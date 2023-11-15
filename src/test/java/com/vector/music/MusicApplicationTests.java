package com.vector.music;

import com.vector.music.service.SingerService;
import com.vector.music.service.SongService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@SpringBootTest
class MusicApplicationTests {
    @Autowired
    private SingerService singerService;
    @Test
    void contextLoads() {
        System.out.println(1^2);
    }
}
