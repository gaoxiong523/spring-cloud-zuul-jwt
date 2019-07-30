package com.gaoxiong.authserver.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;

import javax.sql.DataSource;

/**
 * @author gaoxiong
 * @ClassName AuthorizationServerConfig
 * @Description TODO
 * @date 2019/7/30 16:05
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {


    @Autowired
    private DataSource dataSource;

    @Override
    public void configure ( AuthorizationServerSecurityConfigurer security ) throws Exception {
        super.configure(security);
    }

    @Override
    public void configure ( ClientDetailsServiceConfigurer clients ) throws Exception {
        clients.jdbc()
    }

    @Override
    public void configure ( AuthorizationServerEndpointsConfigurer endpoints ) throws Exception {
        super.configure(endpoints);
    }
}
