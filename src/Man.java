public class Man extends Human{
    public Man(String name) {
        super(name);
    }

    @Override
    public void shave() {
        System.out.println(name + " is shaving his beard");
    }
}
