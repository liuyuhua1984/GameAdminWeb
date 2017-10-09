package com.lyh.admin.alipay.domain;

import com.lyh.admin.alipay.AlipayObject;
import com.lyh.admin.alipay.internal.mapping.ApiField;

/**
 * 保险机构
 *
 * @author auto create
 * @since 1.0, 2017-07-18 15:49:26
 */
public class InsMerchant extends AlipayObject {

	private static final long serialVersionUID = 6871182277625889912L;

	/**
	 * 机构全称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 服务电话
	 */
	@ApiField("service_phone")
	private String servicePhone;

	/**
	 * 机构简称
	 */
	@ApiField("short_name")
	private String shortName;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getServicePhone() {
		return this.servicePhone;
	}
	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}

	public String getShortName() {
		return this.shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

}