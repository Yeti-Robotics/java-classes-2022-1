package Zoo;

public class Main {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        System.out.println(mammal.speak());

        Cat cat = new Cat("Garfield");
        System.out.println(cat.getName() + " says \"" + cat.speak() + "\"");

        Cat catTwo = new Cat("Calvin");
        System.out.println(catTwo.getName() + " says \"" + catTwo.speak() + "\"");
    }
}
