public class Superman extends Man implements Flier{
    public Superman(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(name + " raises his hand (and repeat after me)");
    }
}
