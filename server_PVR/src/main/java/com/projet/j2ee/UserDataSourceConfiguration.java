package com.projet.j2ee;
import java.util.HashMap;
 
import javax.sql.DataSource;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
 
import com.zaxxer.hikari.HikariDataSource;
 
@Configuration
@EnableJpaRepositories(basePackages = "com.projet.j2ee.repos.g_user", entityManagerFactoryRef = "userEntityManager", transactionManagerRef = "userTransactionManager")
public class UserDataSourceConfiguration {
 
    @Autowired
    Environment env;
 
    @Bean
    @ConfigurationProperties(prefix = "app.datasource.user")
    public DataSourceProperties userDataSourceProperties() {
        return new DataSourceProperties();
    }
 
    @Bean
    public DataSource userDataSource() {
        return userDataSourceProperties().initializeDataSourceBuilder().type(HikariDataSource.class).build();
    }
 
    @Bean
    public LocalContainerEntityManagerFactoryBean userEntityManager() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(userDataSource());
        em.setPackagesToScan("com.projet.j2ee.models.g_user");
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
        properties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
        em.setJpaPropertyMap(properties);
        return em;
    }
 
    @Bean
    public PlatformTransactionManager userTransactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(userEntityManager().getObject());
        return transactionManager;
    }
}