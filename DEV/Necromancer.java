import java.io.*;

public class Necromancer extends Monster{

protected int ex_hp;
protected int ex_mana;
protected int ex_dmg;
protected int ex_mdmg;
protected int ex_def;
protected int ex_crit;
protected int h_pot;		//mikstury zycia
protected int m_pot;		//mikstury many
protected int gold;		//zloto
public Staff weapon;	//slot na bron
public Amulet amulet;	//slot na amulet
protected Book spell_book;	//ksiega zaklec
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

public Necromancer(int z, int l, Name names) throws IOException
	{
	//Nekromanta
	strenght = (z + (l-1)); //dmg = 5*3; hp = 5*40;
	dexterity = ((z-1) + (l-1));	//def = 3*3; crt = 3*3
	magic_skill = ((z+1) + (l-1)); //mdmg = 2*3; mp = 2*30
	
	lvl = l;
	this.names = names;
	
	weapon = new Staff(z,l,names);
	amulet = new Amulet(z,l,names);
	spell_book = new Book(z);
	
	amulet.add_to_n(this);
	weapon.add_to_n(this);
	
	hp = 40*strenght;
	mana = 30*magic_skill;
	dmg = 3*strenght;		
	mdmg = 3*magic_skill;		
	def = 3*dexterity;	
	crit = 3*dexterity;	
	h_pot = 4;	
	m_pot = 4;	
	gold = 20*z;			
	spell_book = new Book(2); 
	
	items = new Thing[4];
	items[0] = new Item(13,"Necromancer's hand");
	items[1] = new Staff(1,l,names);
	items[2] = new Amulet(1,l,names);
	items[3] = new Amulet(2,l,names);
	

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