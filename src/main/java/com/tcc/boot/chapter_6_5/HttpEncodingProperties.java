package com.tcc.boot.chapter_6_5;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.nio.charset.Charset;

/**
 *@ConfigurationProperties 将properties中的属性和一个bean的属性关联，实现类型安全配置
 * 其中prefix是前缀
 * Created by ibm on 2017/3/4.
 */
@ConfigurationProperties(prefix = "spring.http.encoding")
public class HttpEncodingProperties {
    public static final Charset default_charset= Charset.forName("GBK");
    private  Charset charset=default_charset;
    private boolean force=false;

    public Charset getCharset() {
        return charset;
    }

    public void setCharset(Charset charset) {
        this.charset = charset;
    }

    public boolean isForce() {
        return force;
    }

    public void setForce(boolean force) {
        this.force = force;
    }
}
