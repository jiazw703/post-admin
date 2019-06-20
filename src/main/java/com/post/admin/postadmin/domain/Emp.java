package com.post.admin.postadmin.domain;

public class Emp {

    private String empid;
    private String empName;
    private String empPhone;
    private String borth;
    private String position;
    private String deptid;
    private  String dname;


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

    public String getEmpid() {

        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }



    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getBorth() {
        return borth;
    }

    public void setBorth(String borth) {
        this.borth = borth;
    }
}
