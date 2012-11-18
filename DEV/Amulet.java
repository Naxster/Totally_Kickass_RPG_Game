public class Amulet extends Thing{

private int ex_hp;
private int ex_mana;
private int ex_dmg;
private int ex_mdmg;
private int ex_def;
private int ex_crit;
private String name;

public Amulet(int z){
	if(z==0)
		{
		int ex_hp = 0;
		int ex_mana = 0;
		int ex_dmg = 0;
		int ex_mdmg = 0;
		int ex_def = 0;
		int ex_crit = 0;
		name = "Simple steel amulet of novice";
		}
	}
public String show(){
	String res = name + " \t(hp:"+ex_hp+" mp:"+ex_mana+" dmg:"+ex_dmg+" mdmg:"+ex_mdmg+" def:"+ex_def+" crt:"+ex_crit+")";
	return res;
	}
}