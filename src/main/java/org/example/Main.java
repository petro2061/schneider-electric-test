package org.example;

public class Main {
    private static final double START_LEVEL = 25.0;

    public static void main(String[] args) {
        TankControlSystem system = new TankControlSystem(START_LEVEL);

        system.openFillValve();
        for (int i = 0; i < 10; i++) {
            system.controlSystem();
            system.simulateStep(8.0);
        }

        system.setDrainBottom(true);
        for (int i = 0; i < 5; i++) {
            system.controlSystem();
            system.simulateStep(10.0);
        }

        system.closeFillValve();
        system.controlSystem();
    }
}
