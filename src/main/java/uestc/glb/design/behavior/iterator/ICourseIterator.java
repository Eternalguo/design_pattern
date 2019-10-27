package uestc.glb.design.behavior.iterator;

/**
 * 迭代器模式：提供了一种访问集合对象各个元素的方法而又不暴露对象的内部表示
 */
public interface ICourseIterator {
    boolean hasNext();
    Course next();
}
