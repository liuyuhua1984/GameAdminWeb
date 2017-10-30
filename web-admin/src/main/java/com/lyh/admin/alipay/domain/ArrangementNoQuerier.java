package com.lyh.admin.alipay.domain;

import com.lyh.admin.alipay.AlipayObject;
import com.lyh.admin.alipay.internal.mapping.ApiField;
import com.lyh.admin.alipay.internal.mapping.ApiListField;

import java.util.List;

/**
 * 合约号查询器，直接获得合约号
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class ArrangementNoQuerier extends AlipayObject {

	private static final long serialVersionUID = 8478943952331293295L;

	/**
	 * 合约编号列表
	 */
	@ApiListField("ar_nos")
	@ApiField("string")
	private List<String> arNos;

	public List<String> getArNos() {
		return this.arNos;
	}
	public void setArNos(List<String> arNos) {
		this.arNos = arNos;
	}

}