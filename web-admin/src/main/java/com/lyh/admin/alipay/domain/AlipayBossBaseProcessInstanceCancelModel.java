package com.lyh.admin.alipay.domain;

import com.lyh.admin.alipay.AlipayObject;
import com.lyh.admin.alipay.internal.mapping.ApiField;

/**
 * 撤消流程实例
 *
 * @author auto create
 * @since 1.0, 2017-03-03 11:29:45
 */
public class AlipayBossBaseProcessInstanceCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1718114913889169695L;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 处理人域账号
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 流程全局唯一ID
	 */
	@ApiField("puid")
	private String puid;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getPuid() {
		return this.puid;
	}
	public void setPuid(String puid) {
		this.puid = puid;
	}

}