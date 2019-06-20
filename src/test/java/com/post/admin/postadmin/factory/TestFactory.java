package com.post.admin.postadmin.factory;

public class TestFactory {


    public static void main(String[] args) {

        FactoryCourse factoryCourse = new FactoryCourse();

        ICourse java = factoryCourse.createCourse("java");

        java.record();
    }
}
