package com.xuecheng.framework.domain.course.ext;/**
 * @author: lsm
 * @description:
 * @create: 2019-09-12 14:27
 */

import com.xuecheng.framework.domain.course.CourseBase;
import com.xuecheng.framework.domain.course.CourseMarket;
import com.xuecheng.framework.domain.course.CoursePic;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 @author: ls
 @description: 课程预览信息
 @create: 2019-09-12 14:27
 */
@Data
@ToString
@NoArgsConstructor
public class CourseView implements Serializable {

    /**
     * 基础信息
     */
    CourseBase courseBase;
    /**
     * 课程营销
     */
    CourseMarket courseMarket;
    /**
     * 课程图片
     */
    CoursePic coursePic;
    /**
     * 课程计划
     */
    TeachplanNode teachplanNode;
}
