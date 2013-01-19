import java.util.Scanner;
import java.io.*;

public class Warrior extends Player {

public Warrior(Name names) throws IOException
	{
	int s;
	int d;
	int m;
	Scanner sc = new Scanner(System.in);
	System.out.println("Type strenght(dmg,hp), dexterity(def,crit), and magic(mdmg,mp)");
	System.out.println("You have 10 points");
	do{
	s = sc.nextInt();
	d = sc.nextInt();
	m = sc.nextInt();}
	while((s+d+m)!=10);
	
	strenght = s; //dmg = 5*3; hp = 5*40;
	dexterity = d;	//def = 9*3; crt = 3*3
	magic_skill = m; //mdmg = 2*3; mp = 2*30
	
	hp = 40*strenght;
	ex_hp = 0;
	mana = 30*magic_skill;	
	ex_mana = 0;
	dmg = 8*strenght;	
	ex_dmg = 0;
	mdmg = 7*magic_skill;		
	ex_mdmg = 0;
	def = 6*dexterity;	
	ex_def = 0;
	crit = 3*dexterity;	
	ex_crit = 0;
	h_pot = 2;	
	m_pot = 2;	
	gold = 0;	
	exp = 0;	
	lvl = 1;	
	spell_book = new Book(1);
	this.names = names;
	equip = new Equipment(this,0);


	 x = 27; //14	
	 y = 32; //1
	 exp_nxt = 500;		
	}
public int slash()
	{
	int res;
	if(this.weapon.id() == 'w')
		{
		Weapon w = (Weapon)(this.weapon);
		res = w.atc();
		res += this.getDMG();
		return res;
		}
	else if(this.weapon.id() == 'l')
		{
		Staff s = (Staff)(this.weapon);
		res = s.atc();
		res += this.getDMG();
		return res;
		}
	return 0;
	}
public void hide(int n)
    {
	int obr = n - this.getDEF();
	if(obr > 0)
		this.meta_hp -= obr;
	System.out.println("You take "+obr+" damage");
    }
}