/**
 * 165. Compare Version Numbers
 * Given two version strings, version1 and version2, compare them. A version string consists of revisions separated by dots '.'. The value of the revision is its integer conversion ignoring leading zeros.
 * To compare version strings, compare their revision values in left-to-right order. If one of the version strings has fewer revisions, treat the missing revision values as 0.
 * Return the following:
 * If version1 < version2, return -1.
 * If version1 > version2, return 1.
 * Otherwise, return 0.
 *
 * Example 1:
 * nput: version1 = "1.2", version2 = "1.10"
 * Output: -1
 *
 * Example 2:
 * Input: version1 = "1.01", version2 = "1.001"
 * Output: 0
 *
 * Example 3:
 * Input: version1 = "1.0", version2 = "1.0.0.0"
 * Output: 0
 */

class Solution {
    public int compareVersion(String version1, String version2) {

        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int[] ver1 = new int[v1.length];
        int[] ver2 = new int[v2.length];

        int k=0;

        for(String x : v1){
            ver1[k++] = Integer.parseInt(x);
        }

        k=0;
        for(String x : v2){
            ver2[k++] = Integer.parseInt(x);
        }

        int i=0, j=0;
        while(i<ver1.length || j<ver2.length){
            int x = i<ver1.length ? ver1[i] : 0;
            int y = j<ver2.length ? ver2[j] : 0;

            if(x==y){
                i++;
                j++;
            }
            else if(x<y){
                return -1;
            }
            else{
                return 1;
            }
        }

        return 0;
    }
}