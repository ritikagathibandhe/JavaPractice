interface Animal{
    void sound();
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Woof");
    }
}
public class JavaNonPrimitiveDataTypeInterface {
    public static void main(String[] args) {
        Animal dog =new Dog();
        dog.sound();
    }
}
