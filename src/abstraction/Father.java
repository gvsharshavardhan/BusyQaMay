package abstraction;

public abstract class Father {
    protected abstract void buildPool();

    abstract void buildLawn();

    abstract void buildHomeTheater();

    public void basicHouse() {
        System.out.println("2bed room, kitchen, garage, hall etc..");
    }

}