package com.lyh.admin.alipay.domain;

import com.lyh.admin.alipay.AlipayObject;
import com.lyh.admin.alipay.internal.mapping.ApiField;

/**
 * 物业社区平台房屋信息Mapping关系.
 *
 * @author auto create
 * @since 1.0, 2016-11-18 16:09:00
 */
public class CplifeRoomInfoResp extends AlipayObject {

	private static final long serialVersionUID = 6264969541891657644L;

	/**
	 * 商户系统小区房屋唯一ID标示.
	 */
	@ApiField("out_room_id")
	private String outRoomId;

	/**
	 * 支付宝系统房间唯一标示.
	 */
	@ApiField("room_id")
	private String roomId;

	public String getOutRoomId() {
		return this.outRoomId;
	}
	public void setOutRoomId(String outRoomId) {
		this.outRoomId = outRoomId;
	}

	public String getRoomId() {
		return this.roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

}