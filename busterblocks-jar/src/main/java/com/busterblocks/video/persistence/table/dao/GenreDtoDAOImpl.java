package com.busterblocks.video.persistence.table.dao;

import com.busterblocks.video.persistence.table.dto.GenreDto;
import com.busterblocks.video.persistence.table.dto.GenreDtoExample;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class GenreDtoDAOImpl extends SqlMapClientDaoSupport implements GenreDtoDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.GENRE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public GenreDtoDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.GENRE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public int countByExample(GenreDtoExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("HR_GENRE.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.GENRE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public int deleteByExample(GenreDtoExample example) {
        int rows = getSqlMapClientTemplate().delete("HR_GENRE.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.GENRE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public int deleteByPrimaryKey(BigDecimal GENRE_ID) {
        GenreDto key = new GenreDto();
        key.setGENRE_ID(GENRE_ID);
        int rows = getSqlMapClientTemplate().delete("HR_GENRE.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.GENRE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public void insert(GenreDto record) {
        getSqlMapClientTemplate().insert("HR_GENRE.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.GENRE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public void insertSelective(GenreDto record) {
        getSqlMapClientTemplate().insert("HR_GENRE.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.GENRE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    @SuppressWarnings("unchecked")
    public List<GenreDto> selectByExample(GenreDtoExample example) {
        List<GenreDto> list = getSqlMapClientTemplate().queryForList("HR_GENRE.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.GENRE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public GenreDto selectByPrimaryKey(BigDecimal GENRE_ID) {
        GenreDto key = new GenreDto();
        key.setGENRE_ID(GENRE_ID);
        GenreDto record = (GenreDto) getSqlMapClientTemplate().queryForObject("HR_GENRE.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.GENRE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public int updateByExampleSelective(GenreDto record, GenreDtoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("HR_GENRE.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.GENRE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public int updateByExample(GenreDto record, GenreDtoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("HR_GENRE.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.GENRE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public int updateByPrimaryKeySelective(GenreDto record) {
        int rows = getSqlMapClientTemplate().update("HR_GENRE.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.GENRE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public int updateByPrimaryKey(GenreDto record) {
        int rows = getSqlMapClientTemplate().update("HR_GENRE.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table HR.GENRE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    private static class UpdateByExampleParms extends GenreDtoExample {
        private Object record;

        public UpdateByExampleParms(Object record, GenreDtoExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}