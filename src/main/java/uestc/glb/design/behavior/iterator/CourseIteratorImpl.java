package uestc.glb.design.behavior.iterator;

import java.util.List;

public class CourseIteratorImpl implements ICourseIterator {
    private List courseList;
    int position;
    Course course;

    public CourseIteratorImpl(List courseList) {
        this.courseList = courseList;
    }

    @Override
    public boolean hasNext() {
        return position < courseList.size() ? true : false;
    }

    @Override
    public Course next() {
        System.out.println("返回课程，位置是："+position);
        course = (Course)courseList.get(position);
        position ++;
        return course;
    }

}
