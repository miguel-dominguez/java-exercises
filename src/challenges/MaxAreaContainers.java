package challenges;

public class MaxAreaContainers {

  public static void main(String[] args) {
    int[] nums = {7, 1, 2 ,3, 9};
    //System.out.println(maxArea(nums));
    System.out.println(max(nums));
  }

  private static int max(int[] nums) {
    int maxArea = 0;
    int i = 0;
    int j = nums.length - 1;
    while (i < j) {
      int minHeight = Math.min(nums[i], nums[j]);
      int width = j - i;
      int area = minHeight * width;
      maxArea = Math.max(area, maxArea);
      if (nums[i] <= nums[j]) {
        i++;
      } else {
        j--;
      }
    }
    return maxArea;
  }

  // brute force
  private static int maxArea(int[] nums) {
    int maxArea = 0;
    int a = 0;
    int b = 0;
    int newArea = 0;
    if (nums.length <= 1) return maxArea;
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = 1; j < nums.length; j++) {
        if (i != j) {
          a = nums[i];
          b = nums[j];
          newArea = Math.min(a,b) * (j - i);
          maxArea = Math.max(maxArea, newArea);
        }
      }
    }
    return maxArea;
  }

}
