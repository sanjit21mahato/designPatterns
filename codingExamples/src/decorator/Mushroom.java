package decorator;

public class Mushroom extends ToppingsDecorator {
	/*Mushroom(BasePizza basePizza) {
		super(basePizza);
	}*/

	BasePizza basePizza;

	public Mushroom(BasePizza basePizza) {
		this.basePizza = basePizza;
	}

	
	@Override
	public int cost() {
		return this.basePizza.cost()+40;
	}
}
