package com.lyh.admin.alipay.domain;

import com.lyh.admin.alipay.AlipayObject;
import com.lyh.admin.alipay.internal.mapping.ApiField;

/**
 * 省份城市地区
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:41
 */
public class AreaInfo extends AlipayObject {

	private static final long serialVersionUID = 5289282467374197582L;

	/**
	 * 城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 省份
	 */
	@ApiField("province")
	private String province;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

}
