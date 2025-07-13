public class Main {
    public static void main(String[] args) {
        Dog defaultDog = new Dog();
        defaultDog.breathe();
        defaultDog.makeSound();
        defaultDog.sleep();
        defaultDog.eat();
        defaultDog.eat("bone");

        Dog buddy = new Dog("Buddy", "Golden Retriever");
        buddy.breathe();
        buddy.makeSound();
        buddy.sleep();
        buddy.eat("chicken");


        System.out.println("Breed of Buddy: " + buddy.getBreed());
        buddy.setBreed("Labrador");
        System.out.println("Updated breed: " + buddy.getBreed());

        // Cat example
        Cat kitty = new Cat("Kitty", 2);
        kitty.breathe();
        kitty.makeSound();
        kitty.sleep();
        kitty.eat("fish");

        Animal polymorphicDog = new Dog("Max", "Bulldog");
        polymorphicDog.breathe();
        polymorphicDog.sleep();

        ((Pet) polymorphicDog).makeSound();
    }
}
