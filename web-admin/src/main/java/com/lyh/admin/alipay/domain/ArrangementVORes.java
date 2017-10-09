package com.lyh.admin.alipay.domain;

import com.lyh.admin.alipay.AlipayObject;
import com.lyh.admin.alipay.internal.mapping.ApiField;

/**
 * 合约信息标准VO
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class ArrangementVORes extends AlipayObject {

	private static final long serialVersionUID = 4611878644396291279L;

	/**
	 * 合约基本信息
	 */
	@ApiField("ar_base")
	private ArrangementBaseVO arBase;

	/**
	 * 合约业务状态
	 */
	@ApiField("ar_bsn_status")
	private String arBsnStatus;

	/**
	 * 合约条件值,其格式为json，数据key因合约而存在差异。
	 */
	@ApiField("ar_condition")
	private String arCondition;

	/**
	 * 合约编号
	 */
	@ApiField("arrangement_no")
	private String arrangementNo;

	public ArrangementBaseVO getArBase() {
		return this.arBase;
	}
	public void setArBase(ArrangementBaseVO arBase) {
		this.arBase = arBase;
	}

	public String getArBsnStatus() {
		return this.arBsnStatus;
	}
	public void setArBsnStatus(String arBsnStatus) {
		this.arBsnStatus = arBsnStatus;
	}

	public String getArCondition() {
		return this.arCondition;
	}
	public void setArCondition(String arCondition) {
		this.arCondition = arCondition;
	}

	public String getArrangementNo() {
		return this.arrangementNo;
	}
	public void setArrangementNo(String arrangementNo) {
		this.arrangementNo = arrangementNo;
	}

}