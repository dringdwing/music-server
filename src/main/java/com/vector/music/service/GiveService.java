package com.vector.music.service;

import com.vector.music.domain.Give;
import com.vector.music.domain.ListSong;

/**
 * 评价service接口
 */
public interface GiveService {
    /**
     *增加
     */
    public boolean insert(Give give);

    /**
     * 查点赞状态
     */
    public int selectGiveType(Integer songListId,Integer consumerId);

    /**
     *修改点赞状态
     */
    public boolean update(Give give);

}
