package com.dist;

import org.springframework.stereotype.Service;

/**
 * Company: 上海数慧系统技术有限公司
 * Department: 数据中心
 * Date: 2019-08-23 13:12
 * Author: xupp
 * Email: xupp@dist.com.cn
 * Desc：
 */
@Service("AbstractServiceImpl2")
public  class AbstractServiceImpl2 extends AbstractService{


    public void test(){
        service1.out();
    }

}