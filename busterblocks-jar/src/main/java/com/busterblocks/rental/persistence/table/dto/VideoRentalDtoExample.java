package com.busterblocks.rental.persistence.table.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class VideoRentalDtoExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table HR.VIDEO_RENTAL
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table HR.VIDEO_RENTAL
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO_RENTAL
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public VideoRentalDtoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO_RENTAL
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    protected VideoRentalDtoExample(VideoRentalDtoExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO_RENTAL
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO_RENTAL
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO_RENTAL
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO_RENTAL
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO_RENTAL
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
     * This method corresponds to the database table HR.VIDEO_RENTAL
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.VIDEO_RENTAL
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table HR.VIDEO_RENTAL
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

        public Criteria andVIDEO_RENTAL_IDIsNull() {
            addCriterion("VIDEO_RENTAL_ID is null");
            return this;
        }

        public Criteria andVIDEO_RENTAL_IDIsNotNull() {
            addCriterion("VIDEO_RENTAL_ID is not null");
            return this;
        }

        public Criteria andVIDEO_RENTAL_IDEqualTo(BigDecimal value) {
            addCriterion("VIDEO_RENTAL_ID =", value, "VIDEO_RENTAL_ID");
            return this;
        }

        public Criteria andVIDEO_RENTAL_IDNotEqualTo(BigDecimal value) {
            addCriterion("VIDEO_RENTAL_ID <>", value, "VIDEO_RENTAL_ID");
            return this;
        }

        public Criteria andVIDEO_RENTAL_IDGreaterThan(BigDecimal value) {
            addCriterion("VIDEO_RENTAL_ID >", value, "VIDEO_RENTAL_ID");
            return this;
        }

        public Criteria andVIDEO_RENTAL_IDGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VIDEO_RENTAL_ID >=", value, "VIDEO_RENTAL_ID");
            return this;
        }

        public Criteria andVIDEO_RENTAL_IDLessThan(BigDecimal value) {
            addCriterion("VIDEO_RENTAL_ID <", value, "VIDEO_RENTAL_ID");
            return this;
        }

        public Criteria andVIDEO_RENTAL_IDLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VIDEO_RENTAL_ID <=", value, "VIDEO_RENTAL_ID");
            return this;
        }

        public Criteria andVIDEO_RENTAL_IDIn(List<BigDecimal> values) {
            addCriterion("VIDEO_RENTAL_ID in", values, "VIDEO_RENTAL_ID");
            return this;
        }

        public Criteria andVIDEO_RENTAL_IDNotIn(List<BigDecimal> values) {
            addCriterion("VIDEO_RENTAL_ID not in", values, "VIDEO_RENTAL_ID");
            return this;
        }

        public Criteria andVIDEO_RENTAL_IDBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VIDEO_RENTAL_ID between", value1, value2, "VIDEO_RENTAL_ID");
            return this;
        }

        public Criteria andVIDEO_RENTAL_IDNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VIDEO_RENTAL_ID not between", value1, value2, "VIDEO_RENTAL_ID");
            return this;
        }

        public Criteria andVIDEO_ITEM_IDIsNull() {
            addCriterion("VIDEO_ITEM_ID is null");
            return this;
        }

        public Criteria andVIDEO_ITEM_IDIsNotNull() {
            addCriterion("VIDEO_ITEM_ID is not null");
            return this;
        }

        public Criteria andVIDEO_ITEM_IDEqualTo(BigDecimal value) {
            addCriterion("VIDEO_ITEM_ID =", value, "VIDEO_ITEM_ID");
            return this;
        }

        public Criteria andVIDEO_ITEM_IDNotEqualTo(BigDecimal value) {
            addCriterion("VIDEO_ITEM_ID <>", value, "VIDEO_ITEM_ID");
            return this;
        }

        public Criteria andVIDEO_ITEM_IDGreaterThan(BigDecimal value) {
            addCriterion("VIDEO_ITEM_ID >", value, "VIDEO_ITEM_ID");
            return this;
        }

        public Criteria andVIDEO_ITEM_IDGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VIDEO_ITEM_ID >=", value, "VIDEO_ITEM_ID");
            return this;
        }

        public Criteria andVIDEO_ITEM_IDLessThan(BigDecimal value) {
            addCriterion("VIDEO_ITEM_ID <", value, "VIDEO_ITEM_ID");
            return this;
        }

        public Criteria andVIDEO_ITEM_IDLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VIDEO_ITEM_ID <=", value, "VIDEO_ITEM_ID");
            return this;
        }

        public Criteria andVIDEO_ITEM_IDIn(List<BigDecimal> values) {
            addCriterion("VIDEO_ITEM_ID in", values, "VIDEO_ITEM_ID");
            return this;
        }

        public Criteria andVIDEO_ITEM_IDNotIn(List<BigDecimal> values) {
            addCriterion("VIDEO_ITEM_ID not in", values, "VIDEO_ITEM_ID");
            return this;
        }

        public Criteria andVIDEO_ITEM_IDBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VIDEO_ITEM_ID between", value1, value2, "VIDEO_ITEM_ID");
            return this;
        }

        public Criteria andVIDEO_ITEM_IDNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VIDEO_ITEM_ID not between", value1, value2, "VIDEO_ITEM_ID");
            return this;
        }

        public Criteria andCUSTOMER_IDIsNull() {
            addCriterion("CUSTOMER_ID is null");
            return this;
        }

        public Criteria andCUSTOMER_IDIsNotNull() {
            addCriterion("CUSTOMER_ID is not null");
            return this;
        }

        public Criteria andCUSTOMER_IDEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_ID =", value, "CUSTOMER_ID");
            return this;
        }

        public Criteria andCUSTOMER_IDNotEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_ID <>", value, "CUSTOMER_ID");
            return this;
        }

        public Criteria andCUSTOMER_IDGreaterThan(BigDecimal value) {
            addCriterion("CUSTOMER_ID >", value, "CUSTOMER_ID");
            return this;
        }

        public Criteria andCUSTOMER_IDGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_ID >=", value, "CUSTOMER_ID");
            return this;
        }

        public Criteria andCUSTOMER_IDLessThan(BigDecimal value) {
            addCriterion("CUSTOMER_ID <", value, "CUSTOMER_ID");
            return this;
        }

        public Criteria andCUSTOMER_IDLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_ID <=", value, "CUSTOMER_ID");
            return this;
        }

        public Criteria andCUSTOMER_IDIn(List<BigDecimal> values) {
            addCriterion("CUSTOMER_ID in", values, "CUSTOMER_ID");
            return this;
        }

        public Criteria andCUSTOMER_IDNotIn(List<BigDecimal> values) {
            addCriterion("CUSTOMER_ID not in", values, "CUSTOMER_ID");
            return this;
        }

        public Criteria andCUSTOMER_IDBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUSTOMER_ID between", value1, value2, "CUSTOMER_ID");
            return this;
        }

        public Criteria andCUSTOMER_IDNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUSTOMER_ID not between", value1, value2, "CUSTOMER_ID");
            return this;
        }

        public Criteria andDATE_BORROWEDIsNull() {
            addCriterion("DATE_BORROWED is null");
            return this;
        }

        public Criteria andDATE_BORROWEDIsNotNull() {
            addCriterion("DATE_BORROWED is not null");
            return this;
        }

        public Criteria andDATE_BORROWEDEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_BORROWED =", value, "DATE_BORROWED");
            return this;
        }

        public Criteria andDATE_BORROWEDNotEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_BORROWED <>", value, "DATE_BORROWED");
            return this;
        }

        public Criteria andDATE_BORROWEDGreaterThan(Date value) {
            addCriterionForJDBCDate("DATE_BORROWED >", value, "DATE_BORROWED");
            return this;
        }

        public Criteria andDATE_BORROWEDGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_BORROWED >=", value, "DATE_BORROWED");
            return this;
        }

        public Criteria andDATE_BORROWEDLessThan(Date value) {
            addCriterionForJDBCDate("DATE_BORROWED <", value, "DATE_BORROWED");
            return this;
        }

        public Criteria andDATE_BORROWEDLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_BORROWED <=", value, "DATE_BORROWED");
            return this;
        }

        public Criteria andDATE_BORROWEDIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_BORROWED in", values, "DATE_BORROWED");
            return this;
        }

        public Criteria andDATE_BORROWEDNotIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_BORROWED not in", values, "DATE_BORROWED");
            return this;
        }

        public Criteria andDATE_BORROWEDBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_BORROWED between", value1, value2, "DATE_BORROWED");
            return this;
        }

        public Criteria andDATE_BORROWEDNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_BORROWED not between", value1, value2, "DATE_BORROWED");
            return this;
        }

        public Criteria andDATE_DUEIsNull() {
            addCriterion("DATE_DUE is null");
            return this;
        }

        public Criteria andDATE_DUEIsNotNull() {
            addCriterion("DATE_DUE is not null");
            return this;
        }

        public Criteria andDATE_DUEEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_DUE =", value, "DATE_DUE");
            return this;
        }

        public Criteria andDATE_DUENotEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_DUE <>", value, "DATE_DUE");
            return this;
        }

        public Criteria andDATE_DUEGreaterThan(Date value) {
            addCriterionForJDBCDate("DATE_DUE >", value, "DATE_DUE");
            return this;
        }

        public Criteria andDATE_DUEGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_DUE >=", value, "DATE_DUE");
            return this;
        }

        public Criteria andDATE_DUELessThan(Date value) {
            addCriterionForJDBCDate("DATE_DUE <", value, "DATE_DUE");
            return this;
        }

        public Criteria andDATE_DUELessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_DUE <=", value, "DATE_DUE");
            return this;
        }

        public Criteria andDATE_DUEIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_DUE in", values, "DATE_DUE");
            return this;
        }

        public Criteria andDATE_DUENotIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_DUE not in", values, "DATE_DUE");
            return this;
        }

        public Criteria andDATE_DUEBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_DUE between", value1, value2, "DATE_DUE");
            return this;
        }

        public Criteria andDATE_DUENotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_DUE not between", value1, value2, "DATE_DUE");
            return this;
        }

        public Criteria andDATE_RETURNEDIsNull() {
            addCriterion("DATE_RETURNED is null");
            return this;
        }

        public Criteria andDATE_RETURNEDIsNotNull() {
            addCriterion("DATE_RETURNED is not null");
            return this;
        }

        public Criteria andDATE_RETURNEDEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_RETURNED =", value, "DATE_RETURNED");
            return this;
        }

        public Criteria andDATE_RETURNEDNotEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_RETURNED <>", value, "DATE_RETURNED");
            return this;
        }

        public Criteria andDATE_RETURNEDGreaterThan(Date value) {
            addCriterionForJDBCDate("DATE_RETURNED >", value, "DATE_RETURNED");
            return this;
        }

        public Criteria andDATE_RETURNEDGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_RETURNED >=", value, "DATE_RETURNED");
            return this;
        }

        public Criteria andDATE_RETURNEDLessThan(Date value) {
            addCriterionForJDBCDate("DATE_RETURNED <", value, "DATE_RETURNED");
            return this;
        }

        public Criteria andDATE_RETURNEDLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_RETURNED <=", value, "DATE_RETURNED");
            return this;
        }

        public Criteria andDATE_RETURNEDIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_RETURNED in", values, "DATE_RETURNED");
            return this;
        }

        public Criteria andDATE_RETURNEDNotIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_RETURNED not in", values, "DATE_RETURNED");
            return this;
        }

        public Criteria andDATE_RETURNEDBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_RETURNED between", value1, value2, "DATE_RETURNED");
            return this;
        }

        public Criteria andDATE_RETURNEDNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_RETURNED not between", value1, value2, "DATE_RETURNED");
            return this;
        }

        public Criteria andCOMMENTSIsNull() {
            addCriterion("COMMENTS is null");
            return this;
        }

        public Criteria andCOMMENTSIsNotNull() {
            addCriterion("COMMENTS is not null");
            return this;
        }

        public Criteria andCOMMENTSEqualTo(String value) {
            addCriterion("COMMENTS =", value, "COMMENTS");
            return this;
        }

        public Criteria andCOMMENTSNotEqualTo(String value) {
            addCriterion("COMMENTS <>", value, "COMMENTS");
            return this;
        }

        public Criteria andCOMMENTSGreaterThan(String value) {
            addCriterion("COMMENTS >", value, "COMMENTS");
            return this;
        }

        public Criteria andCOMMENTSGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTS >=", value, "COMMENTS");
            return this;
        }

        public Criteria andCOMMENTSLessThan(String value) {
            addCriterion("COMMENTS <", value, "COMMENTS");
            return this;
        }

        public Criteria andCOMMENTSLessThanOrEqualTo(String value) {
            addCriterion("COMMENTS <=", value, "COMMENTS");
            return this;
        }

        public Criteria andCOMMENTSLike(String value) {
            addCriterion("COMMENTS like", value, "COMMENTS");
            return this;
        }

        public Criteria andCOMMENTSNotLike(String value) {
            addCriterion("COMMENTS not like", value, "COMMENTS");
            return this;
        }

        public Criteria andCOMMENTSIn(List<String> values) {
            addCriterion("COMMENTS in", values, "COMMENTS");
            return this;
        }

        public Criteria andCOMMENTSNotIn(List<String> values) {
            addCriterion("COMMENTS not in", values, "COMMENTS");
            return this;
        }

        public Criteria andCOMMENTSBetween(String value1, String value2) {
            addCriterion("COMMENTS between", value1, value2, "COMMENTS");
            return this;
        }

        public Criteria andCOMMENTSNotBetween(String value1, String value2) {
            addCriterion("COMMENTS not between", value1, value2, "COMMENTS");
            return this;
        }
    }
}