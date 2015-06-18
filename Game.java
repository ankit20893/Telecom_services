package wrestling;

import java.util.*;

public class Game {
	/*
	public static void exit(boolean b)
	{
	
	}
*/
	public static void main(String[] args) {
		
		List<Wrestler> wrestlers = Wrestler.defaultDeck();
		
		Collections.shuffle(wrestlers);
		List<Wrestler> playerOneCards = new ArrayList<Wrestler>();
		List<Wrestler> playerTwoCards = new ArrayList<Wrestler>();
		
		int index=0;
		for (Wrestler someWrestler : wrestlers) {
			if (index%2 == 0){
				playerOneCards.add(someWrestler);
			} else {
				playerTwoCards.add(someWrestler);
			}
			index++;
		}


	
		Scanner sc=new Scanner(System.in);
		int ch;
		boolean a=true;
		while(a)
		{
		System.out.println("plz enter 1 for name of player");
		System.out.println("plz enter 2 for rank of player");
		System.out.println("plz enter 3 for height of player");
		System.out.println("plz enter 4 for weight of player");
		System.out.println("plz enter 5 for wonMatches of player");
		System.out.println("plz enter 6 for lostMatches of player");
		System.out.println("plz enter 7 for totalMatches of player");
		System.out.println("plz enter 8 for exit from the game");
		System.out.println("Plz Enter Your Choice:-");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:System.out.println("user wants to play with name\n");
		break;
		case 2:System.out.println("user wants to play with rank\n");
		break;
		case 3:System.out.println("user wants to play with height\n");
		break;
		case 4:System.out.println("user wants to play with weight\n");
		break;
		case 5:System.out.println("user wants to play with won matches\n");
		break;
		case 6:System.out.println("user wants to play with lost matches\n");
		break;
		case 7:System.out.println("user wants to play with total matches\n");
		break;
		case 8:System.exit(0);
		break;
		default: System.out.println("Sorry you have entered wrong choice\n");
		}
		}
		}
	}

