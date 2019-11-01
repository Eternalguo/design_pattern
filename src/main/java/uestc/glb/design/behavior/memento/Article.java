package uestc.glb.design.behavior.memento;

public class Article {
    private String title;
    private String contents;
    private String imgs;

    public Article(String title, String contents, String imgs) {
        this.title = title;
        this.contents = contents;
        this.imgs = imgs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    public ArticleMemento saveToMemento(){
        ArticleMemento memento = new ArticleMemento(title, contents, imgs);
        return memento;
    }

    public void undoMemento(ArticleMemento memento){
        setTitle(memento.getTitle());
        setContents(memento.getContents());
        setImgs(memento.getImgs());
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                ", imgs='" + imgs + '\'' +
                '}';
    }
}
