public class Mage extends Player {

public Mage()
	{
	hp = 100;
	ex_hp = 0;
	mana = 150;	
	ex_mana = 0;
	dmg = 5;	
	ex_dmg = 0;
	def = 3;	
	ex_def = 0;
	crit = 3;	
	ex_crit = 0;
	h_pot = 4;	
	m_pot = 4;	
	gold = 0;	
	exp = 0;	
	lvl = 1;	
	weapon = null;	
	shield = null;	
	amulet = new Amulet(0);	//przy konstruktorze dla itemu dal "0" da bazowy predefiniowany startowy zestaw
	spell_book = new Book(2); 
	equip = new Equipment(this);

	 x = 10;	
	 y = 0;
	 exp_nxt = 500;		
	}
public int slash()
	{
	/*
	int res = (int)(Math.random()*(this.weapon.atc_u - this.weapon.atc_l + 1));
	res += this.getDMG();
	res += this.weapon.atc_ex();
	return res;
	*/
	}
public int hide()
     {
	 /*
	 int res = (int)(Math.random()*(this.shield.def_u - this.shield.def_l + 1)) + this.getDEF();
     return res;
	 */
     }
}