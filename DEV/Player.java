public abstract class Player implements Character {

protected int strenght; 	//sila (dmg + hp)
protected int dexterity;	//zrecznosc (def + crit)
protected int magic_skill;		//umiejetnosci magiczne (mdmg + mp)

protected int hp; 	//zycie
protected int ex_hp;
protected int mana;		//mana
protected int ex_mana;
protected int dmg;		//obrazenia podstawowe
protected int ex_dmg;
protected int mdmg;		//obrazenia magiczne
protected int ex_mdmg;
protected int def;		//obrona podstawowa
protected int ex_def;
protected int crit;		//szansa na krytyczne
protected int ex_crit;
protected int h_pot;		//mikstury zycia
protected int m_pot;		//mikstury many
protected int gold;		//zloto
protected int exp;		//doswiadczenie
protected int lvl;		//poziom
public Weapon weapon;	//slot na bron
public Amulet amulet;	//slot na amulet
public Shield shield;
protected Book spell_book;	//ksiega zaklec
protected Equipment equip;	//ekwipunek
protected Name names; //katalog nazw

public int x;			//pozycja x i y
public int y;
protected int exp_nxt;		//doswiadczenie do nastepnego poziomu



//FUNKCJE DO WYSWIETLANIA
/**
* funkcja podajaca zycie
* do: kopiowania przy walce, wyswietlania w glownym oknie
*/
public int getHP()
    {
    return (this.hp + this.ex_hp);
    }
/**
* funkcja podajaca mane
* do: kopiowania przy walce, wyswietlania w glownym oknie
*/
public int getMANA()
    {
    return (this.mana + this.ex_mana);
    }
/**
* funkcja zmieniajaca zycie
* do: zmiany wartosci od przedmiotu
* @param z - warotsc zmiany
*/
public void chgHP(int z)
     {
     this.ex_hp+=z;
     }
/**
* funkcja zmieniajaca mane
* do: zmiany wartosci od przedmiotu
* @param z - warotsc zmiany
*/
public void chgMAN(int z)
     {
     this.ex_mana+=z;
     }
/**
* funkcja uzywania potionow zycia
* do: uzycia w walce, znalezienia na mapie
* @param t - true to uzycie, false to dodanie
* @param z - ilosc znalezionych
*/
public void useHPOT(boolean t, int z)
     {
     if(t==true)
     this.h_pot-=1;
     else
     this.h_pot+=z;
     }  
/**
* funkcja podajaca ilosc potionow zycia
* do: wyswietlania w glownym oknie, wyswietlania w walce
*/	 
public int getHPOT()
    {
    return this.h_pot;
    }
/**
* funkcja uzywania potionow many
* do: uzycia w walce, znalezienia na mapie
* @param t - true to uzycie, false to dodanie
* @param z - ilosc znalezionych
*/
public void useMPOT(boolean t, int z)  //true to uzycie, false to dodanie
     {
     if(t==true)
     this.m_pot-=1;
     else
     this.m_pot+=z;
     } 
/**
* funkcja podajaca ilosc potionow many
* do: wyswietlania w glownym oknie, wyswietlania w walce
*/	
public int getMPOT()
    {
    return this.m_pot;
    }
/**
* funkcja podajaca ilosc gotowki
* do: wyswietlania w glownym oknie
*/	
public int getGOLD()
    {
    return this.gold;
    }
/**
* funkcja zmieniajaca gotowke
* do: zmiany po walce, w sklepie
*/	
public void chgGOLD(int z)
    {
     this.gold += z;
    }
	
//FUNKCJE PODAWANIA W WALCE
/**
* funkcja zmieniajaca krytyczne
* do: zmiany wartosci od przedmiotu
* @param z - warotsc zmiany
*/	
public void chgCRIT(int z)
     {
     this.ex_crit+=z;
     }
/**
* funkcja podajaca szanse na krytyczne
* do: obliczen w walce
*/
public int getCRIT()
    {
    return (this.crit + this.ex_crit);
    }
/**
* funkcja podajaca obrone
* do: obliczen w walce
*/
public int getDEF()
    {
    return (this.def + this.ex_def);
    }
/**
* funkcja zmieniajaca obrone
* do: zmiany wartosci od przedmiotu
* @param z - warotsc zmiany
*/
public void chgDEF(int z)
	{
	this.ex_def+=z;
	}
/**
* funkcja podajaca obrazenia
* do: obliczen funkcji slash
*/
public int getDMG()
    {
    return (this.dmg + this.ex_dmg);
    }
/**
* funkcja zmieniajaca atak
* do: zmiany wartosci od przedmiotu
* @param z - warotsc zmiany
*/
public void chgDMG(int z)
	{
	this.ex_dmg+=z;
	}
/**
* funkcja podajaca obrazenia magiczne
* do: obliczen zaklec
*/
public int getMDMG()
    {
    return (this.mdmg + this.ex_mdmg);
    }
/**
* funkcja zmieniajaca atak magiczny
* do: zmiany wartosci od przedmiotu
* @param z - warotsc zmiany
*/
public void chgMDMG(int z)
	{
	this.ex_mdmg+=z;
	}
	
	
	
//FUNKCJE ZWIAZANE Z POZIOMEM
/**
* funkcja podajaca poziom
* do: wyswietlania w glownym oknie
*/	
public int getLVL()
     {
     return this.lvl;
     }
/**
* funkcja podajaca doswiadczenie
* do: wyswietlania w glownym oknie
*/
public int getEXP()
     {
     return this.exp;
     }
/**
* funkcja dodajaca doswiadczenie
* do: zmiany wartosci po walce, obsluga inicjacji zmiany poziomu
* @param z - warotsc zmiany
*/
public void addEXP(int z)
     {
     this.exp += z;
	 if(this.exp>=this.exp_nxt)
		{
		this.exp -= this.exp_nxt;
		this.chgEXPNXT();
		this.levelup();
		this.lvl++;
		}
     }
public abstract void levelup();
/**
* funkcja podajaca dosw. do nastepnego poziomu
* do: wyswietlania w glownym oknie
*/
public int getEXPNXT()
     {
     return this.exp_nxt;
     }	
/**
* funkcja zmieniajaca dosw. do nastepnego poziomu
* do: dzialan przy zmianie poziomu
*/
public void chgEXPNXT()
     {
     int tmp;
	 if(this.lvl < 6)
		{
		tmp = (int)(this.exp_nxt * (2 - (0.15*this.lvl-1)));
		this.exp_nxt = tmp;
		}
	else
		{
		tmp = (int)(this.exp_nxt * 1.4);
		this.exp_nxt = tmp;
		}
     }
	 

//FUNKCJE OBLICZENIOWE DO WALKI
/**
* funkcja wyliczajaca watosc ataku (ABSTAKCJA)
* do: walki
*/
public abstract int slash();
/**
* funkcja wyliczajaca watosc aobrony
* do: walki
*/
public abstract int hide();

public void identify(){
	int data;
	
	data = strenght;
	System.out.println("Strenght: \t\t" + data);
	data = dexterity;
	System.out.println("Dexterity: \t\t" + data);
 	data = magic_skill;
	System.out.println("Magic: \t\t\t" + data);
	data = hp;
	System.out.println("Health: \t\t" + data);
	data = mana;
	System.out.println("Mana: \t\t\t" + data);
	data = dmg;
	System.out.println("Damage: \t\t" + data);
	data = mdmg;
	System.out.println("Magical damage: \t" + data);
	data = def;
	System.out.println("Defence: \t\t" + data);
	data = crit;
	System.out.println("Chance for critical: \t" + data);
	System.out.println("ADDITIONAL:");
	data = ex_hp;
	System.out.println("Add Health: \t\t" + data);
	data = ex_mana;
	System.out.println("Add Mana: \t\t" + data);
	data = ex_dmg;
	System.out.println("Add Damage: \t\t" + data);
	data = ex_mdmg;
	System.out.println("Add Magical damage: \t" + data);
	data = ex_def;
	System.out.println("Add Defence: \t\t" + data);
	data = ex_crit;
	System.out.println("Add Chn for critical: \t" + data);
	}
public Name getNames(){
	return names;
	}
public int s_strenght(){
	return strenght;
	}
public int s_dexterity(){
	return dexterity;
	}
public int s_magic_skill(){
	return magic_skill;
	}
}
