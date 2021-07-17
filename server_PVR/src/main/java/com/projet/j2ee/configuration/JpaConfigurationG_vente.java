package com.projet.j2ee.configuration;

import java.util.HashMap;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@PropertySource(value = { "classpath:application.properties" })

@ComponentScan
@EnableJpaRepositories
public class JpaConfigurationG_vente {
	 @Autowired
	    private Environment env;
	    
	    @Bean
	    @Primary
	    public LocalContainerEntityManagerFactoryBean userEntityManager() {
	        LocalContainerEntityManagerFactoryBean em
	          = new LocalContainerEntityManagerFactoryBean();
	        em.setDataSource(userDataSource());
	        em.setPackagesToScan(
	          new String[] { "com.projet.j2ee.models" });

	        HibernateJpaVendorAdapter vendorAdapter
	          = new HibernateJpaVendorAdapter();
	        em.setJpaVendorAdapter(vendorAdapter);
	        HashMap<String, Object> properties = new HashMap<>();
	        properties.put("hibernate.hbm2ddl.auto",
	          env.getProperty("hibernate.hbm2ddl.auto"));
	        properties.put("hibernate.dialect",
	          env.getProperty("hibernate.dialect"));
	        em.setJpaPropertyMap(properties);

	        return em;
	    }

	    @Primary
	    @Bean
	    public DataSource userDataSource() {
	 
	        DriverManagerDataSource dataSource
	          = new DriverManagerDataSource();
	        dataSource.setDriverClassName(
	          env.getProperty("app.datasource.g_vente.driver-class-name"));
	        dataSource.setUrl(env.getProperty("app.datasource.g_vente.url"));
	        dataSource.setUsername(env.getProperty("app.datasource.g_vente.username"));
	        dataSource.setPassword(env.getProperty("app.datasource.g_vente.password"));

	        return dataSource;
	    }

	    @Primary
	    @Bean
	    public PlatformTransactionManager userTransactionManager() {
	 
	        JpaTransactionManager transactionManager
	          = new JpaTransactionManager();
	        transactionManager.setEntityManagerFactory(
	          userEntityManager().getObject());
	        return transactionManager;
	    }

}
