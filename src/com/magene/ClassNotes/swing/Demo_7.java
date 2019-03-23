package com.magene.ClassNotes.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/*
画一只王八
* */
public class Demo_7 extends JFrame {
    Paneltest paneltest =null;

    public static void main(String[] args) {
        Demo_7 demo =new Demo_7();
    }
    public Demo_7(){
        paneltest = new Paneltest();
        this.add(paneltest);
        //添加到监听
        this.addKeyListener(paneltest);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setTitle("画王八");
        this.setVisible(true);
    }
}
class Paneltest extends JPanel  implements KeyListener {
    int x =225;
    int y =120;
    public void paint(Graphics g){
        super.paint(g);
        //头
        g.drawOval(x,y,20,40);
        g.drawLine(x+8,y+5,x+8,y+8);
        g.drawLine(x+13,y+5,x+13,y+8);
        g.setColor(Color.red);
        g.fillOval(x-25,y+30,70,100);
        g.setColor(Color.green);
        //前腿
        g.fillOval(x-30,y+25,10,40);
        g.fillOval(x+40,y+25,10,40);
        //后腿
        g.fillOval(x-25,y+112,10,30);
        g.fillOval(x+32,y+112,10,30);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

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

    @Override
    public void keyReleased(KeyEvent e) {

    }
}