package com.lyh.admin.alipay.internal.parser.xml;

import com.lyh.admin.alipay.*;
import com.lyh.admin.alipay.internal.mapping.Converter;

/**
 * 单个JSON对象解释器。
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class ObjectXmlParser<T extends AlipayResponse> implements AlipayParser<T> {

    private Class<T> clazz;

    public ObjectXmlParser(Class<T> clazz) {
        this.clazz = clazz;
    }

    public T parse(String rsp) throws AlipayApiException {
        Converter converter = new XmlConverter();
        return converter.toResponse(rsp, clazz);
    }

    public Class<T> getResponseClass() {
        return clazz;
    }

    /** 
     * @see com.lyh.admin.alipay.AlipayParser#getSignItem(com.lyh.admin.alipay.AlipayRequest, String)
     */
    public SignItem getSignItem(AlipayRequest<?> request, String responseBody)
                                                                              throws AlipayApiException {

        Converter converter = new XmlConverter();

        return converter.getSignItem(request, responseBody);
    }

    /** 
     * @see com.lyh.admin.alipay.AlipayParser#encryptSourceData(com.lyh.admin.alipay.AlipayRequest, String, String, String, String, String)
     */
    public String encryptSourceData(AlipayRequest<?> request, String body, String format,
                                       String encryptType, String encryptKey, String charset)
                                                                                             throws AlipayApiException {

        Converter converter = new XmlConverter();

        return converter.encryptSourceData(request, body, format, encryptType, encryptKey,
            charset);
    }

}