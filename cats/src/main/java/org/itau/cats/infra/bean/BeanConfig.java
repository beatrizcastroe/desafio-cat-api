package org.itau.cats.infra.bean;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public DozerBeanMapper getDozerMapper() {
        return new DozerBeanMapper();
    }

}
