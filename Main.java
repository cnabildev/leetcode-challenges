class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String cat = "cat";
        String tac = "tac";

        Boolean result = solution.isAnagram(tac, cat);
        System.out.println(result);
    }

    public boolean isAnagram(String s, String t) {

        // if strings has not the same length return false
        if (s.length() != t.length()) {
            return false;
        }
        // create an array if 26 characters and fill it with false
        int[] map = new int[26];

        // loop through the strings
        for (int i = 0; i < s.length(); i++) {
            // get the char from the string
            int s_char = s.charAt(i) - 'a';
            int t_char = t.charAt(i) - 'a';
            map[s_char]++;
            map[t_char]--;
        }

        // loop through the map
        for (int i = 0; i < map.length; i++) {
            // if the map is not 0 return false
            if (map[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
