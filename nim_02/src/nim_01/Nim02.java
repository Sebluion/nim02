
import java.util.Scanner;

public class Nim02{
static void wait500() {
		try{
			Thread.sleep(1000);
	    } catch(InterruptedException e){
	    	e.printStackTrace();
	    }
	}

public void play(){
	System.out.println("Welcome to 'Dr. Nim 2 player edition'!"); //Intro and explanation sequence begin
		wait500();
		System.out.println("Every time it's your turn, you can choose to remove 1, 2 or 3 marbles.");
		wait500();
		System.out.println("The player who removes the last marble wins!");
		wait500();
		System.out.println("This time you're playing against a friend (you will have to use the same laptop and take turns).");
		wait500();
		System.out.println("Good luck!");
		wait500();
		wait500();
		//End of intro sequence
		
		//declaration of variables
		int marblesLeft = 12; //amount of marbles left
		int marblesToSub; //amount of marbles to subtract
		String exitThing;
		int winner = 0;
		Scanner marblesIn = new Scanner(System.in); //Input module
		
		//selection of amount of marbles
		System.out.println("***");
		wait500();
		System.out.println("Type in the amount of marbles you want to play with (12 marbles is recommended).");
		wait500();
		System.out.println("Please only enter numbers or the game will break.");
		marblesLeft = marblesIn.nextInt();
		System.out.println(marblesLeft + " marbles selected.");
		wait500();
		
		//gameplay loop begin
		while (marblesLeft > 3) {
			//player1 turn
			System.out.println("***");
			wait500();
			System.out.println("It's player 1's turn.");
			wait500();
			System.out.print("Marbles left: "); //shows how
			System.out.println(marblesLeft); //	many marbles are left
			wait500();
			System.out.println("Input the amount of marbles you want to subtract (1, 2 or 3):");
			marblesToSub = marblesIn.nextInt(); //marblestosub
			if (marblesToSub > 3) {
				marblesToSub = 3;
			} else if (marblesToSub < 1) {
				marblesToSub = 1;
			}
			marblesLeft = marblesLeft - marblesToSub; //player1 turn end
			
			//marble removal confirmation
			if (marblesToSub == 1) {
				System.out.println(marblesToSub + " marble removed.");
			}else {
				System.out.println(marblesToSub + " marbles removed.");
			}
			
			//PLAYER 2 TURN
			if (marblesLeft > 3) {
				System.out.println("***");
				wait500();
				System.out.println("It's player 2's turn.");
				wait500();
				System.out.print("Marbles left: "); //shows how
				System.out.println(marblesLeft); //	many marbles are left
				wait500();
				System.out.println("Input the amount of marbles you want to subtract (1, 2 or 3):");
				marblesToSub = marblesIn.nextInt(); //marblestosub
				if (marblesToSub > 3) {
					marblesToSub = 3;
				} else if (marblesToSub < 1) {
					marblesToSub = 1;
				}
				marblesLeft = marblesLeft - marblesToSub;
				
				//marble removal confirmation
				if (marblesToSub == 1) {
					System.out.println(marblesToSub + " marble removed.");
				}else {
					System.out.println(marblesToSub + " marbles removed.");
				}
				
				//WIN LOGIC PART I
				if (marblesLeft < 4) {
					winner = 1; //win logic player 2
				}
			} else {
				winner = 2; //win logic player 1
			}
			
			/* REDUNDANT CODE BUT IM TOO SCARED TO DELETE IT. IGNORE
			//dr nims turn
			System.out.println("***");
			wait500();
			System.out.println("It's Dr. Nim's turn.");
			wait500();
			if (marblesToSub == 1) { //Dr. nim logic here
				marblesToSub = 3;
			} else if (marblesToSub == 2) {
				marblesToSub = 2;
			} else if (marblesToSub == 3) {
				marblesToSub = 1;
			}
			System.out.print("Doctor Nim removed ");
			System.out.print(marblesToSub);
			if (marblesToSub == 1) {
				System.out.println(" marble.");
			} else {
				System.out.println(" marbles.");
			}
			marblesLeft = marblesLeft - marblesToSub;
			wait500();
			*/
			
			
		}
		
		System.out.println(marblesLeft);
		//WIN LOGIC PART II
		if (winner == 1) {
			System.out.println("Player 1 won!"); //win announcement
		}else if (winner == 2) {
			System.out.println("Player 2 won!");
		}else if (winner == 0) {
			System.out.println("Noone won?");
		}
		
		//EXIT THINGY
		System.out.println("Press any key and then enter to exit.");
		Scanner exit = new Scanner(System.in);
		exitThing = exit.nextLine();
	}
  }


