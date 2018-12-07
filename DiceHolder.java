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
		return -1;
	}
}
	public void shake(){
		for(int i=0;i<cup.size();i++){
			cup.get(i).roll();
		}
}
	public String toString(){
		String r="";
		for(int i=0;i<cup.size();i++){
		r+="\nDice "+(i+1)+": "+(cup.get(i));
	}
	return r;
	}
}
