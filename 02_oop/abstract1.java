import java.net.SocketPermission;

abstract class Animal{
    String name ;

    Animal(String name){
        this.name = name;
    }
    // abstract method - no body, just the idea
    // every animal MUST implement this
    // every child have to override it cant skip --  not optional
    abstract void makeSound();

    void sleep(){
        System.out.println(name + " is sleeping");
    }

}
class Tiger extends Animal{
    Tiger(String name){
        super(name);
    }

    @Override
    void makeSound(){
        System.out.println(name + " Roars");
    };

}
class Wolf extends Animal{
    Wolf(String name){
        super(name);
    }

    @Override // safer throws erreor when typo , checks avail in the parent or not at the first place
    void makeSound(){
        System.out.println(name + " Howls");
    };

    void work(){
        makeSound();
        sleep();
    }

}

public class abstract1 {
    public static void main(String args[]){
        Tiger t = new Tiger("TiTuTiger");
        Wolf w = new Wolf("WollyWolf");

        t.makeSound();
        t.sleep();

        w.work();
    }
}