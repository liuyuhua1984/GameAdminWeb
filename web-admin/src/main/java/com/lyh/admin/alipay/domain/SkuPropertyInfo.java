package com.lyh.admin.alipay.domain;

import com.lyh.admin.alipay.AlipayObject;
import com.lyh.admin.alipay.internal.mapping.ApiField;
import com.lyh.admin.alipay.internal.mapping.ApiListField;

import java.util.List;

/**
 * 外部商家sku属性详情
 *
 * @author auto create
 * @since 1.0, 2017-03-17 17:48:10
 */
public class SkuPropertyInfo extends AlipayObject {

	private static final long serialVersionUID = 7678817551758224132L;

	/**
	 * sku属性key值,可发邮件到lei.mao@antfin.com,联系支付宝获取已支持的key.支付宝在收到邮件后三个工作日内回复
	 */
	@ApiField("key")
	private String key;

	/**
	 * 商家sku属性值列表
	 */
	@ApiListField("value")
	@ApiField("sku_property_value")
	private List<SkuPropertyValue> value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public List<SkuPropertyValue> getValue() {
		return this.value;
	}
	public void setValue(List<SkuPropertyValue> value) {
		this.value = value;
	}

}