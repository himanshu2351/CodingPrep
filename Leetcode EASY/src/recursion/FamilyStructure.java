package recursion;

//Problem statement :
//	
//Aakash is a member of Ninja club. He has a weird family structure. Every male member (M) gives birth to a male child first and then a female child, whereas every female (F) member gives birth to a female child first and then to a male child. Aakash analyses this pattern and wants to know what will be the Kth child in his Nth generation. Can you help him?
//
//A sample generation tree is shown, where ‘M’ denotes the male member and ‘F’ denotes the female member. 
//
//
//Sample Input 1:
//2
//2 2 
//3 4  
//
//Sample Output 1:
//Female
//Male

public class FamilyStructure {
	
	public static String kthChildNthGeneration(int n, long k) {
		// Write your code here

		if(n==1 || k==1L){
			return "Male";
		}
		String x = kthChildNthGeneration(n-1, (k+1)/2);

		if(x.equals("Male")){
			if(k%2==0) return "Female";
			else return "Male";
		}
		else{
			if(k%2==0) return "Male";
			else return "Female";
		}
	}
}
