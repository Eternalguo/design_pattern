package uestc.glb.principle.interfacesegregation;

/**
 * Dog不应该依赖总的接口，而应该实现只用自己相关的接口
 */
public class Dog implements IEatAnimalAction, ISiwmAnimalAction {
    @Override
    public void eat() {

    }

    @Override
    public void swim() {

    }
}
