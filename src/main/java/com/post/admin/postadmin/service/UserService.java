package com.post.admin.postadmin.service;


import com.post.admin.postadmin.dao.UserDao;
import com.post.admin.postadmin.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao  userDao;
    public  User  login(User  user){


        try {

          return userDao.queryUsernameAndpwd(user);


        }catch (Exception  e){

            e.printStackTrace();

        }

        return  null;
    }

    public pageUtil deptAll(Dept dept,Integer page,Integer rows) {
        try {

            List<Dept> deptList = userDao.queryDeptWhere(dept);
            //分页
            List<Dept> rowsdept = userDao.queryPageDeptList(dept, (page - 1) * rows, rows);
            pageUtil pages =new pageUtil
                    (rowsdept,page,(deptList.size() + rows-1) /rows, page, (long) deptList.size());

            return  pages;
        }catch (Exception e){

            e.printStackTrace();

        }
        return  null;
    }

    public int addDept(Dept dept) {
        try {


            return userDao.addDept(dept);
        }catch (Exception e){

            e.printStackTrace();
        }
        return 0;
    }

    public int delDept(String deptid) {
        try {


            return userDao.delDept(deptid);
        }catch (Exception e){

            e.printStackTrace();
        }
        return 0;
    }

    public  int  updateDept(Dept  dept){
        try {


            return userDao.updateDept(dept);
        }catch (Exception e){

            e.printStackTrace();
        }
        return 0;

    }

    public pageUtil empAll(Emp emp, Integer page, Integer rows) {
        try {

            List<Emp> empList = userDao.queryEmpWhere(emp);
            //分页
            List<Emp> rowsEmp = userDao.queryPageEmpList(emp, (page - 1) * rows, rows);
            pageUtil pages =new pageUtil
                    (rowsEmp,page,(empList.size() + rows-1) /rows, page, (long) empList.size());

            return  pages;
        }catch (Exception e){

            e.printStackTrace();

        }
        return  null;

    }

    public int  delEmp(String empid) {
        try {


           return  userDao.delEmp(empid);
        }catch (Exception e){

            e.printStackTrace();

        }
        return  0;
    }

    public List<Dept> deptQueryAll() {
        return userDao.queryDeptAll();
    }

    public int addEmp(Emp emp) {

        return  userDao.addEmp(emp);
    }


    public int editEmp(Emp emp) {
        return userDao.updateEmp(emp);
    }

    public pageUtil workAll(Work work, Integer page, Integer rows) {


        List<Work> workList = userDao.queryWorkWhere(work);
        //分页Work
        List<Work> rowsWork = userDao.queryPageWorkList(work, (page - 1) * rows, rows);
        pageUtil pages =new pageUtil
                (rowsWork,page,(workList.size() + rows-1) /rows, page, (long) workList.size());

        return  pages;

    }

    public List<Emp> empQueryAll() {
       return  userDao.empQueryAll();
    }

    public int  delwork(String workid) {

        return  userDao.delWork(workid);
    }
}
