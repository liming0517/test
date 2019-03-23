package TankGme;
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


public class MytankGame1 extends JFrame {
    MyPanel myPanel = null;

    public MytankGame1() {
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(300, 300);
        this.setSize(300, 300);
        this.setTitle("坦克大战");
        this.setVisible(true);
    }

    public static void main(String[] args) {

        MytankGame1 mytankgame = new MytankGame1();
    }
}

class MyPanel extends Panel {
    MyTank mytank = null;

    public MyPanel() {
        mytank = new MyTank(100, 100);
    }

    public void paint(Graphics g) {
        super.paint(g);
        drawTank(mytank.getX(), mytank.getY(), g, 0, 0);
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
            case 3:
                g.setColor(Color.yellow);
            default:
                g.setColor(Color.black);
        }
        //判断坦克什么方向
        switch (direct) {
            //0代表朝上
            case 0:
                g.fill3DRect(mytank.getX(), mytank.getY(), 5, 28, false);
                g.fill3DRect(mytank.getX() + 15, mytank.getY(), 5, 28, false);
                g.fill3DRect(mytank.getX() + 3, mytank.getY() + 3, 15, 20, false);
                g.fillOval(mytank.getX() + 5, mytank.getY() + 8, 10, 10);
                g.drawLine(mytank.getX() + 9, mytank.getY() + 10, 109, 90);
                g.drawLine(mytank.getX() + 10, mytank.getY() + 10, 110, 90);
                break;
            //默认朝上
            default:
                g.fill3DRect(mytank.getX(), mytank.getY(), 5, 28, false);
                g.fill3DRect(mytank.getX() + 15, mytank.getY(), 5, 28, false);
                g.fill3DRect(mytank.getX() + 3, mytank.getY() + 3, 15, 20, false);
                g.fillOval(mytank.getX() + 5, mytank.getY() + 8, 10, 10);
                g.drawLine(mytank.getX() + 9, mytank.getY() + 10, 109, 90);
                g.drawLine(mytank.getX() + 10, mytank.getY() + 10, 110, 90);
                break;
        }
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
