import java.lang.*;
import java.util.Scanner;
import java.io.*;

public class Test{

public static void main(String[] args) throws IOException,InterruptedException{
Scanner sc = new Scanner(System.in);
String useless;
Name ok = new Name();

System.out.println("\n Creating Mage \n");
Player gram = new Mage(ok);
gram.identify();
System.out.println("\n Creating Warrior \n");
Player gram2 = new Warrior(ok);
gram2.identify();

useless = sc.nextLine();

System.out.println("\n Mage spells \n");
gram.spell_book.show();
System.out.println("\n Warrior spells \n");
gram2.spell_book.show();

useless = sc.nextLine();

System.out.println("\n Mage things \n");
gram.equip.show();
System.out.println("\n Warrior things \n");
gram2.equip.show();

useless = sc.nextLine();

System.out.println("\n now Mage will found something and something... \n");
Thread.currentThread().sleep(1500);
Amulet something = new Amulet(0,1,ok);
gram.equip.found(something);
Weapon something2 = new Weapon(1,5,ok);
gram.equip.found(something2);
Shield something3 = new Shield(1,5,ok);
gram.equip.found(something3);
Amulet something4 = new Amulet(1,4,ok);
gram.equip.found(something4);

useless = sc.nextLine();

System.out.println("\n Mage stats: \n");
gram.identify();
System.out.println("\n changing Mage things \n");
gram.equip.change();

System.out.println("\n changed things: \n");
gram.equip.show();
System.out.println("\n changed stats: \n");
gram.identify();
}
}