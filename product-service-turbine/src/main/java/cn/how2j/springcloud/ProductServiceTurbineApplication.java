package cn.how2j.springcloud;

import cn.hutool.core.util.NetUtil;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created by 宗子豪 on 2019-04-26
 */
@SpringBootApplication
@EnableTurbine
public class ProductServiceTurbineApplication {

    public static void main(String[] args){
        int port = 8021;
        if(!NetUtil.isUsableLocalPort(port)){
            System.err.printf("端口%d被占用, 无法启动%n", port);
            System.exit(1);
        }
        new SpringApplicationBuilder(ProductServiceTurbineApplication.class).properties("server.port=" + port).run(args);
    }

}
