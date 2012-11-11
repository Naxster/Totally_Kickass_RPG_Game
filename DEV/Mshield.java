public class Mshield implements Spell{

private int defence;
private int cost;

private String name;
private String formula;

public int lvl;

public Mshield(int z){
	if(z>0)
		{
		defence = 5 + (z-1);
		cost = 10 + ((z-1)*2);
		}
	lvl = z;
	name = "Force shield";
	formula = "Prevetio";
	}
/**
* funkcja podajaca pdodatkwe informacje
*/
public String data(){
	String h = (String)(defence + "; " + cost);
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
* funkcja podajaca wzmocnienie obrony
*/
public int protect(){
	return defence;
	}
/**
* funkcja uzycia zaklecia na postaci
* @param z - Postac na ktora rzucane jest zaklecie
*/
public void use(Character z){
	int tmp = protect();
	}
}