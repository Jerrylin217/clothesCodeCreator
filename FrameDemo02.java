package org.example;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class FrameDemo02 implements ActionListener {
    JRadioButton jRadioButton1, jRadioButton2, jRadioButton3, jRadioButton4, jRadioButton5, jRadioButton6, jRadioButton7,
            jRadioButton8, jRadioButton9, jRadioButton10, jRadioButton11, jRadioButton12, jRadioButton13, jRadioButton14,
            jRadioButton15, jRadioButton16, jRadioButton17;
    Panel pn0, pn1, pn2, pn3, pn4, pn5, pn6, pn7, pn8, pn9, pn10, pn11, pn12;
    JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6;

    TextField textField1, textField2;

    String styleId = "XX-XX-XX";
    String suitId = "";

    public static void main(String[] args) {
        new FrameDemo02();
    }

    public FrameDemo02() {
        // TODO Auto-generated method stub
        JFrame frame = new JFrame("衣服编码器v3.2");
        frame.setBounds(100, 100, 600, 300);
        GridLayout gl = new GridLayout(13, 1, 5, 5); //设置表格为13行1列排列，表格横向间距为5个像素，纵向间距为5个像素
        frame.setLayout(gl);

        //文本
        pn11 = new Panel();
        jLabel6 = new JLabel("品牌名称");
        pn11.add(jLabel6);
        frame.add(pn11);

        //单行输入文本框
        pn12 = new Panel();
        pn12.setLayout(new FlowLayout());
        textField1 = new TextField("", 30); //30列长度
        textField1.addActionListener(this);
        pn12.add(textField1);
        frame.add(pn12);

        //文本
        pn0 = new Panel();
        jLabel1 = new JLabel("衣服类型");
        pn0.add(jLabel1);
        frame.add(pn0);

        //单选框
        jRadioButton1 = new JRadioButton("12路连体服1201", true);
        jRadioButton1.addActionListener(this);
        jRadioButton2 = new JRadioButton("12路马甲1202");
        jRadioButton2.addActionListener(this);
        jRadioButton3 = new JRadioButton("12路上下分体服(上身)12081");
        jRadioButton3.addActionListener(this);
        jRadioButton4 = new JRadioButton("12路上下分体服(下身)12082");
        jRadioButton4.addActionListener(this);

        //由于单选框只能选择一个，分组
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton3);
        buttonGroup1.add(jRadioButton4);

        //添加衣服类型单选框组件
        pn1 = new Panel();
        pn1.setLayout(new FlowLayout());
        pn1.add(jRadioButton1);
        pn1.add(jRadioButton2);
        pn1.add(jRadioButton3);
        pn1.add(jRadioButton4);
        frame.add(pn1);

        //文本
        pn2 = new Panel();
        jLabel2 = new JLabel("男码/女码");
        pn2.add(jLabel2);
        frame.add(pn2);

        //单选框
        jRadioButton5 = new JRadioButton("男码", true);
        jRadioButton5.addActionListener(this);
        jRadioButton6 = new JRadioButton("女码");
        jRadioButton6.addActionListener(this);

        //由于单选框只能选择一个，分组
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(jRadioButton5);
        buttonGroup2.add(jRadioButton6);

        //添加男码/女码组件
        pn3 = new Panel();
        pn3.add(jRadioButton5);
        pn3.add(jRadioButton6);
        frame.add(pn3);

        //文本
        pn7 = new Panel();
        jLabel4 = new JLabel("版本");
        pn7.add(jLabel4);
        frame.add(pn7);

        //单选框
        jRadioButton15 = new JRadioButton("专业", true);
        jRadioButton15.addActionListener(this);
        jRadioButton16 = new JRadioButton("个人");
        jRadioButton16.addActionListener(this);

        //由于单选框只能选择一个，分组
        ButtonGroup buttonGroup4 = new ButtonGroup();
        buttonGroup4.add(jRadioButton15);
        buttonGroup4.add(jRadioButton16);

        //添加版本组件
        pn8 = new Panel();
        pn8.add(jRadioButton15);
        pn8.add(jRadioButton16);
        frame.add(pn8);

        //文本
        pn4 = new Panel();
        jLabel3 = new JLabel("尺码");
        pn4.add(jLabel3);
        frame.add(pn4);

        //尺码单选框
        jRadioButton7 = new JRadioButton("2XS", true);
        jRadioButton7.addActionListener(this);
        jRadioButton8 = new JRadioButton("XS");
        jRadioButton8.addActionListener(this);
        jRadioButton9 = new JRadioButton("S");
        jRadioButton9.addActionListener(this);
        jRadioButton10 = new JRadioButton("M");
        jRadioButton10.addActionListener(this);
        jRadioButton11 = new JRadioButton("L");
        jRadioButton11.addActionListener(this);
        jRadioButton12 = new JRadioButton("XL");
        jRadioButton12.addActionListener(this);
        jRadioButton13 = new JRadioButton("2XL");
        jRadioButton13.addActionListener(this);
        jRadioButton14 = new JRadioButton("3XL");
        jRadioButton14.addActionListener(this);
        jRadioButton17 = new JRadioButton("4XL");
        jRadioButton17.addActionListener(this);

        //由于单选框只能选择一个，分组
        ButtonGroup buttonGroup3 = new ButtonGroup();
        buttonGroup3.add(jRadioButton7);
        buttonGroup3.add(jRadioButton8);
        buttonGroup3.add(jRadioButton9);
        buttonGroup3.add(jRadioButton10);
        buttonGroup3.add(jRadioButton11);
        buttonGroup3.add(jRadioButton12);
        buttonGroup3.add(jRadioButton13);
        buttonGroup3.add(jRadioButton14);
        buttonGroup3.add(jRadioButton17);

        //添加 尺码组件
        pn5 = new Panel();
        pn5.add(jRadioButton7);
        pn5.add(jRadioButton8);
        pn5.add(jRadioButton9);
        pn5.add(jRadioButton10);
        pn5.add(jRadioButton11);
        pn5.add(jRadioButton12);
        pn5.add(jRadioButton13);
        pn5.add(jRadioButton14);
        pn5.add(jRadioButton17);
        frame.add(pn5);

        //文本
        pn9 = new Panel();
        jLabel5 = new JLabel("生成数量");
        pn9.add(jLabel5);
        frame.add(pn9);

        //单行文本框
        pn10 = new Panel();
        pn10.setLayout(new FlowLayout());
        textField2 = new TextField("", 30); //30列长度
        textField2.addActionListener(this);
        pn10.add(textField2);
        frame.add(pn10);

        //按钮组件
        JButton but1 = new JButton("生成");
        but1.addActionListener(this);
        but1.setActionCommand("生成");
        pn6 = new Panel();
        pn6.setLayout(new FlowLayout());
        pn6.add(but1);
        frame.add(pn6);

        frame.setVisible(true);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String[] styleIdTemp = styleId.split("-");
        String styleID;
        String type = null;
        String typeForShort = null;
        if (jRadioButton1.isSelected()) {
            styleIdTemp[0] = "1201" + "-";
        }
        if (jRadioButton2.isSelected()) {
            styleIdTemp[0] = "1202" + "-";
        }
        if (jRadioButton3.isSelected()) {
            styleIdTemp[0] = "12081" + "-";
        }
        if (jRadioButton4.isSelected()) {
            styleIdTemp[0] = "12082" + "-";
        }

        if (jRadioButton5.isSelected()) styleIdTemp[1] = "Male" + "-";
        if (jRadioButton6.isSelected()) styleIdTemp[1] = "Female" + "-";

        if (jRadioButton7.isSelected()) styleIdTemp[2] = "2XS";
        if (jRadioButton8.isSelected()) styleIdTemp[2] = "XS";
        if (jRadioButton9.isSelected()) styleIdTemp[2] = "S";
        if (jRadioButton10.isSelected()) styleIdTemp[2] = "M";
        if (jRadioButton11.isSelected()) styleIdTemp[2] = "L";
        if (jRadioButton12.isSelected()) styleIdTemp[2] = "XL";
        if (jRadioButton13.isSelected()) styleIdTemp[2] = "2XL";
        if (jRadioButton14.isSelected()) styleIdTemp[2] = "3XL";
        if (jRadioButton17.isSelected()) styleIdTemp[2] = "4XL";

        styleID = styleIdTemp[0] + styleIdTemp[1] + styleIdTemp[2];

        if(jRadioButton15.isSelected()) {type = "PROFESSIONAL";typeForShort = "pf";};
        if(jRadioButton16.isSelected()) {type = "PERSONAL";typeForShort = "ps";};

        //当前用户桌面路径
        File desktopDir = FileSystemView.getFileSystemView() .getHomeDirectory();
        String desktopPath = desktopDir.getAbsolutePath();
        desktopPath = desktopPath.replace("\\","/");
        //System.out.println(desktopPath);
        if (e.getActionCommand().equals("生成")) {
            if (textField1.getText().isEmpty() || textField2.getText().isEmpty()){
                JOptionPane.showConfirmDialog(null, "信息不完整，请填写完品牌名称与生成数量！", "Tips", JOptionPane.DEFAULT_OPTION);
            }
            //生成数量取出来
            String strNum = textField2.getText();
            int num = Integer.parseInt(strNum);

            //System.out.println("style_id:" + str);
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("1201-Female-2XS", "a1");
            hashMap.put("1201-Female-XS", "a2");
            hashMap.put("1201-Female-S", "a3");
            hashMap.put("1201-Female-M", "a4");
            hashMap.put("1201-Female-L", "a5");
            hashMap.put("1201-Female-XL", "a6");
            hashMap.put("1201-Female-2XL", "a7");
            hashMap.put("1201-Female-3XL", "a8");
            hashMap.put("1201-Male-2XS", "a9");
            hashMap.put("1201-Male-XS", "a0");
            hashMap.put("1201-Male-S", "aa");
            hashMap.put("1201-Male-M", "ab");
            hashMap.put("1201-Male-L", "ac");
            hashMap.put("1201-Male-XL", "ad");
            hashMap.put("1201-Male-2XL", "ae");
            hashMap.put("1201-Male-3XL", "af");
            hashMap.put("12081-Female-2XS", "b1");
            hashMap.put("12081-Female-XS", "b2");
            hashMap.put("12081-Female-S", "b3");
            hashMap.put("12081-Female-M", "b4");
            hashMap.put("12081-Female-L", "b5");
            hashMap.put("12081-Female-XL", "b6");
            hashMap.put("12081-Female-2XL", "b7");
            hashMap.put("12081-Female-3XL", "b8");
            hashMap.put("12081-Male-2XS", "b9");
            hashMap.put("12081-Male-XS", "b0");
            hashMap.put("12081-Male-S", "ba");
            hashMap.put("12081-Male-M", "bb");
            hashMap.put("12081-Male-L", "bc");
            hashMap.put("12081-Male-XL", "bd");
            hashMap.put("12081-Male-2XL", "be");
            hashMap.put("12081-Male-3XL", "bf");
            hashMap.put("12082-Female-2XS", "c1");
            hashMap.put("12082-Female-XS", "c2");
            hashMap.put("12082-Female-S", "c3");
            hashMap.put("12082-Female-M", "c4");
            hashMap.put("12082-Female-L", "c5");
            hashMap.put("12082-Female-XL", "c6");
            hashMap.put("12082-Female-2XL", "c7");
            hashMap.put("12082-Female-3XL", "c8");
            hashMap.put("12082-Male-2XS", "c9");
            hashMap.put("12082-Male-XS", "c0");
            hashMap.put("12082-Male-S", "ca");
            hashMap.put("12082-Male-M", "cb");
            hashMap.put("12082-Male-L", "cc");
            hashMap.put("12082-Male-XL", "cd");
            hashMap.put("12082-Male-2XL", "ce");
            hashMap.put("12082-Male-3XL", "cf");
            hashMap.put("1202-Female-2XS", "d1");
            hashMap.put("1202-Female-XS", "d2");
            hashMap.put("1202-Female-S", "d3");
            hashMap.put("1202-Female-M", "d4");
            hashMap.put("1202-Female-L", "d5");
            hashMap.put("1202-Female-XL", "d6");
            hashMap.put("1202-Female-2XL", "d7");
            hashMap.put("1202-Female-3XL", "d8");
            hashMap.put("1202-Male-2XS", "d9");
            hashMap.put("1202-Male-XS", "d0");
            hashMap.put("1202-Male-S", "da");
            hashMap.put("1202-Male-M", "db");
            hashMap.put("1202-Male-L", "dc");
            hashMap.put("1202-Male-XL", "dd");
            hashMap.put("1202-Male-2XL", "de");
            hashMap.put("1202-Male-3XL", "df");
            //新补充的编码
            hashMap.put("1201-Female-4XL", "e1");
            hashMap.put("1201-Male-4XL", "e2");
            hashMap.put("12081-Female-4XL", "e3");
            hashMap.put("12081-Male-4XL", "e4");
            hashMap.put("12082-Female-4XL", "e5");
            hashMap.put("12082-Male-4XL", "e6");
            hashMap.put("1202-Female-4XL", "e7");
            hashMap.put("1202-Male-4XL", "e8");


            String tag = null;
            try {
                tag = hashMap.get(styleID);
                //System.out.println("haspMap取出来的前缀:" + tag);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }

            /*String id = String.format("%06x",Long.valueOf(timeStamp()));
            id = tag + id;*/
//            String id = tag + timeStamp();
//            System.out.println("组合后的16进制数字" + id);
//            BigInteger suitId = new BigInteger(id, 16);
//            System.out.println(new Date() + "suitId:" + suitId);
//
//            id = id.toUpperCase();
//            String[] strings = id.split("");
//            String str1 = strings[0] + strings[1] + " " + strings[2] + strings[3] + " " + strings[4] + strings[5] + " " + strings[6] + strings[7];
//            System.out.println(str1);
//            String postNum = "36 00 E5 " + str1 + " C9";
//
//            System.out.println("烧入串口号：" + postNum);

            //List数组存 每一条衣服信息
            List<List<String>> rows = new ArrayList<>();
            List<String> firstList =  CollUtil.newArrayList("QRCode Content","SuitID","StyleID","Brand","Type","Key");
            rows.add(firstList);
            for (int n = num; n > 0; n--) {
                String id = tag + timeStamp();
                //System.out.println("组合后的16进制数字" + id);
                BigInteger suitId = new BigInteger(id, 16);
                //System.out.println(new Date() + "suitId:" + suitId);

                id = id.toUpperCase();
                String[] strings = id.split("");
                String str1 = strings[0] + strings[1] + " " + strings[2] + strings[3] + " " + strings[4] + strings[5] + " " + strings[6] + strings[7];
                //System.out.println(str1);
                String postNum = "36 00 E5 " + str1 + " C9";

                //System.out.println("烧入串口号：" + postNum);
                //list.add("Brand:" + textField1.getText() + "\n" + "styleId:" + str + "\n" + "suitId:" + suitId + "\n" + "烧入串口号:" + postNum)
                List<String> list =  CollUtil.newArrayList("{" + "\"" + "Brand" + "\"" + ":" + "\"" + textField1.getText() + "\"" + "," +
                        "\"" + "SuitID" + "\"" + ":" + "\"" + suitId + "\"" + "," +
                        "\"" + "StyleID" + "\"" + ":" + "\"" + styleID + "\"" + "," +
                        "\"" + "Type" + "\"" + ":" + "\"" + type + "\"" + "," +
                        "\"" + "Key" + "\"" + ":" + "\"" + postNum + "\"" + "}",
                        suitId + "",
                        styleID,
                        textField1.getText(),
                        type,
                        postNum);
                rows.add(list);
            }
            Date date = new Date();
            //分别获取年，月，日，时，分，秒
            String year = String.format("%tY", date);
            String month = String.format("%tm", date);
            String day = String.format("%td", date);
            String hour = String.format("%tH",date);
            String minute = String.format("%tM",date);
            String result = year + month + day + hour + minute;
            //System.out.println(result);

            //通过工具类创建writer
            ExcelWriter writer = ExcelUtil.getWriter(desktopPath + "/" + textField1.getText() + "_" + result +
                    "_" + styleID + "_" + typeForShort + "_" + num + ".xlsx");
            //一次性写出内容，强制输出标题
            writer.write(rows, true);
            //关闭writer，释放内存
            writer.close();

            JOptionPane.showConfirmDialog(null, "生成Excel文件成功，请在桌面寻找到" + textField1.getText() + "_" + result +
                    "_" + styleID + "_" + typeForShort + "_" + num + ".xlsx。", "Tips", JOptionPane.DEFAULT_OPTION);

//            JTextArea textArea = new JTextArea("Brand:" + textField1.getText() +"\n" + "styleId:" + str + "\n" + "suitId:" + suitId + "\n" + "烧入串口号:" + postNum);
//            textArea.setEditable(false); // 设置文本区域为不可编辑
//            JScrollPane scrollPane = new JScrollPane(textArea);
//
//            JButton copyButton = new JButton("复制");
//            copyButton.addActionListener(new ActionListener() {
//                public void actionPerformed(ActionEvent e) {
//                    StringSelection stringSelection = new StringSelection(textArea.getText());
//                    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//                    clipboard.setContents(stringSelection, null);
//                }
//            });
//
//            JPanel buttonPanel = new JPanel(); // 按钮面板
//            buttonPanel.add(copyButton);
//            dialog.add(scrollPane, BorderLayout.CENTER);
//            dialog.add(buttonPanel, BorderLayout.SOUTH);
//            dialog.setSize(400, 200);
//            dialog.setVisible(true);
        }
    }

    public static String timeStamp() {
        String simpleUUID = IdUtil.simpleUUID();
        //System.out.println("UUID++++++++++before=======" + simpleUUID);
        simpleUUID = simpleUUID.substring(0, 6);
        //System.out.println("UUID++++++++++after========" + simpleUUID);
        return simpleUUID;
    }

}