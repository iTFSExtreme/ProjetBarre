
import org.junit.Test;

public class ArrayTest{
	int tab[] = {};
	int res[]={561,223,3,124,5};
	Arrays t = new Arrays(res, 561);
	Arrays t2 = new Arrays(tab,561);
	@Test
	public void TestDicho() throws Exception{
		int resultat = t.dicho();
		t.setValue(223);
		resultat = t.dicho();
		t.setValue(3);
		resultat = t.dicho();
		t.setValue(124);
		resultat = t.dicho();
		t.setValue(5);
		resultat = t.dicho();

		
	}
	
	@Test(expected = Exception.class)
	public void PeutTestDicho() throws Exception{
		t2.dicho();
	}
	
	@Test
	public void TestValue() throws Exception{
		try{
			Integer i = t.getValue();
			if (!(i instanceof Integer))
			    System.out.println("Erreur"); 
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		}
}
