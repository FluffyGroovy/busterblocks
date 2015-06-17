package com.busterblocks.rental.persistence.table.dao;

import com.busterblocks.rental.persistence.table.dto.LastVideoRentalViewDto;
import com.busterblocks.rental.persistence.table.dto.LastVideoRentalViewDtoExample;

import java.util.List;

public interface LastVideoRentalViewDtoDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.LAST_VIDEO_RENTAL_VIEW
     *
     * @ibatorgenerated Mon Jun 15 18:56:37 CAT 2015
     */
    int countByExample(LastVideoRentalViewDtoExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.LAST_VIDEO_RENTAL_VIEW
     *
     * @ibatorgenerated Mon Jun 15 18:56:37 CAT 2015
     */
    int deleteByExample(LastVideoRentalViewDtoExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.LAST_VIDEO_RENTAL_VIEW
     *
     * @ibatorgenerated Mon Jun 15 18:56:37 CAT 2015
     */
    void insert(LastVideoRentalViewDto record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.LAST_VIDEO_RENTAL_VIEW
     *
     * @ibatorgenerated Mon Jun 15 18:56:37 CAT 2015
     */
    void insertSelective(LastVideoRentalViewDto record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.LAST_VIDEO_RENTAL_VIEW
     *
     * @ibatorgenerated Mon Jun 15 18:56:37 CAT 2015
     */
    List<LastVideoRentalViewDto> selectByExample(LastVideoRentalViewDtoExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.LAST_VIDEO_RENTAL_VIEW
     *
     * @ibatorgenerated Mon Jun 15 18:56:37 CAT 2015
     */
    int updateByExampleSelective(LastVideoRentalViewDto record, LastVideoRentalViewDtoExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.LAST_VIDEO_RENTAL_VIEW
     *
     * @ibatorgenerated Mon Jun 15 18:56:37 CAT 2015
     */
    int updateByExample(LastVideoRentalViewDto record, LastVideoRentalViewDtoExample example);
}