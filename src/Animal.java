public class Animal extends Creature {
    @Override
    public void born() {
        System.out.println("The " + this.getClass().getSimpleName() + " " + name + "was borned");
    }

    @Override
    public void die() {
        System.out.println("The " + this.getClass().getSimpleName() + " " + name + "has died");
    }
}
