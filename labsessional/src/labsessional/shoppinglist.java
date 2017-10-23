package labsessional;

public class shoppinglist implements shipmentcont {
	public String names[] = {"0.75" , "2kg" ,"3kg" , "4kg"}; 
	
	public caculator getcaculator() {
	      return new Namecaculator();
	   }
	private class Namecaculator implements caculator {

	      int cost;
	      public float hasweight() {
	          
	          if(cost < names.length){
	             return hasweight();
	          }
	          return hasweight();
	          
	          public Object weight() {
	              
	              if(cost<=5){
	                 return names[cost++];
	              }
	              return null;
	           }		   
}
	@Override
	public caculator getcalculator() {
		// TODO Auto-generated method stub
		return null;
	}
	}
