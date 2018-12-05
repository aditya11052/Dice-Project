import java.util.ArrayList;

public class DiceRunner{
	public static void main(String[]args){

		//Task1
		Die D1 = new Die();
		Die D2 = new Die();

		int rolls = 0;

		while((D1 != 1) && (D2 != 1)){
		rolls ++;
		System.out.println("Roll: " + rolls);
		D1.roll();
		D2.roll();
		System.out.println("Dice 1: " + D1.toString());
		System.out.println("Dice 2: " + D2.toString());
		System.out.println("\n");
		}

		System.out.println("It took " + rolls + " rolls to get Snake Eyes");




	}
}





