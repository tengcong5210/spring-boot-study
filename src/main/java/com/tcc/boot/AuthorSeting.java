package com.tcc.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ConfigurationProperties 将properties中的属性和一个bean的属性关联，实现类型安全配置
 * Created by ibm on 2017/3/3.
 */
@Component
@ConfigurationProperties(prefix = "author")
public class AuthorSeting {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "AuthorSeting{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
