package com.magene.ClassNotes.swing;
/**韩老师32讲 Swing实战
 * 常用组件集合：
 * JSplitPane 一分为二，垂直/水平划分
 * JComboBox下拉框
 * Jlist 列表
 * JScrollPane 滚动窗格组件
 * JButton 按钮
 * JTextArea 多行文本框组件
 * JPanel 非顶层容器
 * JTabbedPane 页签(选项卡窗格)
 * JLabel 文本(可插入图片)
 * JTextField 文本输入框
 * JpasswordFiel 密码输入框
 * JCheckBox 复选框
 *JRidioButton 单选框 必须将一组需要单选的放到ButtonGroup中才有单选效果
 * Jmenu 菜单组件 树枝 Jmenu中可以嵌套Jmenu组成二级菜单
 * JmenuBar 菜单条组件 树干
 * JmenuItem 菜单项组件 树叶
 * JToolBar 工具条组件 容器组件
 *
 *
 */

import javax.swing.*;
import java.awt.*;

public class Demo_6 extends JFrame{
    //定义组件
       JList  jls;
       JSplitPane jsp;
       JTextArea text;
       JScrollPane jScrollPane;
       String list[]={"111","222","333","444","555","6666"};
       String word[]={"Hello","eternal","topic","rare","which","effocts","hard","denifility",};

    public static void main(String[] args) {
        Demo_6 demo_6 =new Demo_6();
    }
       public Demo_6(){
           //创建组件
           text=new JTextArea();
           jls = new JList(word);
           jScrollPane=new JScrollPane(text);
           jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jls,jScrollPane);

           //加入容器
           super.add(jsp);
           //设置窗体
           super.setTitle("窗口标题");
           super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           super.setSize(500,500);
           super.setLocation(300,300);
           super.setVisible(true);
       }


}
