package com.lyh.admin.alipay.domain;

import com.lyh.admin.alipay.AlipayObject;
import com.lyh.admin.alipay.internal.mapping.ApiField;
import com.lyh.admin.alipay.internal.mapping.ApiListField;

import java.util.List;

/**
 * 学生信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class EduStudentInfoShareResult extends AlipayObject {

	private static final long serialVersionUID = 3562464124272711555L;

	/**
	 * 教育分类
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 学生详细信息
	 */
	@ApiListField("student_infos")
	@ApiField("student_info")
	private List<StudentInfo> studentInfos;

	/**
	 * 用户的userid
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public List<StudentInfo> getStudentInfos() {
		return this.studentInfos;
	}
	public void setStudentInfos(List<StudentInfo> studentInfos) {
		this.studentInfos = studentInfos;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
