import java.io.*;

public class Knurla extends Monster{

protected int ex_hp;
protected int ex_mana;
protected int ex_dmg;
protected int ex_mdmg;
protected int ex_def;
protected int ex_crit;
protected int h_pot;		//mikstury zycia
protected int gold;		//zloto
public Weapon weapon;	//slot na bron
public Shield shield;
public Amulet amulet;	//slot na amulet
protected Name names; //katalog nazw

public void chgHP(int z)
     {
     this.ex_hp+=z;
     }
public void chgMAN(int z)
     {
     this.ex_mana+=z;
     }
public void chgCRIT(int z)
     {
     this.ex_crit+=z;
     }
public void chgDEF(int z)
	{
	this.ex_def+=z;
	}
public void chgDMG(int z)
	{
	this.ex_dmg+=z;
	}
public void chgMDMG(int z)
	{
	this.ex_mdmg+=z;
	}

public Knurla(int z, int l) throws IOException
	{
	//Nekromanta
	strenght = ((z+1) + (l-1)); //dmg = 5*3; hp = 5*40;
	dexterity = ((z+1) + (l-1));	//def = 3*3; crt = 3*3
	magic_skill = 0; //mdmg = 2*3; mp = 2*30
	
	lvl = l;
	this.names = names;
	
	weapon = new Weapon(z,l,names);
	amulet = new Amulet(z,l,names);
	shield = new Shield(z,l,names);
	
	amulet.add_to_k(this);
	
	hp = 40*strenght;
	mana = 30*magic_skill;
	dmg = 3*strenght;		
	mdmg = 3*magic_skill;		
	def = 3*dexterity;	
	crit = 3*dexterity;	
	h_pot = 4;	
	gold = 20*z;			
	
	items = new Thing[4];
	items[0] = new Item(5,"Claws");
	items[1] = new Item(10,"Piece of ebonite");
	items[2] = new Weapon(2,l,names);
	items[3] = new Shield(1,l,names);
	
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