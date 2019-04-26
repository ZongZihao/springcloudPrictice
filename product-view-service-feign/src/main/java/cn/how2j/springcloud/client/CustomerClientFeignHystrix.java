package cn.how2j.springcloud.client;

import cn.how2j.springcloud.pojo.Customer;
import cn.how2j.springcloud.pojo.IdModel;

import java.util.List;

/**
 * Created by 宗子豪 on 2019-04-26
 */
public class CustomerClientFeignHystrix implements CustomerClientFeign{
    @Override
    public List<Customer> CustomerList() {
        return null;
    }

    @Override
    public Customer Customer(IdModel model) {
        return null;
    }
}
