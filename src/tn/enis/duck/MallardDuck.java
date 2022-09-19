package tn.enis.duck;

import tn.enis.flybehavior.FlyWithWings;
import tn.enis.quackbehavior.Quack;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		qBehavior = new Quack();
		fBehavior = new FlyWithWings();
	}
	public void display() {
		System.out.println("I'm a Mallard Duck");
	}
}