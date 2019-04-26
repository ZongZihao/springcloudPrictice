package cn.how2j.springcloud;

import cn.hutool.core.util.NetUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by 宗子豪 on 2019-04-26
 */

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
public class ProductServiceZuulApplication {

    public static void main(String[] args){
        int port = 8040;
        if(!NetUtil.isUsableLocalPort(port)){
            System.out.printf("端口%d被占用", port);
            System.exit(1);
        }
        new SpringApplicationBuilder(ProductServiceZuulApplication.class).properties("server.port=" + port).run(args);
    }

}
