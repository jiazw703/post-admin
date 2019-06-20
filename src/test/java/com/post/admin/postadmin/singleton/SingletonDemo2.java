package com.post.admin.postadmin.singleton;

public class SingletonDemo2 {

    private  SingletonDemo2  singletonDemo2=null;

    private  SingletonDemo2(){}

    public  SingletonDemo2  getSingletonDemo2(){

        singletonDemo2=new SingletonDemo2();
        return singletonDemo2;
    }

    public static void main(String[] args) {
        for(int i=0;i<1000;i++){



        }
    }
}
