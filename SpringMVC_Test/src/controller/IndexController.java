package controller;
//控制类 IndexController实现接口Controller ，提供方法handleRequest处理请求
//SpringMVC通过 ModelAndView 对象把模型和视图结合在一起
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;

@Controller
public class IndexController {
    @RequestMapping("/index")
    public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response)throws Exception{
//        表示视图
        ModelAndView mav = new ModelAndView("index");
//        模型数据
        mav.addObject("message","Hello Spring MVC!");
        return mav;
    }
    @RequestMapping("/jump")
    public ModelAndView jump(){
        ModelAndView mav = new ModelAndView("redirect:/index");
        return mav;
    }
}
