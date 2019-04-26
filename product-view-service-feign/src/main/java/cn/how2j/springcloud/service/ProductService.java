package cn.how2j.springcloud.service;

import cn.how2j.springcloud.client.ProductClientFeign;
import cn.how2j.springcloud.pojo.Product;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 宗子豪 on 2019-04-23
 */
@Service
public class ProductService {

    @Autowired
    ProductClientFeign productClientFeign;

    public List<Product> listProducts(){
        return productClientFeign.listProducts();
    }

}
