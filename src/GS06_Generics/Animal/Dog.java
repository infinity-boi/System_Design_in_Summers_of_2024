package GS06_Generics.Animal;

public class Dog extends Animal{

    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Woof Woof!");
    }

    @Override
    public String toString() {
        return "Dog" + name;
    }
}

