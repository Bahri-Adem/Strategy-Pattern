package tn.enis.duck;

import tn.enis.flybehavior.FlyNoWay;
import tn.enis.quackbehavior.MuteQuack;

public class WoodenDuck extends Duck {

	public WoodenDuck() {
		fBehavior = new FlyNoWay();
		qBehavior = new MuteQuack();
	}
	public void display() {
		System.out.println("I'm a Wooden Duck");
	}

}