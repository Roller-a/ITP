final public class Dog extends Animal {
    @Override
    public void born() {
        System.out.println("The dog "+name+" was born");
    }

    @Override
    public void die() {
        System.out.println("The dog " + name + " has died");
    }
    public void bark(){
        System.out.println("The dog " + name + " barked");
    }
}
