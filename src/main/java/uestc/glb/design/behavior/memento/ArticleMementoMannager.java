package uestc.glb.design.behavior.memento;

import java.util.Stack;

public class ArticleMementoMannager {
    private final Stack<ArticleMemento> stack = new Stack<>();
    public ArticleMemento getArticleMemento(){
        return stack.pop();
    }
    public void addMemento(ArticleMemento memento){
        stack.push(memento);
    }
}
