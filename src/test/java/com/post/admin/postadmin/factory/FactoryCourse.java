package com.post.admin.postadmin.factory;

public class FactoryCourse {

    public  ICourse  createCourse(String course){

        if("java".equals(course)){

           return  new  JavaCourse();


        }
        return  null;
    }

}
