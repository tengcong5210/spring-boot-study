package com.tcc.boot.chapter_6_5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * Created by ibm on 2017/3/4.
 */
@Configuration
@EnableConfigurationProperties(HttpEncodingProperties.class)//1.开启属性注入
@ConditionalOnClass(CharacterEncodingFilter.class)//2.当CharacterEncodingFilter在类路径的条件下
//3.当spring.http.encoding=enabled的情况下，如果没有设置则默认为true
@ConditionalOnProperty(prefix = "spring.http.encoding",value = "enabled",matchIfMissing = true)
public class HttpEncodingAutoConfiguration {
    @Autowired
    private HttpEncodingProperties httpEncodingProperties;
    @Bean
    //4.当容器中没有这个Bean的时候新建Bean
    @ConditionalOnMissingBean(CharacterEncodingFilter.class)
    public CharacterEncodingFilter characterEncodingFilter(){
        CharacterEncodingFilter filter=new CharacterEncodingFilter();
        filter.setEncoding(this.httpEncodingProperties.getCharset().name());
        filter.setForceEncoding(this.httpEncodingProperties.isForce());
        return filter;
    }
}
