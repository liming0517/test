package com.magene.ClassNotes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*异常分为三种
1.检查性异常(编译异常) java.lang.Exception
2.运行期异常 java.lang.RuntimeException
3.错误 java.lang.Error
    顶层是java.lang.Throwable类，检查性异常，运行期异常，错误都是这个类的子孙类。
    java.lang,Exception和java.lang.Error继承自java.lamg.Throwable,而java.lang.RuntimeException继承自java.lang.Exception
* */
public class Exception {
    public static void main(String[] args) {
        FileReader fileReader=null;
        try {
           fileReader= new FileReader("F:\\aaa.txt");
        } catch (FileNotFoundException e) {
            //抛出异常
            e.printStackTrace();
        }finally {
            //不管有没有异常都会执行
            // 一般说把需要关闭的资源文件，连接，内存
            if(fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
