

public class Arrays {

	private int[] tab;
	private int value;


	public Arrays(int[] tab, int value){
		this.tab = tab;
		this.value = value;
	}
	
	public void setValue(int v){
		 this.value = v;
	}
	
	 public int dicho() throws Exception
     {
		 if(tab.length == 0) throw new Exception("Le tableau est vide");
		 else{
             int debut=0;
             int fin=tab.length-1;
             int milieu;
             int  Rang = -1; 
             do{
                milieu =  (debut + fin) / 2; 
                if ( value == tab[milieu])  Rang =  milieu ;
                else if  ( tab[milieu] < value )  debut =  milieu + 1 ;
                else{
                	fin =  milieu-1 ;
                
                }
                
          
             }
             while ( ( value != tab[milieu] ) & ( debut <= fin ) );  
           if(Rang ==-1){
        	   System.out.println("La valeur n'est pas dans le tableau");
           }
             
             	return Rang;
		 }
     }

	public int getValue() {
		return value;
	}
	 
	 
	 
}
