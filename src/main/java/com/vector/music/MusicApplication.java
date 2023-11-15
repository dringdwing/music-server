package com.vector.music;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 热更新、热加载
 * 1、CTRL+N-->搜索register，然后找到compiler.automake.alLow.when.app.running,勾选
 * 2、CTRL+F9进行热加载
 */
@SpringBootApplication
@MapperScan("com.vector.music.dao")
public class MusicApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicApplication.class, args);
    }

}
