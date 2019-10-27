package uestc.glb.design.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

public class CourseAggregateImpl implements ICourseAggregate{
    private List courseList;

    public CourseAggregateImpl( ) {
        this.courseList = new ArrayList();
    }

    @Override
    public void addCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    @Override
    public CourseIteratorImpl getIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
