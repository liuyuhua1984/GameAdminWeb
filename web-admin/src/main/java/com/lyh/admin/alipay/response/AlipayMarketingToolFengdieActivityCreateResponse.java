package com.lyh.admin.alipay.response;

import com.lyh.admin.alipay.AlipayResponse;
import com.lyh.admin.alipay.internal.mapping.ApiField;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.activity.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-20 10:29:17
 */
public class AlipayMarketingToolFengdieActivityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3897443779864727139L;

	/** 
	 * H5应用的唯一id
	 */
	@ApiField("activity_id")
	private Long activityId;

	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}
	public Long getActivityId( ) {
		return this.activityId;
	}

}