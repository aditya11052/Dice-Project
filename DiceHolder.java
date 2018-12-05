import java.util.ArrayList;
public class DiceHolder{

	private ArrayList<Die> cup;

	public DiceHolder(){
		 cup = new ArrayList<Die>();
	}

	public int addDie(Die die){

	if(cup.size() < 6){
		cup.add(die);
		return 1;

	}
	else{
		return 1;
	}
}
	public void shake(){
		cup.set(0, cup.get((int)(Math.random()*6)+1));
		cup.set(1, cup.get((int)(Math.random()*6)+1));
		cup.set(2, cup.get((int)(Math.random()*6)+1));
		cup.set(3, cup.get((int)(Math.random()*6)+1));
		cup.set(4, cup.get((int)(Math.random()*6)+1));
		cup.set(5, cup.get((int)(Math.random()*6)+1));

}
	public String toString(){
		return "\n" + cup;
	}
}
