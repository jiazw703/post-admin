package com.post.admin.postadmin;


import javax.validation.constraints.Pattern;

import static java.lang.Thread.sleep;

class  threadDemo004  extends Thread{

    public    boolean  flag=true;
    @Override
    public void run() {

        System.out.println("线程开始。。。");
        while(flag){


        }
        System.out.println("线程结束。。");
    }

    public  void  setFlag(boolean flag){

        this.flag=flag;
    }
}


public class Thread004 {

    public static void main(String[] args) throws InterruptedException {
        threadDemo004  t1=new threadDemo004();

        t1.start();
        Thread.sleep(3000);
        t1.setFlag(false);

        System.out.println("flag变为false");

        java.lang.Thread.sleep(1000);
        System.out.println(t1.flag);


    }
}
