/**
 * 3481. Apply Substitutions
 * You are given a replacements mapping and a text string that may contain placeholders formatted as %var%, where each var corresponds to a key in the replacements mapping. Each replacement value may itself contain one or more such placeholders. Each placeholder is replaced by the value associated with its corresponding replacement key.
 * Return the fully substituted text string which does not contain any placeholders.
 *
 * Example 1:
 * Input: replacements = [["A","abc"],["B","def"]], text = "%A%_%B%"
 * Output: "abc_def"
 *
 * Example 2:
 * Input: replacements = [["A","bce"],["B","ace"],["C","abc%B%"]], text = "%A%_%B%_%C%"
 * Output: "bce_ace_abcace"
 */

class Solution {
    public String applySubstitutions(List<List<String>> replacements, String text) {
        HashMap<String, String> hm = new HashMap<>();
        HashMap<String, Integer> inOrder = new HashMap<>();
        HashMap<String, Set<String>> adj = new HashMap<>();
        boolean[] vis = new boolean[26];

        for(List<String> al : replacements){
            String val = al.get(1);
            hm.put(al.get(0),val);
            Set<String> strSet = new HashSet<>();
            inOrder.put(al.get(0),0);
            for(int i=2;i<val.length();i++){
                if(val.charAt(i)=='%' && val.charAt(i-2)=='%' && Character.isUpperCase(val.charAt(i-1))){
                    if(!adj.containsKey(""+val.charAt(i-1))){
                        adj.put(""+val.charAt(i-1), new HashSet<String>());
                    }
                    adj.get(""+val.charAt(i-1)).add(al.get(0));
                    strSet.add(""+val.charAt(i-1));
                }
            }
            inOrder.put(al.get(0), strSet.size());
        }

        ArrayDeque<String> ad = new ArrayDeque<>();
        for(String key : inOrder.keySet()){
            if(inOrder.get(key)==0) ad.addLast(key);
        }

        while(!ad.isEmpty()){
            String key = ad.removeFirst();
            if(vis[key.charAt(0)-'A']) continue;
            vis[key.charAt(0)-'A'] = true;
            if(adj.get(key)==null || adj.get(key).isEmpty()) continue;
            for(String x : adj.get(key)){
                hm.put(x, hm.get(x).replace("%"+key+"%",hm.get(key)));
                int order = inOrder.get(x);
                if(order <= 1) ad.addLast(x);
                inOrder.put(x, order-1);
            }
        }

        for(String x : hm.keySet()){
            text = text.replace("%"+x+"%", hm.get(x));
        }

        return text;
    }
}