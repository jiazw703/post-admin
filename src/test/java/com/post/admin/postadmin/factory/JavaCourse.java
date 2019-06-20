package com.post.admin.postadmin.factory;

public class JavaCourse implements  ICourse{

    @Override
    public void record() {
        System.out.println("录制课程java..");
    }
}
