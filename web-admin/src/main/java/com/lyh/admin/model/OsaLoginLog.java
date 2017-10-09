package com.lyh.admin.model;

import java.io.Serializable;
import java.util.Date;

public class OsaLoginLog implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private String worldId;

    /**
     * 
     */
    private String userIp;

    /**
     * 
     */
    private Date loginTime;

    /**
     * 
     */
    private String openId;

    /**
     * 
     */
    private Integer level;

    /**
     * 
     */
    private String roleName;

    /**
     * 
     */
    private String addtime;

    /**
     * 应用id
     */
    private String appId;

    /**
     * osa_login_log
     */
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWorldId() {
        return worldId;
    }

    public void setWorldId(String worldId) {
        this.worldId = worldId == null ? null : worldId.trim();
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp == null ? null : userIp.trim();
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", worldId=").append(worldId);
        sb.append(", userIp=").append(userIp);
        sb.append(", loginTime=").append(loginTime);
        sb.append(", openId=").append(openId);
        sb.append(", level=").append(level);
        sb.append(", roleName=").append(roleName);
        sb.append(", addtime=").append(addtime);
        sb.append(", appId=").append(appId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}