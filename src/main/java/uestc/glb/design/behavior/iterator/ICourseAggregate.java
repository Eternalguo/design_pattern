package uestc.glb.design.behavior.iterator;

public interface ICourseAggregate {
    void addCourse(Course course);
    void removeCourse(Course course);

    CourseIteratorImpl getIterator();
}
