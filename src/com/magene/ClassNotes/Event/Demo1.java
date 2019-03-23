package com.magene.ClassNotes.Event;
/*
创建一个开关，点击红色按钮变成红色，点击黑色按钮变成黑色
* */
import com.magene.ClassNotes.swing.Demo_7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo1 extends JFrame implements ActionListener {
    MyPanel2 myPanel=null;
    JButton jbutton1=null;
    JButton jbutton2=null;

    public static void main(String[] args) {
        Demo1 demo =new Demo1();
    }
    public Demo1() {
        //创建实例
        myPanel =new MyPanel2();
        jbutton1 =new JButton("黑色");
        jbutton2=new JButton("红色");
        //创建监听事件源
        jbutton1.setActionCommand("黑色");
        jbutton2.setActionCommand("红色");
        //注册监听
        jbutton1.addActionListener(this);
        jbutton2.addActionListener(this);
        //设置背景颜色
        myPanel.setBackground(Color.blue);

        //添加组件
        this.add(myPanel,BorderLayout.CENTER);
        this.add(jbutton1,BorderLayout.NORTH);
        this.add(jbutton2,BorderLayout.SOUTH);
        //设置窗口面板
        this.setTitle("监听事件");
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("黑色")){
            myPanel.setBackground(Color.black);
        }else if(e.getActionCommand().equals("红色")){
            myPanel.setBackground(Color.red);
        }
    }
}
class MyPanel2 extends JPanel{
    public void paint(Graphics g){
        super.paint(g);
    }
}
