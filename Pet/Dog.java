public class Dog extends Animal implements Pet {
    private String breed;

    // Default constructor
    public Dog() {
        super("Unknown Dog");
        this.breed = "Mixed";
    }

    // Parameterized constructor
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    // Getter & Setter (Encapsulation)
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Implement abstract method
    @Override
    public void sleep() {
        System.out.println(name + " the dog is sleeping.");
    }

    // Implement interface method
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }

    // Overloading
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // Overriding
    @Override
    public void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
    }
}
