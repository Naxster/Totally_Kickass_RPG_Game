public class Book {

private Spell[] spells;

public Book(int z){
	spells = new Spell[6];
	switch(z){
	case 1:
		spells[0] = new Fball(1);
        spells[1] = new Lightning(0);
        spells[2] = new Freeze(0);
        spells[3] = new Heal(1);
        spells[4] = new Mshield(0);
        spells[5] = new Meteor(0);
		break;
	case 2:
		spells[0] = new Fball(2);
        spells[1] = new Lightning(0);
        spells[2] = new Freeze(1);
        spells[3] = new Heal(2);
        spells[4] = new Mshield(0);
        spells[5] = new Meteor(0);
		break;
	case 0:
		break;
	default:
		spells[0] = new Fball(z);
        spells[1] = new Lightning(z);
        spells[2] = new Freeze(z);
        spells[3] = new Heal(z-1);
        spells[4] = new Mshield(z+1);
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
	Spell z;
	String name;
	String formula;
	String ex;
	int lev,i;
	
	for(i=0;i<6;i++)
		{
		z = spells[i];
		name = z.name();
		formula = z.formula();
		lev = z.level();
		ex = z.data();
		System.out.println(name+" "+lev+",\t (" + ex +") \t\t: "+formula);
		}
}
}
	
