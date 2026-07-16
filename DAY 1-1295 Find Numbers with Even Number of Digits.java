import java.util.Arrays;

class Solution {
    public int findNumbers(int[] nums) {
        return (int) Arrays.stream(nums).filter(n -> ((int) Math.log10(n) & 1) == 1).count();
    }
}
