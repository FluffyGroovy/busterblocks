package com.busterblocks.util;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class GenericSequenceDtoDaoManager extends SqlMapClientDaoSupport {

	public Long generateNewSequenceId() {
		final GenericSequence dbSequence = (GenericSequence) getSqlMapClientTemplate().queryForObject("Query.GenericSequence");
		return dbSequence.getNewId();
	}
}
