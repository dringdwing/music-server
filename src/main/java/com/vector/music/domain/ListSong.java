package com.vector.music.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 歌单里面的歌曲
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListSong implements Serializable {

    private Integer id;     //主键

    private Integer songId; //歌曲id

    private Integer songListId; //歌单id

}
