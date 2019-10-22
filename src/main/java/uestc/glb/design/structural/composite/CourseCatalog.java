package uestc.glb.design.structural.composite;

import java.util.ArrayList;

public class CourseCatalog extends CatalogComponent{
    private ArrayList<CatalogComponent> items = new ArrayList<>();
    private String name;
    /**
     * level表示目录的层数，使用包装类型是为了方便判断是否为空，int的话有默认值0
     */
    private Integer level;

    public CourseCatalog(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }


    @Override
    public void print() {
        System.out.println(name);
        for(CatalogComponent catalog : items){
            // 展示目录的层次结构
            if(level != null) {
                for (int i = 0; i < level; i++) {
                    System.out.print("  ");
                }
            }
            catalog.print();
        }
    }
}
