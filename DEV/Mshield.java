public class Mshield extends Spell{

private int defence;

public Mshield(int z){
	if(z>0)
		{
		defence = 25 + (z-1);
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
	z.spoilDEF(-tmp);
	z.drain(this.cost());
	}
}