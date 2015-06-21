package runescape.game.node.character.player.skill;

public final class Skill {
	
	private static final int[] EXPERIENCE_FOR_LEVEL = new int[100];
	
	private static final int MAX_EXPERIENCE = 200_000_000;
	
	private static final int MAX_LEVEL = 99;
	
	static {
		int points = 0, output = 0;
		for (int level = 1; level <= 99; level++) {
			EXPERIENCE_FOR_LEVEL[level] = output;
			points += Math.floor(level + 300 * Math.pow(2, level / 7.0));
			output = (int) Math.floor(points / 4);
		}
	}
	
	private final String name;
	
	private int level;
	
	private int experience;
	
	protected Skill(String name, int level, int experience) {
		this.name = name;
		this.level = level;
		this.experience = experience;
	}
	
	public static Skill of(String name, int level, int experience) {
		return new Skill(name, level, experience);
	}
	
	public void increment() {
		level++;
	}
	
	public void decrement() {
		level--;
	}

	public int getLevel() {
		return level;
	}
	
	public int getLevel(int experience) {
		if (experience < 0 || experience > MAX_EXPERIENCE) {
			throw new IllegalArgumentException("Experience must be between 0 and " + MAX_EXPERIENCE + " inclusive.");
		}
		
		for (int level = 1; level <= 98; level++) {
			if (experience < EXPERIENCE_FOR_LEVEL[level + 1]) {
				return level; 
			}
		}
		return 99;
	}

	public void setLevel(int level) {
		this.level = level > MAX_LEVEL ? MAX_LEVEL : level;
	}

	public int getExperience() {
		return experience;
	}
	
	public int getExperience(int level) {
		if (level < 0 || level > MAX_LEVEL) {
			throw new IllegalArgumentException("Level must be between 0 and " + MAX_LEVEL + " inclusive.");
		}
		
		return EXPERIENCE_FOR_LEVEL[level];
	}

	public void setExperience(int experience) {
		this.experience = experience > MAX_EXPERIENCE ? MAX_EXPERIENCE : experience;
	}

	public String getName() {
		return name;
	}

}
