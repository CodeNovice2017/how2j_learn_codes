package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DatabaseMetaData;
import charactor.*;
import java.util.List;
import java.util.ArrayList;
import jdbc.ConnectionPool;

public class TestJDBC {
    //JDBC ORM Object Relationship DataBase Mapping 对象和关系数据库的映射 简单来说 一个对象对应数据库的一条记录
    public static Hero get(int id) {
        Hero hero = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try(
        Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8", "root", "admin");
        Statement s = c.createStatement();) {
            String sql = "select * from hero where id = " + id;
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                hero = new Hero();
                String name = rs.getString(2);
                float hp = rs.getFloat("hp");
                int damage = rs.getInt(4);
                hero.name = name;
                hero.hp = hp;
                hero.damage = damage;
                hero.id = id;
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        return hero;
}
    public static void main(String[] args) {

        //初始化驱动
//        try {
//            //驱动类com.mysql.jdbc.Driver
//            //就在 mysql-connector-java-5.0.8-bin.jar中
//            //如果忘记了第一个步骤的导包，就会抛出ClassNotFoundException
//            Class.forName("com.mysql.jdbc.Driver");
//
//            System.out.println("数据库驱动加载成功 ！");
//
//        } catch (ClassNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        // 建立与数据库的Connection连接
        // 这里需要提供：
        // 数据库所处于的ip:127.0.0.1 (本机)
        // 数据库的端口号： 3306 （mysql专用端口号）
        // 数据库名称 how2java
        // 编码方式 UTF-8
        // 账号 root
//        Connection c = null;
//        Statement s = null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");// 密码 admin
//            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8", "root", "admin");
//            System.out.println("连接成功,获取连接对象: "+ c);
//            s = c.createStatement();
//            System.out.println("获取Statement对象: "+s);
//            String sql = "insert into hero values(null,"+"'提莫'"+","+313.0f+","+50+")";
//            s.execute(sql);
//            System.out.println("执行插入语句成功");
//        }catch(ClassNotFoundException e){
//            e.printStackTrace();
//        }catch(SQLException e){
//            e.printStackTrace();
//        }finally{
//            // 数据库的连接时有限资源，相关操作结束后，养成关闭数据库的好习惯
//            // 先关闭Statement
//            if(s!=null){
//                try{
//                    s.close();
//                }catch(SQLException e){
//                    e.printStackTrace();
//                }
//            }
//            //再关闭connection
//            if(c!=null){
//                try{
//                    c.close();
//                }catch(SQLException e){
//                    e.printStackTrace();
//                }
//            }
//        }
//        try(Connection c1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","admin");
//            Statement s1 = c1.createStatement();){
//            for(int i = 0;i<100;i++){
//                String sql = "insert into hero values(null," + "'英雄" + i+"'"+","+313.0f + "," + 50 + ")";
//                String sql2 = "select * from hero";
//                s1.execute(sql);
//                ResultSet rs = s1.executeQuery(sql2);
//                while(rs.next()){
//                    int id = rs.getInt("id");
//                    String name = rs.getString(2);
//                    float hp = rs.getFloat("hp");
//                    int damage = rs.getInt(4);
//                    System.out.printf("%d\t%s\t%f\t%d%n",id,name,hp,damage);
//                }
//                // 不一定要在这里关闭ReultSet，因为Statement关闭的时候，会自动关闭ResultSet
//            }
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
        //查询
//        try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","admin");
//            Statement s = c.createStatement();){
//            String name = "dashen";
//            String password = "thisispassword1";
//            String sql = "select * from user where name = '" + name + "' and password = '" + password + "'";
//            String sql2 = "select count(*) from hero";
//            ResultSet rs = s.executeQuery(sql);
//            ResultSet rs2 = s.executeQuery(sql2);
//            int total = 0;
//            while(rs2.next()){
//                total = rs2.getInt(1);
//            }
//            System.out.println("表Hero中共有:" + total + "条数据");
////            if(rs.next()){
////                System.out.println("账号密码正确");
////            }else{
////                System.out.println("账号密码错误");
////            }
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
        //PreparedStatement
        //Statement 需要进行字符串拼接，可读性和维护性比较差
        //PreparedStatement 使用参数设置，可读性好，不易犯错
        //PreparedStatement有预编译机制，性能比Statement更快
        //PreparedStatement的优点3-防止SQL注入式攻击
//        String sql = "insert into hero values(null,?,?,?)";
//        try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","admin");
//            PreparedStatement ps = c.prepareStatement(sql);){
//            ps.setString(1,"提莫");
//            ps.setFloat(2,313.0f);
//            ps.setInt(3,50);
//            ps.execute();
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
        //PreparedStatement和Statement插入数据耗时比较
//        long t1,t2,t3,t4 = 0;
//        try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","admin");
//            Statement s = c.createStatement();){
//            t1 = System.currentTimeMillis();
//            for(int i = 0;i<10000;i++) {
//                String sql0 = "insert into hero values(null,"+"'超级英雄"+i+"',"+400f+","+60+")";
//                s.execute(sql0);
//            }
//            t2 = System.currentTimeMillis();
//            System.out.println(t2-t1);
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
//        String sql1 = "insert into hero values(null,?,?,?)";
//        try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","admin");
//            PreparedStatement ps = c.prepareStatement(sql1,Statement.RETURN_GENERATED_KEYS);){
//            t3 = System.currentTimeMillis();
//            for(int i = 0;i<10000;i++){
//                ps.setString(1,"超级英雄"+i);
//                ps.setFloat(2,400);
//                ps.setInt(3,60);
//                ps.execute();
//                ResultSet rs1 = ps.getGeneratedKeys();
//                while(rs1.next()){
//                    int id = rs1.getInt(1);
//                    System.out.println(id);
//                }
//            }
//            t4 = System.currentTimeMillis();
//            System.out.println(t4-t3);
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
        //数据库元数据的访问
//        try(Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8","root","admin");){
//            DatabaseMetaData dbmd = c.getMetaData();
//            System.out.println("数据库产品名称:\t"+dbmd.getDatabaseProductName());
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
//        //ORM
//        Hero h = get(22);
//        System.out.println(h.name);
//    }
        //DAO Data Access Object 数据访问对象
        //实际上就是运用了练习-ORM中的思路，把数据库相关的操作都封装在这个类里面，其他地方看不到JDBC的代码


        //数据库连接池ConnectionPool的实现
        ConnectionPool cp = new ConnectionPool(3);
        for(int i = 0;i<100;i++){
            new WorkingThread("Working thread"+i,cp).start();
        }
    }
}
class WorkingThread extends Thread{
    private ConnectionPool cp;
    public WorkingThread(String name,ConnectionPool cp){
        super(name);
        this.cp = cp;
    }
    @Override
    public void run(){
        Connection c = cp.getConnection();
        System.out.println(this.getName()+ ":\t 获取了一根连接，并开始工作"  );
        try(Statement st = c.createStatement()){
            Thread.sleep(1000);
            st.execute("select * from hero");
        }catch(SQLException e){
            e.printStackTrace();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        cp.returnConnection(c);
    }
}