import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Scanner;

import org.junit.Test;


public class MageTest  {
	
	/**
	*Zestaw danych wejsciowych do testów 2,3,5
	*/ 
	

	@Test
	public void testGetHP()  throws IOException,InterruptedException{
		Scanner sc = new Scanner(System.in);
		Name ok = new Name();
		Player gram = new Mage(ok);
		assertTrue(gram.getHP() == 80);
	}

	@Test
	public void testGetMANA() throws IOException,InterruptedException{
		Scanner sc = new Scanner(System.in);
		Name ok = new Name();
		Player gram = new Mage(ok);
		assertTrue(gram.getMANA() == 150+10);
	}

	@Test
	public void testChgHP() throws IOException,InterruptedException{
		Scanner sc = new Scanner(System.in);
		Name ok = new Name();
		Player gram = new Mage(ok);
		gram.chgHP(1);
		assertTrue(gram.ex_hp == 1);
	}

	@Test
	public void testChgMAN() throws IOException,InterruptedException{
		Scanner sc = new Scanner(System.in);
		Name ok = new Name();
		Player gram = new Mage(ok);
		gram.chgMAN(1);
		assertTrue(gram.ex_mana == 11);
	}

	@Test
	public void testUseHPOT() throws IOException,InterruptedException{
		Scanner sc = new Scanner(System.in);
		Name ok = new Name();
		Player gram = new Mage(ok);
		gram.useHPOT(true, 0); //uzycie
		assertTrue(gram.h_pot == 3);
		
		gram.useHPOT(false, 1); //dodanie
		assertTrue(gram.h_pot == 4);
	}

	@Test
	public void testGetHPOT() throws IOException,InterruptedException{
		Scanner sc = new Scanner(System.in);
		Name ok = new Name();
		Player gram = new Mage(ok);
		assertTrue(gram.getHPOT() == 4);
	}

	@Test
	public void testUseMPOT() throws IOException,InterruptedException{
		Scanner sc = new Scanner(System.in);
		Name ok = new Name();
		Player gram = new Mage(ok);
		gram.useMPOT(true, 0); //uzycie
		assertTrue(gram.m_pot == 3);
		gram.useMPOT(false, 1); //dodanie
		assertTrue(gram.m_pot == 4);
	}

	@Test
	public void testGetMPOT() throws IOException,InterruptedException{
		Scanner sc = new Scanner(System.in);
		Name ok = new Name();
		Player gram = new Mage(ok);
		assertTrue(gram.getMPOT() == 4);
	}

	@Test
	public void testGetGOLD() throws IOException,InterruptedException{
		Scanner sc = new Scanner(System.in);
		Name ok = new Name();
		Player gram = new Mage(ok);
		assertTrue(gram.getGOLD() == 0);
	}

	@Test
	public void testChgGOLD() throws IOException,InterruptedException{
		Scanner sc = new Scanner(System.in);
		Name ok = new Name();
		Player gram = new Mage(ok);
		gram.chgGOLD(1);
		assertTrue(gram.gold == 1);
	}

	@Test
	public void testChgCRIT() throws IOException,InterruptedException{
		Scanner sc = new Scanner(System.in);
		Name ok = new Name();
		Player gram = new Mage(ok);
		gram.chgCRIT(1);
		assertTrue(gram.ex_crit == 1);
	}

	@Test
	public void testGetCRIT() throws IOException,InterruptedException{
		Scanner sc = new Scanner(System.in);
		Name ok = new Name();
		Player gram = new Mage(ok);
		assertTrue(gram.getCRIT() == 9);
	}

	@Test
	public void testGetDEF() throws IOException,InterruptedException{
		Scanner sc = new Scanner(System.in);
		Name ok = new Name();
		Player gram = new Mage(ok);
		assertTrue(gram.getDEF() == 9);
	}

	@Test
	public void testChgDEF() throws IOException,InterruptedException{
		Scanner sc = new Scanner(System.in);
		Name ok = new Name();
		Player gram = new Mage(ok);
		gram.chgDEF(1);
		assertTrue(gram.ex_def == 1);
	}

	@Test
	public void testGetDMG() throws IOException,InterruptedException{
		Scanner sc = new Scanner(System.in);
		Name ok = new Name();
		Player gram = new Mage(ok);
		assertTrue(gram.getDMG() == 6);
	}

	@Test
	public void testChgDMG() throws IOException,InterruptedException{
		Scanner sc = new Scanner(System.in);
		Name ok = new Name();
		Player gram = new Mage(ok);
		gram.chgDMG(1);
		assertTrue(gram.ex_dmg == 1);
	}

	@Test
	public void testGetMDMG() throws IOException,InterruptedException{
		Scanner sc = new Scanner(System.in);
		Name ok = new Name();
		Player gram = new Mage(ok);
		assertTrue(gram.getMDMG() == 15+2);
	}

	@Test
	public void testChgMDMG() throws IOException,InterruptedException{
		Scanner sc = new Scanner(System.in);
		Name ok = new Name();
		Player gram = new Mage(ok);
		gram.chgMDMG(1);
		assertTrue(gram.ex_mdmg == 3);
	}

	@Test
	public void testGetLVL() throws IOException,InterruptedException{
		Scanner sc = new Scanner(System.in);
		Name ok = new Name();
		Player gram = new Mage(ok);
		assertTrue(gram.getLVL() == 1);
	}

	@Test
	public void testGetEXP() throws IOException,InterruptedException{
		Scanner sc = new Scanner(System.in);
		Name ok = new Name();
		Player gram = new Mage(ok);
		assertTrue(gram.getEXP() == 0);
	}

	@Test
	public void testAddEXP() throws IOException,InterruptedException{
		Scanner sc = new Scanner(System.in);
		Name ok = new Name();
		Player gram = new Mage(ok);
		gram.addEXP(1);
		assertTrue(gram.exp == 1);
		
		gram.addEXP(500);
		assertTrue(gram.lvl == 2);
		assertTrue(gram.exp == 1);
	}

	@Test
	public void testGetEXPNXT() throws IOException,InterruptedException{
		Scanner sc = new Scanner(System.in);
		Name ok = new Name();
		Player gram = new Mage(ok);
		assertTrue(gram.getEXPNXT() == 500);
	}

	/*@Test
	public void testChgEXPNXT() throws IOException,InterruptedException{
		
	}*/


	/*@Test
	public void testGetNames() throws IOException,InterruptedException{
		
	}*/

	@Test
	public void testS_strenght() throws IOException,InterruptedException{
		Scanner sc = new Scanner(System.in);
		Name ok = new Name();
		Player gram = new Mage(ok);
		assertTrue(gram.strenght == 2);
	}

	@Test
	public void testS_dexterity() throws IOException,InterruptedException{
		Scanner sc = new Scanner(System.in);
		Name ok = new Name();
		Player gram = new Mage(ok);
		assertTrue(gram.dexterity == 3);
	}

	@Test
	public void testS_magic_skill() throws IOException,InterruptedException{
		Scanner sc = new Scanner(System.in);
		Name ok = new Name();
		Player gram = new Mage(ok);
		assertTrue(gram.magic_skill == 5);
	}

}
