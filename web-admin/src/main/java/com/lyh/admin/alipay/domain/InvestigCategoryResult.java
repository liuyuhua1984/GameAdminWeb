package com.lyh.admin.alipay.domain;

import com.lyh.admin.alipay.AlipayObject;
import com.lyh.admin.alipay.internal.mapping.ApiField;
import com.lyh.admin.alipay.internal.mapping.ApiListField;

import java.util.List;

/**
 * 数据项的调查结果
 *
 * @author auto create
 * @since 1.0, 2017-05-31 13:44:00
 */
public class InvestigCategoryResult extends AlipayObject {

	private static final long serialVersionUID = 4723613658247918751L;

	/**
	 * 数据项Category
	 */
	@ApiField("category")
	private String category;

	/**
	 * 数据项对应的所有采集结果
	 */
	@ApiListField("category_result")
	@ApiField("investig_category_data")
	private List<InvestigCategoryData> categoryResult;

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public List<InvestigCategoryData> getCategoryResult() {
		return this.categoryResult;
	}
	public void setCategoryResult(List<InvestigCategoryData> categoryResult) {
		this.categoryResult = categoryResult;
	}

}