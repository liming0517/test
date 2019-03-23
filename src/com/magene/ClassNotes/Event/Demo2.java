package com.magene.ClassNotes.Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Demo2 extends JFrame {
    MyPanel3 mypanel = null;

    public static void main(String[] args) {
        Demo2 demo = new Demo2();
    }

    public Demo2() {
        mypanel = new MyPanel3();
        //添加组件到面板
        this.add(mypanel);
        //添加事件监听者
        this.addKeyListener(mypanel);
        //设置窗体
        this.setSize(400, 300);
        this.setTitle("移动小圆圈");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class MyPanel3 extends JPanel implements KeyListener {
    //必须有的  重构
    int x = 100;
    int y = 100;

    public void paint(Graphics g) {
        super.paint(g);
        //画一个小圆
        g.fillOval(x, y, 10, 10);

    }

    //键盘输入的内容
    @Override
    public void keyTyped(KeyEvent e) {

    }


    //键盘按下 触发
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            y--;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            y++;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x--;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x++;
        }
        this.repaint();
    }

    //键盘释放 触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
