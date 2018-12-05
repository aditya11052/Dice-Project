import java.util.ArrayList;
class DiceHolder{

	private ArrayList<Integer> x = new ArrayList<>();

	public int addDie(Die die){

	if(x.size() == 6){
		return -1;
	}
	else{
		x.add(die);
		return 1;
	}
}
	public void shake(){
		x.set(0, x.get((int)(Math.random()*6)+1));
		x.set(1, x.get((int)(Math.random()*6)+1));
		x.set(2, x.get((int)(Math.random()*6)+1));
		x.set(3, x.get((int)(Math.random()*6)+1));
		x.set(4, x.get((int)(Math.random()*6)+1));
		x.set(5, x.get((int)(Math.random()*6)+1));

}
	public String toString(){
		return "\n" + x;
	}
}