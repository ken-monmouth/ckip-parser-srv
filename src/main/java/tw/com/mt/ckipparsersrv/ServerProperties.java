/*
 * ServerProperties.java    1.0 2017年7月20日
 *
 * Copyright (c) 2017-2030 Monmouth Technologies, Inc.
 * http://www.mt.com.tw
 * 10F-1 No. 306 Chung-Cheng 1st Road, Linya District, 802, Kaoshiung, Taiwan
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Monmouth
 * Technologies, Inc. You shall not disclose such Confidential Information and
 * shall use it only in accordance with the terms of the license agreement you
 * entered into with Monmouth Technologies.
 */
package tw.com.mt.ckipparsersrv;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import lombok.Data;

/**
 * 提供系統屬性值的Bean.
 *
 * @version 1.0 2017年7月20日
 * @author ken
 * @see <a href="https://stackoverflow.com/questions/32058814/
 * spring-boot-custom-variables-in-application-properties">Spring boot - custom variables
 *  in Application.properties</a>
 */
@Component
@ConfigurationProperties(prefix = "parser")
@Data
public class ServerProperties {
    /**
     * Default port number of ckip parser.
     */
    private static final int CKIP_PARSER_DEFAULT_PORT = 8000;
    /**
     * Ip address of ckip parser server.
     */
    private String ip = "";
    /**
     * Port number of ckip parser server.
     */
    private int port = CKIP_PARSER_DEFAULT_PORT;
    /**
     * User account of ckip parser server.
     */
    private String account = "";
    /**
     * User password of ckip parser server.
     */
    private String password = "";
}
