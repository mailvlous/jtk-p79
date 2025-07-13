public abstract class Animal {
    protected String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Abstract method
    public abstract void sleep();

    // Concrete method
    public void breathe() {
        System.out.println(name + " is breathing.");
    }
}
