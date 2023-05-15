package ExercicioExtra;

public abstract class Fighter {
	private String name;
	private int health = 100;
	private int victories = 0;
	private int defeats = 0;

	public Fighter(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public int getVictories() {
		return victories;
	}

	public int getDefeats() {
		return defeats;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void setVictories(int victories) {
		this.victories = victories;
	}

	public void setDefeats(int defeats) {
		this.defeats = defeats;
	}

	public boolean isAlive() {
		return health > 0;
	}

	public void win() {
		victories++;
	}

	public void lose() {
		defeats++;
	}

	public abstract void attack(Fighter fighter);

	@Override
	public String toString() {
		return "Fighter [name=" + name + ", health=" + health + ", victories=" + victories + ", defeats=" + defeats + "]";
	}

}