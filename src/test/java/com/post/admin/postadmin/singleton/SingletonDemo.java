package com.post.admin.postadmin.singleton;


public class SingletonDemo {

    private static  SingletonDemo  singletonDemo=new SingletonDemo();


    private  SingletonDemo(){}

    public  SingletonDemo  getSingletonDemo(){

        return singletonDemo;

    }

    public static void main(String[] args) {

        SingletonDemo singletonDemo = SingletonDemo.singletonDemo.getSingletonDemo();


        for(int i=0;i<100;i++){

            System.out.println(singletonDemo);

        }
        System.out.println(singletonDemo);
    }

}
