package com.lyh.admin.alipay.response;

import com.lyh.admin.alipay.AlipayResponse;
import com.lyh.admin.alipay.domain.MerchantCard;
import com.lyh.admin.alipay.internal.mapping.ApiField;

/**
 * ALIPAY API: alipay.marketing.card.open response.
 * 
 * @author auto create
 * @since 1.0, 2017-07-20 10:21:56
 */
public class AlipayMarketingCardOpenResponse extends AlipayResponse {

	private static final long serialVersionUID = 6313343285629938676L;

	/** 
	 * 商户卡信息（包括支付宝分配的业务卡号）
	 */
	@ApiField("card_info")
	private MerchantCard cardInfo;

	public void setCardInfo(MerchantCard cardInfo) {
		this.cardInfo = cardInfo;
	}
	public MerchantCard getCardInfo( ) {
		return this.cardInfo;
	}

}
