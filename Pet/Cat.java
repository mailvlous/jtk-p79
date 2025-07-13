public class Cat extends Animal implements Pet {
    private int age;

    // Constructor
    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    // Implement abstract method
    @Override
    public void sleep() {
        System.out.println(name + " the cat is sleeping.");
    }

    // Implement interface method
    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }

    // Overriding
    @Override
    public void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
    }
}
