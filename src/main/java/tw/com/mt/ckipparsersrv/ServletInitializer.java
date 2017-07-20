package tw.com.mt.ckipparsersrv;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Servlet initializer class.
 *
 * @version 1.0 2017年7月20日
 * @author ken
 *
 */
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CkipParserSrvApplication.class);
    }

}
