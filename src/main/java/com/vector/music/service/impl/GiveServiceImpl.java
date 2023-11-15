package com.vector.music.service.impl;

import com.vector.music.dao.GiveMapper;
import com.vector.music.dao.RankMapper;
import com.vector.music.domain.Give;
import com.vector.music.domain.SongList;
import com.vector.music.service.GiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 评价service实现
 */
@Service
public class GiveServiceImpl implements GiveService {

    @Autowired
    private GiveMapper giveMapper;

    /**
     * 增加
     *
     * @param give
     */
    @Override
    public boolean insert(Give give) {
        return giveMapper.insert(give)>0;
    }

    /**
     * 查总分
     *
     * @param songListId
     */
    @Override
    public int selectGiveType(Integer songListId,Integer consumerId) {
        return giveMapper.selectGiveType(songListId,consumerId);
    }

    /**
     * 修改
     *
     * @param give
     */
    @Override
    public boolean update(Give give) {
        return giveMapper.update(give)>0;
    }

}
