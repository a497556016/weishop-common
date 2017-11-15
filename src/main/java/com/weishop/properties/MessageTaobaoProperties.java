package com.weishop.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(ignoreUnknownFields=false,prefix="message.taobao")
public class MessageTaobaoProperties {
	private String url;
	private String appKey;
	private String appSecret;
	private String smsType;
	private String smsFreeSignName;
	private String registerTemplateCode;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAppKey() {
		return appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}
	public String getAppSecret() {
		return appSecret;
	}
	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}
	public String getSmsType() {
		return smsType;
	}
	public void setSmsType(String smsType) {
		this.smsType = smsType;
	}
	public String getSmsFreeSignName() {
		return smsFreeSignName;
	}
	public void setSmsFreeSignName(String smsFreeSignName) {
		this.smsFreeSignName = smsFreeSignName;
	}
	public String getRegisterTemplateCode() {
		return registerTemplateCode;
	}
	public void setRegisterTemplateCode(String registerTemplateCode) {
		this.registerTemplateCode = registerTemplateCode;
	}
}
