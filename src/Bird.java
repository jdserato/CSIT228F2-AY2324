public class Bird extends Animal implements Flier{
    public Bird(String name) {
        this.name = name;
    }

    public void fly () {
        System.out.println(name + " is flapping wings");
    }
}
