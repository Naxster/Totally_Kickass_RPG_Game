public class Weapon extends Thing{

private int atc_l;
private int atc_u;
private int atc_s;
private String name;
private String spec;

public Weapon(int z){
	if(z==0)
		{
		atc_l = 10;
		atc_u = 12;
		atc_s = 0;
		name = "Simple novice one-handed sword";
		spec = "";
		}
}
public int atc(){
	int res = atc_l + (int)(Math.random()*(atc_u - atc_l + 1));
	res += atc_s;
	return res;
	}
public String addition(){
	int a = spec.length();
	if(a > 1)
		{
		String res = "(+ " + atc_s + " " + spec + ")";
		return res;
		}
	return " ";
	}
public String show(){
	String sp = addition();
	String res = name + " " + sp + " \t" + atc_l + "-" + atc_u;
	return res;
	}
}
