import java.io.EOFException;
import java.io.IOException;

public class Cat extends Animal{
    int age;

    public Cat(int age) throws Exception {
        if (age <0) {
            throw new Exception("Positive ba diay ning " + age +"?");
        }
        this.age = age;
    }

    void pet_the_cat() {
        System.out.println(name + " purrs");
    }
}
