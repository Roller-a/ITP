final public class Human extends Animal{
    @Override
    public void born() {
        System.out.println("The human " + name + " was born");
    }

    @Override
    public void die() {
        System.out.println("The human " + name + " has died");
    }
}
