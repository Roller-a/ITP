public class Alien extends Creature{
    @Override
    public void born() {
        System.out.println("The alien " + name + " was born");
    }

    @Override
    public void die() {
        System.out.println("The alien " + name + " has died");
    }
}
