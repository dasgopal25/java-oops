package second_set;
abstract class Animal
{
    Animal(){
        System.out.println("Abstract Constructor");
    }
    void Anything(){
        System.out.println("I am Animal Simple Function");
    }
    public abstract void sound();
}
class Dog extends Animal
{   
    Dog(){
        super();
    }
    public void sound(){
        System.out.println("Dog is barking ");
    }
}
class Lion extends Animal
{
    public void sound(){
        super.Anything();
        System.out.println("Lion is roar");
    }
}
public class animal_Abstract {
    public static void main(String[] args) {
        Dog d = new Dog();
        Lion l = new Lion();
        d.sound(); l.sound();
    }
}
