package com.vector.music.dao;

import com.vector.music.domain.Give;
import com.vector.music.domain.ListSong;
import org.springframework.stereotype.Repository;


/**
 * 点赞Dao
 */
@Repository
public interface GiveMapper {
    /**
     *增加
     */
    public int insert(Give give);

    /**
     * 查点赞状态
     */
    public int selectGiveType(Integer songListId,Integer consumerId);

    /**
     *修改点赞状态
     */
    public int update(Give give);
}
















