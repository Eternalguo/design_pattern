package uestc.glb.design.behavior.chainofresponsibility;
import lombok.Setter;
import lombok.Getter;
public class Course {
    @Setter @Getter private String name;
    @Setter @Getter private String article;
    @Setter @Getter private String video;

    public Course(String name) {
        this.name = name;
    }
}
