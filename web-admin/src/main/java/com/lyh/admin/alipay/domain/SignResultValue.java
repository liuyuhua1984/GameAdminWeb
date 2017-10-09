package com.lyh.admin.alipay.domain;

import com.lyh.admin.alipay.AlipayObject;
import com.lyh.admin.alipay.internal.mapping.ApiField;

/**
 * 已生效的销账或出账机构
 *
 * @author auto create
 * @since 1.0, 2016-12-27 10:52:19
 */
public class SignResultValue extends AlipayObject {

	private static final long serialVersionUID = 7168347146144553699L;

	/**
	 * 已生效的销账/出账机构
	 */
	@ApiField("effect_biz_value")
	private String effectBizValue;

	public String getEffectBizValue() {
		return this.effectBizValue;
	}
	public void setEffectBizValue(String effectBizValue) {
		this.effectBizValue = effectBizValue;
	}

}