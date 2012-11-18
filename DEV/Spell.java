public abstract class Spell{
protected int cost;
protected String name;
protected String formula;
public int lvl;

public String name(){
	return name;
	}
public String formula(){
	return formula;
	}
public int level(){
	return lvl;
	}
public abstract String data();
public abstract void use(Character z);
}