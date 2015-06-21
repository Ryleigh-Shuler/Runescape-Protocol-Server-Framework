package runescape.game.node;

import runescape.game.coord.CoordinateManager;

public interface Node {
	
	enum NodeType {
		PLAYER, NPC, GAME_OBJECT, GROUND_ITEM
	}
	
	public abstract CoordinateManager getCoordinateManager();
	
	public abstract NodeType getNodeType();

}
