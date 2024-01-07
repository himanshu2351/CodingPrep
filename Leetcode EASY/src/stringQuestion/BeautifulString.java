package stringQuestion;

//Problem statement :
//	
//Ninja has been given a binary string ‘STR’ containing either ‘0’ or ‘1’. A binary string is called beautiful if it contains alternating 0s and 1s.
//
//For Example:‘0101’, ‘1010’, ‘101’, ‘010’ are beautiful strings.
//
//He wants to make ‘STR’ beautiful by performing some operations on it. In one operation, Ninja can convert ‘0’ into ‘1’ or vice versa.
//
//Your task is to determine the minimum number of operations Ninja should perform to make ‘STR’ beautiful.
//
//For Example :
//Minimum operations to make ‘STR’ ‘0010’ beautiful is ‘1’. In one operation, we can convert ‘0’ at index ‘0’ (0-based indexing) to ‘1’. The ‘STR’ now becomes ‘1010’ which is a beautiful string. 
//
//Sample Input 1 :
//2
//0000
//1010
//
//Sample Output 1 :
//2
//0

public class BeautifulString {
	public static int makeBeautiful(String str) {
        int m = 0;
        int n = 0;
        char x = '0', y ='1';
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=x){
                m++;
            }
            x = x=='0' ?'1' : '0';

            if(str.charAt(i)!=y){
                n++;
            }
            y = y=='0' ?'1' : '0';
        }

        return Math.min(m,n);
    }
}
