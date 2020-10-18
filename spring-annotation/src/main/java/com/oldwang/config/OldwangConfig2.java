package com.oldwang.config;

import com.oldwang.pojo.Oldwang;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OldwangConfig2 {

    @Bean
    public Oldwang oldwang2(){
       Oldwang oldwang = new Oldwang();
       oldwang.name="lovelace";
       return oldwang;
    }
}
