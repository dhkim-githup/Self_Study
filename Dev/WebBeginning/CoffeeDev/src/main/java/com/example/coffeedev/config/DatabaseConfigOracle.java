package com.example.coffeedev.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/*************************************************** 
* 
* 업무 그룹명 : 공통 업무
* 서브 업무명 : 공통 업무
* 설      명 : 데이터베이스 연결을 위한 데이터소스 정의
* 작   성  자 : 윤지훈
* 작   성  일 : 2020.11.09
* Copyright ⓒ SK C&C. All Right Reserved
* ======================================
* 변경자/변경일 :  jihun7core / 2020.01.22
* 변경사유/내역 :  multi datasource 처리를 위해 미사용 어노테이션 주석으로 처리됨
*               향 후 로컬개발은 application.yml (/main/resource)
*               개발,운영,로컬빌드는 configuration/database/dev|local|prod 에서 담당
* ======================================
* 
****************************************************/ 

//@Configuration
//@EnableTransactionManagement
public class DatabaseConfigOracle {

	
	/*
	 * @Method Name : dataSource
	 * @작성일 : 2020-11-09
	 * @작성자 : 윤지훈
	 * @Method 설명 : 커넥션 정보에 대한 Data 소스 빌딩
	 * @param 
	 * @return 설정된 DataSource
	 * @exception Exception
	 * @변경이력 :
	 */
	@Bean
	@Qualifier("dataSource")
	@ConfigurationProperties(prefix="spring.datasource.hikari")
	public DataSource dataSource() {
		return DataSourceBuilder.create()
				.type(HikariDataSource.class)
				.build();
	}
}
