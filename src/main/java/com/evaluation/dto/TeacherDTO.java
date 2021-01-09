package com.evaluation.dto;

import com.evaluation.entity.TeacherEntity;

/**
 * @author: xieyong
 * @date: 2019/4/23 19:48
 * @Description:
 */
public class TeacherDTO extends TeacherEntity {

    Integer[] courseIds;

    public Integer[] getCourseIds() {
        return courseIds;
    }

    public void setCourseIds(Integer[] courseIds) {
        this.courseIds = courseIds;
    }
}
