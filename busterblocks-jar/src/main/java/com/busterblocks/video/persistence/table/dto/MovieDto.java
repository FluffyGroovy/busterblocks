package com.busterblocks.video.persistence.table.dto;

import java.math.BigDecimal;

public class MovieDto {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column HR.MOVIE.MOVIE_ID
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    private BigDecimal MOVIE_ID;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column HR.MOVIE.MOVIE_NAME
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    private String MOVIE_NAME;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column HR.MOVIE.GENRE_ID
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    private BigDecimal GENRE_ID;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column HR.MOVIE.DURATION_IN_MINUTES
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    private Short DURATION_IN_MINUTES;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column HR.MOVIE.MOVIE_ID
     *
     * @return the value of HR.MOVIE.MOVIE_ID
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public BigDecimal getMOVIE_ID() {
        return MOVIE_ID;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column HR.MOVIE.MOVIE_ID
     *
     * @param MOVIE_ID the value for HR.MOVIE.MOVIE_ID
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public void setMOVIE_ID(BigDecimal MOVIE_ID) {
        this.MOVIE_ID = MOVIE_ID;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column HR.MOVIE.MOVIE_NAME
     *
     * @return the value of HR.MOVIE.MOVIE_NAME
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public String getMOVIE_NAME() {
        return MOVIE_NAME;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column HR.MOVIE.MOVIE_NAME
     *
     * @param MOVIE_NAME the value for HR.MOVIE.MOVIE_NAME
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public void setMOVIE_NAME(String MOVIE_NAME) {
        this.MOVIE_NAME = MOVIE_NAME == null ? null : MOVIE_NAME.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column HR.MOVIE.GENRE_ID
     *
     * @return the value of HR.MOVIE.GENRE_ID
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public BigDecimal getGENRE_ID() {
        return GENRE_ID;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column HR.MOVIE.GENRE_ID
     *
     * @param GENRE_ID the value for HR.MOVIE.GENRE_ID
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public void setGENRE_ID(BigDecimal GENRE_ID) {
        this.GENRE_ID = GENRE_ID;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column HR.MOVIE.DURATION_IN_MINUTES
     *
     * @return the value of HR.MOVIE.DURATION_IN_MINUTES
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public Short getDURATION_IN_MINUTES() {
        return DURATION_IN_MINUTES;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column HR.MOVIE.DURATION_IN_MINUTES
     *
     * @param DURATION_IN_MINUTES the value for HR.MOVIE.DURATION_IN_MINUTES
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public void setDURATION_IN_MINUTES(Short DURATION_IN_MINUTES) {
        this.DURATION_IN_MINUTES = DURATION_IN_MINUTES;
    }
}