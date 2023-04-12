package Weights;

public class NumsAndWeights {
    private int[] nums;
    private int[] weights;
    private int[] ranges;
    private int sum;

    public NumsAndWeights(int[] nums, int[] weights) {
        this.nums = nums;
        this.weights = weights;
        ranges = new int[nums.length];

        sum = 0;
        for (int i:weights){
            sum+=i;
        }

        int lastSum = 0;
        for (int i=0;i< ranges.length;i++){
            ranges[i] = lastSum;
            lastSum+=weights[i];
        }
    }
    public int getRandom() {
        int random = (int) (Math.random() * (sum - 1));

        int ourRangeIndex = 0;
        for (int i = 0; i < ranges.length; i++) {
            if (ranges[i] > random) {
                break;
            }
            ourRangeIndex = i;
        }

        return nums[ourRangeIndex];
    }

}
