package com.oldwang.config;

import com.oldwang.pojo.Oldwang;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(OldwangConfig2.class)
public class OldwangConfig {

    @Bean
    public Oldwang oldwang() {
        return new Oldwang();
    }
}
