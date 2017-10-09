package com.lyh.admin.alipay.domain;

import com.lyh.admin.alipay.AlipayObject;
import com.lyh.admin.alipay.internal.mapping.ApiField;
import com.lyh.admin.alipay.internal.mapping.ApiListField;

import java.util.List;

/**
 * 删除物业小区住户信息
 *
 * @author auto create
 * @since 1.0, 2016-11-24 16:14:56
 */
public class AlipayEcoCplifeResidentinfoDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5278747475577134663L;

	/**
	 * 待删除的住户所在的小区ID(支付宝平台统一小区ID标识)
	 */
	@ApiField("community_id")
	private String communityId;

	/**
	 * 待删除住户在物业系统中的唯一标示,一次至多传入200条用户ID
	 */
	@ApiListField("out_resident_id_set")
	@ApiField("string")
	private List<String> outResidentIdSet;

	public String getCommunityId() {
		return this.communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public List<String> getOutResidentIdSet() {
		return this.outResidentIdSet;
	}
	public void setOutResidentIdSet(List<String> outResidentIdSet) {
		this.outResidentIdSet = outResidentIdSet;
	}

}
