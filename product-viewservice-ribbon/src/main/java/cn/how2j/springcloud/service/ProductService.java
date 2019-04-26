package cn.how2j.springcloud.service;

import cn.how2j.springcloud.client.ProductClientRibbon;
import cn.how2j.springcloud.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 宗子豪 on 2019-04-23
 */
@Service
public class ProductService {

    @Autowired
    ProductClientRibbon productClientRibbon;

    public List<Product> listProducts(){
        return productClientRibbon.listProducts();
    }

}
