public class Heal extends Spell{

private int heal;

public Heal(int z){
	if(z>0)
		{
		heal = 50 + ((z-1)*10);
		cost = 10 + ((z-1)*2);
		}
	lvl = z;
	name = "Healing";
	formula = "Harme";
	}
/**
* funkcja podajaca pdodatkwe informacje
*/
public String data(){
	String h = (String)(heal + "; " + cost);
	return h;
	}
/**
* funkcja podajaca leczone hp
*/
public int healing(){
	return heal;
	}
/**
* funkcja uzycia zaklecia na postaci
* @param z - Postac na ktora rzucane jest zaklecie
*/
public void use(Character z){
	int tmp = healing();
	z.help(tmp);
	z.drain(this.cost());
	}
}