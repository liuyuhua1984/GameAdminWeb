package com.lyh.admin.alipay.domain;

import com.lyh.admin.alipay.AlipayObject;
import com.lyh.admin.alipay.internal.mapping.ApiField;

/**
 * 分页查询广告的推广信息
 *
 * @author auto create
 * @since 1.0, 2017-01-17 10:33:52
 */
public class KoubeiAdvertCommissionAdvchannelBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1891711685989177547L;

	/**
	 * 广告ID
	 */
	@ApiField("adv_id")
	private String advId;

	/**
	 * 当前页码
	 */
	@ApiField("page_index")
	private String pageIndex;

	/**
	 * 每页记录数，默认10，最大100
	 */
	@ApiField("page_size")
	private String pageSize;

	public String getAdvId() {
		return this.advId;
	}
	public void setAdvId(String advId) {
		this.advId = advId;
	}

	public String getPageIndex() {
		return this.pageIndex;
	}
	public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

}
