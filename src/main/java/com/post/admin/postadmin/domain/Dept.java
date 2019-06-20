package com.post.admin.postadmin.domain;

import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;

import java.io.Serializable;
import java.util.List;

public class Dept {
    private String deptid;
    private String dname;
    private String dPhone;
    private String dmark;


    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getdPhone() {
        return dPhone;
    }

    public void setdPhone(String dPhone) {
        this.dPhone = dPhone;
    }

    public String getDmark() {
        return dmark;
    }

    public void setDmark(String dmark) {
        this.dmark = dmark;
    }

    public static void main(String[] args) {
        AutowiredAnnotationBeanPostProcessor
    }
}
