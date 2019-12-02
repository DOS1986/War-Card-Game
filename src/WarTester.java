import java.util.Scanner;

public class WarTester 
{
	public static void main(String[] args) 
    {   
		Game War = new Game();
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of hands you would like to play: "); 
		
		int hands = in.nextInt(); 
		int handsPlayed = 0;
		int totalUserCards = 0;
		int totalComputerCards = 0;
		int userWins = 0;
		int computerWins = 0;
		
		
		System.out.println();
		System.out.print("A normal 52 Card Deck: ");
		System.out.println(War.Deck);
		
		War.dealCards();
		
		boolean done = false;
		while(handsPlayed < hands & !done)
		{
			handsPlayed++; 
			if (War.User_Draw_Pile.size() + War.User_Winning_Pile.size() == 0)
			{
				System.out.println("Computer Wins Game");	
				System.out.println();
				System.out.print("Games won by Computer: ");	
				System.out.println(computerWins);
				System.out.print("Games won by User: ");	
				System.out.println(userWins);
				
				done = true;
			}
			else if (War.Computer_Draw_Pile.size() + War.Computer_Winning_Pile.size()   == 0)
			{
				System.out.println("User Wins Game");	
				System.out.println();
				System.out.print("Games won by User: ");	
				System.out.println(userWins);
				System.out.print("Games won by Computer: ");	
				System.out.println(computerWins);
				done = true;
			}
			else
			{
				System.out.println();
				System.out.println("Hand Number: " + handsPlayed);
				System.out.println();
				System.out.print("Cards in Users Draw Pile: ");
				System.out.println(War.User_Draw_Pile.size());
				System.out.println();
				System.out.print("Cards in Users Winning Pile: ");
				System.out.println(War.User_Winning_Pile.size());
				System.out.println();
				totalUserCards = War.User_Draw_Pile.size() + War.User_Winning_Pile.size();
				System.out.print("Total Cards User Has: ");
				System.out.println(totalUserCards);
				System.out.println();
				War.userCardDrawn(1);
				War.userValue();
				System.out.print("The Users Card is: ");
				System.out.println(War.getUserCard());
				System.out.println();
				System.out.print("Cards in Computers Draw Pile: ");
				System.out.println(War.Computer_Draw_Pile.size());
				System.out.println();
				System.out.print("Cards in Computers Winning Pile: ");
				System.out.println(War.Computer_Winning_Pile.size());
				System.out.println();
				totalComputerCards = War.Computer_Draw_Pile.size() + War.Computer_Winning_Pile.size();
				System.out.print("Total Cards Computer Has: ");
				System.out.println(totalComputerCards);
				System.out.println();
				War.computerCardDrawn(1);
				War.computerValue();
				System.out.print("The Computers Card is: ");
				System.out.println(War.getComputerCard());
				System.out.println();
				if (War.getComputerCardValue() == War.getUserCardValue())
				{
					if (War.Computer_Draw_Pile.size() + War.Computer_Winning_Pile.size() <= 3 || War.User_Draw_Pile.size() + War.User_Winning_Pile.size() <= 3)
					{
						System.out.println("War is Declaired");
						System.out.println();
						System.out.println("Computer places one card face down");
						War.computerWar(0);
						System.out.println();
						System.out.println("User places one card face down");
						War.userWar(0);
						System.out.println();
						System.out.print("Cards in Users Draw Pile: ");
						System.out.println(War.User_Draw_Pile.size());
						System.out.println();
						System.out.print("Cards in Users Winning Pile: ");
						System.out.println(War.User_Winning_Pile.size());
						System.out.println();
						War.userCardDrawn(1);
						War.userValue();
						System.out.print("The Users Card is: ");
						System.out.println(War.getUserCard());
						System.out.println();
						System.out.print("Cards in Computers Draw Pile: ");
						System.out.println(War.Computer_Draw_Pile.size());
						System.out.println();
						System.out.print("Cards in Computers Winning Pile: ");
						System.out.println(War.Computer_Winning_Pile.size());
						System.out.println();
						War.computerCardDrawn(1);
						War.computerValue();
						System.out.print("The Computers Card is: ");
						System.out.println(War.getComputerCard());
						System.out.println();
						if (War.getComputerCardValue() == War.getUserCardValue())
						{
							if (War.Computer_Draw_Pile.size() + War.Computer_Winning_Pile.size() <= 3 || War.User_Draw_Pile.size() + War.User_Winning_Pile.size() <= 3)
							{
								System.out.println("War is Declaired");
								System.out.println();
								System.out.println("Computer places one card face down");
								War.computerWar(0);
								System.out.println();
								System.out.println("User places one card face down");
								War.userWar(0);
								System.out.println();
								System.out.print("Cards in Users Draw Pile: ");
								System.out.println(War.User_Draw_Pile.size());
								System.out.println();
								System.out.print("Cards in Users Winning Pile: ");
								System.out.println(War.User_Winning_Pile.size());
								System.out.println();
								War.userCardDrawn(1);
								War.userValue();
								System.out.print("The Users Card is: ");
								System.out.println(War.getUserCard());
								System.out.println();
								System.out.print("Cards in Computers Draw Pile: ");
								System.out.println(War.Computer_Draw_Pile.size());
								System.out.println();
								System.out.print("Cards in Computers Winning Pile: ");
								System.out.println(War.Computer_Winning_Pile.size());
								System.out.println();
								War.computerCardDrawn(1);
								War.computerValue();
								System.out.print("The Computers Card is: ");
								System.out.println(War.getComputerCard());
								System.out.println();
								if (War.getComputerCardValue() > War.getUserCardValue())
								{
									computerWins++;
									System.out.print("Computer Wins: ");
									System.out.println(War.getComputerCard().toString() + ", " + War.getUserCard().toString() + ", "+ War.User_War_Pile.toString()+ ", "+ War.Computer_War_Pile.toString());
									War.computerHandWins();
									System.out.println();
								}
								else if (War.getComputerCardValue() < War.getUserCardValue())
								{
									userWins++;
									System.out.print("User Wins: ");
									System.out.println(War.getComputerCard().toString() + ", " + War.getUserCard().toString()+ ", " + War.User_War_Pile.toString()+ ", "+ War.Computer_War_Pile.toString());
									War.userHandWins();
									System.out.println();
								}
							}
							else
							{
							System.out.println("War is Declaired");
							System.out.println();
							System.out.println("Computer places three cards face down");
							War.computerWar(2);
							System.out.println();
							System.out.println("User places three cards face down");
							War.userWar(2);
							System.out.println();
							System.out.print("Cards in Users Draw Pile: ");
							System.out.println(War.User_Draw_Pile.size());
							System.out.println();
							System.out.print("Cards in Users Winning Pile: ");
							System.out.println(War.User_Winning_Pile.size());
							System.out.println();
							War.userCardDrawn(1);
							War.userValue();
							System.out.print("The Users Card is: ");
							System.out.println(War.getUserCard());
							System.out.println();
							System.out.print("Cards in Computers Draw Pile: ");
							System.out.println(War.Computer_Draw_Pile.size());
							System.out.println();
							System.out.print("Cards in Computers Winning Pile: ");
							System.out.println(War.Computer_Winning_Pile.size());
							System.out.println();
							War.computerCardDrawn(1);
							War.computerValue();
							System.out.print("The Computers Card is: ");
							System.out.println(War.getComputerCard());
							System.out.println();
							if (War.getComputerCardValue() > War.getUserCardValue())
							{
								computerWins++;
								System.out.print("Computer Wins: ");
								System.out.println(War.getComputerCard().toString() + ", " + War.getUserCard().toString() + ", "+ War.User_War_Pile.toString()+ ", "+ War.Computer_War_Pile.toString());
								War.computerHandWins();
								System.out.println();
							}
							else if (War.getComputerCardValue() < War.getUserCardValue())
							{
								userWins++;
								System.out.print("User Wins: ");
								System.out.println(War.getComputerCard().toString() + ", " + War.getUserCard().toString()+ ", " + War.User_War_Pile.toString()+ ", "+ War.Computer_War_Pile.toString());
								War.userHandWins();
								System.out.println();
							}
						}
						}
						if (War.getComputerCardValue() > War.getUserCardValue())
						{
							computerWins++;
							System.out.print("Computer Wins: ");
							War.getUserCard();
							System.out.println(War.getComputerCard().toString() + ", " + War.getUserCard().toString() + ", "+ War.User_War_Pile.toString()+ ", "+ War.Computer_War_Pile.toString());
							War.computerHandWins();
							System.out.println();
						}
						else if (War.getComputerCardValue() < War.getUserCardValue())
						{
							userWins++;
							System.out.print("User Wins: ");
							System.out.println(War.getComputerCard().toString() + ", " + War.getUserCard().toString()+ ", " + War.User_War_Pile.toString()+ ", "+ War.Computer_War_Pile.toString());
							War.userHandWins();
							System.out.println();
						}
					}
					else
					{
					System.out.println("War is Declaired");
					System.out.println();
					System.out.println("Computer places three cards face down");
					War.computerWar(2);
					System.out.println();
					System.out.println("User places three cards face down");
					War.userWar(2);
					System.out.println();
					System.out.print("Cards in Users Draw Pile: ");
					System.out.println(War.User_Draw_Pile.size());
					System.out.println();
					System.out.print("Cards in Users Winning Pile: ");
					System.out.println(War.User_Winning_Pile.size());
					System.out.println();
					War.userCardDrawn(1);
					War.userValue();
					System.out.print("The Users Card is: ");
					System.out.println(War.getUserCard());
					System.out.println();
					System.out.print("Cards in Computers Draw Pile: ");
					System.out.println(War.Computer_Draw_Pile.size());
					System.out.println();
					System.out.print("Cards in Computers Winning Pile: ");
					System.out.println(War.Computer_Winning_Pile.size());
					System.out.println();
					War.computerCardDrawn(1);
					War.computerValue();
					System.out.print("The Computers Card is: ");
					System.out.println(War.getComputerCard());
					System.out.println();
					if (War.getComputerCardValue() == War.getUserCardValue())
					{
						if (War.Computer_Draw_Pile.size() + War.Computer_Winning_Pile.size() <= 3 || War.User_Draw_Pile.size() + War.User_Winning_Pile.size() <= 3)
						{
							System.out.println("War is Declaired");
							System.out.println();
							System.out.println("Computer places one card face down");
							War.computerWar(0);
							System.out.println();
							System.out.println("User places one card face down");
							War.userWar(0);
							System.out.println();
							System.out.print("Cards in Users Draw Pile: ");
							System.out.println(War.User_Draw_Pile.size());
							System.out.println();
							System.out.print("Cards in Users Winning Pile: ");
							System.out.println(War.User_Winning_Pile.size());
							System.out.println();
							War.userCardDrawn(1);
							War.userValue();
							System.out.print("The Users Card is: ");
							System.out.println(War.getUserCard());
							System.out.println();
							System.out.print("Cards in Computers Draw Pile: ");
							System.out.println(War.Computer_Draw_Pile.size());
							System.out.println();
							System.out.print("Cards in Computers Winning Pile: ");
							System.out.println(War.Computer_Winning_Pile.size());
							System.out.println();
							War.computerCardDrawn(1);
							War.computerValue();
							System.out.print("The Computers Card is: ");
							System.out.println(War.getComputerCard());
							System.out.println();
							if (War.getComputerCardValue() > War.getUserCardValue())
							{
								computerWins++;
								System.out.print("Computer Wins: ");
								System.out.println(War.getComputerCard().toString() + ", " + War.getUserCard().toString() + ", "+ War.User_War_Pile.toString()+ ", "+ War.Computer_War_Pile.toString());
								War.computerHandWins();
								System.out.println();
							}
							else if (War.getComputerCardValue() < War.getUserCardValue())
							{
								userWins++;
								System.out.print("User Wins: ");
								System.out.println(War.getComputerCard().toString() + ", " + War.getUserCard().toString()+ ", " + War.User_War_Pile.toString()+ ", "+ War.Computer_War_Pile.toString());
								War.userHandWins();
								System.out.println();
							}
						}
						else
						{
						System.out.println("War is Declaired");
						System.out.println();
						System.out.println("Computer places three cards face down");
						War.computerWar(2);
						System.out.println();
						System.out.println("User places three cards face down");
						War.userWar(2);
						System.out.println();
						System.out.print("Cards in Users Draw Pile: ");
						System.out.println(War.User_Draw_Pile.size());
						System.out.println();
						System.out.print("Cards in Users Winning Pile: ");
						System.out.println(War.User_Winning_Pile.size());
						System.out.println();
						War.userCardDrawn(1);
						War.userValue();
						System.out.print("The Users Card is: ");
						System.out.println(War.getUserCard());
						System.out.println();
						System.out.print("Cards in Computers Draw Pile: ");
						System.out.println(War.Computer_Draw_Pile.size());
						System.out.println();
						System.out.print("Cards in Computers Winning Pile: ");
						System.out.println(War.Computer_Winning_Pile.size());
						System.out.println();
						War.computerCardDrawn(1);
						War.computerValue();
						System.out.print("The Computers Card is: ");
						System.out.println(War.getComputerCard());
						System.out.println();
						if (War.getComputerCardValue() == War.getUserCardValue())
						{
							if (War.Computer_Draw_Pile.size() + War.Computer_Winning_Pile.size() <= 3 || War.User_Draw_Pile.size() + War.User_Winning_Pile.size() <= 3)
							{
								System.out.println("War is Declaired");
								System.out.println();
								System.out.println("Computer places one card face down");
								War.computerWar(0);
								System.out.println();
								System.out.println("User places one card face down");
								War.userWar(0);
								System.out.println();
								System.out.print("Cards in Users Draw Pile: ");
								System.out.println(War.User_Draw_Pile.size());
								System.out.println();
								System.out.print("Cards in Users Winning Pile: ");
								System.out.println(War.User_Winning_Pile.size());
								System.out.println();
								War.userCardDrawn(1);
								War.userValue();
								System.out.print("The Users Card is: ");
								System.out.println(War.getUserCard());
								System.out.println();
								System.out.print("Cards in Computers Draw Pile: ");
								System.out.println(War.Computer_Draw_Pile.size());
								System.out.println();
								System.out.print("Cards in Computers Winning Pile: ");
								System.out.println(War.Computer_Winning_Pile.size());
								System.out.println();
								War.computerCardDrawn(1);
								War.computerValue();
								System.out.print("The Computers Card is: ");
								System.out.println(War.getComputerCard());
								System.out.println();
								if (War.getComputerCardValue() > War.getUserCardValue())
								{
									computerWins++;
									System.out.print("Computer Wins: ");
									System.out.println(War.getComputerCard().toString() + ", " + War.getUserCard().toString() + ", "+ War.User_War_Pile.toString()+ ", "+ War.Computer_War_Pile.toString());
									War.computerHandWins();
									System.out.println();
								}
								else if (War.getComputerCardValue() < War.getUserCardValue())
								{
									userWins++;
									System.out.print("User Wins: ");
									System.out.println(War.getComputerCard().toString() + ", " + War.getUserCard().toString()+ ", " + War.User_War_Pile.toString()+ ", "+ War.Computer_War_Pile.toString());
									War.userHandWins();
									System.out.println();
								}
							}
							else
							{
							System.out.println("War is Declaired");
							System.out.println();
							System.out.println("Computer places three cards face down");
							War.computerWar(2);
							System.out.println();
							System.out.println("User places three cards face down");
							War.userWar(2);
							System.out.println();
							System.out.print("Cards in Users Draw Pile: ");
							System.out.println(War.User_Draw_Pile.size());
							System.out.println();
							System.out.print("Cards in Users Winning Pile: ");
							System.out.println(War.User_Winning_Pile.size());
							System.out.println();
							War.userCardDrawn(1);
							War.userValue();
							System.out.print("The Users Card is: ");
							System.out.println(War.getUserCard());
							System.out.println();
							System.out.print("Cards in Computers Draw Pile: ");
							System.out.println(War.Computer_Draw_Pile.size());
							System.out.println();
							System.out.print("Cards in Computers Winning Pile: ");
							System.out.println(War.Computer_Winning_Pile.size());
							System.out.println();
							War.computerCardDrawn(1);
							War.computerValue();
							System.out.print("The Computers Card is: ");
							System.out.println(War.getComputerCard());
							System.out.println();
							if (War.getComputerCardValue() > War.getUserCardValue())
							{
								computerWins++;
								System.out.print("Computer Wins: ");
								System.out.println(War.getComputerCard().toString() + ", " + War.getUserCard().toString() + ", "+ War.User_War_Pile.toString()+ ", "+ War.Computer_War_Pile.toString());
								War.computerHandWins();
								System.out.println();
							}
							else if (War.getComputerCardValue() < War.getUserCardValue())
							{
								userWins++;
								System.out.print("User Wins: ");
								System.out.println(War.getComputerCard().toString() + ", " + War.getUserCard().toString()+ ", " + War.User_War_Pile.toString()+ ", "+ War.Computer_War_Pile.toString());
								War.userHandWins();
								System.out.println();
							}
						}
						}
						if (War.getComputerCardValue() > War.getUserCardValue())
						{
							computerWins++;
							System.out.print("Computer Wins: ");
							System.out.println(War.getComputerCard().toString() + ", " + War.getUserCard().toString() + ", "+ War.User_War_Pile.toString()+ ", "+ War.Computer_War_Pile.toString());
							War.computerHandWins();
							System.out.println();
						}
						else if (War.getComputerCardValue() < War.getUserCardValue())
						{
							userWins++;
							System.out.print("User Wins: ");
							System.out.println(War.getComputerCard().toString() + ", " + War.getUserCard().toString()+ ", " + War.User_War_Pile.toString()+ ", "+ War.Computer_War_Pile.toString());
							War.userHandWins();
							System.out.println();
						}
					}
					}
					if (War.getComputerCardValue() > War.getUserCardValue())
					{
						computerWins++;
						System.out.print("Computer Wins: ");
						System.out.println(War.getComputerCard().toString() + ", " + War.getUserCard().toString() + ", "+ War.User_War_Pile.toString()+ ", "+ War.Computer_War_Pile.toString());
						War.computerHandWins();
						System.out.println();
					}
					else if (War.getComputerCardValue() < War.getUserCardValue())
					{
						userWins++;
						System.out.print("User Wins: ");
						System.out.println(War.getComputerCard().toString() + ", " + War.getUserCard().toString()+ ", " + War.User_War_Pile.toString()+ ", "+ War.Computer_War_Pile.toString());
						War.userHandWins();
						System.out.println();
					}
				}
				}
				else
				{
					if (War.getComputerCardValue() > War.getUserCardValue())
					{
						computerWins++;
						System.out.print("Computer Wins: ");
						System.out.println(War.getComputerCard().toString() + ", " + War.getUserCard().toString());
						War.computerHandWins();
						System.out.println();
					}
					else if (War.getComputerCardValue() < War.getUserCardValue())
					{
						userWins++;
						System.out.print("User Wins: ");
						System.out.println(War.getComputerCard().toString() + ", " + War.getUserCard().toString());
						War.userHandWins();
						System.out.println();
					}
				}
			}
		}
    }
}
