package com.busterblocks.video.persistence.table.dto;

import java.math.BigDecimal;

public class VideoStatusDto {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column HR.VIDEO_STATUS.VIDEO_STATUS_ID
     *
     * @ibatorgenerated Mon Jun 15 18:24:55 CAT 2015
     */
    private BigDecimal VIDEO_STATUS_ID;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column HR.VIDEO_STATUS.DESCRIPTION
     *
     * @ibatorgenerated Mon Jun 15 18:24:55 CAT 2015
     */
    private String DESCRIPTION;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column HR.VIDEO_STATUS.VIDEO_STATUS_ID
     *
     * @return the value of HR.VIDEO_STATUS.VIDEO_STATUS_ID
     *
     * @ibatorgenerated Mon Jun 15 18:24:55 CAT 2015
     */
    public BigDecimal getVIDEO_STATUS_ID() {
        return VIDEO_STATUS_ID;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column HR.VIDEO_STATUS.VIDEO_STATUS_ID
     *
     * @param VIDEO_STATUS_ID the value for HR.VIDEO_STATUS.VIDEO_STATUS_ID
     *
     * @ibatorgenerated Mon Jun 15 18:24:55 CAT 2015
     */
    public void setVIDEO_STATUS_ID(BigDecimal VIDEO_STATUS_ID) {
        this.VIDEO_STATUS_ID = VIDEO_STATUS_ID;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column HR.VIDEO_STATUS.DESCRIPTION
     *
     * @return the value of HR.VIDEO_STATUS.DESCRIPTION
     *
     * @ibatorgenerated Mon Jun 15 18:24:55 CAT 2015
     */
    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column HR.VIDEO_STATUS.DESCRIPTION
     *
     * @param DESCRIPTION the value for HR.VIDEO_STATUS.DESCRIPTION
     *
     * @ibatorgenerated Mon Jun 15 18:24:55 CAT 2015
     */
    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION == null ? null : DESCRIPTION.trim();
    }
}