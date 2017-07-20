/*
 * CkipParserController.java    1.0 2017年7月20日
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

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tw.com.mt.ckipparser.Client;
import tw.com.mt.ckipparser.ParserResult;

/**
 * 提供Parser語句解析服務的Rest Controller.
 *
 * @version 1.0 2017年7月20日
 * @author ken
 *
 */
@RestController
@Path("/")
public class CkipParserController {
    /**
     * System property bean.
     */
    @Autowired
    private ServerProperties props;

    /**
     * 使用Parser對使用者輸入的語句做解析.
     * @param sentence 要進行解析的語句
     * @return 語句解析結果
     */
    @GET
    @Path("/parsing/{sentence}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUser(@PathParam("sentence") final String sentence) {
        Client c = new Client(props.getIp(), props.getPort(), props.getAccount(),
                props.getPassword());
        ParserResult result = c.parse(sentence);
        return Response.status(HttpServletResponse.SC_OK)
                .entity(result).build();
    }
}
