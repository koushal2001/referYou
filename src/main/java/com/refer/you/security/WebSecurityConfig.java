// package com.refer.you.security;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

// @Configuration
// @EnableWebSecurity
// @EnableOAuth2Client
// public class WebSecurityConfig extends WebSecurityConfiguration {

//     @Override
//     protected void configure(HttpSecurity http) throws Exception {
//         http
//             .authorizeRequests()
//                 .antMatchers("/auth/**", "/login**").permitAll()
//                 .anyRequest().authenticated()
//                 .and()
//             .oauth2Login()
//                 .loginPage("/login")
//                 .defaultSuccessUrl("/auth/login")
//                 .and()
//             .logout()
//                 .logoutSuccessUrl("/");
//     }
// }
