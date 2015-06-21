package runescape.game.node.character;

import runescape.game.coord.Coordinate;
import runescape.game.coord.CoordinateManager;
import runescape.game.node.Node;

public abstract class CharacterNode implements Node {
	
	private final CoordinateManager coordinateManager;
	
	public CharacterNode(Coordinate coordinate) {
		this.coordinateManager = new CoordinateManager(coordinate);
	}

	@Override
	public CoordinateManager getCoordinateManager() {
		return coordinateManager;
	}

}
