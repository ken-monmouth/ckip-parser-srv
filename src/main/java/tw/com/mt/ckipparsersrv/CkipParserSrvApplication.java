package tw.com.mt.ckipparsersrv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Spring boot main configuration class.
 *
 * @version 1.0 2017年7月20日
 * @author ken
 *
 */
@SpringBootApplication
@EnableConfigurationProperties(ServerProperties.class)
public class CkipParserSrvApplication {

    /**
     * Plain old main method.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(CkipParserSrvApplication.class, args);
    }
}
