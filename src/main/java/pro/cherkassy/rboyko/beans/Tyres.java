package pro.cherkassy.rboyko.beans;

/**
 * Created by rboyko on 02.02.17.
 */
public class Tyres {
    protected int size;
    protected String name;

    public Tyres(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name+" "+Integer.toString(size)+"d";
    }
}
