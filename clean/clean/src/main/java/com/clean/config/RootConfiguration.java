package com.clean.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.clean.mapper.AccountMapper;
import com.clean.service.AccountServiceImpl;

@Configuration
@MapperScan(basePackages = {"com.clean.mapper"})
@EnableTransactionManagement
public class RootConfiguration implements ApplicationContextAware{
	
	
	private ApplicationContext applicationcontext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		
		this.applicationcontext = applicationContext;
	}
	
	@Bean
	public BasicDataSource dbcpDataSource( ) {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");	// xe : 기본(clean으로 하는거 아님)
		dataSource.setUsername("clean");
		dataSource.setPassword("clean");
		dataSource.setMaxTotal(10);
		dataSource.setMaxIdle(5);
		dataSource.setMaxWaitMillis(-1);
		
		return dataSource;
	}
	
 
	@Bean // JDBC template
	public JdbcTemplate jdbcTemplate () {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dbcpDataSource());                       
		
		return jdbcTemplate;
	}
	
		
	@Bean // 계정 관련
	public AccountServiceImpl accountService() {
		AccountServiceImpl accountService = new AccountServiceImpl();
		accountService.setAccountMapper(applicationcontext.getBean(AccountMapper.class)); // setter 방식
		
		return accountService;
	}
	
	
	
	@Bean	// mybatis
	public SqlSessionFactory sqlSessionFactory() throws Exception{
		
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();  // 다른 객체를 만드는 객체 
		factoryBean.setDataSource(dbcpDataSource());
		factoryBean.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
		SqlSessionFactory sessionFactory = factoryBean.getObject(); // IoC컨테이너에 등록할 객체 생성
		
		return sessionFactory;
	}
	
	// 트랜잭션 설정
	@Bean
	public DataSourceTransactionManager txManager() {
		return new DataSourceTransactionManager(dbcpDataSource());
	}
}
