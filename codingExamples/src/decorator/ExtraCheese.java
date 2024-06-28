package decorator;

public class ExtraCheese extends ToppingsDecorator {
	BasePizza basePizza;

	public ExtraCheese(BasePizza basePizza) {
		this.basePizza = basePizza;
	}

	/*ExtraCheese(BasePizza basePizza) {
		super(basePizza);
	}*/

	@Override
	public int cost() {
		return this.basePizza.cost() + 50;
	}
}
