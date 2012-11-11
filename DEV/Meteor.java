public class Meteor implements Spell{

private int dmg_l;
private int dmg_u;
private int cost;

private String name;
private String formula;

public int lvl;

public Meteor(int z){
	if(z>0)
		{
		dmg_l = 100 + ((z-1)*10);
		dmg_u = 130 + ((z-1)*15);
		cost = 250 + ((z-1)*30);
		}
	lvl = z;
	name = "Meteor";
	formula = "Krav naheris dran klamere";
	}
/**
* funkcja podajaca pdodatkwe informacje
*/
public String data(){
	String h = (String)(dmg_l + "-" + dmg_u + "; " + cost);
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
* funkcja podajaca obrazenia
*/
public int dmg(){
	int res = dmg_l + (int)(Math.random()*(dmg_u - dmg_l + 1));
	return res;
	}
/**
* funkcja uzycia zaklecia na postaci
* @param z - Postac na ktora rzucane jest zaklecie
*/
public void use(Character z){
	int tmp = dmg();
	}
}