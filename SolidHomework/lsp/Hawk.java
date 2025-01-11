package lsp;

public class Hawk extends Bird implements FlyAction{
    protected Hawk(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Hawk is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Hawk is sleeping.");
    }

    @Override
    public void fly() {
        System.out.println("Hawk is flying.");
    }
}
