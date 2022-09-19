import tn.enis.duck.*;
import tn.enis.flybehavior.*;
import tn.enis.quackbehavior.*;
public class Main {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.swim();
		mallard.display();
		mallard.performQuack();
		mallard.performFly();

		Duck wooden = new WoodenDuck();
		wooden.display();
		wooden.performQuack();
		wooden.performFly();
		wooden.setFlyBehavior(new FlyWithWings());
		wooden.performFly();
		wooden.setQuackBehavior(new Squeak());
		wooden.performQuack();
	}
	
}