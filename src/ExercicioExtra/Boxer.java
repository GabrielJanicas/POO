package ExercicioExtra;

public class Boxer extends Fighter {
	private int range;

	public Boxer(String name) {
		super(name);

		this.range = (int) (Math.random() * 10) + 1;
	}
	
	public void attack(Fighter fighter) {
		if (!this.isAlive()) return;
		
		int distance = (int) (Math.random() * 10) + 1;

		if (distance <= this.range) {
			int damage = (int) (Math.random() * 100) + 1;
			fighter.setHealth(fighter.getHealth() - damage);
		}
	}
	
}
