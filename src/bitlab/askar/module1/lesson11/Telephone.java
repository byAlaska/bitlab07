package bitlab.askar.module1.lesson11;

public class Telephone implements CanCharge {

    public int size;
    public String name;
    private int telephoneCount = 0;

    static {

    }

    {
        telephoneCount++;
    }

    public Telephone() {
    }

    public Telephone(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public void charge() {
        System.out.println("Telephone charges");
    }

    @Override
    public Object clone() {
        return new Telephone(size, name);
    }
}
