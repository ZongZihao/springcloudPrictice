package cn.how2j.springcloud.mapper;

import cn.how2j.springcloud.pojo.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by 宗子豪 on 2019-04-26
 */


@Mapper
public interface CustomerMapper {

    List<Customer> findAll();

    Customer selectById(int id);


}
