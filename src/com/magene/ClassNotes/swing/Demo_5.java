package com.magene.ClassNotes.swing;

import javax.swing.*;
import java.awt.*;

/**多种布局管理器组合使用
 * 面板组件 Jpanel
 * ①在图形用户界面编程中，如果只是普通的组件布局，我们用前面讲的三种布局管理器就可以解决，但是在比较复杂的布局要求时，就需要使用布局管理器的组合使用
 * ②Jpanel：面板组件 非顶层容器
 * 一个界面只可以有一个JFrame窗体组件，但是可以有多个Jpanel面板组件，而Jpanel也可以使用FlowLayout、BorderLayout、GirdLayout等各种布局管理器。
 */
public class Demo_5 extends JFrame {
    JPanel jp1,jp2;
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7;

    public static void main(String[] args) {
        Demo_5 demo_5=new Demo_5();
    }
    //构造函数
    public Demo_5(){
        //创建组件 Jpanel布局默认是FlowLayout
        jp1=new JPanel();
        jp2=new JPanel();

        jb1=new JButton("黄瓜");
        jb2=new JButton("茄子");
        jb3=new JButton("苹果");
        jb4=new JButton("桃子");
        jb5=new JButton("蓝莓");
        jb6=new JButton("榴莲");
        jb7=new JButton("芒果");
        //添加Jpanel
        jp1.add(jb1);
        jp1.add(jb2);
        jp1.add(jb3);
        jp2.add(jb4);
        jp2.add(jb5);
        jp2.add(jb7);
        //把JPanel放入JFrame
        super.add(jp1,BorderLayout.NORTH);
        super.add(jb6,BorderLayout.CENTER);
        super.add(jp2,BorderLayout.SOUTH);
        //设置窗口
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocation(300,300);
        super.setSize(300,300);

        //显示窗口
        super.setVisible(true);
    }

}
