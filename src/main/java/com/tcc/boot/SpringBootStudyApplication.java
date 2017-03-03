package com.tcc.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootStudyApplication {

	//通过@value注解可以把属性(application.properties)文件中的值注入进来
	@Value("${book.author}")
	private String bookAuthor;
	@Value("${book.name}")
	private String bookName;
	@Autowired
	private AuthorSeting authorSeting;

	@RequestMapping("/")
	public String index(){
		return "Hello Spring boot,"+bookAuthor+";"+bookName+";authorName:"+authorSeting.getName()+";age:"+authorSeting.getAge();
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootStudyApplication.class, args);
	}
}
