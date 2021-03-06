package com.yungou.o2o.center.manager.model;

import java.io.Serializable;

public class Category implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -1936284860996762026L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.Id:
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.category_name:
     *
     * @mbggenerated
     */
    private String categoryName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.category_code:
     *
     * @mbggenerated
     */
    private String categoryCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.parent_id:
     *
     * @mbggenerated
     */
    private String parentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.Id
     *
     * @return the value of category.Id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.Id
     *
     * @param id the value for category.Id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.category_name
     *
     * @return the value of category.category_name
     *
     * @mbggenerated
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.category_name
     *
     * @param categoryName the value for category.category_name
     *
     * @mbggenerated
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.category_code
     *
     * @return the value of category.category_code
     *
     * @mbggenerated
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.category_code
     *
     * @param categoryCode the value for category.category_code
     *
     * @mbggenerated
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode == null ? null : categoryCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.parent_id
     *
     * @return the value of category.parent_id
     *
     * @mbggenerated
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.parent_id
     *
     * @param parentId the value for category.parent_id
     *
     * @mbggenerated
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }
}