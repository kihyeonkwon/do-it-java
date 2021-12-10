package gameLevel;

public class Player {
	private PlayerLevel level;

	public Player() {
		level = new Beginnerlevel();
		level.showLevelMessage();
	}

	public Playerlevel getLevel() {
		return level;
	}

	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}

	public void play(in count) {
		level.go(count);
	}

}
