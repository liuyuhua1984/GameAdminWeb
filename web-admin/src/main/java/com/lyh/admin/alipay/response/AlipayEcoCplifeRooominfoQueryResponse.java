package com.lyh.admin.alipay.response;

import com.lyh.admin.alipay.AlipayResponse;
import com.lyh.admin.alipay.domain.CplifeRoomDetail;
import com.lyh.admin.alipay.internal.mapping.ApiField;
import com.lyh.admin.alipay.internal.mapping.ApiListField;

import java.util.List;

/**
 * ALIPAY API: alipay.eco.cplife.rooominfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-02-10 18:51:44
 */
public class AlipayEcoCplifeRooominfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8181376173712722654L;

	/** 
	 * 符合条件的小区房屋信息列表.
	 */
	@ApiListField("room_info")
	@ApiField("cplife_room_detail")
	private List<CplifeRoomDetail> roomInfo;

	public void setRoomInfo(List<CplifeRoomDetail> roomInfo) {
		this.roomInfo = roomInfo;
	}
	public List<CplifeRoomDetail> getRoomInfo( ) {
		return this.roomInfo;
	}

}
