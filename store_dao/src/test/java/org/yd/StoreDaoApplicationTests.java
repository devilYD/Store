package org.yd;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.yd.config.MyBatisPlusConfig;
import org.yd.dao.UserDao;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = MyBatisPlusConfig.class,loader = AnnotationConfigContextLoader.class)
public class StoreDaoApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void contextLoads() {
        System.out.println(userDao.selectList(null));
    }

}
