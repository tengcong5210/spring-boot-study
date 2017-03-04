package com.tcc.boot.annotation.chapter_3_4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 条件注解@Conditional
 * 该示例以不同的操作系统作为条件，通过实现Condition接口，并重写matchers方法来判断条件，
 * 若在windows系统下运行，则输出dir;在linux系统下运行，则输出ls
 * Created by ibm on 2017/3/4.
 */
public class TestMain {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService=context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name")+"系统下的列表命令："+listService.showListCmd());
    }
}
