public class Shield extends Thing{

private int def_l;
private int def_u;
private String name;

public Shield(int z){
	if(z==0)
		{
		def_l = 5;
		def_u = 7;
		name = "Simple novice wooden shield";
		}
}
public int def(){
	int res = def_l + (int)(Math.random()*(def_u - def_l + 1));
	return res;
	}
public String show(){
	String res = name + "  \t" + def_l + "-" + def_u;
	return res;
	}
}
