
import static org.junit.Assert.*;
import static org.junit.Assert.fail;

import org.junit.Test;


public class TriTest {
	int tab[] = {};
 	int res[]={561,223,3,124,5};
 	Tri t = new Tri(tab);
 	Tri t2 = new Tri(res);
 	
	@Test(expected = Exception.class)
	public void PeutTrierLeTableau() throws Exception{
		t.Trier();
	}
	
	@Test
	public void testTrier() throws Exception{
		t2.Trier();
	}
	 /*	
	 public void PeutTrierLeTableau() throws Exception{
			
			 t.Trier();
		 	if(res == t.getTab()){
			 System.out.println("Test Tri réussi");
		 	
		 }	
		 	else
		 		System.out.println("Tri impossible");
	 }*/
	
	@Test
	public void testTri_Afficher() throws Exception
	{
			t2.afficher();
			System.out.println();
			t2.Trier();
			t2.afficher();
	}
	
	@Test(expected = Exception.class)
	public void test2Afficher() throws Exception
	{
		t.afficher();
	}

}
