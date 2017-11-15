package com.weishop.utils;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;
import com.weishop.properties.MessageTaobaoProperties;

@Component
public class MessageUtil {
	private final Logger logger = Logger.getLogger(getClass());
	@Autowired
	private MessageTaobaoProperties messageTaobaoProperties;
	
	private TaobaoClient client;
	
	public MessageUtil() {
		this.client = new DefaultTaobaoClient(messageTaobaoProperties.getUrl(), messageTaobaoProperties.getAppKey(), messageTaobaoProperties.getAppSecret(), "json");
	}
	
	public boolean send(String tempCode,String recNum,String jsonParam,String extend) {
		AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
		req.setSmsType(messageTaobaoProperties.getSmsType());
		req.setSmsFreeSignName(messageTaobaoProperties.getSmsFreeSignName());
		
		req.setExtend(extend);
		req.setSmsParamString(jsonParam);
		req.setRecNum(recNum);
		req.setSmsTemplateCode(tempCode);
		try {
			AlibabaAliqinFcSmsNumSendResponse rsp = client.execute(req);
			System.out.println(rsp.getBody());
		} catch (ApiException e) {
			logger.error(e.getMessage(),e);
			return false;
		}
		return true;
	}
	
	public boolean sendRegisterCode(String recNum,String code,String userId) {
		return this.send(messageTaobaoProperties.getRegisterTemplateCode(), recNum, "{\"name\":\""+code+"\"}", "regist-"+userId);
	}
}
