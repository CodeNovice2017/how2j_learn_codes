package filter;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//打印用户访问ip地址和访问的页面
public class FirstFilter implements Filter {
    @Override
    public void destroy(){

    }
    @Override
    public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain) throws IOException, ServletException{
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        String ip = request.getRemoteAddr();
        String url = request.getRequestURL().toString();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = new Date();
        String date = sdf.format(d);

        System.out.printf("%s %s 访问了 %s%n",date,ip,url);
        chain.doFilter(request,response);
    }
//    与Servlet需要配置自启动才会随着tomcat的启动而执行init()方法不一样。
//    Filter一定会随着tomcat的启动自启动。
    @Override
    public void init(FilterConfig arg0) throws ServletException{
        System.out.println("First Filter init()");
    }
}
