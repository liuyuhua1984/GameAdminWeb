package com.lyh.admin.alipay.domain;

import com.lyh.admin.alipay.AlipayObject;
import com.lyh.admin.alipay.internal.mapping.ApiField;

/**
 * 投保订单出单撤销
 *
 * @author auto create
 * @since 1.0, 2017-03-20 14:55:38
 */
public class AlipayInsSceneApplicationCancelModel extends AlipayObject {

	private static final long serialVersionUID = 3444863181612458642L;

	/**
	 * 投保订单号
	 */
	@ApiField("application_no")
	private String applicationNo;

	public String getApplicationNo() {
		return this.applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

}