package wrestling;
import java.util.*;
public class game_sir {
	
	public static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		int choice = 0;
		wrestler_sir wrestler1 = new wrestler_sir("Underacker", 2, 60.5, 80.9, 20, 2,0);
		wrestler1.display();
		wrestler_sir wrestler2 = new wrestler_sir("Khali", 3, 50.5, 70.9, 30, 2,0);
		wrestler2.display();
		
		while (choice != 7) {
			System.out.println("On what attribute you want to play?");
			System.out.println("1. Rank");
			System.out.println("2. Height");
			System.out.println("3. Weight");
			System.out.println("4. Matches Won");
			System.out.println("5. Matches Lost");
			System.out.println("6. Total Matches");
			System.out.println("7. I don't want to play");

			if (userInput.hasNextInt()) {
				choice = userInput.nextInt();
				
				}
			

			switch (choice) {
			case 1:System.out.println("user wants to play with rank");
			
				
				if(wrestler1.rank1() > wrestler2.rank1()){
					System.out.println("wrestler1 won the game");
				}
					else
						System.out.println("wrestler2 won the game");
				
				break;
			case 2:System.out.println("user wants to play with height");
                 
				
				if(wrestler1.height1() > wrestler2.height1()){
					System.out.println("wrestler1 won the game");
					}
					else
						System.out.println("wrestler2 won the game");
				
				break;
			case 3:System.out.println("user wants to play with weight");
               
				
				if(wrestler1.weight1() > wrestler2.weight1()){
					System.out.println("wrestler1 won the game");
					}
					else
						System.out.println("wrestler2 won the game");
				
				break;
			case 4: System.out.println("user wants to play with won matches");
             
				
				if(wrestler1.matchesWon1() > wrestler2.matchesWon1()){
					System.out.println("wrestler1 won the game");
					}
					else
						System.out.println("wrestler2 won the game");
				
				break;
			case 5: System.out.println("user wants to play with lost matches");
                 
				
				if(wrestler1.matchesLost1() < wrestler2.matchesLost1()){
					System.out.println("wrestler1 won the game");
					}
					else
						System.out.println("wrestler2 won the game");
				
				break;
			case 6: System.out.println("user wants to play with totla matches");
               
				
				if(wrestler1.totalMatches1() > wrestler2.totalMatches1()){
					System.out.println("wrestler1 won the game");
					}
					else
						System.out.println("wrestler2 won the game");
				
				break;
			case 7:System.out.println("user wants to exit from the game");
				//System.exit(0);
			break;
			default:
				System.out.println("invalid input");
				break;

			}
		}
			
			
	}		
	
		}
	

