 import java.util.*;
public class Game 
{
	ArrayList<String> Deck = new ArrayList<String>();
	ArrayList<String> User_Draw_Pile = new ArrayList<String>();
	ArrayList<String> User_Winning_Pile = new ArrayList<String>();
	ArrayList<String> Computer_Draw_Pile = new ArrayList<String>();
	ArrayList<String> Computer_Winning_Pile = new ArrayList<String>();
	ArrayList<String> User_Drawn_Card = new ArrayList<String>();
	ArrayList<String> Computer_Drawn_Card = new ArrayList<String>();
	ArrayList<String> CardSuits = new ArrayList<String>();
	ArrayList<String> User_War_Pile = new ArrayList<String>();
	ArrayList<String> Computer_War_Pile = new ArrayList<String>();
	
	
	private int userCardValue;
	private int computerCardValue;
	
	Random deckShuffle = new Random();
	Random Deal = new Random();
	Random cardDrawn = new Random();
	
	public Game()
	{
		CardSuits.add("Clubs");
		CardSuits.add("Diamonds");
		CardSuits.add("Hearts");
		CardSuits.add("Spades");
		
		Deck.add("Two of Clubs");
		Deck.add("Three of Clubs");
		Deck.add("Four of Clubs");
		Deck.add("Five of Clubs");
		Deck.add("Six of Clubs");
		Deck.add("Seven of Clubs");
		Deck.add("Eight of Clubs");
		Deck.add("Nine of Clubs");
		Deck.add("Ten of Clubs");
		Deck.add("Jack of Clubs");
		Deck.add("Queen of Clubs");
		Deck.add("King of Clubs");
		Deck.add("Ace of Clubs");
		Deck.add("Two of Diamonds");
		Deck.add("Three of Diamonds");
		Deck.add("Four of Diamonds");
		Deck.add("Five of Diamonds");
		Deck.add("Six of Diamonds");
		Deck.add("Seven of Diamonds");
		Deck.add("Eight of Diamonds");
		Deck.add("Nine of Diamonds");
		Deck.add("Ten of Diamonds");
		Deck.add("Jack of Diamonds");
		Deck.add("Queen of Diamonds");
		Deck.add("King of Diamonds");
		Deck.add("Ace of Diamonds");
		Deck.add("Two of Hearts");
		Deck.add("Three of Hearts");
		Deck.add("Four of Hearts");
		Deck.add("Five of Hearts");
		Deck.add("Six of Hearts");
		Deck.add("Seven of Hearts");
		Deck.add("Eight of Hearts");
		Deck.add("Nine of Hearts");
		Deck.add("Ten of Hearts");
		Deck.add("Jack of Hearts");
		Deck.add("Queen of Hearts");
		Deck.add("King of Hearts");
		Deck.add("Ace of Hearts");
		Deck.add("Two of Spades");
		Deck.add("Three of Spades");
		Deck.add("Four of Spades");
		Deck.add("Five of Spades");
		Deck.add("Six of Spades");
		Deck.add("Seven of Spades");
		Deck.add("Eight of Spades");
		Deck.add("Nine of Spades");
		Deck.add("Ten of Spades");
		Deck.add("Jack of Spades");
		Deck.add("Queen of Spades");
		Deck.add("King of Spades");
		Deck.add("Ace of Spades");
	}
	
	public void dealCards()
	{
		for(int i = 0; i <= 25; i++)
		{
		int j = Deal.nextInt(Deck.size());	
		User_Draw_Pile.add(Deck.get(j));
		Deck.remove(j);
		}
		Computer_Draw_Pile.addAll(Deck);
		Deck.removeAll(Deck);
	}

	public void userCardDrawn(int CardDrawn)
	{
		if (User_Draw_Pile.size() == 0)
		{
			User_Draw_Pile.addAll(User_Winning_Pile);
			User_Winning_Pile.removeAll(User_Winning_Pile);
			for(int i = 1; i <= CardDrawn; i++)
			{
			int j = cardDrawn.nextInt(User_Draw_Pile.size());
			User_Drawn_Card.add(User_Draw_Pile.get(j));
			User_Draw_Pile.remove(j);
			}
		}
		else if (User_Draw_Pile.size() + User_Winning_Pile.size() == 0)
		{
			System.out.println("Computer Wins the Game");
		}
		else
		{
		for(int i = 1; i <= CardDrawn; i++)
		{
		int j = cardDrawn.nextInt(User_Draw_Pile.size());
		User_Drawn_Card.add(User_Draw_Pile.get(j));
		User_Draw_Pile.remove(j);
		}
		}
	}

	public void computerCardDrawn(int CardDrawn)
	{
		if (Computer_Draw_Pile.size() == 0)
		{
			Computer_Draw_Pile.addAll(Computer_Winning_Pile);
			Computer_Winning_Pile.removeAll(Computer_Winning_Pile);
			for(int i = 1; i <= CardDrawn; i++)
			{
			int j = cardDrawn.nextInt(Computer_Draw_Pile.size());
			Computer_Drawn_Card.add(Computer_Draw_Pile.get(j));
			Computer_Draw_Pile.remove(j);
			}
		}
		else
		{
			for(int i = 1; i <= CardDrawn; i++)
			{
			int j = cardDrawn.nextInt(Computer_Draw_Pile.size());
			Computer_Drawn_Card.add(Computer_Draw_Pile.get(j));
			Computer_Draw_Pile.remove(j);
			}	
		}
	}
	
	public void userWar(int cardsDrawn)
	{
		if (User_Draw_Pile.size() == 0)
		{
			User_Draw_Pile.addAll(User_Winning_Pile);
			User_Winning_Pile.removeAll(User_Winning_Pile);
			for(int i = 0; i <= cardsDrawn; i++)
			{
				int j = cardDrawn.nextInt(User_Draw_Pile.size());
				User_War_Pile.add(User_Draw_Pile.get(j));
				User_War_Pile.addAll(User_Drawn_Card);
				User_Draw_Pile.remove(j);
				User_Drawn_Card.removeAll(User_Drawn_Card);
			}
		}
		else
		{
			for(int i = 0; i <= cardsDrawn; i++)
			{
				if (User_Draw_Pile.size() == 0)
				{
					User_Draw_Pile.addAll(User_Winning_Pile);
					User_Winning_Pile.removeAll(User_Winning_Pile);
					int j = cardDrawn.nextInt(User_Draw_Pile.size());
					User_War_Pile.add(User_Draw_Pile.get(j));
					User_War_Pile.addAll(User_Drawn_Card);
					User_Draw_Pile.remove(j);
					User_Drawn_Card.removeAll(User_Drawn_Card);
				}
				else
				{
					int j = cardDrawn.nextInt(User_Draw_Pile.size());
					User_War_Pile.add(User_Draw_Pile.get(j));
					User_War_Pile.addAll(User_Drawn_Card);
					User_Draw_Pile.remove(j);
					User_Drawn_Card.removeAll(User_Drawn_Card);
				}
			}
		}
	}
		
	public void computerWar(int cardsDrawn)
	{
		if (Computer_Draw_Pile.size() == 0)
		{
			Computer_Draw_Pile.addAll(Computer_Winning_Pile);
			Computer_Winning_Pile.removeAll(Computer_Winning_Pile);
			for(int i = 0; i <= cardsDrawn; i++)
			{
				int j = cardDrawn.nextInt(Computer_Draw_Pile.size());
				Computer_War_Pile.add(Computer_Draw_Pile.get(j));
				Computer_War_Pile.addAll(Computer_Drawn_Card);
				Computer_Draw_Pile.remove(j);
				Computer_Drawn_Card.removeAll(Computer_Drawn_Card);
			}
		}
		else
		{
			for(int i = 0; i <= cardsDrawn; i++)
			{
				if (Computer_Draw_Pile.size() == 0)
				{
					Computer_Draw_Pile.addAll(Computer_Winning_Pile);
					Computer_Winning_Pile.removeAll(Computer_Winning_Pile);
					int j = cardDrawn.nextInt(Computer_Draw_Pile.size());
					Computer_War_Pile.add(Computer_Draw_Pile.get(j));
					Computer_War_Pile.addAll(Computer_Drawn_Card);
					Computer_Draw_Pile.remove(j);
					Computer_Drawn_Card.removeAll(Computer_Drawn_Card);
				}
				else
				{
					int j = cardDrawn.nextInt(Computer_Draw_Pile.size());
					Computer_War_Pile.add(Computer_Draw_Pile.get(j));
					Computer_War_Pile.addAll(Computer_Drawn_Card);
					Computer_Draw_Pile.remove(j);
					Computer_Drawn_Card.removeAll(Computer_Drawn_Card);
				}
			}
		}
	}
	
	public void userValue()
	{
		for(int i = 0; i <= 4; i++)
		{
			if (User_Drawn_Card.get(0).equals("Two of " + CardSuits.get(i)))
			{
				userCardValue = 2; break;
			}
			else if (User_Drawn_Card.get(0).equals("Three of " + CardSuits.get(i)))
			{
				userCardValue = 3; break;
			}
			else if (User_Drawn_Card.get(0).equals("Four of " + CardSuits.get(i)))
			{
				userCardValue = 4; break;
			}
			else if (User_Drawn_Card.get(0).equals("Five of " + CardSuits.get(i)))
			{
				userCardValue = 5; break;
			}
			else if (User_Drawn_Card.get(0).equals("Six of " + CardSuits.get(i)))
			{
				userCardValue = 6; break;
			}
			else if (User_Drawn_Card.get(0).equals("Seven of " + CardSuits.get(i)))
			{
				userCardValue = 7; break;
			}
			else if (User_Drawn_Card.get(0).equals("Eight of " + CardSuits.get(i)))
			{
				userCardValue = 8; break;
			}
			else if (User_Drawn_Card.get(0).equals("Nine of " + CardSuits.get(i)))
			{
				userCardValue = 9; break;
			}
			else if (User_Drawn_Card.get(0).equals("Ten of " + CardSuits.get(i)))
			{
				userCardValue = 10; break;
			}
			else if (User_Drawn_Card.get(0).equals("Jack of " + CardSuits.get(i)))
			{
				userCardValue = 11; break;
			}
			else if (User_Drawn_Card.get(0).equals("Queen of " + CardSuits.get(i)))
			{
				userCardValue = 12; break;
			}
			else if (User_Drawn_Card.get(0).equals("King of " + CardSuits.get(i)))
			{
				userCardValue = 13; break;
			}
			else if (User_Drawn_Card.get(0).equals("Ace of " + CardSuits.get(i)))
			{
				userCardValue = 14; break;
			}	
		}
	}
	
	public void computerValue()
	{
		for(int i = 0; i <= 4; i++)
		{
			if (Computer_Drawn_Card.get(0).equals("Two of " + CardSuits.get(i)))
			{
				computerCardValue = 2; break;
			}
			else if (Computer_Drawn_Card.get(0).equals("Three of " + CardSuits.get(i)))
			{
				computerCardValue = 3; break;
			}
			else if (Computer_Drawn_Card.get(0).equals("Four of " + CardSuits.get(i)))
			{
				computerCardValue = 4; break;
			}
			else if (Computer_Drawn_Card.get(0).equals("Five of " + CardSuits.get(i)))
			{
				computerCardValue = 5; break;
			}
			else if (Computer_Drawn_Card.get(0).equals("Six of " + CardSuits.get(i)))
			{
				computerCardValue = 6; break;
			}
			else if (Computer_Drawn_Card.get(0).equals("Seven of " + CardSuits.get(i)))
			{
				computerCardValue = 7; break;
			}
			else if (Computer_Drawn_Card.get(0).equals("Eight of " + CardSuits.get(i)))
			{
				computerCardValue = 8; break;
			}
			else if (Computer_Drawn_Card.get(0).equals("Nine of " + CardSuits.get(i)))
			{
				computerCardValue = 9; break;
			}
			else if (Computer_Drawn_Card.get(0).equals("Ten of " + CardSuits.get(i)))
			{
				computerCardValue = 10; break;
			}
			else if (Computer_Drawn_Card.get(0).equals("Jack of " + CardSuits.get(i)))
			{
				computerCardValue = 11; break;
			}
			else if (Computer_Drawn_Card.get(0).equals("Queen of " + CardSuits.get(i)))
			{
				computerCardValue = 12; break;
			}
			else if (Computer_Drawn_Card.get(0).equals("King of " + CardSuits.get(i)))
			{
				computerCardValue = 13; break;
			}
			else if (Computer_Drawn_Card.get(0).equals("Ace of " + CardSuits.get(i)))
			{
				computerCardValue = 14; break;
			}	
		}
	}
	
	public void userHandWins()
	{
		if(User_War_Pile.size() == 0 )
		{
			User_Winning_Pile.addAll(User_Drawn_Card);
			User_Winning_Pile.addAll(Computer_Drawn_Card);
			User_Drawn_Card.removeAll(User_Drawn_Card);
			Computer_Drawn_Card.removeAll(Computer_Drawn_Card);
		}
		else
		{
			User_Winning_Pile.addAll(User_Drawn_Card);
			User_Winning_Pile.addAll(Computer_Drawn_Card);
			User_Winning_Pile.addAll(User_War_Pile);
			User_Winning_Pile.addAll(Computer_War_Pile);
			User_War_Pile.removeAll(User_War_Pile);
			Computer_War_Pile.removeAll(Computer_War_Pile);
			User_Drawn_Card.removeAll(User_Drawn_Card);
			Computer_Drawn_Card.removeAll(Computer_Drawn_Card);
		}
	}
	
	public void computerHandWins()
	{
		if(Computer_War_Pile.size() == 0 )
		{
			Computer_Winning_Pile.addAll(Computer_Drawn_Card);
			Computer_Winning_Pile.addAll(User_Drawn_Card);
			Computer_Drawn_Card.removeAll(Computer_Drawn_Card);
			User_Drawn_Card.removeAll(User_Drawn_Card);	
		}	
		else
		{
			Computer_Winning_Pile.addAll(Computer_Drawn_Card);
			Computer_Winning_Pile.addAll(User_Drawn_Card);
			Computer_Winning_Pile.addAll(Computer_War_Pile);
			Computer_Winning_Pile.addAll(User_War_Pile);
			Computer_War_Pile.removeAll(Computer_War_Pile);
			User_War_Pile.removeAll(User_War_Pile);
			Computer_Drawn_Card.removeAll(Computer_Drawn_Card);
			User_Drawn_Card.removeAll(User_Drawn_Card);	
		}
	}
	
	public ArrayList<String> getUserCard()
	{
	   return User_Drawn_Card;
	}
	
	public ArrayList<String> getComputerCard()
	{
	   return Computer_Drawn_Card;
	}

	public ArrayList<String> getUserWinningPile()
	{
		return User_Winning_Pile;
	}
	
	public ArrayList<String> getComputerWinningPile()
	{
		return Computer_Winning_Pile;
	}
	
	public int getUserCardValue()
	{
		return userCardValue;
	}
	
	public int getComputerCardValue()
	{
		return computerCardValue;
	}
	
}
