package com.busterblocks.video.persistence.table.dao;

import com.busterblocks.video.persistence.table.dto.VideoStatusDto;
import com.busterblocks.video.persistence.table.dto.VideoStatusDtoExample;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class VideoStatusDtoDAOImpl extends SqlMapClientDaoSupport implements VideoStatusDtoDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO_STATUS
     *
     * @ibatorgenerated Mon Jun 15 18:24:55 CAT 2015
     */
    public VideoStatusDtoDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO_STATUS
     *
     * @ibatorgenerated Mon Jun 15 18:24:55 CAT 2015
     */
    public int countByExample(VideoStatusDtoExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("HR_VIDEO_STATUS.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO_STATUS
     *
     * @ibatorgenerated Mon Jun 15 18:24:55 CAT 2015
     */
    public int deleteByExample(VideoStatusDtoExample example) {
        int rows = getSqlMapClientTemplate().delete("HR_VIDEO_STATUS.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO_STATUS
     *
     * @ibatorgenerated Mon Jun 15 18:24:55 CAT 2015
     */
    public int deleteByPrimaryKey(BigDecimal VIDEO_STATUS_ID) {
        VideoStatusDto key = new VideoStatusDto();
        key.setVIDEO_STATUS_ID(VIDEO_STATUS_ID);
        int rows = getSqlMapClientTemplate().delete("HR_VIDEO_STATUS.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO_STATUS
     *
     * @ibatorgenerated Mon Jun 15 18:24:55 CAT 2015
     */
    public void insert(VideoStatusDto record) {
        getSqlMapClientTemplate().insert("HR_VIDEO_STATUS.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO_STATUS
     *
     * @ibatorgenerated Mon Jun 15 18:24:55 CAT 2015
     */
    public void insertSelective(VideoStatusDto record) {
        getSqlMapClientTemplate().insert("HR_VIDEO_STATUS.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO_STATUS
     *
     * @ibatorgenerated Mon Jun 15 18:24:55 CAT 2015
     */
    @SuppressWarnings("unchecked")
    public List<VideoStatusDto> selectByExample(VideoStatusDtoExample example) {
        List<VideoStatusDto> list = getSqlMapClientTemplate().queryForList("HR_VIDEO_STATUS.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO_STATUS
     *
     * @ibatorgenerated Mon Jun 15 18:24:55 CAT 2015
     */
    public VideoStatusDto selectByPrimaryKey(BigDecimal VIDEO_STATUS_ID) {
        VideoStatusDto key = new VideoStatusDto();
        key.setVIDEO_STATUS_ID(VIDEO_STATUS_ID);
        VideoStatusDto record = (VideoStatusDto) getSqlMapClientTemplate().queryForObject("HR_VIDEO_STATUS.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO_STATUS
     *
     * @ibatorgenerated Mon Jun 15 18:24:55 CAT 2015
     */
    public int updateByExampleSelective(VideoStatusDto record, VideoStatusDtoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("HR_VIDEO_STATUS.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO_STATUS
     *
     * @ibatorgenerated Mon Jun 15 18:24:55 CAT 2015
     */
    public int updateByExample(VideoStatusDto record, VideoStatusDtoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("HR_VIDEO_STATUS.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO_STATUS
     *
     * @ibatorgenerated Mon Jun 15 18:24:55 CAT 2015
     */
    public int updateByPrimaryKeySelective(VideoStatusDto record) {
        int rows = getSqlMapClientTemplate().update("HR_VIDEO_STATUS.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO_STATUS
     *
     * @ibatorgenerated Mon Jun 15 18:24:55 CAT 2015
     */
    public int updateByPrimaryKey(VideoStatusDto record) {
        int rows = getSqlMapClientTemplate().update("HR_VIDEO_STATUS.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table HR.VIDEO_STATUS
     *
     * @ibatorgenerated Mon Jun 15 18:24:55 CAT 2015
     */
    private static class UpdateByExampleParms extends VideoStatusDtoExample {
        private Object record;

        public UpdateByExampleParms(Object record, VideoStatusDtoExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}