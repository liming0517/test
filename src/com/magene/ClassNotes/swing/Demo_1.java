package com.magene.ClassNotes.swing;
import javax.swing.*;

/*
演示Swing使用
* */
public class Demo_1 extends JFrame {
    //Jframe是一个顶层容器类（可以添加其他swing组件的类）
    JFrame jf = null;
    public static void main(String[] args) {
    Demo_1 demo_1=new Demo_1();
    }

    public Demo_1() {
        jf=new JFrame();
        //给窗体设置标题
        super.setTitle("haha");
        //设置大小
        super.setSize(200, 200);
        //设置初始位置
        super.setLocation(300, 300);
        //设置当关闭窗口的时候，JVM也退出
        super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //显示
        super.setVisible(true);
    }


}
