package uestc.glb.design.creational.builder;

/**
 * 建造者模式，创建一个对象时需要很多步骤使用建造者模式
 */
public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseAticale;
    private String courseQA;

    public Course(CourseBuilder courseBuilder) {
        this.courseName = courseBuilder.courseName;
        this.coursePPT = courseBuilder.coursePPT;
        this.courseVideo = courseBuilder.courseVideo;
        this.courseAticale = courseBuilder.courseAticale;
        this.courseQA = courseBuilder.courseQA;
    }

    public static class CourseBuilder{

        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseAticale;
        private String courseQA;

        public CourseBuilder buildCourseName(String courseName) {
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder buildCoursePPT(String coursePPT) {
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuilder buildCourseVideo(String courseVideo) {
            this.courseVideo = courseVideo;
            return this;
        }

        public CourseBuilder buildCourseAticale(String courseAticale) {
            this.courseAticale = courseAticale;
            return this;
        }

        public CourseBuilder buildCourseQA(String courseQA) {
            this.courseQA = courseQA;
            return this;
        }
        public Course build(){
            return new Course(this);
        }
    }
    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseAticale='" + courseAticale + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }
}
