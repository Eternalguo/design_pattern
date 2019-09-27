package uestc.glb.design.creational.simplefactroy;


public class VideoFactory {
    // 这种实现添加新的产品时，需要修改简单工厂类，违背开闭原则
    public Video getVideo(String type){
        if("Java".equals(type)){
            return new JavaVideo();
        }else if("Python".equals(type)){
            return new PythonVideo();
        }
        return null;
    }

    // 采用反射方式来改善违背开闭原则
    public Video getVideo(Class clazz){
        Video video = null;
        try {
            video = (Video) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
