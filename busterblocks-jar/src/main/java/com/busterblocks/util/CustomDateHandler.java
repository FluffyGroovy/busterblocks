package com.busterblocks.util;

import com.ibatis.sqlmap.client.extensions.ParameterSetter;
import com.ibatis.sqlmap.client.extensions.ResultGetter;
import com.ibatis.sqlmap.client.extensions.TypeHandlerCallback;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

public class CustomDateHandler implements TypeHandlerCallback {

	public Object getResult(ResultGetter getter) throws SQLException {
		final Object obj = getter.getTimestamp();
		return obj != null ? (Date) obj : null;
	}

	public void setParameter(ParameterSetter setter, Object value) throws SQLException {
		setter.setTimestamp(value != null ? new Timestamp(((Date) value).getTime()) : null);
	}

	public Object valueOf(String datetime) {
		return Timestamp.valueOf(datetime);
	}
}