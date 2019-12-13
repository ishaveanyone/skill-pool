package com.aliyun.oss.demo;

import com.aliyun.oss.ClientBuilderConfiguration;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.common.comm.Protocol;

public class T1OSSClientInit {

    //创建一个ossclient 实例
    public static void main(String[] args) {
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "http://oss-cn-hangzhou.aliyuncs.com";
// 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
        String accessKeyId = "LTAI4FptiyDnHfYsCPoBSq4Q";
        String accessKeySecret = "HmGxyviLd4N7NMZP41dYa6LU48alU1";
        // 创建OSSClient实例。

        // 创建ClientConfiguration。ClientConfiguration是OSSClient的配置类，可配置代理、连接超时、最大连接数等参数。
        ClientBuilderConfiguration conf = new ClientBuilderConfiguration();

// 设置OSSClient允许打开的最大HTTP连接数，默认为1024个。
        conf.setMaxConnections(200);
// 设置Socket层传输数据的超时时间，默认为50000毫秒。
        conf.setSocketTimeout(10000);
// 设置建立连接的超时时间，默认为50000毫秒。
        conf.setConnectionTimeout(10000);
// 设置从连接池中获取连接的超时时间（单位：毫秒），默认不超时。
        conf.setConnectionRequestTimeout(1000);
// 设置连接空闲超时时间。超时则关闭连接，默认为60000毫秒。
        conf.setIdleConnectionTime(10000);
// 设置失败请求重试次数，默认为3次。
        conf.setMaxErrorRetry(5);
// 设置是否支持将自定义域名作为Endpoint，默认支持。
        conf.setSupportCname(true);
// 设置是否开启二级域名的访问方式，默认不开启。
        conf.setSLDEnabled(true);
// 设置连接OSS所使用的协议（HTTP/HTTPS），默认为HTTP。
        conf.setProtocol(Protocol.HTTP);
// 设置用户代理，指HTTP的User-Agent头，默认为aliyun-sdk-java。
        conf.setUserAgent("aliyun-sdk-java");
// 设置代理服务器端口。
        conf.setProxyHost("<yourProxyHost>");
// 设置代理服务器验证的用户名。
        conf.setProxyUsername("<yourProxyUserName>");
// 设置代理服务器验证的密码。
        conf.setProxyPassword("<yourProxyPassword>");


        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret,conf);


// 关闭OSSClient。
        ossClient.shutdown();
    }


}
