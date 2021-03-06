package com.busterblocks.video.persistence.table.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class VideoDtoExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table HR.VIDEO
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table HR.VIDEO
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public VideoDtoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    protected VideoDtoExample(VideoDtoExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table HR.VIDEO
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public static class Criteria {
        protected List<String> criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andVIDEO_IDIsNull() {
            addCriterion("VIDEO_ID is null");
            return this;
        }

        public Criteria andVIDEO_IDIsNotNull() {
            addCriterion("VIDEO_ID is not null");
            return this;
        }

        public Criteria andVIDEO_IDEqualTo(BigDecimal value) {
            addCriterion("VIDEO_ID =", value, "VIDEO_ID");
            return this;
        }

        public Criteria andVIDEO_IDNotEqualTo(BigDecimal value) {
            addCriterion("VIDEO_ID <>", value, "VIDEO_ID");
            return this;
        }

        public Criteria andVIDEO_IDGreaterThan(BigDecimal value) {
            addCriterion("VIDEO_ID >", value, "VIDEO_ID");
            return this;
        }

        public Criteria andVIDEO_IDGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VIDEO_ID >=", value, "VIDEO_ID");
            return this;
        }

        public Criteria andVIDEO_IDLessThan(BigDecimal value) {
            addCriterion("VIDEO_ID <", value, "VIDEO_ID");
            return this;
        }

        public Criteria andVIDEO_IDLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VIDEO_ID <=", value, "VIDEO_ID");
            return this;
        }

        public Criteria andVIDEO_IDIn(List<BigDecimal> values) {
            addCriterion("VIDEO_ID in", values, "VIDEO_ID");
            return this;
        }

        public Criteria andVIDEO_IDNotIn(List<BigDecimal> values) {
            addCriterion("VIDEO_ID not in", values, "VIDEO_ID");
            return this;
        }

        public Criteria andVIDEO_IDBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VIDEO_ID between", value1, value2, "VIDEO_ID");
            return this;
        }

        public Criteria andVIDEO_IDNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VIDEO_ID not between", value1, value2, "VIDEO_ID");
            return this;
        }

        public Criteria andMOVIE_IDIsNull() {
            addCriterion("MOVIE_ID is null");
            return this;
        }

        public Criteria andMOVIE_IDIsNotNull() {
            addCriterion("MOVIE_ID is not null");
            return this;
        }

        public Criteria andMOVIE_IDEqualTo(BigDecimal value) {
            addCriterion("MOVIE_ID =", value, "MOVIE_ID");
            return this;
        }

        public Criteria andMOVIE_IDNotEqualTo(BigDecimal value) {
            addCriterion("MOVIE_ID <>", value, "MOVIE_ID");
            return this;
        }

        public Criteria andMOVIE_IDGreaterThan(BigDecimal value) {
            addCriterion("MOVIE_ID >", value, "MOVIE_ID");
            return this;
        }

        public Criteria andMOVIE_IDGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MOVIE_ID >=", value, "MOVIE_ID");
            return this;
        }

        public Criteria andMOVIE_IDLessThan(BigDecimal value) {
            addCriterion("MOVIE_ID <", value, "MOVIE_ID");
            return this;
        }

        public Criteria andMOVIE_IDLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MOVIE_ID <=", value, "MOVIE_ID");
            return this;
        }

        public Criteria andMOVIE_IDIn(List<BigDecimal> values) {
            addCriterion("MOVIE_ID in", values, "MOVIE_ID");
            return this;
        }

        public Criteria andMOVIE_IDNotIn(List<BigDecimal> values) {
            addCriterion("MOVIE_ID not in", values, "MOVIE_ID");
            return this;
        }

        public Criteria andMOVIE_IDBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOVIE_ID between", value1, value2, "MOVIE_ID");
            return this;
        }

        public Criteria andMOVIE_IDNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MOVIE_ID not between", value1, value2, "MOVIE_ID");
            return this;
        }

        public Criteria andDATE_RELEASEDIsNull() {
            addCriterion("DATE_RELEASED is null");
            return this;
        }

        public Criteria andDATE_RELEASEDIsNotNull() {
            addCriterion("DATE_RELEASED is not null");
            return this;
        }

        public Criteria andDATE_RELEASEDEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_RELEASED =", value, "DATE_RELEASED");
            return this;
        }

        public Criteria andDATE_RELEASEDNotEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_RELEASED <>", value, "DATE_RELEASED");
            return this;
        }

        public Criteria andDATE_RELEASEDGreaterThan(Date value) {
            addCriterionForJDBCDate("DATE_RELEASED >", value, "DATE_RELEASED");
            return this;
        }

        public Criteria andDATE_RELEASEDGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_RELEASED >=", value, "DATE_RELEASED");
            return this;
        }

        public Criteria andDATE_RELEASEDLessThan(Date value) {
            addCriterionForJDBCDate("DATE_RELEASED <", value, "DATE_RELEASED");
            return this;
        }

        public Criteria andDATE_RELEASEDLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_RELEASED <=", value, "DATE_RELEASED");
            return this;
        }

        public Criteria andDATE_RELEASEDIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_RELEASED in", values, "DATE_RELEASED");
            return this;
        }

        public Criteria andDATE_RELEASEDNotIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_RELEASED not in", values, "DATE_RELEASED");
            return this;
        }

        public Criteria andDATE_RELEASEDBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_RELEASED between", value1, value2, "DATE_RELEASED");
            return this;
        }

        public Criteria andDATE_RELEASEDNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_RELEASED not between", value1, value2, "DATE_RELEASED");
            return this;
        }
    }
}