package cardGame;

public class Card {
	
	private Color color;
	private Value value;
	private int dangerLevel;
	
	public Card(Color color, Value value, int dangerLevel){
		this.color = color;
		this.value = value;
		this.dangerLevel = dangerLevel;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public int getDangerLevel() {
		return dangerLevel;
	}

	public void setDangerLevel(int dengerLevel) {
		this.dangerLevel = dangerLevel;
	}
	
}
