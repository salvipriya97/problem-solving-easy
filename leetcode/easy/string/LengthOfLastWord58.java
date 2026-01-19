package leetcode.easy.string;
/*
* https://leetcode.com/problems/length-of-last-word/description/
* 58. Length of Last Word
* */
public class LengthOfLastWord58 {
    public static int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return arr[arr.length-1].length();
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
}
