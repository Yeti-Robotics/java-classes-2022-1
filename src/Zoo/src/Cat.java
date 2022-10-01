package Zoo.src;

public class Cat extends Mammal{
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String speak() {
        return "Meow";
    }

    @Override
    public String toString() {
        return "Cat";
    }
}
