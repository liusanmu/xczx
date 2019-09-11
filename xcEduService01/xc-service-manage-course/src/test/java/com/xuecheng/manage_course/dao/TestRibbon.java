package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.manage_course.client.CmsPageClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author: lsm
 * @description:
 * @create: 2019-09-11 20:20
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestRibbon {

    @Autowired
    RestTemplate restTemplate;

     @Test
     public void test()throws Exception{
         String serviceId = "XC-SERVICE-MANAGE-CMS";
         for (int i = 0; i < 10; i++) {

             ResponseEntity<CmsPage> entity = restTemplate.getForEntity("http://" + serviceId + "/cms/page/get/5a754adf6abb500ad05688d9", CmsPage.class);
             CmsPage body = entity.getBody();
             System.out.println(body);
         }


     }
     @Test
     public void test2()throws Exception{
         String serviceId = "XC-SERVICE-MANAGE-CMS";
         for (int i=0;i<10;i++){
             //ribbon客户端从eurekaServer中获取服务列表,根据服务名获取服务列表
             ResponseEntity<Map> forEntity = restTemplate.getForEntity("http://"+serviceId+"/cms/page/get/5a754adf6abb500ad05688d9", Map.class);
             Map body = forEntity.getBody();
             System.out.println(body);
         }

     }

     @Autowired
    CmsPageClient cmsPageClient;
    @Test
    public void testFeign() {
         //通过服务id调用cms的查询页面接口
        CmsPage cmsPage = cmsPageClient.findById("5a754adf6abb500ad05688d9");
        System.out.println(cmsPage);
    }
}
