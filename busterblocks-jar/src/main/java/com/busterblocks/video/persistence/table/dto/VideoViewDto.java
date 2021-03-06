package com.busterblocks.video.persistence.table.dto;

import java.math.BigDecimal;
import java.util.Date;

public class VideoViewDto {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column HR.VIDEO_VIEW.MOVIE_ID
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    private BigDecimal MOVIE_ID;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column HR.VIDEO_VIEW.MOVIE_NAME
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    private String MOVIE_NAME;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column HR.VIDEO_VIEW.GENRE_ID
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    private BigDecimal GENRE_ID;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column HR.VIDEO_VIEW.GENRE_DESCRIPTION
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    private String GENRE_DESCRIPTION;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column HR.VIDEO_VIEW.ACTOR_ID
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    private BigDecimal ACTOR_ID;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column HR.VIDEO_VIEW.ACTOR_NAME
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    private String ACTOR_NAME;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column HR.VIDEO_VIEW.DURATION_IN_MINUTES
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    private Short DURATION_IN_MINUTES;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column HR.VIDEO_VIEW.VIDEO_ID
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    private BigDecimal VIDEO_ID;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column HR.VIDEO_VIEW.DATE_VIDEO_RELEASED
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    private Date DATE_VIDEO_RELEASED;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column HR.VIDEO_VIEW.VIDEO_ITEM_ID
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    private BigDecimal VIDEO_ITEM_ID;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column HR.VIDEO_VIEW.SERIAL_NUMBER
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    private String SERIAL_NUMBER;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column HR.VIDEO_VIEW.DATE_VIDEO_ITEM_CREATED
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    private Date DATE_VIDEO_ITEM_CREATED;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column HR.VIDEO_VIEW.VIDEO_STATUS_ID
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    private BigDecimal VIDEO_STATUS_ID;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column HR.VIDEO_VIEW.VIDEO_STATUS_DESCRIPTION
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    private String VIDEO_STATUS_DESCRIPTION;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column HR.VIDEO_VIEW.MOVIE_ID
     *
     * @return the value of HR.VIDEO_VIEW.MOVIE_ID
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    public BigDecimal getMOVIE_ID() {
        return MOVIE_ID;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column HR.VIDEO_VIEW.MOVIE_ID
     *
     * @param MOVIE_ID the value for HR.VIDEO_VIEW.MOVIE_ID
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    public void setMOVIE_ID(BigDecimal MOVIE_ID) {
        this.MOVIE_ID = MOVIE_ID;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column HR.VIDEO_VIEW.MOVIE_NAME
     *
     * @return the value of HR.VIDEO_VIEW.MOVIE_NAME
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    public String getMOVIE_NAME() {
        return MOVIE_NAME;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column HR.VIDEO_VIEW.MOVIE_NAME
     *
     * @param MOVIE_NAME the value for HR.VIDEO_VIEW.MOVIE_NAME
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    public void setMOVIE_NAME(String MOVIE_NAME) {
        this.MOVIE_NAME = MOVIE_NAME == null ? null : MOVIE_NAME.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column HR.VIDEO_VIEW.GENRE_ID
     *
     * @return the value of HR.VIDEO_VIEW.GENRE_ID
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    public BigDecimal getGENRE_ID() {
        return GENRE_ID;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column HR.VIDEO_VIEW.GENRE_ID
     *
     * @param GENRE_ID the value for HR.VIDEO_VIEW.GENRE_ID
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    public void setGENRE_ID(BigDecimal GENRE_ID) {
        this.GENRE_ID = GENRE_ID;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column HR.VIDEO_VIEW.GENRE_DESCRIPTION
     *
     * @return the value of HR.VIDEO_VIEW.GENRE_DESCRIPTION
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    public String getGENRE_DESCRIPTION() {
        return GENRE_DESCRIPTION;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column HR.VIDEO_VIEW.GENRE_DESCRIPTION
     *
     * @param GENRE_DESCRIPTION the value for HR.VIDEO_VIEW.GENRE_DESCRIPTION
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    public void setGENRE_DESCRIPTION(String GENRE_DESCRIPTION) {
        this.GENRE_DESCRIPTION = GENRE_DESCRIPTION == null ? null : GENRE_DESCRIPTION.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column HR.VIDEO_VIEW.ACTOR_ID
     *
     * @return the value of HR.VIDEO_VIEW.ACTOR_ID
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    public BigDecimal getACTOR_ID() {
        return ACTOR_ID;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column HR.VIDEO_VIEW.ACTOR_ID
     *
     * @param ACTOR_ID the value for HR.VIDEO_VIEW.ACTOR_ID
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    public void setACTOR_ID(BigDecimal ACTOR_ID) {
        this.ACTOR_ID = ACTOR_ID;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column HR.VIDEO_VIEW.ACTOR_NAME
     *
     * @return the value of HR.VIDEO_VIEW.ACTOR_NAME
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    public String getACTOR_NAME() {
        return ACTOR_NAME;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column HR.VIDEO_VIEW.ACTOR_NAME
     *
     * @param ACTOR_NAME the value for HR.VIDEO_VIEW.ACTOR_NAME
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    public void setACTOR_NAME(String ACTOR_NAME) {
        this.ACTOR_NAME = ACTOR_NAME == null ? null : ACTOR_NAME.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column HR.VIDEO_VIEW.DURATION_IN_MINUTES
     *
     * @return the value of HR.VIDEO_VIEW.DURATION_IN_MINUTES
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    public Short getDURATION_IN_MINUTES() {
        return DURATION_IN_MINUTES;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column HR.VIDEO_VIEW.DURATION_IN_MINUTES
     *
     * @param DURATION_IN_MINUTES the value for HR.VIDEO_VIEW.DURATION_IN_MINUTES
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    public void setDURATION_IN_MINUTES(Short DURATION_IN_MINUTES) {
        this.DURATION_IN_MINUTES = DURATION_IN_MINUTES;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column HR.VIDEO_VIEW.VIDEO_ID
     *
     * @return the value of HR.VIDEO_VIEW.VIDEO_ID
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    public BigDecimal getVIDEO_ID() {
        return VIDEO_ID;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column HR.VIDEO_VIEW.VIDEO_ID
     *
     * @param VIDEO_ID the value for HR.VIDEO_VIEW.VIDEO_ID
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    public void setVIDEO_ID(BigDecimal VIDEO_ID) {
        this.VIDEO_ID = VIDEO_ID;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column HR.VIDEO_VIEW.DATE_VIDEO_RELEASED
     *
     * @return the value of HR.VIDEO_VIEW.DATE_VIDEO_RELEASED
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    public Date getDATE_VIDEO_RELEASED() {
        return DATE_VIDEO_RELEASED;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column HR.VIDEO_VIEW.DATE_VIDEO_RELEASED
     *
     * @param DATE_VIDEO_RELEASED the value for HR.VIDEO_VIEW.DATE_VIDEO_RELEASED
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    public void setDATE_VIDEO_RELEASED(Date DATE_VIDEO_RELEASED) {
        this.DATE_VIDEO_RELEASED = DATE_VIDEO_RELEASED;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column HR.VIDEO_VIEW.VIDEO_ITEM_ID
     *
     * @return the value of HR.VIDEO_VIEW.VIDEO_ITEM_ID
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    public BigDecimal getVIDEO_ITEM_ID() {
        return VIDEO_ITEM_ID;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column HR.VIDEO_VIEW.VIDEO_ITEM_ID
     *
     * @param VIDEO_ITEM_ID the value for HR.VIDEO_VIEW.VIDEO_ITEM_ID
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    public void setVIDEO_ITEM_ID(BigDecimal VIDEO_ITEM_ID) {
        this.VIDEO_ITEM_ID = VIDEO_ITEM_ID;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column HR.VIDEO_VIEW.SERIAL_NUMBER
     *
     * @return the value of HR.VIDEO_VIEW.SERIAL_NUMBER
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    public String getSERIAL_NUMBER() {
        return SERIAL_NUMBER;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column HR.VIDEO_VIEW.SERIAL_NUMBER
     *
     * @param SERIAL_NUMBER the value for HR.VIDEO_VIEW.SERIAL_NUMBER
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    public void setSERIAL_NUMBER(String SERIAL_NUMBER) {
        this.SERIAL_NUMBER = SERIAL_NUMBER == null ? null : SERIAL_NUMBER.trim();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column HR.VIDEO_VIEW.DATE_VIDEO_ITEM_CREATED
     *
     * @return the value of HR.VIDEO_VIEW.DATE_VIDEO_ITEM_CREATED
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    public Date getDATE_VIDEO_ITEM_CREATED() {
        return DATE_VIDEO_ITEM_CREATED;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column HR.VIDEO_VIEW.DATE_VIDEO_ITEM_CREATED
     *
     * @param DATE_VIDEO_ITEM_CREATED the value for HR.VIDEO_VIEW.DATE_VIDEO_ITEM_CREATED
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    public void setDATE_VIDEO_ITEM_CREATED(Date DATE_VIDEO_ITEM_CREATED) {
        this.DATE_VIDEO_ITEM_CREATED = DATE_VIDEO_ITEM_CREATED;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column HR.VIDEO_VIEW.VIDEO_STATUS_ID
     *
     * @return the value of HR.VIDEO_VIEW.VIDEO_STATUS_ID
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    public BigDecimal getVIDEO_STATUS_ID() {
        return VIDEO_STATUS_ID;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column HR.VIDEO_VIEW.VIDEO_STATUS_ID
     *
     * @param VIDEO_STATUS_ID the value for HR.VIDEO_VIEW.VIDEO_STATUS_ID
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    public void setVIDEO_STATUS_ID(BigDecimal VIDEO_STATUS_ID) {
        this.VIDEO_STATUS_ID = VIDEO_STATUS_ID;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column HR.VIDEO_VIEW.VIDEO_STATUS_DESCRIPTION
     *
     * @return the value of HR.VIDEO_VIEW.VIDEO_STATUS_DESCRIPTION
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    public String getVIDEO_STATUS_DESCRIPTION() {
        return VIDEO_STATUS_DESCRIPTION;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column HR.VIDEO_VIEW.VIDEO_STATUS_DESCRIPTION
     *
     * @param VIDEO_STATUS_DESCRIPTION the value for HR.VIDEO_VIEW.VIDEO_STATUS_DESCRIPTION
     *
     * @ibatorgenerated Mon Jun 15 18:30:59 CAT 2015
     */
    public void setVIDEO_STATUS_DESCRIPTION(String VIDEO_STATUS_DESCRIPTION) {
        this.VIDEO_STATUS_DESCRIPTION = VIDEO_STATUS_DESCRIPTION == null ? null : VIDEO_STATUS_DESCRIPTION.trim();
    }
}