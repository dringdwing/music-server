package com.vector.music.service.impl;

import com.vector.music.dao.SongMapper;
import com.vector.music.domain.Song;
import com.vector.music.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 歌曲Service实现类
 */
@Service
public class SongServiceImpl implements SongService {
    @Autowired
    private SongMapper songMapper;
    /**
     * 增加
     *
     * @param song
     */
    @Override
    public boolean insert(Song song) {
        return songMapper.insert(song)>0;
    }

    /**
     * 修改
     *
     * @param song
     */
    @Override
    public boolean update(Song song) {
        return songMapper.update(song)>0;
    }

    /**
     * 删除
     *
     * @param id
     */
    @Override
    public boolean delete(Integer id) {
        return songMapper.delete(id)>0;
    }

    /**
     * 根据主键查询
     *
     * @param id
     */
    @Override
    public Song selectByPrimaryKey(Integer id) {
        return songMapper.selectByPrimaryKey(id);
    }
    /**
     * 根据主键查询歌曲地址
     *
     * @param id
     */
    @Override
    public String selectByPrimaryKeySong(Integer id) {
        return songMapper.selectByPrimaryKeySong(id);
    }

    /**
     * 查询所有歌曲
     */
    @Override
    public List<Song> allSong() {
        return songMapper.allSong();
    }

    /**
     * 根据歌名字精确查询列表
     *
     * @param name
     */
    @Override
    public List<Song> songOfName(String name) {
        return songMapper.songOfName(name);
    }

    /**
     * 根据歌名字模糊查询列表
     *
     * @param name
     */
    @Override
    public List<Song> likeSongOfName(String name) {
        return songMapper.likeSongOfName("%"+name+"%");
    }

    /**
     * 根据歌手id查询
     *
     * @param singerId
     */
    @Override
    public List<Song> songOfSingerId(Integer singerId) {
        return songMapper.songOfSingerId(singerId);
    }
}
