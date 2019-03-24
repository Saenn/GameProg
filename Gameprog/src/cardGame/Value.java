package cardGame;

public enum Value {
	// etc
	TAKSIN(2,Color.RED),TOO(2,Color.BLUE);
	
	 // declaring private variable for getting values 
    private int dangerLevel;  
    private Color color;
    
    Value(int dangerLevel, Color color){ 
        this.dangerLevel = dangerLevel; 
        this.color = color;
    }     

    // getter method 
    public int getDangerLevel(){ 
        return this.dangerLevel; 
    }   
    
    public Color getColor(){
    	return this.color;
    }
}
