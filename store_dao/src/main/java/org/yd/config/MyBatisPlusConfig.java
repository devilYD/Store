package org.yd.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSessionFactory;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.yd.utils.YmlConfigFactory;

import javax.sql.DataSource;

@Configuration
@PropertySource(value = "classpath:application.yml",encoding = "utf-8",factory = YmlConfigFactory.class)
@MapperScan("org.yd.dao")
public class MyBatisPlusConfig {

    @Bean
    @Autowired
    public DataSource dataSource(@Value("${spring.datasource.driver-class-name}") String classname,
                                 @Value("${spring.datasource.url}") String url,
                                 @Value("${spring.datasource.username}") String username,
                                 @Value("${spring.datasource.password}") String password) {
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(classname);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        MybatisSqlSessionFactoryBean ssfb = new MybatisSqlSessionFactoryBean();
        ssfb.setDataSource(dataSource);
        ssfb.setTypeAliasesPackage("org.YD");

        return ssfb.getObject();
    }
}
