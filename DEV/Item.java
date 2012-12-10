public class Item extends Thing{

public Item(int c, String n){
	this.cost = c;
	this.name = n;
	this.require = 0;
}
public String show(){
	String res = name;
	return res;
	}
public char id(){
	return 'i';
	}
public void remove_from(Player z){}
public void add_to(Player z){}
}