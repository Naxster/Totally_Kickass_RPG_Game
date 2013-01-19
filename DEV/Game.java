import java.lang.*;
import java.util.Scanner;
import java.io.*;

public class Game{

private Quest q1;
private Quest q2;
private Quest q3;
public Name names;
WorldGenerator world;
Player play;

public Game() throws IOException{
	q1 = null;
	q2 = null;
	q3 = null;
	names = new Name();
	world = new WorldGenerator();
	play = null;
	}

public void label(){
	int cord = play.y*30 + play.x;
	switch(world.map[cord][4]){
		case 0:
			System.out.println("You are in: VILLAGE OF KER'BHINAK");
			break;
		case 1:
			System.out.println("You are in: ANCIENT CAVE");
			break;
		case 2:
			System.out.println("You are in: TREASURE ZONE");
			break;
		case 3:
			System.out.println("You are in: GREAT LABIRYNTH");
			break;
		case 4:
			System.out.println("You are in: ABANDONED HOUSE");
			break;
		case 5:
			System.out.println("You are in: SWAMP OF DECAY");
			break;
		case 6:
			System.out.println("You are in: BOSS ZONE");
			break;
		case 7:
			System.out.println("You are in: FOREST");
			break;
		default:
			break;
		}
	}
public int movement()throws IOException{
	int cord = play.y*30 + play.x;
	switch(world.map[cord][1]){
		case 0:
			return 0;
		case 1:
			return 1;
		case 2:
			if(world.map[cord][0] == 0)
				{
				Fight f = new Fight(play,world.map[cord][2],world.map[cord][3],names);
				if(f.Mortal_Kombat() == true)
					return 0;
				else
					return 2;
				}
			else
				return 0;
		case 3:
			if(world.map[cord][0] == 0)
				{
				Treasure t = new Treasure(play.getLVL(),world.map[cord][3],names);
				t.getemall(play);
				}
			return 0;
		case 4:
			if(world.map[cord][0] == 0)
				{
				switch(world.map[cord][3]){
				case 1:
					q1 = new Quest(1);
					q1.checkQuest(play,0);
					break;
				case 2:
					q2 = new Quest(2);
					q2.checkQuest(play,0);
					break;
				case 3:
					q3 = new Quest(3);
					q3.checkQuest(play,0);
					break;
				}
				}
			else
				{
				switch(world.map[cord][3]){
				case 1:
					q1.checkQuest(play,1);
					break;
				case 2:
					q2.checkQuest(play,1);
					break;
				case 3:
					q3.checkQuest(play,1);
					break;
				}
				}
			return 0;	
		case 5:
			return 0;
		default:
			return 0;
		}
	}

public static void main(String[] args) throws IOException,InterruptedException{
Scanner sc = new Scanner(System.in);
Game g = new Game();
int i;
String chos;
int obstacle;

System.out.println("\n Choose your class: (m)age or (w)arrior");
chos = sc.nextLine();

switch(chos){
case "m":
	System.out.println("\n Creating Mage \n");
	g.play = new Mage(g.names);
	break;
case "w":
	System.out.println("\n Creating Warrior \n");
	g.play = new Warrior(g.names);
	break;
default:
	g.play = new Warrior(g.names);
	break;
}

while(true)
	{
	System.out.println("\n Type [wsad] for direction, [e]quipment or s[t]ats \n");
	chos = sc.nextLine();
	switch(chos){
	case "w":
		if(g.play.y + 1 <= 34)
			{
			g.play.y += 1;
			obstacle = g.movement();
			if(obstacle == 1)
				g.play.y -= 1;
			if(obstacle == 2)
				return ;
			g.world.map[g.play.y*30 + g.play.x][0] = 1;
			}
		break;
	case "s":
		if(g.play.y-1 >= 0)
			{
			g.play.y -= 1;
			obstacle = g.movement();
			if(obstacle == 1)
				g.play.y += 1;
			if(obstacle == 2)
				return ;
			g.world.map[g.play.y*30 + g.play.x][0] = 1;
			}
		break;	
	case "a":
		if(g.play.x-1 >= 0)
			{
			g.play.x -= 1;
			obstacle = g.movement();
			if(obstacle == 1)
				g.play.x += 1;
			if(obstacle == 2)
				return ;
			g.world.map[g.play.y*30 + g.play.x][0] = 1;
			}
		break;
	case "d":
		if(g.play.x+1 >= 0)
			{
			g.play.x += 1;
			obstacle = g.movement();
			if(obstacle == 1)
				g.play.x -= 1;
			if(obstacle == 2)
				return ;
			g.world.map[g.play.y*30 + g.play.x][0] = 1;
			}
		break;
	case "e":
		g.play.equip.change();
	case "t":
		g.play.identify();
	default:
		break;
	}
	g.label();
	g.world.show(g.play.y*30 + g.play.x);
	}
}
}
