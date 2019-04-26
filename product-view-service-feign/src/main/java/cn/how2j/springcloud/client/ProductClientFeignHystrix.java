package cn.how2j.springcloud.client;

import cn.how2j.springcloud.pojo.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 宗子豪 on 2019-04-26
 */
@Component
public class ProductClientFeignHystrix implements ProductClientFeign {

    public List<Product> listProducts(){
        List<Product> result = new ArrayList();
        result.add(new Product(0, "产品数据微服务不可用", 0));
        return result;
    }

}
