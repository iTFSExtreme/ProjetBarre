
public class Tri{
	
	private int[] tab;
	
	
	public Tri(int[] tab){
		this.tab = tab;
	}
	
	public void Trier() throws Exception{	
		int k = 0;
		 if(tab.length == 0) throw new Exception("Le tableau est vide");
		 else {
			 for (int i=0 ;i<=(tab.length-2);i++)
			for (int j=(tab.length-1);i < j;j--)
                 if (tab[j] < tab[j-1])
                      {
                	 	int x=tab[j-1];
                        tab[j-1]=tab[j];
                        tab[j]=x;
                      }
		 }
				
				
		}
	public void afficher() throws Exception{
		if(tab.length == 0) throw new Exception("Le tableau est vide");
		else{
		System.out.println("Affichage du tableau : \n");
		for(int i =0 ; i<tab.length; i++){
			System.out.print(tab[i] + " | ");
		}
		}
		
	}
}
