package cardGame;

import java.util.ArrayList;

public class Player {
	
	private ArrayList<Card> hands, dropZone;
	private Card card;
	
	public Player(){		
		this.hands = new ArrayList<Card>();	
		this.dropZone = new ArrayList<Card>();
	}
	
	//Remove a card from the deck
	public void removeCard(int i){
		this.hands.remove(i);
	}
	
	//Get card
	public Card getCard(int i){
		return this.hands.get(i);
	}
	
	// draw from deck
	public void draw(Deck deck){
		this.card = deck.draw();
		this.addCard(card);
	}
	
	//Add card to hands
	public void addCard(Card card){
		this.hands.add(card);
	}
	
	//Add card to dropzone
	public void addCardToZone(Card card){
		this.dropZone.add(card);
	}
	
	public Card getCard(Value value){
		int s = this.getHandsSize();
		for(int i = 0 ; i < s ; i++){
			if(this.getCard(i).getValue() == value){				
				this.card =  this.getCard(i);
				this.removeCard(i);
				return this.card;
			}
		}		
		return null;
	}
	
	public void dropCard(int position){
		this.card = this.getCard(position);
		this.removeCard(position);
		this.addCardToZone(card);
	}
	
	public int getHandsSize(){
		return this.hands.size();
	}
	
	// Check Death
}
