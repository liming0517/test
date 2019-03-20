package ClassNotes;

import java.lang.reflect.Method;

public class GenericAndReflection {
    public static void main(String[] args) {
        Bird br = new Bird();
        Gen<Bird> gen1 = new Gen<Bird>(br);
        gen1.showInfo();
    }
}

class Gen<T> {
    private T o;
    //构造函数初始化变量
    public Gen(T t){
        this.o=t;
    }
    public void showInfo() {
        //反射出类的各种信息
        System.out.println("类型是" + o.getClass().getName());
        //反射出Bird类中的所有方法，因为Bird类中的方法不止一个，此处返回的是一组数据
       Method[] method=o.getClass().getDeclaredMethods();
       //遍历打印出Bird类中的方法
       for(int i=0;i<method.length;i++){
           System.out.println(method[i].getName());
       }
    }
}

class Bird {
    public int count(int a, int b) {
        return a + b;
    }
    public void SingSong(){
        System.out.println("会唱歌的鸟儿");
    }

    private String color;
}


