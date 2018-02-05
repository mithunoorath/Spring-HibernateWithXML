package mithun.config;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.activation.DataSource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import mithun.learn.samples.App;
import mithun.learn.samples.Dao.AppDao;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages= {"mithun.learn.samples.Dao"})
@ComponentScan(basePackages= {"mithun"})
public class MithunConfig {
	

	@Bean 
	public App app() {
		App app = new App();	
		return app;
	}

	@Bean
	public BasicDataSource dataSource() {
		BasicDataSource ds = null;
		ds = new BasicDataSource();
		ds.setMaxActive(25);
		ds.setDriverClassName(dataSourceProperties().getProperty("driverClassName"));
        ds.setUsername("system");
        ds.setPassword("oracle");
        ds.setUrl(dataSourceProperties().getProperty("jdbcUrl"));
		return ds;	
			 
    }
	
	@Bean
	LocalContainerEntityManagerFactoryBean containerEntityManagerFactoryBean () {
		LocalContainerEntityManagerFactoryBean containerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		containerEntityManagerFactoryBean.setDataSource(dataSource());
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		containerEntityManagerFactoryBean.setJpaVendorAdapter(vendorAdapter);
		containerEntityManagerFactoryBean.setJpaProperties(hibernateAddlProperties());
		containerEntityManagerFactoryBean.setPackagesToScan("mithun");
		return containerEntityManagerFactoryBean;
	}
	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
		jpaTransactionManager.setEntityManagerFactory(entityManagerFactory);
		return jpaTransactionManager;
	}
	
	Properties dataSourceProperties() {
		Properties properties = new Properties();
		properties.setProperty("driverClassName", "oracle.jdbc.OracleDriver");
		properties.setProperty("jdbcUrl","jdbc:oracle:thin:@//localhost:1521/XE");
		return properties;
			
		}
	
	Properties hibernateAddlProperties() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
	    properties.setProperty("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
	    return properties;
	    
	}
}

	