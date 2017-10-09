package com.lyh.admin.alipay.response;

import com.lyh.admin.alipay.AlipayResponse;
import com.lyh.admin.alipay.domain.McardTemplateBenefitQuery;
import com.lyh.admin.alipay.internal.mapping.ApiField;
import com.lyh.admin.alipay.internal.mapping.ApiListField;

import java.util.List;

/**
 * ALIPAY API: alipay.marketing.card.benefit.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-06-23 09:41:01
 */
public class AlipayMarketingCardBenefitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2382559953153529574L;

	/** 
	 * 会员卡模板外部权益列表
	 */
	@ApiListField("mcard_template_benefit_query")
	@ApiField("mcard_template_benefit_query")
	private List<McardTemplateBenefitQuery> mcardTemplateBenefitQuery;

	public void setMcardTemplateBenefitQuery(List<McardTemplateBenefitQuery> mcardTemplateBenefitQuery) {
		this.mcardTemplateBenefitQuery = mcardTemplateBenefitQuery;
	}
	public List<McardTemplateBenefitQuery> getMcardTemplateBenefitQuery( ) {
		return this.mcardTemplateBenefitQuery;
	}

}
