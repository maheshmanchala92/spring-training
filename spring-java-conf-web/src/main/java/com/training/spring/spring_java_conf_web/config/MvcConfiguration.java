package com.training.spring.spring_java_conf_web.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="com.training")
@EnableWebMvc
//@EnableTransactionManagement
//@PropertySource(value = { "classpath:application.properties" })
public class MvcConfiguration extends WebMvcConfigurerAdapter{

	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");// 			/WEB-INF/views/home.jsp
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
	        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	        sessionFactory.setDataSource(dataSource());
	        sessionFactory.setPackagesToScan(new String[] { "com.training.spring.spring_java_conf_web.model" });
	        sessionFactory.setHibernateProperties(hibernateProperties());
	        return sessionFactory;
	}
	     
	    @Bean
	    public DataSource dataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	        dataSource.setUrl("jdbc:mysql://localhost:3306/spring-app-hib?useSSL=false");
	        dataSource.setUsername("root");
	        dataSource.setPassword("root");
	        return dataSource;
	    }
	     
	    private Properties hibernateProperties() {
	        Properties properties = new Properties();
	        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
	        properties.put("hibernate.show_sql", true);
	        properties.put("hibernate.format_sql", false);
	        properties.put("hibernate.hbm2ddl.auto", "validate");
	        return properties;        
	    }
	    
	/*
	 * @Bean
	 * 
	 * @Autowired public HibernateTransactionManager
	 * transactionManager(SessionFactory s) { HibernateTransactionManager txManager
	 * = new HibernateTransactionManager(); txManager.setSessionFactory(s); return
	 * txManager; }
	 */
	
}
