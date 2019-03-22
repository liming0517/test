package com.magene.ClassNotes.swing;

/**
 * 常用的布局管理器
 * 1.边界布局，将容器简单的划分为东西南北中5个区域，中间区域最大BoderLayou
 */

import javax.swing.*;
import java.awt.*;

/**
 * BoderLayout演示
 * 1.继承JFrame
 * 2.定义你需要的组件
 * 3.创建组件(构造函数)
 * 4.添加组件
 * 5.对窗体设置
 * 6.显示窗体
 */
public class Demo_2 extends JFrame {
    JFrame jf;
    int size=5;
    JButton jButton[] = new JButton[size];

    public static void main(String[] args) {
        Demo_2 demp_2=new Demo_2();
    }
    public Demo_2(){
        jf=new JFrame();
        //创建组件
//        for(int i=0;i<size;i++){
//            jButton[i]=new JButton("Hello");
//        }
        jButton[0]=new JButton("中部");
        jButton[1]=new JButton("北部");
        jButton[2]=new JButton("南部");
        jButton[3]=new JButton("东部");
        jButton[4]=new JButton("西部");

        //添加各个组件

        super.add(jButton[0], BorderLayout.CENTER);
        super.add(jButton[1], BorderLayout.NORTH);
        super.add(jButton[2], BorderLayout.SOUTH);
        super.add(jButton[3], BorderLayout.EAST);
        super.add(jButton[4], BorderLayout.WEST);

        //设置窗体属性
        super.setTitle("窗口标题");
        super.setSize(300,300);
        super.setLocation(300,300);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //显示窗体
        super.setVisible(true);
    }

}
