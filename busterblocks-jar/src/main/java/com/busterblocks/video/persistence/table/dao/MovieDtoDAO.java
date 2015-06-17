package com.busterblocks.video.persistence.table.dao;

import com.busterblocks.video.persistence.table.dto.MovieDto;
import com.busterblocks.video.persistence.table.dto.MovieDtoExample;
import java.math.BigDecimal;
import java.util.List;

public interface MovieDtoDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.MOVIE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    int countByExample(MovieDtoExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.MOVIE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    int deleteByExample(MovieDtoExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.MOVIE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    int deleteByPrimaryKey(BigDecimal MOVIE_ID);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.MOVIE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    void insert(MovieDto record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.MOVIE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    void insertSelective(MovieDto record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.MOVIE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    List<MovieDto> selectByExample(MovieDtoExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.MOVIE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    MovieDto selectByPrimaryKey(BigDecimal MOVIE_ID);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.MOVIE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    int updateByExampleSelective(MovieDto record, MovieDtoExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.MOVIE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    int updateByExample(MovieDto record, MovieDtoExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.MOVIE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    int updateByPrimaryKeySelective(MovieDto record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.MOVIE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    int updateByPrimaryKey(MovieDto record);
}