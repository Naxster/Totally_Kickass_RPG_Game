public class Book {

private Spell f_ball;
private Spell light;
private Spell fr_bolt;
private Spell heal;
private Spell shield;
private Spell meteor;

public Book(int z){
	switch(z){
	case 1:
		f_ball = new Fball(1);
        light = new Lightning(0);
        fr_bolt = new Freeze(0);
        heal = new Heal(1);
        shield = new Mshield(0);
        meteor = new Meteor(0);
		break;
	case 2:
		f_ball = new Fball(2);
        light = new Lightning(0);
        fr_bolt = new Freeze(1);
        heal = new Heal(2);
        shield = new Mshield(0);
        meteor = new Meteor(0);
		break;
	case 0:
		f_ball = null;
        light =  null;
        fr_bolt =  null;
        heal = null;
        shield =  null;
        meteor =  null;
		break;
	default:
		f_ball = new Fball(z);
        light = new Lightning(z);
        fr_bolt = new Freeze(z);
        heal = new Heal(z-1);
        shield = new Mshield(z+1);
        meteor = null;
		break;
	}
}
/**
* funkcja rzucenia zaklecia. Dostanie wroga(i moze gracza) i numer zaklecia
* potem wywola use() konkretnego zaklecia, na konkretnej posstaci
*/
public void cast(Character z, int n){
	//brak implementacji
}
/**
* funkcja pokazujaca spelle
* do: pokazania na rozkaz, przy awansie
*/
public void show(){
	String name;
	String formula;
	String ex;
	int lev;
	
	name = f_ball.name();
	formula = f_ball.formula();
	lev = f_ball.level();
	ex = f_ball.data();
	System.out.println(name+" "+lev+",\t (" + ex +") \t\t: "+formula);
	
    name = light.name();
	formula = light.formula();
	lev = light.level();
	ex = light.data();
	System.out.println(name+" "+lev+",\t (" + ex +") \t\t: "+formula);
	
    name = fr_bolt.name();
	formula = fr_bolt.formula();
	lev = fr_bolt.level();
	ex = fr_bolt.data();
	System.out.println(name+" "+lev+",\t (" + ex +") \t\t: "+formula);
	
    name = heal.name();
	formula = heal.formula();
	lev = heal.level();
	ex = heal.data();
	System.out.println(name+" "+lev+",\t (" + ex +") \t\t: "+formula);
	
	name = shield.name();
	formula = shield.formula();
	lev = shield.level();
	ex = shield.data();
	System.out.println(name+" "+lev+",\t (" + ex +") \t\t: "+formula);
	
	name = meteor.name();
	formula = meteor.formula();
	lev = meteor.level();
	ex = meteor.data();
	System.out.println(name+" "+lev+",\t (" + ex +") \t\t: "+formula);
}
}
	
