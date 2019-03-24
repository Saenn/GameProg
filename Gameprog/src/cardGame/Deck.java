package cardGame;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
private ArrayList<Card> deck;
private Card card;
	
	public Deck(){		
		this.deck = new ArrayList<Card>();	
	}
	
	//Add cards to the deck
	public void createDeck(){
        for (Value value : Value.values()) {
        	int s = value.getDangerLevel();
        	for(int i = 0 ; i < s ; i++){
        		this.card = new Card(value.getColor(), value, value.getDangerLevel());
                deck.add(card);
        	}
        }	  
	}		
		
	//Shuffle deck of cards
	public void shuffle(){
		
		ArrayList<Card> tmpDeck = new ArrayList<Card>();
		Random random = new Random();
		int randomCardIndex = 0;
		int originalSize = this.deck.size();
		for(int i = 0; i<originalSize;i++){
			randomCardIndex = random.nextInt((this.deck.size()-1 - 0) + 1) + 0;
			tmpDeck.add(this.deck.get(randomCardIndex));
			this.deck.remove(randomCardIndex);
		}
		
		this.deck = tmpDeck;
	}
		
	//Remove a card from the deck
	public void removeCard(int i){
		this.deck.remove(i);
	}
	
	//Get card from deck
	public Card getCard(int i){
		return this.deck.get(i);
	}
	
	//Add card to deck
	public void addCard(Card addCard){
		this.deck.add(addCard);
	}
	
	//Draw a top card
	public Card draw(){
		Card card = this.getCard(0);
		this.removeCard(0);
		return card;
	}
	
	public int deckSize(){
		return this.deck.size();
	}	
	
}
