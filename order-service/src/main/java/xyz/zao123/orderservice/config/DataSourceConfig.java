package xyz.zao123.orderservice.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = "xyz.zao123.orderservice.mapper")
@Slf4j
public class DataSourceConfig {

    @Bean("master")
    @ConfigurationProperties(prefix = "spring.datasource.druid.master")
    public DataSource master() {
        return DruidDataSourceBuilder.create().build();
    }

    /**
     * slave DataSource
     *
     * @return list source
     */
    @Bean("slave")
    @ConfigurationProperties(prefix = "spring.datasource.druid.slave")
    public DataSource slave() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean("dataSource")
    @Primary
    public DataSource dataSource() {
//        DynamicDataSource dynamicRoutingDataSource = new DynamicDataSource();
//        Map<Object, Object> dataSourceMap = new HashMap<>(2);
//        dataSourceMap.put("slave", slave());
//        dataSourceMap.put("master", master());
//
//        // Set master datasource as default
//        dynamicRoutingDataSource.setDefaultTargetDataSource(master());
//        // Set master and slave datasource as target datasource
//        dynamicRoutingDataSource.setTargetDataSources(dataSourceMap);

        return master();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }
}

