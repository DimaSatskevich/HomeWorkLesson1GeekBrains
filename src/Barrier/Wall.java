package Barrier;

import Interface.PropertyForBarrier;

public class Wall implements PropertyForBarrier {
    double height = 0;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public double getDistance() {
        return height;
    }
}
