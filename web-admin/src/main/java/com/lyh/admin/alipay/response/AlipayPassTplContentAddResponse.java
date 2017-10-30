package com.lyh.admin.alipay.response;

import com.lyh.admin.alipay.AlipayResponse;
import com.lyh.admin.alipay.internal.mapping.ApiField;

/**
 * ALIPAY API: alipay.pass.tpl.content.add response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-01 15:30:16
 */
public class AlipayPassTplContentAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 4129212741415859317L;

	/** 
	 * 业务结果
	 */
	@ApiField("biz_result")
	private String bizResult;

	/** 
	 * 业务错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 是否成功标识:T-成功；F-失败
	 */
	@ApiField("success")
	private String success;

	public void setBizResult(String bizResult) {
		this.bizResult = bizResult;
	}
	public String getBizResult( ) {
		return this.bizResult;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}