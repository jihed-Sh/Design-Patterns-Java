package org.example.strategy.models;

import org.example.strategy.behaviours.fly.FlyWithWings;
import org.example.strategy.behaviours.quack.Quack;

public class MallardDuck extends Duck{
    @Override
    public void display() {
        System.out.println("this is a mallard duck");
    }

    public MallardDuck() {
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
    }
}
