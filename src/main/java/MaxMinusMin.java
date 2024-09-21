
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public static void main(String[] args){
          
    }
    public int difference(List<Integer> nums){
        int maximum =   nums.get(0);
        int minimum = nums.get(0);
        int size = nums.size();
        for (int i=0;i<size;i++){
            if (maximum<nums.get(i)){
                maximum = nums.get(i);
            }
            if (minimum>nums.get(i)){
                minimum = nums.get(i);
            }
        }


        return maximum-minimum;
    }
}
