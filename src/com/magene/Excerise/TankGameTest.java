package com.magene.Excerise;
/**
 * 画直线 drawLine
 * 画矩形边框 drawRect
 * 画椭圆 drawOval
 * 填充矩形 fillRect
 * 填充椭圆 fillOval
 * 画图片 drawImage
 * 画字符串 derawString
 * 设置画笔的字体 setFromt
 * 设置画笔的颜色 setColor
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class TankGameTest extends JFrame {
    MyPanel myPanel = null;

    public TankGameTest() {
        myPanel = new MyPanel();
        this.add(myPanel);
        this.addKeyListener(myPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(300, 300);
        this.setSize(300, 300);
        this.setTitle("坦克大战");
        this.setVisible(true);
    }

    public static void main(String[] args) {

        TankGameTest mytankgame = new TankGameTest();
    }
}

class MyPanel extends JPanel implements KeyListener {
    MyTank mytank = null;
    //坦克横坐标
    int x = 100;
    //坦克纵坐标
    int y = 100;
    //坦克方向 0-->上；1-->下；2-->左；3-->右;
    int direct = 0;
    //坦克类型 0-->红色；1 蓝色 ；2 黄色
    int type = 2;

    public MyPanel() {
        mytank = new MyTank(x, y);
    }

    public void paint(Graphics g) {
        super.paint(g);
        this.setBackground(Color.GRAY);
        drawTank(x, y, g, direct, type);

    }

    //绘制坦克
    public void drawTank(int x, int y, Graphics g, int direct, int type) {

        //选择类型
        switch (type) {
            //设置为红色
            case 0:
                g.setColor(Color.red);
                break;
            //设置蓝色
            case 1:
                g.setColor(Color.blue);
                break;
            //设置黄色
            case 2:
                g.setColor(Color.yellow);
                break;
            default:
                g.setColor(Color.black);
        }
        //判断坦克什么方向
        switch (direct) {
            //0代表朝上
            case 0:
                //左轮
                g.fill3DRect(x, y, 5, 28, false);
                //右轮
                g.fill3DRect(x + 15, y, 5, 28, false);
                //中间框架
                g.fill3DRect(x + 3, y + 3, 15, 20, false);
                //圆形顶盖
                g.fillOval(x + 5, y + 8, 10, 10);
                //炮台
                g.drawLine(x + 9, y + 10, x + 9, y - 10);
                g.drawLine(x + 10, y + 10, x + 10, y - 10);
                break;
            case 1:
                //左轮
                g.fill3DRect(x, y, 5, 28, false);
                //右轮
                g.fill3DRect(x + 15, y, 5, 28, false);
                //中间框架
                g.fill3DRect(x + 3, y + 3, 15, 20, false);
                //圆形顶盖
                g.fillOval(x + 5, y + 8, 10, 10);
                //炮台
                g.drawLine(x + 9, y + 10, x + 9, y + 35);
                g.drawLine(x + 10, y + 10, x + 10, y + 35);
                break;
            case 2:
                //左轮
                g.fill3DRect(x, y, 28, 5, false);
                //右轮
                g.fill3DRect(x, y + 15, 28, 5, false);
                //中间框架
                g.fill3DRect(x + 4, y + 3, 20, 15, false);
                //圆形顶盖
                g.fillOval(x + 8, y + 5, 10, 10);
                //炮台
                g.drawLine(x + 10, y + 9, x - 10, y + 9);
                g.drawLine(x + 10, y + 10, x - 10, y + 10);
                break;
            case 3:
                //左轮
                g.fill3DRect(x, y, 28, 5, false);
                //右轮
                g.fill3DRect(x, y + 15, 28, 5, false);
                //中间框架
                g.fill3DRect(x + 4, y + 3, 20, 15, false);
                //圆形顶盖
                g.fillOval(x + 8, y + 5, 10, 10);
                //炮台
                g.drawLine(x + 10, y + 9, x + 35, y + 9);
                g.drawLine(x + 10, y + 10, x + 35, y + 10);
                break;

            //默认朝上
            default:
                g.fill3DRect(x, y, 5, 28, false);
                g.fill3DRect(x + 15, y, 5, 28, false);
                g.fill3DRect(x + 3, y + 3, 15, 20, false);
                g.fillOval(x + 5, y + 8, 10, 10);
                g.drawLine(x + 9, y + 10, x + 9, y - 10);
                g.drawLine(x + 10, y + 10, x + 10, y - 10);
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            direct = 0;
            y--;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            direct = 1;
            y++;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            direct = 2;
            x--;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            direct = 3;
            x++;
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

class Tank {
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    int x = 0;
    int y = 0;

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class MyTank extends Tank {
    public MyTank(int x, int y) {
        super(x, y);
    }
}
