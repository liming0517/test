package com.magene.ClassNotes.swing;

import javax.swing.*;
import java.awt.*;

/**
 * 常用的布局管理器
 * 网格布局 GirdLayout
 * 组件被填充到每个网格中，添加到容器中的组件首先放置在左上角的网格中
 */
public class Demo_4 extends JFrame {
    int size = 9;
    JButton jb[] = new JButton[size];

    public static void main(String[] args) {
        Demo_4 demo_4=new Demo_4();
    }
    public Demo_4(){
        //创建组件
        for(int i =0;i<size;i++){
            jb[i]=new JButton(String.valueOf(i));
        }
        //添加组件
        for(int i =0;i<size;i++){
            super.add(jb[i]);
        }
        //设置布局管理器
        super.setLayout(new GridLayout(3,3,10,10));
        //设置窗体属性
        super.setTitle("窗口标题");
        super.setSize(300,300);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocation(300,300);
        //显示窗口
        super.setVisible(true);
    }
}
