package org.example.strategy.models;

import org.example.strategy.behaviours.fly.FlyNoWay;
import org.example.strategy.behaviours.quack.Quack;

public class ModelDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
