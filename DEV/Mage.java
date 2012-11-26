import java.util.Scanner;
import java.io.*;

public class Mage extends Player {

public Mage(Name names) throws IOException
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
	dexterity = d;	//def = 3*3; crt = 3*3
	magic_skill = m; //mdmg = 2*3; mp = 2*30
	
	hp = 40*strenght;
	ex_hp = 0;
	mana = 30*magic_skill;
	ex_mana = 10;
	dmg = 3*strenght;		
	ex_dmg = 0;
	mdmg = 3*magic_skill;		
	ex_mdmg = 2;
	def = 3*dexterity;	
	ex_def = 0;
	crit = 3*dexterity;	
	ex_crit = 0;
	h_pot = 4;	
	m_pot = 4;	
	gold = 0;	
	exp = 0;	
	lvl = 1;	
	spell_book = new Book(2); 
	names = new Name();
	equip = new Equipment(this,1);

	 x = 10;	
	 y = 0;
	 exp_nxt = 500;		
	}
public int slash()
	{
	int res = this.weapon.atc();
	res += this.getDMG();
	return res;
	}
public int hide()
    {
	int res = this.getDEF();
    return res;
    }
public void levelup(){
	}
}