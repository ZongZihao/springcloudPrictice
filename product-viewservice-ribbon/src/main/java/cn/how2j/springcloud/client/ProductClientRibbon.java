package cn.how2j.springcloud.client;

import cn.how2j.springcloud.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by 宗子豪 on 2019-04-23
 */
@Component
public class ProductClientRibbon {

    @Autowired
    RestTemplate restTemplate;

    public List<Product> listProducts(){
        return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products", List.class);
    }
}
