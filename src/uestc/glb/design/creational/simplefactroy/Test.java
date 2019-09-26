package uestc.glb.design.creational.simplefactroy;


/**
 * Test相当于一个应用层或者客户端client
 */
public class Test {
    public static void main1(String[] args) {
        VideoFactory factory = new VideoFactory();
        Video video = factory.getVideo("Java");
        if(video == null)
            return;
        video.preduce();
        video = factory.getVideo("Python");
        video.preduce();
    }

    public static void main(String[] args) {
        VideoFactory factory = new VideoFactory();
        Video video = factory.getVideo(JavaVideo.class);
        if(video == null)
            return;
        video.preduce();
        video = factory.getVideo(PythonVideo.class);
        if(video == null)
            return;
        video.preduce();
    }
}
