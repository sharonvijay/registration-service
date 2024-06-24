package org.reg.registrationservice.configuration;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.filter.CorsFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
@Configuration
public class WebConfig {

    @Value("http://localhost:3000")
    String corsFilterAllowedOrigins;

    @Value("GET,POST,PUT,DELETE,OPTIONS")
    String corsFilterAllowedMethods;

    @Value("Accept,Authorization,Content-Type")
    String corsFilterAllowedHeaders;

    @Value("/api/**")
    String corsFilterAllowedPathPattern;

    @Bean
    public FilterRegistrationBean<CorsFilter> customCorsFilter()
    {
        var corsConfig = new CorsConfiguration();
        corsConfig.setAllowCredentials(true);
        corsConfig.setAllowedHeaders(delimitedStringToList(corsFilterAllowedHeaders));
        corsConfig.setAllowedOrigins(delimitedStringToList(corsFilterAllowedOrigins));
        corsConfig.setAllowedMethods(delimitedStringToList(corsFilterAllowedMethods));
        
        var source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration(corsFilterAllowedPathPattern, corsConfig);

        FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<>(new CorsFilter(source));
        bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
        return bean;
        

    }

    private List<String>delimitedStringToList(String allowedString)
    {
        return Arrays.stream(allowedString.split(",")).map(String::trim).collect(Collectors.toList());
    }
}