package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.IntelligentPromo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.intelligent.effect.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-10-10 18:45:21
 */
public class KoubeiMarketingDataIntelligentEffectQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3712456351979668426L;

	/** 
	 * 咨询后返回的模型，包含活动本身的模型以及效果模型
	 */
	@ApiField("promo")
	private IntelligentPromo promo;

	public void setPromo(IntelligentPromo promo) {
		this.promo = promo;
	}
	public IntelligentPromo getPromo( ) {
		return this.promo;
	}

}
