import java.lang.*;
import java.util.Scanner;
import java.io.*;

public class Game{

public int movement(WorldGenerator world, Player play){
	int cord = play.y*30 + play.x;
	if(world.map[cord][1] == 1)
		return 1;
	else
		{
		if(world.map[cord][1] < 4 && world.map[cord][0] == 0)
			return world.map[cord][1];
		else if(world.map[cord][1] < 4 && world.map[cord][0] == 1)
			return 0;
		else 
			return world.map[cord][1];
		}
	}

public static void main(String[] args) throws IOException,InterruptedException{
Scanner sc = new Scanner(System.in);
Name names = new Name();
WorldGenerator world = new WorldGenerator();
Player play = null;
Game g = new Game();
int i;
String chos;
int obstacle;

System.out.println("\n Choose your class: (m)age or (w)arrior");
chos = sc.nextLine();

switch(chos){
case "m":
	System.out.println("\n Creating Mage \n");
	play = new Mage(names);
	break;
case "w":
	System.out.println("\n Creating Warrior \n");
	play = new Warrior(names);
	break;
default:
	play = new Warrior(names);
	break;
}

while(true)
	{
	System.out.println("\n Give a direction, wsad \n");
	chos = sc.nextLine();
	switch(chos){
	case "w":
		if(play.y + 1 <= 34)
			{
			play.y += 1;
			obstacle = g.movement(world,play);
			if(obstacle == 1)
				play.y -= 1;
			world.map[play.y*30 + play.x][0] = 1;
			}
		break;
	case "s":
		if(play.y-1 >= 0)
			{
			play.y -= 1;
			obstacle = g.movement(world,play);
			if(obstacle == 1)
				play.y += 1;
			world.map[play.y*30 + play.x][0] = 1;
			}
		break;	
	case "a":
		if(play.x-1 >= 0)
			{
			play.x -= 1;
			obstacle = g.movement(world,play);
			if(obstacle == 1)
				play.x += 1;
			world.map[play.y*30 + play.x][0] = 1;
			}
		break;
	case "d":
		if(play.x+1 >= 0)
			{
			play.x += 1;
			obstacle = g.movement(world,play);
			if(obstacle == 1)
				play.x -= 1;
			world.map[play.y*30 + play.x][0] = 1;
			}
		break;
	default:
		System.out.println("\n wrong \n");
		break;
	}
	System.out.println("\n wrong ");
	world.show();
	}
}
}
