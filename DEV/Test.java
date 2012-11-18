public class Test{
public static void main(String[] args){
System.out.println("\n Creating Mage");
Player gram = new Mage();
System.out.println("\n Creating Warrior");
Player gram2 = new Warrior();
System.out.println("\n Mage spells");
gram.spell_book.show();
System.out.println("\n Warrior spells");
gram2.spell_book.show();

System.out.println("\n Mage things");
gram.equip.show();
System.out.println("\n Warrior things");
gram2.equip.show();
}
}