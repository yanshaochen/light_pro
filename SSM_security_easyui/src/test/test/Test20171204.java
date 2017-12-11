package test;

import com.giit.dao.IUserInfoDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test20171204 {
    @Test
    public void test01(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext_Test.xml");
        IUserInfoDao dao = (IUserInfoDao)ctx.getBean("IUserInfoDao");
        //do something
    }
}
