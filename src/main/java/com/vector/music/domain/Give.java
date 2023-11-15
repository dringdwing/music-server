package com.vector.music.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 评价
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Give implements Serializable {
    /*主键*/
    private Integer id;
    /*歌单id*/
    private Integer songListId;
    /*用户id*/
    private Integer consumerId;
    /*评分*/
    private Integer type_A;

}
