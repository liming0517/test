package com.magene.ClassNotes.swing;

import javax.swing.*;
import java.awt.*;

public class Demo_3 extends JFrame{
    /**
     * 常用的布局管理器
     * 流式布局FlowLaout
     * 按照组件的添加次序将按钮组件(当然也可以是其他组件)从左到右放置在容器中。当到达容器的边界时，组件将放置在下一行中。
     * FlowLayout可以以左对齐、居中对齐、右对齐的方式排列组件。
     */
    //定义需要的组件
    JButton jb1,jb2,jb3,jb4,jb5,jb6;

    public static void main(String[] args) {
        Demo_3 demo_3=new Demo_3();
    }
    public Demo_3(){
    //创建组件
        jb1=new JButton("红色");
        jb2=new JButton("橙色");
        jb3=new JButton("黄色");
        jb4=new JButton("绿色");
        jb5=new JButton("蓝色");
        jb6=new JButton("紫色");
        //添加组件
        super.add(jb1);
        super.add(jb2);
        super.add(jb3);
        super.add(jb4);
        super.add(jb5);
        super.add(jb6);
        //设置布局管理器,默认居中对齐，后边加参数
        super.setLayout(new FlowLayout(FlowLayout.LEFT));
        //不允许修改控件大小
        super.setResizable(false);
        //对窗体设置
        super.setTitle("窗口标题");
        super.setLocation(300,300);
        super.setSize(300,300);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //显示窗口
        super.setVisible(true);
    }
}
