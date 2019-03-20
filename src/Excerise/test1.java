package Excerise;
import java.util.Scanner;
/*
跳水比赛，8个评委打分。运动员的成绩是8个成绩去掉一个最高分，去掉一个最低分，剩下的6个分数的平均分就是最后得分。使用一维数组实现打分功能。
* */
//以下是自己做的，调试通过了，但是感觉代码冗余多
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double people[] = new double[8];
        double count = 0;
        double avgScore=0;
        for (int i = 0; i < people.length; i++) {
            System.out.println("请输入第" + (i+1) + "位评委的分数");
            people[i] = sc.nextDouble();
        }
        double maxScore = people[0];
        double minScore = people[0];
        for (int i = 0; i < people.length; i++) {
            //取到最大值
            if (people[i] > maxScore) {
                maxScore = people[i];
            }
            //取到最小值
            if (people[i] < minScore) {
                minScore = people[i];
            }
        }
            for (int i =0;i<people.length;i++){
                if(people[i]!=maxScore && people[i]!=minScore){
                    count+=people[i];
                    avgScore=count/(people.length-2);
                }
        }
        System.out.println("最大分数是" + maxScore + "最小分数是" + minScore);
        System.out.println("平均分" + avgScore);
    }
}

