package ee.bcs.koolitus.muisikratt2.spring_app.config;

import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = {"ee.bcs.koolitus.muisikratt2.spring_app.repository"})
@EnableTransactionManagement
public class JpaConfiguration {

  @Value("${spring.jpa.hibernate.ddl-auto:none}")
  private String ddlAuto;
  @Value("${spring.jpa.show-sql:false}")
  private String showSql;

  @Bean
  public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
    LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
    entityManagerFactory.setDataSource(dataSource);
    entityManagerFactory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
    entityManagerFactory.setJpaDialect(new HibernateJpaDialect());
    entityManagerFactory.setPackagesToScan("ee.bcs.koolitus.muisikratt2.spring_app.entity");
    entityManagerFactory.setJpaPropertyMap(hibernateJpaProperties());
    return entityManagerFactory;
  }

  private Map<String, ?> hibernateJpaProperties() {
    Map<String, String> properties = new HashMap<>();
    properties.put("hibernate.hbm2ddl.auto", ddlAuto);
    properties.put("hibernate.show_sql", showSql);
    properties.put("hibernate.connection.charSet", "UTF-8");
    return properties;
  }

  @Bean
  public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
    JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
    jpaTransactionManager.setEntityManagerFactory(emf);
    return jpaTransactionManager;
  }
}
