package org.example.strategy.behaviours.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm not flying");
    }
}
