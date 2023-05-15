package ExercicioExtra;

public class Wrestler extends Fighter {
	private int velocity;

	public Wrestler(String name) {
		super(name);

		this.velocity = (int) (Math.random() * 10) + 1;
	}
	
	public void attack(Fighter fighter) {
		if (!this.isAlive()) return;
		
		int distance = (int) (Math.random() * 10) + 1;

		if (this.velocity >= distance) {
			int damage = (int) (Math.random() * 100) + 1;
			fighter.setHealth(fighter.getHealth() - damage);
		}	
	}
	
}