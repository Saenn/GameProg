package cardGame;

import java.util.ArrayList;
import java.util.Random;

public class Field {
	
	private ArrayList<Condition> field;
	
	public Field(){
		field = new ArrayList<>();
		createField();
		shuffle();
	}
	
	public void createField(){
		for(Condition condition : Condition.values()){
			for(int i = 0 ; i < 4 ; i++){
				this.addCondition(condition);
			}
		}
	}
	
	public Condition getConditon(){
		return this.field.get(0);
	}
	
	public Condition getNextCondition(){
		return this.field.get(1);
	}
	
	public void addCondition(Condition condition){
		this.field.add(condition);
	}
	
	public void removeTop(){
		this.field.remove(0);
	}
	
	//Shuffle deck of cards
	public void shuffle(){
		
		ArrayList<Condition> tmpDeck = new ArrayList<Condition>();
		Random random = new Random();
		int randomCardIndex = 0;
		int originalSize = this.field.size();
		for(int i = 0; i<originalSize;i++){
			randomCardIndex = random.nextInt((this.field.size()-1 - 0) + 1) + 0;
			tmpDeck.add(this.field.get(randomCardIndex));
			this.field.remove(randomCardIndex);
		}
		
		this.field = tmpDeck;
	}
}
