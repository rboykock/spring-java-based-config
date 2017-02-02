package pro.cherkassy.rboyko.beans;

/**
 * Created by rboyko on 02.02.17.
 */
public class Wheels {
    protected  Tyres tyres;

    public Wheels(Tyres tyres) {
        this.tyres = tyres;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    @Override
    public String toString() {
        return tyres.toString();
    }
}
