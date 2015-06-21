package runescape.game.node.character.player;

import runescape.game.coord.Coordinate;
import runescape.game.node.character.CharacterNode;

public final class Player extends CharacterNode {

	public Player(Coordinate coordinate) {
		super(coordinate);
	}

	@Override
	public NodeType getNodeType() {
		return NodeType.PLAYER;
	}

}
