package uestc.glb.design.behavior.iterator;

public class Test {
    public static void main(String[] args) {
        Course course1 = new Course("Java设计模式");
        Course course2 = new Course("Java并发编程");
        Course course3 = new Course("Java虚拟机");
        Course course4 = new Course("Spring实战");
        Course course5 = new Course("Netty实战");
        CourseAggregateImpl courseAggregate = new CourseAggregateImpl();
        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);
        courseAggregate.addCourse(course3);
        courseAggregate.addCourse(course4);
        courseAggregate.addCourse(course5);
        System.out.println("-------课程列表-------");
        printCourse(courseAggregate);
        courseAggregate.removeCourse(course2);
        courseAggregate.removeCourse(course3);
        System.out.println("-------删除后，课程列表------");
        printCourse(courseAggregate);
    }
    public static void printCourse(ICourseAggregate courseAggregate){
        ICourseIterator courseIterator = courseAggregate.getIterator();
        while(courseIterator.hasNext()){
            Course course = courseIterator.next();
            System.out.println(course.getName());
        }
    }
}
