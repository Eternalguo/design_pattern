package uestc.glb.design.behavior.templatemethod;

/**
 * 模板方法模式定义一个算法的骨架，允许子类为一个或多个步骤提供实现，使得子类在不改变算法结构的情况下重新定义算法的步骤
 */
public abstract class ACourse {
    // 模板方法，申明为final的，防止被重写
    public final void makeCourse(){
        makePPT();
        makeVideo();
        if(needMakeArticle()){
            makeArticle();
        }
        packageCourse();
    }
    final void makePPT(){
        System.out.println("制作PPT");
    }
    final void makeVideo(){
        System.out.println("制作视频");
    }
    final void makeArticle(){
        System.out.println("制作手记");
    }
    protected abstract void packageCourse();
    protected boolean needMakeArticle(){
        return false;
    }
}
