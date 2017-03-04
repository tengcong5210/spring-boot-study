package com.tcc.boot.annotation.chapter_3_4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 * Created by ibm on 2017/3/4.
 */
@Configuration
public class ConditionConfig {
    @Bean
    @Conditional(WindowCondition.class)
    public ListService windowsListService(){
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListService(){
        return new LinuxListService();
    }
}
