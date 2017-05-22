package com.example;

/***
 *
 * 描    述：
 *
 * 创 建 者： liudh
 * 创建时间： 2017/5/11 13:38
 * 创建描述：
 *
 */
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.sql.SQLException;

/**
 * @author Niu Li
 * @date 2016/8/12
 */
@Configuration
public class DataSourcesConfig {
    /**
     * druid初始化
     * @return
     * @throws SQLException
     */
    @Primary //默认数据源
    @Bean(name = "dataSource",destroyMethod = "close")
    public DruidDataSource Construction() throws SQLException {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://192.168.160.61:3306/zc");
        dataSource.setUsername("zc");
        dataSource.setPassword("zcdbpasswd");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        //配置最大连接
        dataSource.setMaxActive(20);
        //配置初始连接
        dataSource.setInitialSize(1);
        //配置最小连接
        dataSource.setMinIdle(1);
        //连接等待超时时间
        dataSource.setMaxWait(60000);
        //间隔多久进行检测,关闭空闲连接
        dataSource.setTimeBetweenEvictionRunsMillis(60000);
        //一个连接最小生存时间
        dataSource.setMinEvictableIdleTimeMillis(300000);
        //用来检测是否有效的sql
        dataSource.setValidationQuery("select 'x'");
        dataSource.setTestWhileIdle(true);
        dataSource.setTestOnBorrow(false);
        dataSource.setTestOnReturn(false);
        //打开PSCache,并指定每个连接的PSCache大小
        dataSource.setPoolPreparedStatements(true);
        dataSource.setMaxOpenPreparedStatements(20);
        //配置sql监控的filter
        dataSource.setFilters("stat,wall,log4j");
        try {
            dataSource.init();
        } catch (SQLException e) {
            throw new RuntimeException("druid datasource init fail");
        }
        return dataSource;
    }
}