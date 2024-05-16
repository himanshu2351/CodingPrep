package arrayQuestion;

public class GiveBalance {
	
	public static void main(String[] args) {
	    String[] groceryList = { "apple 4 3", "banana 2 5", "milk 3 2" };
	    System.out.println(total(groceryList));  // Example test case
	}
	
	public static String total( String[] groceryList ) {
		//Insert your code here
		
		// Creating array to store price of each items
		int[] price = new int[groceryList.length];

		//Variable to store the total price
		int sum = 0;

		//Iterating over grocery list 
		for(int i=0;i<groceryList.length;i++){
			String item = groceryList[i];
			int j=0;
			String p=null,a=null;

			//Loop to capture rate and quantity
			while(j<item.length()){
				if(item.charAt(j)<48 || item.charAt(j)>57){
					j++;
					continue;
				}
				String x = "";
				//Checking if value is a number or not and capturing it
				while(item.charAt(j)>47 && item.charAt(j)<58){
					x+=item.charAt(j);
					j++;
				}
				if(p==null){
					p=x;
				}
				else{
					a=x;
				}
			}
			if(p!=null && a!=null){
				int tot =Integer.valueOf(p) * Integer.valueOf(a);
				price[i] = tot;
				sum+=tot; 
			}
			else{
				price[i] = -1;
			}
		}
		//Creating StringBuilder for output
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<price.length;i++){
			if(price[i]<0){
				continue;
			}
			if(i>0) sb.append("+");
			sb.append(price[i]);
		}
		sb.append("=");
		sb.append(sum);

		//Returning desired output
		return sb.toString();
	}
}
