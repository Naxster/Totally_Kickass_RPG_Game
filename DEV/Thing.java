public abstract class Thing{

protected int cost;
protected int require;
protected String name;

public abstract String show();
public abstract char id();
public abstract void remove_from(Player z);
public abstract void add_to(Player z);
public int requirements(){
	return this.require;
	}
public int costing(){
	return this.cost;
	}
}