import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet{
    //生命周期1:实例化:用户通过浏览器访问输入一个路径,对应的servlet被调用的时候,该servlet就会被实例化
//    public LoginServlet(){
//        System.out.println("LoginServlet构造方法被调用");
//    }
    //生命周期2:初始化:LoginServlet 继承了HttpServlet，同时也继承了init(ServletConfig) 方法
    //init 方法是一个实例方法，所以会在构造方法执行后执行。
    //无论访问了多少次LoginServlet
    //init初始化 只会执行一次
//    public void init(){
//        System.out.println("init(ServletConfig)");
//    }
//    public void destroy(){
//        System.out.println("destroy");
//    }
    //生命周期3:提供服务:接下来就是执行service()方法，然后通过浏览器传递过来的信息进行判断，是调用doGet()还是doPost()方法
    //在service中编写的代码就称为业务代码
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        System.out.println("浏览器发出请求时的完整URL，包括协议 主机名 端口(如果有): " + request.getRequestURL());
        System.out.println("浏览器发出请求的资源名部分，去掉了协议和主机名: " + request.getRequestURI());
        System.out.println("请求行中的参数部分: " + request.getQueryString());
        System.out.println("浏览器所处于的客户机的IP地址: " + request.getRemoteAddr());
        System.out.println("浏览器所处于的客户机的主机名: " + request.getRemoteHost());
        System.out.println("浏览器所处于的客户机使用的网络端口: " + request.getRemotePort());
        System.out.println("服务器的IP地址: " + request.getLocalAddr());
        System.out.println("服务器的主机名: " + request.getLocalName());
        System.out.println("得到客户机请求方式: " + request.getMethod());
        if("admin".equals(name)&&"123".equals(password)) {
            //LoginServlet发现密码正确会在服务器内部访问success.html并把内容发给浏览器
            request.getRequestDispatcher("success.html").forward(request,response);
        }else{
            //密码错误,服务器发送一条特殊消息给浏览器,让浏览器访问fail.html,浏览器访问fail.html,服务器获取fail.html的内容发送给浏览器
            response.sendRedirect("fail.html");
        }
        response.setContentType("text/html; charset=UTF-8");
    }
}
