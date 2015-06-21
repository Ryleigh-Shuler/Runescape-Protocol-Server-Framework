package runescape.game.coord;

public final class CoordinateManager {
	
	private final Coordinate coordinate;
	
	public CoordinateManager(Coordinate coordinate) {
		this.coordinate = coordinate;
	}
	
	public boolean isWithinDistance(Coordinate other, int distance) {
		int deltaX = Math.abs(getX() - other.getX());
		int deltaY = Math.abs(getY() - other.getY());
		return deltaX <= distance && deltaY <= distance;
	}
	
	public int getX() {
		return coordinate.getX();
	}
	
	public int getRegionX() {
		return (coordinate.getX() >> 3);
	}
	
	public int getLocalX() {
		return (coordinate.getX() - 8 * (getRegionX() - 6));
	}
	
	public int getY() {
		return coordinate.getY();
	}
	
	public int getRegionY() {
		return (coordinate.getY() >> 3);
	}
	
	public int getLocalY() {
		return (coordinate.getY() - 8 * (getRegionY() - 6));
	}
	
	public int getLevel() {
		return coordinate.getLevel();
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

}
