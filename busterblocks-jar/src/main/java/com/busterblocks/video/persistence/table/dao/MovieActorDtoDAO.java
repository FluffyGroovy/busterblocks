package com.busterblocks.video.persistence.table.dao;

import com.busterblocks.video.persistence.table.dto.MovieActorDtoExample;
import com.busterblocks.video.persistence.table.dto.MovieActorDtoKey;
import java.util.List;

public interface MovieActorDtoDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.MOVIE_ACTOR
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    int countByExample(MovieActorDtoExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.MOVIE_ACTOR
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    int deleteByExample(MovieActorDtoExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.MOVIE_ACTOR
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    int deleteByPrimaryKey(MovieActorDtoKey key);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.MOVIE_ACTOR
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    void insert(MovieActorDtoKey record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.MOVIE_ACTOR
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    void insertSelective(MovieActorDtoKey record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.MOVIE_ACTOR
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    List<MovieActorDtoKey> selectByExample(MovieActorDtoExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.MOVIE_ACTOR
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    int updateByExampleSelective(MovieActorDtoKey record, MovieActorDtoExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.MOVIE_ACTOR
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    int updateByExample(MovieActorDtoKey record, MovieActorDtoExample example);
}