package com.post.admin.postadmin;

import org.thymeleaf.spring5.context.SpringContextUtils;

import java.util.Scanner;

public class hello {


    public static void main(String[] args) {

        //
        System.out.println("请输入第一个数：");
        Scanner s1=new Scanner(System.in);
        int param1 = s1.nextInt();
        System.out.println("请输入第二个数：");
        Scanner s=new Scanner(System.in);
        int param2 =s.nextInt();


//html

        int add = add(param1,param2);
        System.out.println("结果："+add);
    }

    public  static  int   add(int a,int b){

        return  a+b;
    }
}
