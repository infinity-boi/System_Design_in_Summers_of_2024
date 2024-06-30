package GS06_Generics.Animal;

abstract public class Animal {
    String name;
    Animal(String name){
        this.name = name;
    }
    abstract void makeSound();
}

