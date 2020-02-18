package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Hero;
import dao.HeroDAO;

public class HeroListServlet2 extends HttpServlet{
    protected void service(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
        int start = 0;
        int count = 3;
        try{
            start = Integer.parseInt(request.getParameter("start"));
        }catch(NumberFormatException e){
            // 当浏览器没有传参数start时
        }
        int last;
        int next = start + count;
        int pre = start - count;
        List<Hero> heros = new HeroDAO().list(start,count);
        int total = new HeroDAO().getTotal();

        if(0==total%count){
            last = total - count;
        }else{
            last = total - total%count;
        }
        pre = pre < 0 ? 0 : pre;
        next = next > last ? last : next;
        request.setAttribute("next",next);
        request.setAttribute("heros",heros);
        request.setAttribute("pre",pre);
        request.setAttribute("last", last);
        request.getRequestDispatcher("listHero2.jsp").forward(request,response);
    }
}
