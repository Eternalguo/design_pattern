package uestc.glb.design.structural.composite;

public class Test {
    public static void main(String[] args) {
        CatalogComponent mainCatalog = new CourseCatalog("课程主目录", 1);
        CatalogComponent linuxCourse = new Course("linux课程", 20);
        CatalogComponent windowsCourse = new Course("windows课程", 30);
        mainCatalog.add(linuxCourse);
        mainCatalog.add(windowsCourse);
        CatalogComponent javaCourseCatalog = new CourseCatalog("java课程目录", 2);
        CatalogComponent concurrentCourse = new Course("Java并发课程", 50);
        CatalogComponent patternDesign = new Course("Java设计模式课程", 55);
        CatalogComponent JVM = new Course("Java JVM课程", 60);
        javaCourseCatalog.add(concurrentCourse);
        javaCourseCatalog.add(patternDesign);
        javaCourseCatalog.add(JVM);
        mainCatalog.add(javaCourseCatalog);
        mainCatalog.print();
    }
}
