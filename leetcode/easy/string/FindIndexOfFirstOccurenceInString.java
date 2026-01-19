package leetcode.easy.string;
/*
* https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
* 28. Find the Index of the First Occurrence in a String
* */
public class FindIndexOfFirstOccurenceInString {
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }
}
