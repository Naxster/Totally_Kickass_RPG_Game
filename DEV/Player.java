public abstract class Player implements Character {

protected int hp; 	//¿ycie
protected int ex_hp;
protected int mana;		//mana
protected int ex_mana;
protected int dmg;		//obra¿enia podstawowe
protected int ex_dmg;
protected int def;		//obrona podstawowa
protected int ex_def;
protected int crit;		//szana na krytyczne
protected int ex_crit;
protected int h_pot;		//mikstury ¿ycia
protected int m_pot;		//mikstury many
protected int gold;		//z³oto
protected int exp;		//doœwiadczenie
protected int lvl;		//poziom
protected Weapon weapon;	//slot na broñ
protected Shield shield;	//slot na tarcze
protected Amulet amulet;	//slot na amulet
protected Book spell_book;	//ksiega zaklec
protected Equipment equip;	//ekwipunek

public int x;			//pozycja x i y
public int y;
public int exp_nxt;		//doœwiadczenie do nastepnego poziomu



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
     this.ex_man+=z;
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
public int chgDEF(int z)
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
public int chgDMG(int z)
	{
	this.ex_dmg+=z;
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
* do: zmiany wartosci po walce
* @param z - warotsc zmiany
*/
public void addEXP(int z)
     {
     this.exp+=z;
     }
	 
	 
	 
/*	 
void addOBR()
     {
     obr+=5;
     cout<<"Sila zwiekszona \n";
     }
void addKRT()
     {
     kr+=5;
     cout<<"Szansa na krytyczne zwiekszona \n";
     }
void addPAN()
     {
     pan+=5;
     cout<<"Odpornosc zwiekszona \n";
     }
*/


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
}