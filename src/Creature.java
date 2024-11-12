public abstract class Creature {
    public abstract void born();
    public abstract void die();
    String name = null;
    public void getName() {this.name = name;}
    boolean isAlive = false;
    public void shoutName (){
        if (name != null) {
            System.out.println(name);
        } else {
            System.err.println("error");
        }
    }
}
