package com.example.coffeedev.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan(value = {"com.example.coffeedev.v1","com.example.coffeedev.v2"}, sqlSessionFactoryRef = "sqlSessionFactoryMainDB")
public class DbMainConfig {

    /*
     * DataSource : DB와 관계된 커넥션 정보를 담고있으며 빈으로 등록하여 인자로 넘겨준다. → 이 과정을 통해 Spring은 DataSource로 DB와의 연결을 획득한다.
                    - DB 서버와의 연결을 해준다.
                    - DB Connetion pooling기능
     * ConfigurationProperties : .properties , *.yml 파일에 있는 property를 자바 클래스에 값을 가져와서(바인딩) 사용할 수 있게 해주는 어노테이션
     *
     */

    @Primary
    @Bean(name = "datasourceMainDb")
    @ConfigurationProperties(prefix = "spring.maindb.datasource")
    public DataSource datasourceMainDb() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "sqlSessionFactoryMainDB")
    public SqlSessionFactory sqlSessionFactoryMainDB(@Qualifier("datasourceMainDb") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        //sqlSessionFactoryBean.setTypeAliasesPackage("com.example.demo.test1");
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:sqlmapper/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    @Primary
    @Bean(name = "SqlSessionTemplateMainDb")
    public SqlSessionTemplate SqlSessionTemplateMainDb(@Qualifier("sqlSessionFactoryMainDB") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
