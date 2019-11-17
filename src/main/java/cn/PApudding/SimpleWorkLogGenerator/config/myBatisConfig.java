package cn.PApudding.SimpleWorkLogGenerator.config;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;


@Configuration
@EnableTransactionManagement    //开启事务管理
public class myBatisConfig {
    /**
     * 配置数据源
     * @return
     */
    @Bean
    public DataSource getDataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setJdbcUrl("jdbc:mysql://120.79.18.137:3306/SimpleWorkLogGenerator?useUnicode=true&characterEncoding=utf8");
        dataSource.setUser("root");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setPassword("MYh1000s23t14V");
        dataSource.setInitialPoolSize(3);
        dataSource.setMaxPoolSize(10);
        dataSource.setMinPoolSize(3);
        dataSource.setAcquireIncrement(3);
        return dataSource;
    }

    /**
     * 配置SqlSessionFactoryBean
     * @param dataSource
     * @return
     */
    @Bean
    public SqlSessionFactoryBean getSessionFactory(DataSource dataSource){
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);

        //sessionFactoryBean.setTypeAliasesPackage("cn.PApudding.SimpleWorkLogGenerator.pojo");
        //sessionFactoryBean.setMapperLocations(new ClassPathResource[]{new ClassPathResource("config/mybatis/mapper/WorkType.xml")});
        return sessionFactoryBean;
    }

    /**
     * 配置声明式事务管理器
     * @param dataSource
     * @return
     */
    @Bean
    public PlatformTransactionManager getTransactionManager(DataSource dataSource){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(dataSource);
        return transactionManager;
    }

    /**
     * 配置pojo扫描
     * @return
     */
    @Bean
    public MapperScannerConfigurer getMapperScannerConfig(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("cn.PApudding.SimpleWorkLogGenerator.dao");
        return mapperScannerConfigurer;
    }
}
