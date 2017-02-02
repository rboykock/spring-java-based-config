package pro.cherkassy.rboyko.beans;

/**
 * Created by rboyko on 02.02.17.
 */
public class Engine {
    protected double engineСapacity;

    public Engine(double engineСapacity) {
        this.engineСapacity = engineСapacity;
    }

    public double getEngineСapacity() {
        return engineСapacity;
    }

    public void setEngineСapacity(double engineСapacity) {
        this.engineСapacity = engineСapacity;
    }

    @Override
    public String toString() {
        return "V"+Double.toString(engineСapacity);
    }
}
