package com.lyh.admin.alipay.response;

import com.lyh.admin.alipay.AlipayResponse;
import com.lyh.admin.alipay.domain.CustomReportCondition;
import com.lyh.admin.alipay.internal.mapping.ApiField;
import com.lyh.admin.alipay.internal.mapping.ApiListField;

import java.util.List;

/**
 * ALIPAY API: koubei.marketing.data.customreport.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2016-11-17 11:57:57
 */
public class KoubeiMarketingDataCustomreportBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3898122731874669856L;

	/** 
	 * 分页输出自定义开放数据规则列表
	 */
	@ApiListField("report_condition_list")
	@ApiField("custom_report_condition")
	private List<CustomReportCondition> reportConditionList;

	public void setReportConditionList(List<CustomReportCondition> reportConditionList) {
		this.reportConditionList = reportConditionList;
	}
	public List<CustomReportCondition> getReportConditionList( ) {
		return this.reportConditionList;
	}

}
