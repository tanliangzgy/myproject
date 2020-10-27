package com.jxd.emp.controller;

import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.jxd.emp.model.Emp;
import com.jxd.emp.model.Users;
import com.jxd.emp.service.IEmpService;
import com.jxd.emp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sound.midi.MidiChannel;
import javax.swing.text.html.parser.Entity;
import java.util.List;

/**
 * @ClassName EmpController
 * @Description TODO
 * @Author tanliang
 * @Date 2020/10/22
 * @Version 1.0
 */
@Controller
public class EmpController {

    @Value("${name}")
    private String name;

    @Value("${student.sname}")
    private String sname;

    @Value("${persons[0].pname}")
    private String pname;

    @Autowired
    private IEmpService empService;

    @Autowired
    private IUserService userService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println(name);
        System.out.println(sname);
        System.out.println(pname);
        return "Hello SpringBoot!!! 热部署测试";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "Hello SpringBoot!!! 热部署测试";
    }

    @RequestMapping("/getAll")
    @ResponseBody
    public List<Emp> getAll(){
        return empService.getAll();
    }


    @RequestMapping("/getUser")
    @ResponseBody
    public List<Users> getUser(){
        //创建条件构造器对象
        //Wrapper<Users> wrapper = new AbstractWrapper<>();

        return userService.list();
    }


   @RequestMapping("/helloBtl")
    public String helloBtl(Model model){
       model.addAttribute("msg","hello Btl !!!");
       return "hello.btl";
    }

   @RequestMapping("/helloBtil02")
    public String helloBtl02(Model model){
        model.addAttribute("msg","html模板文件");
        return "hello02.html";
   }

   @RequestMapping("/welcome")
    public String welcome(Model model){
        model.addAttribute("msg","改变了模板位置");
        List<Users> list = userService.list();
        model.addAttribute("list",list);
        return "welcome.html";
    }

    @RequestMapping("/login/{uname}/{pwd}")
    @ResponseBody
    public String login(@PathVariable("uname") String uname,@PathVariable("pwd") String pwd){
        if("admin".equals(uname) && "123".equals(pwd)){
            return "success";
        }else {
            return "error";
        }

    }


}
