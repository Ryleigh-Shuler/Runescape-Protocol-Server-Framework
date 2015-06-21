package runescape.game.node.character.player.skill;

public class SkillManager {
	
	private final Skill[] skills = {
			Skill.of("Attack", 1, 0), Skill.of("Defence", 1, 0), Skill.of("Strength", 1, 0),
			Skill.of("Hitpoints", 10, 1154), Skill.of("Range", 1, 0), Skill.of("Prayer", 1, 0),
			Skill.of("Magic", 1, 0), Skill.of("Cooking", 1, 0), Skill.of("Woodcutting", 1, 0),
			Skill.of("Fletching", 1, 0), Skill.of("Fishing", 1, 0), Skill.of("Firemaking", 1, 0),
			Skill.of("Crafting", 1, 0), Skill.of("Smithing", 1, 0), Skill.of("Mining", 1, 0),
			Skill.of("Herblore", 1, 0), Skill.of("Agility", 1, 0), Skill.of("Thieving", 1, 0),
			Skill.of("Slayer", 1, 0), Skill.of("Farming", 1, 0), Skill.of("Runecrafting", 1, 0)
	};
	
	private int combatLevel;
	
	public SkillManager() {
		this.setCombatLevel(3);
	}

	public int getCombatLevel() {
		return combatLevel;
	}

	public void setCombatLevel(int combatLevel) {
		this.combatLevel = combatLevel;
	}

	public Skill[] getSkills() {
		return skills;
	}

}
