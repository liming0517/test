/*
请做一个公司职员薪水管理系统，要求完成如下功能：
1.当有新员工时，将该员工加入到管理系统
2.可以根据员工号，显示该员工的信息
3.可以显示所有员工信息
4.可以修改员工的薪水
5.当员工离职时，将该员工从管理系统中删除
6.可以按照薪水从低到高顺序排序
7.可以统计员工的平均工资和最低和最高工资
* */
package 练习题;

import java.util.*;


public class ArryListFighting {
    public static void main(String[] args) {
        empManage empManage = new  empManage();
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("请按照编号操作");
            System.out.println("输入1来添加一个新员工");
            System.out.println("输入2来退出系统");
            String input = sc.next();
            if (input.equals("1")) {
                System.out.println("请输入姓名");
                String name = sc.next();
                System.out.println("请输入编号");
                int empNo = sc.nextInt();
                System.out.println("请输入薪水");
                float sal = sc.nextFloat();
                emp emp = new emp(name, empNo, sal);
                empManage.add(emp);
            }
            if (input.equals("2")) {
              System.exit(0);
            }
        }
    }
}



    //员工表
    class emp {

        private String name;
        private int empNo;
        private float sal;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getEmpNo() {
            return empNo;
        }

        public void setEmpNo(int empNo) {
            this.empNo = empNo;
        }

        public float getSal() {
            return sal;
        }

        public void setSal(float sal) {
            this.sal = sal;
        }

        public emp(String name, int empNo, float sal) {
            this.name = name;
            this.empNo = empNo;
            this.sal = sal;
        }

    }

    //员工管理
    class empManage {
        ArrayList al = null;

        public empManage() {
            al = new ArrayList();
        }

        //1.当有新员工时，将该员工加入到管理系统
        public void add(emp emp) {
            al.add(emp);
        }
        //2.可以根据员工号，显示该员工的信息
        public void showInfo(int empNo){
            for(int i=0;i<al.size();i++){
                emp emp =(emp)al.get(i);
                if(){
                    System.out.println("找到该员工，他的编号是"+empNo);
                }
            }
        }
    }
