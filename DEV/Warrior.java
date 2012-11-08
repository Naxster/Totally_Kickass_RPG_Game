public class Warrior extends Player {

public Warrior()
	{
	hp = 200;
	ex_hp = 0;
	mana = 60;	
	ex_mana = 0;
	dmg = 15;	
	ex_dmg = 0;
	def = 10;	
	ex_def = 0;
	crit = 10;	
	ex_crit = 0;
	h_pot = 2;	
	m_pot = 2;	
	gold = 0;	
	exp = 0;	
	lvl = 1;	
	weapon = new Weapon(0);	//przy konstruktorze dla itemu dal "0" da bazowy predefiniowany startowy zestaw
	shield = new Shield(0);	
	amulet = null;	
	spell_book = new Book(1);
	equip = new Equipment(this);

	 x = 10;	
	 y = 0;
	 exp_nxt = 500;		
	}
public int slash()
	{
	int res = (int)(Math.random()*(this.weapon.atc_u - this.weapon.atc_l + 1));
	res += this.getDMG();
	res += this.weapon.atc_ex();
	return res;
	}
public int hide()
     {
	 int res = (int)(Math.random()*(this.shield.def_u - this.shield.def_l + 1)) + this.getDEF();
     return res;
     }
}