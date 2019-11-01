package uestc.glb.design.behavior.memento;

public class Test {
    /**
     * 备忘录模式，保存了一个对象的状态，以便在适当的时候恢复对象
     * @param args
     */
    public static void main(String[] args) {
        ArticleMementoMannager mannager = new ArticleMementoMannager();
        Article article = new Article("设计模式手记A", "内容为A", "图片为A");
        // 保存一次对象的状态
        ArticleMemento mementoA = article.saveToMemento();
        mannager.addMemento(mementoA);
        System.out.println("当前手记状态： " + article);
        article.setTitle("设计模式B");
        article.setContents("内容B");
        article.setImgs("图片B");
        // 保存一次对象的状态
        ArticleMemento mementoB = article.saveToMemento();
        mannager.addMemento(mementoB);
        System.out.println("当前手记状态： " + article);
        article.setTitle("设计模式C");
        article.setContents("内容C");
        article.setImgs("图片C");
        System.out.println("恢复前状态： " + article);
        // 恢复对象到上次保存的状态
        article.undoMemento(mannager.getArticleMemento());
        System.out.println("当前手记状态： " + article);
        // 恢复对象到上次保存的状态
        article.undoMemento(mannager.getArticleMemento());
        System.out.println("当前手记状态： " + article);
    }
}
