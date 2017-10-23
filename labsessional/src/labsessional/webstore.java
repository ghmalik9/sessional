package labsessional;

public class webstore {

	public static void main(String[] args) {
		shoppinglist shoppinglist = new shoppinglist();

	      for(caculator cal = shoppinglist.getcaculator(); cal.hasweight();){
	         String name = (String)cal.weight();
	         System.out.println("Name : " + name);
	      } 	

	}

}
