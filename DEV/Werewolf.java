import java.io.*;

public class Werewolf extends Monster{

public Werewolf(int z, int l) throws IOException
	{
	//duza zywotnosc i sila, slaba obrona. Specjalny atak ze zwiekszeniem obrazen i w³. krytami
	strenght = (z+1); //dmg = 5*3; hp = 5*40;
	dexterity = (z+1);	//def = 3*3; crt = 3*3
	magic_skill = (z-1); //mdmg = 2*3; mp = 2*30
	
	lvl = l;
	
	hp = 40*strenght + (20+strenght)*lvl;
	mana = 30*magic_skill;	
	dmg = 10*strenght + lvl*6;	
	mdmg = 0;		
	def = 2*dexterity + 2*lvl;	
	crit = 10*dexterity + 20;	
		
	items = new Item[4];
	items[0] = new Item(60,"Werewolf's head");
	items[1] = new Item(30,"Werewolf's fur");
	items[2] = new Item(20,"Werewolf's heart");
	items[3] = new Item(5,"Claws");

	 x = 0;	
	 y = 0;
	}
public int slash()
	{
	int res = this.dmg;
	return res;
	}
public int hide()
    {
	int res = this.dmg;
    return res;
    }
}