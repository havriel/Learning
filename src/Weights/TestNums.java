package Weights;

public class TestNums {
    public static void main(String[] args) {
        int[] nums = {2,6,9};
        int[] weights = {4,6,8};
        NumsAndWeights numsAndWeights = new NumsAndWeights(nums,weights);
        numsAndWeights.getRandom();
    }
}
