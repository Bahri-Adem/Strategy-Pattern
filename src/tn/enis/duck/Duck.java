package tn.enis.duck;

import tn.enis.flybehavior.FlyBehavior;
import tn.enis.quackbehavior.QuackBehavior;

public abstract class Duck {
	protected QuackBehavior qBehavior;
	protected FlyBehavior fBehavior;
	
	public Duck() {
		
	}
	
	public void swim() {
		System.out.println("All Ducks Swim !");
	}
	
	public abstract void display();
	
	public void performFly() {
		fBehavior.fly();
	}
	
	public void performQuack() {
		qBehavior.quack();
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		fBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		qBehavior = qb;
	}
}