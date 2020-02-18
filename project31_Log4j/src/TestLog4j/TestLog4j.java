package TestLog4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLog4j {
//    基于类的名称获取日志对象
    static Logger logger = Logger.getLogger(TestLog4j.class);
    public static void main(String[] args) throws InterruptedException{
        //log4j入门
////        进行默认配置
//        BasicConfigurator.configure();
////        设置日志输出级别
//        logger.setLevel(Level.DEBUG);
////        进行不同级别的日志输出
//        logger.trace("跟踪信息");
//        logger.debug("调试信息");
//        logger.info("输出信息");
////        Thread.sleep(1000); 是为了便于观察前后日志输出的时间差
//        Thread.sleep(1000);
//        logger.warn("警告信息");
//        logger.error("错误信息");
//        logger.fatal("致命信息");
        //log4j配置讲解
        PropertyConfigurator.configure("C:\\DataCenter\\Coder\\How2J\\Codes\\how2j_learn_codes\\project31_Log4j\\src\\log4j.properties");
        for (int i = 0; i < 5000; i++) {
            logger.trace("跟踪信息");
            logger.debug("调试信息");
            logger.info("输出信息");
            logger.warn("警告信息");
            logger.error("错误信息");
            logger.fatal("致命信息");
        }
    }
}
