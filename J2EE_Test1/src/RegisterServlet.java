import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
    protected void service(HttpServletRequest request,HttpServletResponse response)
    throws IOException,ServletException{
        System.out.println("获取单值参数name:"+request.getParameter("name"));
        String[] habits = request.getParameterValues("habits");
        System.out.println("获取具有多值的参数habits: "+Arrays.asList(habits));
        System.out.println("通过 getParameterMap 遍历所有的参数： ");
        Map<String, String[]> parameters = request.getParameterMap();
        Set<String> paramNames = parameters.keySet();
        for(String param : paramNames){
            String[] value = parameters.get(param);
            System.out.println(param + ":" + Arrays.asList(value));
        }
    }
}
