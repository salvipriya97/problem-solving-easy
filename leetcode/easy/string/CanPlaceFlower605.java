package leetcode.easy.string;
/*
* https://leetcode.com/problems/can-place-flowers/description/
* 605. Can Place Flowers
* */
public class CanPlaceFlower605 {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed == null || flowerbed.length == 0) return false;

        int possible = 0;
        for(int i = 0; i < flowerbed.length;i++) {
            int left = i == 0 ? 0 : flowerbed[i-1];
            int right = i == flowerbed.length-1 ? 0 : flowerbed[i+1];
            if (flowerbed[i] == 0
                    && left == 0
                    && right == 0)
            {
                possible++;
                flowerbed[i] = 1;
            }
        }
        return n <= possible;

    }

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
    }
}
