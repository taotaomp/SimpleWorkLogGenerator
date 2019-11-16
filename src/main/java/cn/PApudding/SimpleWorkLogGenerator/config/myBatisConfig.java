package cn.PApudding.SimpleWorkLogGenerator.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Configuration
@EnableTransactionManagement    //开启事务管理
@PropertySource("classpath:db.properties")
public class myBatisConfig {
    @Value("${url}")
    String DBUrl;

    @Bean
    public DataSource getDataSource() throws IOException {

        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(DBUrl);
        return druidDataSource;
    }
}
