package com.lyh.admin.alipay.response;

import com.lyh.admin.alipay.AlipayResponse;
import com.lyh.admin.alipay.domain.AssetAccountResult;
import com.lyh.admin.alipay.internal.mapping.ApiField;
import com.lyh.admin.alipay.internal.mapping.ApiListField;

import java.util.List;

/**
 * ALIPAY API: alipay.asset.account.get response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-07 18:05:33
 */
public class AlipayAssetAccountGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2557225156319323772L;

	/** 
	 * 账户绑定关系列表
	 */
	@ApiListField("asset_list")
	@ApiField("asset_account_result")
	private List<AssetAccountResult> assetList;

	public void setAssetList(List<AssetAccountResult> assetList) {
		this.assetList = assetList;
	}
	public List<AssetAccountResult> getAssetList( ) {
		return this.assetList;
	}

}
