import java.util.*;
public class Telecom {
	public static Scanner sc=new Scanner(System.in);
	public static void main(String ar[]){
	System.out.println("Welcome to the Telecom customer care services");
	System.out.println("To continue in english press 1");
	System.out.println("Hindi mein jaankari ke liye 2 dabayein");
	int choice;
	choice=sc.nextInt();
	switch(choice){
	
	case 1:while(choice != 0){
		System.out.println("To know your bill press 1");
         System.out.println("For porting request press 2");
	       System.out.println("To talk to our customer care executive press 3");
	       System.out.println("To go back to previous menu press 9");
	       System.out.println("To exit press 0");
	       int choice1=sc.nextInt();
	       switch(choice1){
	       case 1:System.out.println("To know your bill press 1");
	       System.out.println("Your bill is 800 Rupees.");
	       System.out.println("To go back to previous menu press 9");
	       System.out.println("To exit press 0");
	       int choice2=sc.nextInt();
	       switch(choice2){
	       case 0:System.exit(0);
	       break;
	       case 9:break;
	       default :System.out.println("Sorry, you have entered wrong choice");
	       }
	       break;
	       case 2:System.out.println("For porting request press 2");
	              System.out.println("Your porting request is under process.");
	              System.out.println("To go back to previous menu press 9");
	              System.out.println("To exit press 0");
	              //System.out.println("To talk to our customer care executive press 3");
	              int choice3=sc.nextInt();
	              switch(choice3){
	              case 0:System.exit(0);
	   	       break;
	   	       case 9:break;
	   	       default :System.out.println("Sorry, you have entered wrong choice");
	              }
	              break;
	       case 3:System.out.println("To talk to our customer care executive press 3");
	              System.out.println("All our executives are busy learning Java. Please try again later.");
	              System.out.println("To go back to previous menu press 9");
	              System.out.println("To exit press 0");
	              int choice4=sc.nextInt();
	              switch(choice4){
	              case 0:System.exit(0);
	   	       break;
	   	       case 9:break;
	   	       default :System.out.println("Sorry, you have entered wrong choice");
	              }
	       //}
	       //case 9:break;
	              default :System.out.println("Sorry, you have entered wrong choice.Plz try again");
	}
	    //code for providing services in Hindi   
	}
	case 2:while(choice != 0){
		System.out.println("Balance ki jankari ke liye 1 dabayein");
        System.out.println("Mobile number ki portability ke liye 2 dabayein");
	       System.out.println("Hmare customer care executive se baat karne ke liye  3 dabayein");
	       System.out.println("Pichhle  menu me jaane ke liye  9 dabayein");
	       System.out.println("exit karne ke liye  0 dabayein");
	       int choice1=sc.nextInt();
	       switch(choice1){
	       case 1:System.out.println("Balance ki jankari ke liye 1 dabayein");
	       System.out.println("Aapke account ka balance hei :- 800 Rupees.");
	       System.out.println("Pichhle  menu me jaane ke liye  9 dabayein");
	       System.out.println("exit karne ke liye  0 dabayein");
	       int choice2=sc.nextInt();
	       switch(choice2){
	       case 0:System.exit(0);
	       break;
	       case 9:break;
	       default :System.out.println("Sorry, Aapne galat vikalp ka chayan kiya hei");
	       }
	       break;
	       case 2:System.out.println("Mobile number ki portability ke liye 2 dabayein");
	              System.out.println("Aapka porting anurodh prakriya ke tahat hei .");
	              System.out.println("Pichhle  menu me jaane ke liye  9 dabayein");
	              System.out.println("exit karne ke liye  0 dabayein");
	              //System.out.println("To talk to our customer care executive press 3");
	              int choice3=sc.nextInt();
	              switch(choice3){
	              case 0:System.exit(0);
	   	       break;
	   	       case 9:break;
	   	       default :System.out.println("Sorry, Aapne galat vikalp ka chayan kiya hei");
	              }
	              break;
	       case 3:System.out.println("Hmare customer care executive se baat karne ke liye  3 dabayein");
	              System.out.println("Hmare sbhi Adhikaari JAVA sikhne me vyast hei. krapya baad mein punah prayas karein.");
	              System.out.println("Pichhle  menu me jaane ke liye  9 dabayein");
	              System.out.println("exit karne ke liye  0 dabayein");
	              int choice4=sc.nextInt();
	              switch(choice4){
	              case 0:System.exit(0);
	   	       break;
	   	       case 9:break;
	   	       default :System.out.println("Sorry, Aapne galat vikalp ka chayan kiya hei");
	              }
	       default :System.out.println("Sorry, Aapne galat vikalp ka chayan kiya hei.Krapaya dobara koshis karein");
	       //}
	}
	}

}
}
}
