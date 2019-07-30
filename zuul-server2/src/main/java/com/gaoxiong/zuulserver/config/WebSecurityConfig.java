package com.gaoxiong.zuulserver.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author gaoxiong
 * @ClassName WebSecurityConfig
 * @Description TODO
 * @date 2019/7/30 15:59
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure ( HttpSecurity http ) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/login","/client")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .csrf()
                .disable();
    }
}
