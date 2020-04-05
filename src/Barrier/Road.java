package Barrier;

import Interface.PropertyForBarrier;

public class Road implements PropertyForBarrier {
    double distance = 0;

    public Road(double distance) {
        this.distance = distance;
    }

    @Override
    public double getDistance() {
        return distance;
    }
}
