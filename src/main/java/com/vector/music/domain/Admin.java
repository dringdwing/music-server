package com.vector.music.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 管理员
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin implements Serializable {
    /**主键*/
    private Integer id;
    /**账号*/
    private String name;
    /**密码*/
    private String password;

}
