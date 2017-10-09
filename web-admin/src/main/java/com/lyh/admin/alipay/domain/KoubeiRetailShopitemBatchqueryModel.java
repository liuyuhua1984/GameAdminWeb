package com.lyh.admin.alipay.domain;

import com.lyh.admin.alipay.AlipayObject;
import com.lyh.admin.alipay.internal.mapping.ApiField;
import com.lyh.admin.alipay.internal.mapping.ApiListField;

import java.util.List;

/**
 * isv 回传的门店商品信息查询接口
 *
 * @author auto create
 * @since 1.0, 2017-04-14 18:19:47
 */
public class KoubeiRetailShopitemBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3533378483196186947L;

	/**
	 * 查询店铺商品查询入参
	 */
	@ApiListField("shop_items")
	@ApiField("request_ext_shop_item_query")
	private List<RequestExtShopItemQuery> shopItems;

	public List<RequestExtShopItemQuery> getShopItems() {
		return this.shopItems;
	}
	public void setShopItems(List<RequestExtShopItemQuery> shopItems) {
		this.shopItems = shopItems;
	}

}
