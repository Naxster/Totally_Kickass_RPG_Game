public class Heal implements Spell{

private int heal;
private int cost;

private String name;
private String formula;

public int lvl;

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
* funkcja podajaca poziom
*/
public int level(){
	return lvl;
	}
/**
* funkcja podajaca nazwe
*/
public String name(){
	return name;
	}
/**
* funkcja podajaca formule
*/
public String formula(){
	return formula;
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
	}
}