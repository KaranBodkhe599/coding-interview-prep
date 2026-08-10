import java.util.Arrays;

public class MoveZeros {

    public static void moveZeros(int[] nums) {
        int index = 0;

        // Place all non-zero elements at the beginning
        for (int num : nums) {
            if (num != 0) {
                nums[index] = num;
                index++;
            }
        }

        // Fill remaining positions with zeros
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        moveZeros(nums);

        System.out.println(Arrays.toString(nums));
    }
}