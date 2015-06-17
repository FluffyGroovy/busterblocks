package com.busterblocks.video.persistence.table.dao;

import com.busterblocks.video.persistence.table.dto.VideoDto;
import com.busterblocks.video.persistence.table.dto.VideoDtoExample;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class VideoDtoDAOImpl extends SqlMapClientDaoSupport implements VideoDtoDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public VideoDtoDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public int countByExample(VideoDtoExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("HR_VIDEO.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public int deleteByExample(VideoDtoExample example) {
        int rows = getSqlMapClientTemplate().delete("HR_VIDEO.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public int deleteByPrimaryKey(BigDecimal VIDEO_ID) {
        VideoDto key = new VideoDto();
        key.setVIDEO_ID(VIDEO_ID);
        int rows = getSqlMapClientTemplate().delete("HR_VIDEO.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public void insert(VideoDto record) {
        getSqlMapClientTemplate().insert("HR_VIDEO.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public void insertSelective(VideoDto record) {
        getSqlMapClientTemplate().insert("HR_VIDEO.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    @SuppressWarnings("unchecked")
    public List<VideoDto> selectByExample(VideoDtoExample example) {
        List<VideoDto> list = getSqlMapClientTemplate().queryForList("HR_VIDEO.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public VideoDto selectByPrimaryKey(BigDecimal VIDEO_ID) {
        VideoDto key = new VideoDto();
        key.setVIDEO_ID(VIDEO_ID);
        VideoDto record = (VideoDto) getSqlMapClientTemplate().queryForObject("HR_VIDEO.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public int updateByExampleSelective(VideoDto record, VideoDtoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("HR_VIDEO.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public int updateByExample(VideoDto record, VideoDtoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("HR_VIDEO.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public int updateByPrimaryKeySelective(VideoDto record) {
        int rows = getSqlMapClientTemplate().update("HR_VIDEO.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public int updateByPrimaryKey(VideoDto record) {
        int rows = getSqlMapClientTemplate().update("HR_VIDEO.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table HR.VIDEO
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    private static class UpdateByExampleParms extends VideoDtoExample {
        private Object record;

        public UpdateByExampleParms(Object record, VideoDtoExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}