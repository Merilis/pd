package ee.bcs.koolitus.muisikratt2.spring_app.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfiguration {

  @Value("${spring.datasource.driver-class-name:org.h2.Driver}")
  private String driverClassName;
  @Value("${spring.datasource.url:jdbc:h2:~/test}")
  private String url;
  @Value("${spring.datasource.username:sa}")
  private String username;
  @Value("${spring.datasource.password:}")
  private String password;

  @Bean
  public BasicDataSource dataSource() {
    BasicDataSource basicDataSource = new BasicDataSource();
    basicDataSource.setDriverClassName(driverClassName);
    basicDataSource.setUrl(url);
    basicDataSource.setUsername(username);
    basicDataSource.setPassword(password);
    return basicDataSource;
  }
}
