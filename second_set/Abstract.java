package second_set;

abstract class Abstract1 {
    abstract void show();   // abstract method
}

class Dog extends Abstract1 {
    @Override
    void show() {
        System.out.println("Dog is barking...");
    }

    public static void main(String[] args) {
        Abstract1 ref = new Dog();
        ref.show();
    }
}
