package com.post.admin.postadmin.dao;

import com.post.admin.postadmin.domain.Dept;
import com.post.admin.postadmin.domain.Emp;
import com.post.admin.postadmin.domain.User;
import com.post.admin.postadmin.domain.Work;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao {

    //@Select("select username,pwd password from t_user where username=#{username} and pwd=#{password}")
    public User  queryUsernameAndpwd(User user);

    public List<Dept> queryDeptAll();
    public List<Dept> queryDeptWhere(Dept dept);

    public   List<Dept> queryPageDeptList(Dept dept, int start, int end);

     public   int addDept(Dept dept);

    public  int delDept(String deptid);

    public  int updateDept(Dept dept);

    public List<Emp> queryEmpWhere(Emp emp);

    public List<Emp> queryPageEmpList(Emp emp, Integer start, Integer end);

   public  int delEmp(String empid);

   public   int addEmp(Emp emp);

    public int updateEmp(Emp emp);

    List<Work> queryWorkWhere(Work work);

    List<Work> queryPageWorkList(Work work, int i, Integer rows);

    List<Emp> empQueryAll();

    int delWork(String workid);
}
