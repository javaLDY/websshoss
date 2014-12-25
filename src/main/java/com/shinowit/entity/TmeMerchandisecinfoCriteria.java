package com.shinowit.entity;

import java.util.ArrayList;
import java.util.List;

public class TmeMerchandisecinfoCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Thu Dec 25 15:00:55 CST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Thu Dec 25 15:00:55 CST 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Thu Dec 25 15:00:55 CST 2014
     */
    protected List<Criteria> oredCriteria;

    private int pageIndex;

    private int pageSize;

    private String customCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Thu Dec 25 15:00:55 CST 2014
     */
    public TmeMerchandisecinfoCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Thu Dec 25 15:00:55 CST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Thu Dec 25 15:00:55 CST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Thu Dec 25 15:00:55 CST 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Thu Dec 25 15:00:55 CST 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Thu Dec 25 15:00:55 CST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Thu Dec 25 15:00:55 CST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Thu Dec 25 15:00:55 CST 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Thu Dec 25 15:00:55 CST 2014
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Thu Dec 25 15:00:55 CST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Thu Dec 25 15:00:55 CST 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex=pageIndex;
    }

    public int getPageIndex() {
        return this.pageIndex;
    }

    public void setPageSize(int pageSize) {
        this.pageSize=pageSize;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setCustomCriteria(String customCriteria) {
        this.customCriteria=customCriteria;
    }

    public String getCustomCriteria() {
        return this.customCriteria;
    }

    public int getSkipRecordCount() {
        int count=(this.pageIndex-1)*this.pageSize;
        if (count<0){
             count=0;
        }
        return count;
    }

    public int getEndRecordCount() {
        return this.pageIndex*this.pageSize;
    }

    public TmeMerchandisecinfoCriteria(int pageSize, int pageIndex) {
        this();
        this.pageSize=pageSize;
        this.pageIndex=pageIndex;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Thu Dec 25 15:00:55 CST 2014
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMerchandisecidIsNull() {
            addCriterion("MerchandiseCID is null");
            return (Criteria) this;
        }

        public Criteria andMerchandisecidIsNotNull() {
            addCriterion("MerchandiseCID is not null");
            return (Criteria) this;
        }

        public Criteria andMerchandisecidEqualTo(Integer value) {
            addCriterion("MerchandiseCID =", value, "merchandisecid");
            return (Criteria) this;
        }

        public Criteria andMerchandisecidNotEqualTo(Integer value) {
            addCriterion("MerchandiseCID <>", value, "merchandisecid");
            return (Criteria) this;
        }

        public Criteria andMerchandisecidGreaterThan(Integer value) {
            addCriterion("MerchandiseCID >", value, "merchandisecid");
            return (Criteria) this;
        }

        public Criteria andMerchandisecidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MerchandiseCID >=", value, "merchandisecid");
            return (Criteria) this;
        }

        public Criteria andMerchandisecidLessThan(Integer value) {
            addCriterion("MerchandiseCID <", value, "merchandisecid");
            return (Criteria) this;
        }

        public Criteria andMerchandisecidLessThanOrEqualTo(Integer value) {
            addCriterion("MerchandiseCID <=", value, "merchandisecid");
            return (Criteria) this;
        }

        public Criteria andMerchandisecidIn(List<Integer> values) {
            addCriterion("MerchandiseCID in", values, "merchandisecid");
            return (Criteria) this;
        }

        public Criteria andMerchandisecidNotIn(List<Integer> values) {
            addCriterion("MerchandiseCID not in", values, "merchandisecid");
            return (Criteria) this;
        }

        public Criteria andMerchandisecidBetween(Integer value1, Integer value2) {
            addCriterion("MerchandiseCID between", value1, value2, "merchandisecid");
            return (Criteria) this;
        }

        public Criteria andMerchandisecidNotBetween(Integer value1, Integer value2) {
            addCriterion("MerchandiseCID not between", value1, value2, "merchandisecid");
            return (Criteria) this;
        }

        public Criteria andMerchandisecnameIsNull() {
            addCriterion("MerchandiseCName is null");
            return (Criteria) this;
        }

        public Criteria andMerchandisecnameIsNotNull() {
            addCriterion("MerchandiseCName is not null");
            return (Criteria) this;
        }

        public Criteria andMerchandisecnameEqualTo(String value) {
            addCriterion("MerchandiseCName =", value, "merchandisecname");
            return (Criteria) this;
        }

        public Criteria andMerchandisecnameNotEqualTo(String value) {
            addCriterion("MerchandiseCName <>", value, "merchandisecname");
            return (Criteria) this;
        }

        public Criteria andMerchandisecnameGreaterThan(String value) {
            addCriterion("MerchandiseCName >", value, "merchandisecname");
            return (Criteria) this;
        }

        public Criteria andMerchandisecnameGreaterThanOrEqualTo(String value) {
            addCriterion("MerchandiseCName >=", value, "merchandisecname");
            return (Criteria) this;
        }

        public Criteria andMerchandisecnameLessThan(String value) {
            addCriterion("MerchandiseCName <", value, "merchandisecname");
            return (Criteria) this;
        }

        public Criteria andMerchandisecnameLessThanOrEqualTo(String value) {
            addCriterion("MerchandiseCName <=", value, "merchandisecname");
            return (Criteria) this;
        }

        public Criteria andMerchandisecnameLike(String value) {
            addCriterion("MerchandiseCName like", value, "merchandisecname");
            return (Criteria) this;
        }

        public Criteria andMerchandisecnameNotLike(String value) {
            addCriterion("MerchandiseCName not like", value, "merchandisecname");
            return (Criteria) this;
        }

        public Criteria andMerchandisecnameIn(List<String> values) {
            addCriterion("MerchandiseCName in", values, "merchandisecname");
            return (Criteria) this;
        }

        public Criteria andMerchandisecnameNotIn(List<String> values) {
            addCriterion("MerchandiseCName not in", values, "merchandisecname");
            return (Criteria) this;
        }

        public Criteria andMerchandisecnameBetween(String value1, String value2) {
            addCriterion("MerchandiseCName between", value1, value2, "merchandisecname");
            return (Criteria) this;
        }

        public Criteria andMerchandisecnameNotBetween(String value1, String value2) {
            addCriterion("MerchandiseCName not between", value1, value2, "merchandisecname");
            return (Criteria) this;
        }

        public Criteria andSortidIsNull() {
            addCriterion("SortID is null");
            return (Criteria) this;
        }

        public Criteria andSortidIsNotNull() {
            addCriterion("SortID is not null");
            return (Criteria) this;
        }

        public Criteria andSortidEqualTo(Integer value) {
            addCriterion("SortID =", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotEqualTo(Integer value) {
            addCriterion("SortID <>", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidGreaterThan(Integer value) {
            addCriterion("SortID >", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SortID >=", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidLessThan(Integer value) {
            addCriterion("SortID <", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidLessThanOrEqualTo(Integer value) {
            addCriterion("SortID <=", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidIn(List<Integer> values) {
            addCriterion("SortID in", values, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotIn(List<Integer> values) {
            addCriterion("SortID not in", values, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidBetween(Integer value1, Integer value2) {
            addCriterion("SortID between", value1, value2, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotBetween(Integer value1, Integer value2) {
            addCriterion("SortID not between", value1, value2, "sortid");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("State is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("State is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Boolean value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Boolean value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Boolean value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Boolean value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Boolean value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Boolean> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Boolean> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Boolean value1, Boolean value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("State not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andMerchandisecnameLikeInsensitive(String value) {
            addCriterion("upper(MerchandiseCName) like", value.toUpperCase(), "merchandisecname");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated do_not_delete_during_merge Thu Dec 25 15:00:55 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TMe_MerchandiseCInfo
     *
     * @mbggenerated Thu Dec 25 15:00:55 CST 2014
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}