package leetcode.easy.string;

/*
* https://leetcode.com/problems/valid-anagram/description/
* 242. Given two strings s and t, return true if t is an anagram of s, and false otherwise.
* */
public class ValidAnagram242 {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int freq[] = new int[26];
        for(char c: s.toCharArray()) {
            freq[c-'a']++;
        }
        for(char c: t.toCharArray()) {
            if (freq[c-'a'] == 0) return false;
            freq[c-'a']--;
        }
        return true;

    }
    public static void main(String[] args) {
        System.out.println(isAnagram("rat", "tar"));
    }
}
