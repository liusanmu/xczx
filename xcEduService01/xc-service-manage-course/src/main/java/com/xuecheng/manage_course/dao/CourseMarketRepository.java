package com.xuecheng.manage_course.dao;

import com.xuecheng.framework.domain.course.CourseMarket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: lsm
 * @description:
 * @create: 2019-09-12 14:36
 */
@Repository
public interface CourseMarketRepository extends JpaRepository<CourseMarket,String> {


}
