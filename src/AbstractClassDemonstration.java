public class AbstractClassDemonstration {
    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                Animal dog = new Dog();
                Dog bark = new Dog();
                dog.name = "Антон";
                bark.name = dog.name;
                dog.born();
                bark.bark();
                dog.die();
            }
            if (array[i] == 2) {
                Animal human = new Human();
                human.name = "mya";
                human.born();
                human.shoutName();
                human.die();
            }
            if (array[i] == 3) {
                Alien alien = new Alien();
                alien.born();
                alien.shoutName();
                alien.die();
            }
        }
    }
}
