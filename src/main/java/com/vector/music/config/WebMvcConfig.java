package com.vector.music.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    /**
     * 解决跨域问题
     * 实现WebMvcConfigurer父类的方法
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("*")
                .allowCredentials(true)
                .allowedMethods("GET", "POST", "DELETE", "PUT", "PATCH");
    }
    /**
     * 定位图片地址
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        /**
         * 歌手头像地址
         */
        registry.addResourceHandler("/img/singerPic/**").addResourceLocations(
                "file:"+System.getProperty("user.dir")+System.getProperty("file.separator")+"img"
                        +System.getProperty("file.separator")+"singerPic"+System.getProperty("file.separator")
        );
        /**
         * 歌单封面图片地址
         */
        registry.addResourceHandler("/img/songListPic/**").addResourceLocations(
                "file:"+System.getProperty("user.dir")+System.getProperty("file.separator")+"img"
                        +System.getProperty("file.separator")+"songListPic"+System.getProperty("file.separator")
        );
        /**
         * 歌曲图片地址
         */
        registry.addResourceHandler("/img/songPic/**").addResourceLocations(
                "file:"+System.getProperty("user.dir")+System.getProperty("file.separator")+"img"
                        +System.getProperty("file.separator")+"songPic"+System.getProperty("file.separator")
        );
        /**
         *  歌曲地址
         */
        registry.addResourceHandler("/song/**").addResourceLocations(
                "file:"+System.getProperty("user.dir")+System.getProperty("file.separator")+"song"+System.getProperty("file.separator")
        );
        /**
         *  前端用户头像地址
         */
        registry.addResourceHandler("/avatorImages/**").addResourceLocations(
                "file:"+System.getProperty("user.dir")+System.getProperty("file.separator")+"avatorImages"+System.getProperty("file.separator")
        );
        /**
         *  前端用户头像默认地址
         */
        registry.addResourceHandler("/img/**").addResourceLocations(
                "file:"+System.getProperty("user.dir")+System.getProperty("file.separator")+"img"+System.getProperty("file.separator")
        );
    }
}
