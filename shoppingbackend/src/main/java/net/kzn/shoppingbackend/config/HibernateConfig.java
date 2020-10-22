package net.kzn.shoppingbackend.config;


import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;

@Configuration
@ComponentScan(basePackages={"net.kzn.shoppingbackend.dto"})
public class HibernateConfig {
//create five varible by using this we provide database realted information
	private final String DATABASE_URL ="jdbc:h2:tcp://localhost/~/onlineshoppings";
	private final String DATABASE_DRIVER ="org.h2.Driver";
	private final String DATABASE_DIALECT ="org.hibernate.dialect.H2Dialect";
	private final String DATABASE_USENAME ="sa";
	private final String DATABASE_PASSWORD ="";

	// provide cnnection pooling by using DataSource bean
@Bean
public DataSource getDataSource () {
	
	BasicDataSource  datasource=new BasicDataSource();
	datasource.setDriverClassName(DATABASE_DRIVER);
	datasource.setUrl(DATABASE_URL);
	datasource.setUsername(DATABASE_USENAME);
	datasource.setPassword(DATABASE_PASSWORD);	
	return datasource;
	
}
//session factory bean
@Bean
public SessionFactory getSessionFactory(DataSource dataSource)  {
LocalSessionFactoryBuilder  localSessionFactoryBuilder=new LocalSessionFactoryBuilder(dataSource);
localSessionFactoryBuilder.addProperties(getHibernateproperties());
localSessionFactoryBuilder.scanPackages("net.kzn.shoppingbackend.dto");
return localSessionFactoryBuilder.buildSessionFactory();

}

private Properties getHibernateproperties() {
	Properties properties=new Properties();
	properties.put("hibernate.dialect", DATABASE_DIALECT);
	properties.put("hibernate.show_sql",true);
	properties.put("hibernate.format_sql",true);
	
	return properties;
}
//transaction management bean
@Bean
public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory){

	HibernateTransactionManager hibernateTransactionManager=new HibernateTransactionManager(sessionFactory);
	return hibernateTransactionManager	;
}
	
}

