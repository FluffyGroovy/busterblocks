package com.busterblocks.rental.persistence.table.dao;

import com.busterblocks.rental.persistence.table.dto.LastVideoRentalViewDto;
import com.busterblocks.rental.persistence.table.dto.LastVideoRentalViewDtoExample;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.util.List;

public class LastVideoRentalViewDtoDAOImpl extends SqlMapClientDaoSupport implements LastVideoRentalViewDtoDAO {

	/**
	 * This method was generated by Apache iBATIS ibator.
	 * This method corresponds to the database table HR.LAST_VIDEO_RENTAL_VIEW
	 *
	 * @ibatorgenerated Mon Jun 15 18:56:37 CAT 2015
	 */
	public LastVideoRentalViewDtoDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Apache iBATIS ibator.
	 * This method corresponds to the database table HR.LAST_VIDEO_RENTAL_VIEW
	 *
	 * @ibatorgenerated Mon Jun 15 18:56:37 CAT 2015
	 */
	public int countByExample(LastVideoRentalViewDtoExample example) {
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject("HR_LAST_VIDEO_RENTAL_VIEW.ibatorgenerated_countByExample", example);
		return count;
	}

	/**
	 * This method was generated by Apache iBATIS ibator.
	 * This method corresponds to the database table HR.LAST_VIDEO_RENTAL_VIEW
	 *
	 * @ibatorgenerated Mon Jun 15 18:56:37 CAT 2015
	 */
	public int deleteByExample(LastVideoRentalViewDtoExample example) {
		int rows = getSqlMapClientTemplate().delete("HR_LAST_VIDEO_RENTAL_VIEW.ibatorgenerated_deleteByExample", example);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator.
	 * This method corresponds to the database table HR.LAST_VIDEO_RENTAL_VIEW
	 *
	 * @ibatorgenerated Mon Jun 15 18:56:37 CAT 2015
	 */
	public void insert(LastVideoRentalViewDto record) {
		getSqlMapClientTemplate().insert("HR_LAST_VIDEO_RENTAL_VIEW.ibatorgenerated_insert", record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator.
	 * This method corresponds to the database table HR.LAST_VIDEO_RENTAL_VIEW
	 *
	 * @ibatorgenerated Mon Jun 15 18:56:37 CAT 2015
	 */
	public void insertSelective(LastVideoRentalViewDto record) {
		getSqlMapClientTemplate().insert("HR_LAST_VIDEO_RENTAL_VIEW.ibatorgenerated_insertSelective", record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator.
	 * This method corresponds to the database table HR.LAST_VIDEO_RENTAL_VIEW
	 *
	 * @ibatorgenerated Mon Jun 15 18:56:37 CAT 2015
	 */
	@SuppressWarnings("unchecked")
	public List<LastVideoRentalViewDto> selectByExample(LastVideoRentalViewDtoExample example) {
		List<LastVideoRentalViewDto> list = getSqlMapClientTemplate().queryForList("HR_LAST_VIDEO_RENTAL_VIEW.ibatorgenerated_selectByExample", example);
		return list;
	}

	/**
	 * This method was generated by Apache iBATIS ibator.
	 * This method corresponds to the database table HR.LAST_VIDEO_RENTAL_VIEW
	 *
	 * @ibatorgenerated Mon Jun 15 18:56:37 CAT 2015
	 */
	public int updateByExampleSelective(LastVideoRentalViewDto record, LastVideoRentalViewDtoExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update("HR_LAST_VIDEO_RENTAL_VIEW.ibatorgenerated_updateByExampleSelective", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator.
	 * This method corresponds to the database table HR.LAST_VIDEO_RENTAL_VIEW
	 *
	 * @ibatorgenerated Mon Jun 15 18:56:37 CAT 2015
	 */
	public int updateByExample(LastVideoRentalViewDto record, LastVideoRentalViewDtoExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update("HR_LAST_VIDEO_RENTAL_VIEW.ibatorgenerated_updateByExample", parms);
		return rows;
	}

	/**
	 * This class was generated by Apache iBATIS ibator.
	 * This class corresponds to the database table HR.LAST_VIDEO_RENTAL_VIEW
	 *
	 * @ibatorgenerated Mon Jun 15 18:56:37 CAT 2015
	 */
	private static class UpdateByExampleParms extends LastVideoRentalViewDtoExample {
		private Object record;

		public UpdateByExampleParms(Object record, LastVideoRentalViewDtoExample example) {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}
}