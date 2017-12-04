package com.ablat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 注解@Controller表示它是一个Controller
 * */
@Controller(value = "myController")
//表明当请求的url在/my下的时候才有该控制器响应
@RequestMapping(value = "/my",method = RequestMethod.GET)
public class MyController {

    //表明url是 /my/index的时候该方法才运行
    @RequestMapping("/index")
    public ModelAndView index(@RequestParam("id") Long id){
        System.out.println(id);
        //模型和视图
        ModelAndView mv = new ModelAndView();
        //视图逻辑名称为index
        mv.setViewName("index");
        //返回模型和试图
        return mv;
    }


}
