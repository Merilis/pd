package ee.bcs.koolitus.muisikratt2.spring_app.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.authorizeRequests().antMatchers("/**").permitAll();
    http.authorizeRequests().antMatchers("/console/**").permitAll();
    http.csrf().disable();
    http.headers().frameOptions().disable();
  }

}
