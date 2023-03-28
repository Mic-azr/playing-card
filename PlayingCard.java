
/**
 * A class representing a traditional playing card, one of a deck of 52 cards, (10 numbered cards + 3 face cards) * 4 suits
 *
 * @author Michael Cummings
 * @version 3.27.23
 */
public class PlayingCard
{
    private int playingCardRank;
    private String playingCardName;
    private String playingCardSuit;
    private String playingCardSuitColor; //Playing card suits are traditionally black spades and clubs, red hearts and diamonds
    private boolean playingCardIsFace;
    
    /**
     * Default constructor for objects of class PlayingCard, creates a Joker card
     */
    public PlayingCard()
    {
        this.playingCardRank = 0;
        this.playingCardName = "Joker";
        this.playingCardSuit = "None";
        this.playingCardSuitColor = "N/A";
        this.playingCardIsFace = false;
    }

    /**
     * Constructor for objects of class PlayingCard
     *
     * @param  name the name of the PlayingCard (Ex: 2, 7, 10)
     * @param   suit    the suit of the PlayingCard (Ex: "Diamonds", "Clubs")
     */
    public PlayingCard(int name, String suit)
    {
        if(name >= 2 && name <= 10)
        {
            this.playingCardRank = name;
            
            String s = String.valueOf(name);
            this.playingCardName = s;
        }
        else
        {
            throw new IllegalArgumentException("Playing cards must have a rank between 2 and 10, or from ('Ace', 'Jack', 'Queen', 'King').");
        }
        
        this.playingCardIsFace = false;
        
        if(suit == "Clubs" || suit == "Spades")
        {
            this.playingCardSuit = suit;
            this.playingCardSuitColor = "Black";
        }
        else if (suit == "Diamonds" || suit == "Hearts")
        {
            this.playingCardSuit = suit;
            this.playingCardSuitColor = "Red";
        }
        else
        {
            throw new IllegalArgumentException("Playing cards must belong to a valid Suit ('Clubs', 'Diamonds', 'Hearts', 'Spades').");
        }
    }
    
    /**
     * Constructor for objects of class PlayingCard, overloaded for String arguments for rank parameter
     * 
     * @param rank  the rank of the PlayingCard (Ex: "Ace", "Jack", "Queen")
     * @param   suit    the suit of the PlayingCard (Ex: "Diamonds", "Clubs")
     */
    public PlayingCard(String name, String suit)
    {
        if(name != "Ace" || name != "A")
        {
            if(name == "Jack" || name == "J")
            {
                this.playingCardRank = 11;
                this.playingCardName = name;
                this.playingCardIsFace = true;
            }
            
            else if (name == "Queen" || name == "Q")
            {
                this.playingCardRank = 12;
                this.playingCardName = name;
                this.playingCardIsFace = true;
            }
            
            else if (name == "King" || name == "K")
            {
                this.playingCardRank = 13;
                this.playingCardName = name;
                this.playingCardIsFace = true;
            }
            
            else
            {
                throw new IllegalArgumentException("Playing cards must have a rank between 2 and 10, or from ('Ace', 'Jack', 'Queen', 'King').");
            }
        }
        else //PlayingCard to be constructed is an Ace
        {
            this.playingCardRank = 1; //An Ace card is usually equal to 1, however in some games like Blackjack, an Ace's value may be 1 or 11 depending on whether the player's hand would total over 21 with an Ace valued at 11. If it would, the Ace card's value is 1.
            this.playingCardName = name;
            this.playingCardIsFace = false;
        }
        
        if(suit == "Clubs" || suit == "Spades")
        {
            this.playingCardSuit = suit;
            this.playingCardSuitColor = "Black";
        }
        else if (suit == "Diamonds" || suit == "Hearts")
        {
            this.playingCardSuit = suit;
            this.playingCardSuitColor = "Red";
        }
        else
        {
            throw new IllegalArgumentException("Playing cards must belong to a valid Suit ('Clubs', 'Diamonds', 'Hearts', 'Spades').");
        }
    }
    
    /**
     * Method to manually set a PlayingCard object's playingCardRank value
     * 
     * @param rank  Int value to set as the PlayingCard object's playingCardRank
     */
    public void setPlayingCardRank(int rank)
    {
        if(rank >= 0 && rank <= 13) //11, 12, 13 represent Jack, Queen, King respectively
        {
           this.playingCardRank = rank; 
        }
        else
        {
            throw new IllegalArgumentException("Playing cards typically have ranks from Ace (1), then 2 to 10, then Jack, Queen, then King.");
        }
    }
    
    /**
     * Method to return a PlayingCard object's playingCardRank value
     * 
     * @return rank the PlayingCard object's playingCardRank value
     */
    public int getPlayingCardRank()
    {   
        return this.playingCardRank;
    }
    
    /**
     * Method to manually set a PlayingCard object's playingCardName value
     * 
     * @param name  An int between 2 and 10, will be converted to String and assigned as playingCardName
     */
    public void setPlayingCardName(int name)
    {
        if(name >= 2 && name <= 10)
        {
            String s = String.valueOf(name);
            this.playingCardName = s;
        }
        else
        {
            throw new IllegalArgumentException("Playing cards must have a rank between 2 and 10, or from ('Ace', 'Jack', 'Queen', 'King').");
        }
    }
    
    /**
     * Method to manually set a PlayingCard object's playingCardName value, overloaded for String arguments for name parameter
     * 
     * @param name  A String that will be assigned to playingCardName
     */
    public void setPlayingCardName(String name)
    {
        if(name != "Ace" || name != "A")
        {
            if(name == "Jack" || name == "J")
            {
                this.playingCardName = name;
            }
            
            else if (name == "Queen" || name == "Q")
            {
                this.playingCardName = name;
            }
            
            else if (name == "King" || name == "K")
            {
                this.playingCardName = name;
            }
            
            else
            {
                throw new IllegalArgumentException("Playing cards must have a rank between 2 and 10, or from ('Ace', 'Jack', 'Queen', 'King').");
            }
        }
        else //PlayingCard to be constructed is an Ace
        {
            this.playingCardName = name;
        }
    }
    
    /**
     * Method to return a PlayingCard object's name.
     * 
     * @return name the String value assigned to the PlayingCard object's playingCardName
     */
    public String getPlayingCardName()
    {
        return this.playingCardName;
    }
    
    /**
     * Method to manually set a PlayingCard object's suit
     * 
     * @param suit  A String representing a PlayingCard object's suit
     */
    public void setPlayingCardSuit(String suit)
    {
        if(suit == "Clubs" || suit == "Spades")
        {
            this.playingCardSuit = suit;
            this.playingCardSuitColor = "Black";
        }
        else if (suit == "Diamonds" || suit == "Hearts")
        {
            this.playingCardSuit = suit;
            this.playingCardSuitColor = "Red";
        }
        else
        {
            throw new IllegalArgumentException("Playing cards must belong to a valid Suit ('Clubs', 'Diamonds', 'Hearts', 'Spades').");
        }
    }
    
    /**
     * Method to return a PlayingCard object's suit
     * 
     * @return suit A String representing the PlayingCard object's suit
     */
    public String getPlayingCardSuit()
    {
        return this.playingCardSuit;
    }
    
    /**
     * Method to manually set a PlayingCard object's suit color. PlayingCard's playingCardSuitColor attribute ought to be determined by the suit it is assigned, so not recommended to make extensive use of this function when creating PlayingCards
     * 
     * @ param color    String representing the color of the PlayingCard's assigned suit
     */
    public void setPlayingCardSuitColor(String color)
    {
        this.playingCardSuitColor = color;
    }
    
    /**
     * Method to return a PlayingCard object's suit color. Traditionally, clubs and spades are black, while hearts and diamonds are red
     * 
     * @return playingCardSuitColor    A String representing the color of the PlayingCard object's suit
     */
    public String getPlayingCardSuitColor()
    {
        return this.playingCardSuitColor;
    }
    
    /**
     * Method that returns a String representation of a PlayingCard object, in the form "[name] of [suit]".
     * 
     * @return playingCardInfo  String representation of the PlayingCardObject
     */
    public String getPlayingCardInfo()
    {
        String s = this.getPlayingCardName() + " of " + this.getPlayingCardSuit();
        return s;
    }
    
    /**
     * Method that returns a detailed String representation of a PlayingCard object
     * 
     * @return playingCardInfoExtended  String representation of the PlayingCard object in sentence form
     */
    public String getPlayingCardInfoExtended()
    {
        String info;
        
        String s = "This PlayingCard is the " + this.getPlayingCardInfo() + ".";
        info = s + "\n This card has a rank of " + this.getPlayingCardRank() + " and its suit color is " + this.getPlayingCardSuitColor() + ".";
        
        return info;
    }
}
