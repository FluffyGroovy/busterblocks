package com.busterblocks.video.persistence.table.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenreDtoExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table HR.GENRE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table HR.GENRE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.GENRE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public GenreDtoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.GENRE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    protected GenreDtoExample(GenreDtoExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.GENRE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.GENRE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.GENRE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.GENRE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.GENRE
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
     * This method corresponds to the database table HR.GENRE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table HR.GENRE
     *
     * @ibatorgenerated Mon Jun 15 13:29:27 CAT 2015
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table HR.GENRE
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

        public Criteria andGENRE_IDIsNull() {
            addCriterion("GENRE_ID is null");
            return this;
        }

        public Criteria andGENRE_IDIsNotNull() {
            addCriterion("GENRE_ID is not null");
            return this;
        }

        public Criteria andGENRE_IDEqualTo(BigDecimal value) {
            addCriterion("GENRE_ID =", value, "GENRE_ID");
            return this;
        }

        public Criteria andGENRE_IDNotEqualTo(BigDecimal value) {
            addCriterion("GENRE_ID <>", value, "GENRE_ID");
            return this;
        }

        public Criteria andGENRE_IDGreaterThan(BigDecimal value) {
            addCriterion("GENRE_ID >", value, "GENRE_ID");
            return this;
        }

        public Criteria andGENRE_IDGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GENRE_ID >=", value, "GENRE_ID");
            return this;
        }

        public Criteria andGENRE_IDLessThan(BigDecimal value) {
            addCriterion("GENRE_ID <", value, "GENRE_ID");
            return this;
        }

        public Criteria andGENRE_IDLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GENRE_ID <=", value, "GENRE_ID");
            return this;
        }

        public Criteria andGENRE_IDIn(List<BigDecimal> values) {
            addCriterion("GENRE_ID in", values, "GENRE_ID");
            return this;
        }

        public Criteria andGENRE_IDNotIn(List<BigDecimal> values) {
            addCriterion("GENRE_ID not in", values, "GENRE_ID");
            return this;
        }

        public Criteria andGENRE_IDBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GENRE_ID between", value1, value2, "GENRE_ID");
            return this;
        }

        public Criteria andGENRE_IDNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GENRE_ID not between", value1, value2, "GENRE_ID");
            return this;
        }

        public Criteria andDESCRIPTIONIsNull() {
            addCriterion("DESCRIPTION is null");
            return this;
        }

        public Criteria andDESCRIPTIONIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return this;
        }

        public Criteria andDESCRIPTIONEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "DESCRIPTION");
            return this;
        }

        public Criteria andDESCRIPTIONNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "DESCRIPTION");
            return this;
        }

        public Criteria andDESCRIPTIONGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "DESCRIPTION");
            return this;
        }

        public Criteria andDESCRIPTIONGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "DESCRIPTION");
            return this;
        }

        public Criteria andDESCRIPTIONLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "DESCRIPTION");
            return this;
        }

        public Criteria andDESCRIPTIONLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "DESCRIPTION");
            return this;
        }

        public Criteria andDESCRIPTIONLike(String value) {
            addCriterion("DESCRIPTION like", value, "DESCRIPTION");
            return this;
        }

        public Criteria andDESCRIPTIONNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "DESCRIPTION");
            return this;
        }

        public Criteria andDESCRIPTIONIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "DESCRIPTION");
            return this;
        }

        public Criteria andDESCRIPTIONNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "DESCRIPTION");
            return this;
        }

        public Criteria andDESCRIPTIONBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "DESCRIPTION");
            return this;
        }

        public Criteria andDESCRIPTIONNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "DESCRIPTION");
            return this;
        }
    }
}