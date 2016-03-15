package com.yungou.o2o.center.manager.model;

import java.io.Serializable;
import java.util.Date;

public class MemberAddress implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -7831080362339735118L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_address.Id:���
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_address.member_id:��ԱID ��ԱID
     *
     * @mbggenerated
     */
    private String memberId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_address.province_code:ʡ�ݴ���
     *
     * @mbggenerated
     */
    private String provinceCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_address.city_code:���д��� ���д���
     *
     * @mbggenerated
     */
    private String cityCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_address.area_code:���� ����
     *
     * @mbggenerated
     */
    private String areaCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_address.province_name:ʡ����� ʡ�����
     *
     * @mbggenerated
     */
    private String provinceName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_address.city_name:������� �������
     *
     * @mbggenerated
     */
    private String cityName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_address.area_name:������� �������
     *
     * @mbggenerated
     */
    private String areaName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_address.detail_address:��ϸ��ַ ��ϸ��ַ
     *
     * @mbggenerated
     */
    private String detailAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_address.postalcode:�������� ��������
     *
     * @mbggenerated
     */
    private String postalcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_address.is_default:�Ƿ�Ĭ���ջ���ַ �Ƿ�Ĭ���ջ���ַ  1 �� 2 ��
     *
     * @mbggenerated
     */
    private Integer isDefault;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_address.contacts:��ϵ�� ��ϵ��
     *
     * @mbggenerated
     */
    private String contacts;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_address.contact_phone:��ϵ�绰 ��ϵ�绰
     *
     * @mbggenerated
     */
    private String contactPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member_address.create_time:����ʱ�� ����ʱ��
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_address.Id
     *
     * @return the value of member_address.Id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_address.Id
     *
     * @param id the value for member_address.Id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_address.member_id
     *
     * @return the value of member_address.member_id
     *
     * @mbggenerated
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_address.member_id
     *
     * @param memberId the value for member_address.member_id
     *
     * @mbggenerated
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_address.province_code
     *
     * @return the value of member_address.province_code
     *
     * @mbggenerated
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_address.province_code
     *
     * @param provinceCode the value for member_address.province_code
     *
     * @mbggenerated
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_address.city_code
     *
     * @return the value of member_address.city_code
     *
     * @mbggenerated
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_address.city_code
     *
     * @param cityCode the value for member_address.city_code
     *
     * @mbggenerated
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_address.area_code
     *
     * @return the value of member_address.area_code
     *
     * @mbggenerated
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_address.area_code
     *
     * @param areaCode the value for member_address.area_code
     *
     * @mbggenerated
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_address.province_name
     *
     * @return the value of member_address.province_name
     *
     * @mbggenerated
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_address.province_name
     *
     * @param provinceName the value for member_address.province_name
     *
     * @mbggenerated
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_address.city_name
     *
     * @return the value of member_address.city_name
     *
     * @mbggenerated
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_address.city_name
     *
     * @param cityName the value for member_address.city_name
     *
     * @mbggenerated
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_address.area_name
     *
     * @return the value of member_address.area_name
     *
     * @mbggenerated
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_address.area_name
     *
     * @param areaName the value for member_address.area_name
     *
     * @mbggenerated
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_address.detail_address
     *
     * @return the value of member_address.detail_address
     *
     * @mbggenerated
     */
    public String getDetailAddress() {
        return detailAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_address.detail_address
     *
     * @param detailAddress the value for member_address.detail_address
     *
     * @mbggenerated
     */
    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress == null ? null : detailAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_address.postalcode
     *
     * @return the value of member_address.postalcode
     *
     * @mbggenerated
     */
    public String getPostalcode() {
        return postalcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_address.postalcode
     *
     * @param postalcode the value for member_address.postalcode
     *
     * @mbggenerated
     */
    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode == null ? null : postalcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_address.is_default
     *
     * @return the value of member_address.is_default
     *
     * @mbggenerated
     */
    public Integer getIsDefault() {
        return isDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_address.is_default
     *
     * @param isDefault the value for member_address.is_default
     *
     * @mbggenerated
     */
    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_address.contacts
     *
     * @return the value of member_address.contacts
     *
     * @mbggenerated
     */
    public String getContacts() {
        return contacts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_address.contacts
     *
     * @param contacts the value for member_address.contacts
     *
     * @mbggenerated
     */
    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_address.contact_phone
     *
     * @return the value of member_address.contact_phone
     *
     * @mbggenerated
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_address.contact_phone
     *
     * @param contactPhone the value for member_address.contact_phone
     *
     * @mbggenerated
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member_address.create_time
     *
     * @return the value of member_address.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member_address.create_time
     *
     * @param createTime the value for member_address.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}