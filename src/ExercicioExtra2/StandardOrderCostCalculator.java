package ExercicioExtra2;

public class StandardOrderCostCalculator implements OrderCostCalculator{
	@Override
	public double calculateOrderCost(Order order) {
		double total = order.valorTotal();
		if (order.isExpresso()) total *= 1.3;
		return total;
	}
}
