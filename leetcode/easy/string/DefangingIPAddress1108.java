package leetcode.easy.string;
/*
* https://leetcode.com/problems/defanging-an-ip-address/description/
*
* */
public class DefangingIPAddress1108 {
    public static String defangIPaddr(String address) {
        // return address.replace(".", "[.]");
        StringBuilder sb = new StringBuilder();
        for(Character ch: address.toCharArray()) {
            if (ch != '.') {
                sb.append(ch);
            }
            else {
                sb.append("[").append(ch).append("]");
                continue;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
}
