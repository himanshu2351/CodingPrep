/**
 * 345. Reverse Vowels of a String
 * Given a string s, reverse only all the vowels in the string and return it.
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 *
 * Example 1:
 * Input: s = "IceCreAm"
 * Output: "AceCreIm"
 *
 * Example 2:
 * Input: s = "leetcode"
 * Output: "leotcede"
 */

class Solution {
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>(Arrays.asList('a','A','e','E','i','I','o','O','u','U'));

        char[] ch = s.toCharArray();
        int low = 0, high = ch.length-1;
        while(low<high){
            if(set.contains(ch[low]) && set.contains(ch[high])){
                char temp = ch[low];
                ch[low] = ch[high];
                ch[high] = temp;
                low++;
                high--;
            }
            else if(set.contains(ch[low])){
                high--;
            }

            else if(set.contains(ch[high])){
                low++;
            }
            else{
                high--;
                low++;
            }
        }

        return new String(ch);
    }
}