package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloController{
    @RequestMapping("/hello")
    public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response)throws Exception{
        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("message","Hello Spring MVC!!!");
        return mav;
    }
    @RequestMapping("/jumphello")
    public ModelAndView jumphello(){
        ModelAndView mav = new ModelAndView("redirect:/hello");
        return mav;
    }
    @RequestMapping("/check")
    public ModelAndView check(HttpSession session){
        Integer i = (Integer)session.getAttribute("count");
        if(i == null){
            i = 0;
        }
        i++;
        session.setAttribute("count",i);
        ModelAndView mav = new ModelAndView("check");
        return mav;
    }
    @RequestMapping("/clear")
    public ModelAndView clearSession(HttpSession session){
        Integer i = (Integer)session.getAttribute("count");
        if(0!=i){
            i = 0;
        }
        session.setAttribute("count",i);
        ModelAndView mav = new ModelAndView("redirect:/check");
        return mav;
    }
}
