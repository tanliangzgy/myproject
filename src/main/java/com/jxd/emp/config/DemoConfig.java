package com.jxd.emp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName DemoConfig
 * @Description TODO
 * @Author tanliang
 * @Date 2020/10/23
 * @Version 1.0
 */

@Configuration
public class DemoConfig {
    //一个@Configuration配置类，可以代表一个XML文件
    @Bean(name="person")  //name指定bean组件的id
    public Person getPerson(){
        //一个方法代表一个bean标签
        //这个方法的返回的对象被加载到Spring容器中
        Person person = new Person();
        person.setName("张三");
        person.setSex("男");
        return person;
    }
}
