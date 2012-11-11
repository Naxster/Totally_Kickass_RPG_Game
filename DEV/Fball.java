public class Fball implements Spell{

private int dmg_l;
private int dmg_u;
private int cost;

private String name;
private String formula;

public int lvl;

public Fball(int z){
	if(z>0)
		{
		dmg_l = 28 + ((z-1)*3);
		dmg_u = 32 + ((z-1)*4);
		cost = 20 + ((z-1)*5);
		}
	lvl = z;
	name = "Fireball";
	formula = "Khar neramas";
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