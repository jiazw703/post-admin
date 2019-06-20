package com.post.admin.postadmin.controller;

import com.post.admin.postadmin.domain.*;
import com.post.admin.postadmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping(value = "user")
public class IndexController {

    private int count;

    @Autowired
    private UserService  userService;

    @RequestMapping(value = "login.html")
    public  String index(){


        return "login";
    }


    @RequestMapping(value = "dept")
    public  String  dept(){

        return  "dept";

    }

    @RequestMapping("addDept")
    @ResponseBody
    public  String addDept(Dept dept){

        dept.setDeptid(UUID.randomUUID().toString());
        userService.addDept(dept);


        return  "ok";
    }

    @RequestMapping("delDept")
    @ResponseBody
    public  String delDept(String  deptid){


        userService.delDept(deptid);


        return  "ok";
    }
    @RequestMapping(value = "deptAll")
    @ResponseBody
    public pageUtil deptAll(Dept dept, Integer page,
                            Integer rows){

        System.out.println(count++);

        return  userService.deptAll(dept, page, rows);


    }

    @RequestMapping("updateDept")
    @ResponseBody
    public  int updateDept(Dept dept){
        return  userService.updateDept(dept);

    }



    @PostMapping(value = "login")
    public  String  hello(User  user, Map<String,Object> map , HttpSession  session){


        User loginuser = userService.login(user);
       // System.out.println(loginuser);
        if(loginuser!=null){

            session.setAttribute("user",loginuser);
            return "redirect:/main.html";
        }


        map.put("msg","用户名或密码错误");

        return  "login";

    }

    @RequestMapping("empAll")
    @ResponseBody
    public  pageUtil  empAll(Emp emp,Integer page,
                             Integer rows){

        return  userService.empAll(emp, page, rows);



    }
    @RequestMapping("deptQueryAll")
    @ResponseBody
    public  List<Dept> deptQueryAll(){
        return  userService.deptQueryAll();

    }

    @RequestMapping("delEmp")
    @ResponseBody
    public  String  delEmp(String empid){


        userService.delEmp(empid);
        return  "ok";

    }


    @RequestMapping("addEmp")
    @ResponseBody
    public String addEmp(Emp  emp){


        emp.setEmpid(UUID.randomUUID().toString());
        userService.addEmp(emp);

        return  "ok";

    }

    @RequestMapping("editEmp")
    @ResponseBody
    public String editEmp(Emp  emp){



        userService.editEmp(emp);

        return  "ok";

    }

    @RequestMapping("empQueryAll")
    @ResponseBody
    public  List<Emp>  empQueryAll(){

        return  userService.empQueryAll();

    }

    @RequestMapping("delWork")
    @ResponseBody
    public  String  delWork(String  workid){


        userService.delwork(workid);
        return  "ok";
    }

    @RequestMapping("workAll")
    @ResponseBody
    public  pageUtil workAll(Work work,Integer page,
                             Integer rows){


        return  userService.workAll(work, page,rows);
    }
}
