/*
 * JerseyConfig.java    1.0 2017年4月19日
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

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Jersey RestCofig class.
 *
 * @version 1.0 2017年4月19日
 * @author ken
 *
 */
@Component
public class JerseyConfig extends ResourceConfig {
    /**
     * Default constructor.
     */
    public JerseyConfig() {
        register(CkipParserController.class);
    }
}
