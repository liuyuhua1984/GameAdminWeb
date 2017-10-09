package com.lyh.admin.alipay.domain;

import com.lyh.admin.alipay.AlipayObject;
import com.lyh.admin.alipay.internal.mapping.ApiField;
import com.lyh.admin.alipay.internal.mapping.ApiListField;

import java.util.List;

/**
 * 物料生产完成反馈接口
 *
 * @author auto create
 * @since 1.0, 2017-06-30 10:15:08
 */
public class AntMerchantExpandAssetproduceCompleteSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8777497317681617276L;

	/**
	 * 物料生产单完成后指定物流信息
	 */
	@ApiListField("asset_produce_details")
	@ApiField("item_delivery_detail")
	private List<ItemDeliveryDetail> assetProduceDetails;

	public List<ItemDeliveryDetail> getAssetProduceDetails() {
		return this.assetProduceDetails;
	}
	public void setAssetProduceDetails(List<ItemDeliveryDetail> assetProduceDetails) {
		this.assetProduceDetails = assetProduceDetails;
	}

}