package com.lyh.admin.alipay.response;

import com.lyh.admin.alipay.AlipayResponse;
import com.lyh.admin.alipay.internal.mapping.ApiField;

/**
 * ALIPAY API: alipay.offline.marketing.voucher.offline response.
 * 
 * @author auto create
 * @since 1.0, 2016-06-23 17:38:01
 */
public class AlipayOfflineMarketingVoucherOfflineResponse extends AlipayResponse {

	private static final long serialVersionUID = 7725971298593338732L;

	/** 
	 * 券模板编号
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/** 
	 * 券模板状态。EFFECTIVE=生效，INVALID=失效。
	 */
	@ApiField("voucher_status")
	private String voucherStatus;

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}
	public String getVoucherId( ) {
		return this.voucherId;
	}

	public void setVoucherStatus(String voucherStatus) {
		this.voucherStatus = voucherStatus;
	}
	public String getVoucherStatus( ) {
		return this.voucherStatus;
	}

}