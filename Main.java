
abstract class Animal {
    
    private String name;

    
    public Animal(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public abstract void sound();

    public void displayInfo() {
        System.out.println("Animal Name: " + name);
    }
}


class Dog extends Animal {

    public Dog(String name) {
        super(name); 
    }

    @Override
    public void sound() {
        System.out.println(getName() + " says: Woof Woof!"); 
    }
}


class Cat extends Animal {

    public Cat(String name) {
        super(name);  
    }

    @Override
    public void sound() {
        System.out.println(getName() + " says: Meow Meow!"); 
    }
}

public class Main {
    public static void main(String[] args) {
        
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");

        
        dog.displayInfo();
        dog.sound(); 

        System.out.println(); 

        cat.displayInfo();
        cat.sound(); 
    }
}