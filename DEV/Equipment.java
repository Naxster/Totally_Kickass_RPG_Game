public class Equipment{

private Thing[] things;
private Player gracz;

public Equipment(Player z, int n){
	gracz = z;
	things = new Thing[8];
	if(n==0)
		{
		gracz.weapon = new Weapon(0);	//przy konstruktorze dla itemu dal "0" da bazowy predefiniowany startowy zestaw
		gracz.shield = new Shield(0);	
		gracz.amulet = null;	
		}
	if(n ==1)
		{
		gracz.weapon = null;	//przy konstruktorze dla itemu dal "0" da bazowy predefiniowany startowy zestaw
		gracz.shield = null;
		gracz.amulet = new Amulet(0);
		}
	}
public void show(){
	String info = "";
	int i;
	
	System.out.println("Equiped things:");
	if(gracz.weapon != null)
		{
		info = gracz.weapon.show();
		System.out.println("\t"+info);
		}
	info = "";
	if(gracz.shield != null)
		{
		info = gracz.shield.show();
		System.out.println("\t"+info);
		}
	info = "";
	if(gracz.amulet != null)
		{
		info = gracz.amulet.show();
		System.out.println("\t"+info);
		}
	
	System.out.println("Backpack things:");
	for(i=0;i<8;i++)
		{
		if(things[i] != null)
			{
			info = things[i].show();
			System.out.println("\t"+info);
			}
		}
	}		
}