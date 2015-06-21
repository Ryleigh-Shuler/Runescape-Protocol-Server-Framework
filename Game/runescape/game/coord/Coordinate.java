package runescape.game.coord;

public final class Coordinate {
	
	private int x;
	
	private int y;
	
	private int level;
	
	protected Coordinate(int x, int y, int level) {
		if (level > 4) {
			throw new IllegalArgumentException("The level can't be greater than 4.");
		}
		this.x = x;
		this.y = y;
		this.level = level;
	}
	
	public static Coordinate of(int x, int y, int level) {
		return new Coordinate(x, y, level);
	}
	
	public static Coordinate of(int x, int y) {
		return new Coordinate(x, y, 0);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
