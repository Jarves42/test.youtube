package dp;

public class FloorAndCeilingSortedArray {
	
	public int floor(int input[], int x){
        int low = 0;
        int high = input.length-1;
        while(low <= high){
            int middle = (low + high)/2;
            if(input[middle] == x || (input[middle] < x && (middle == input.length-1 || input[middle+1] > x))){
                return middle;
            }else if(input[middle] < x){
                low = middle+1;
            }else{
                high = middle-1;
            }
        }
        return -1;
    }

    public int ceiling(int input[], int x){
        int low = 0;
        int high = input.length-1;
        while(low <= high){
            int middle = (low + high)/2;
            if(input[middle] == x || (input[middle] > x && (middle == 0 || input[middle-1] < x))){
                return middle;
            }else if(input[middle] < x){
                low = middle+1;
            }else{
                high = middle-1;
            }
        }
        return -1;
    }
    
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int middle = (low + high)/2;
            if ((middle == 0 || nums[middle] < nums[middle - 1]) ) {
                return nums[middle];
            }
            else if (nums[middle] > nums[high]) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return nums[low];
    }
    
    public static void main(String args[]){
        int input[] = {11,12,15,21,22,28,6};
        FloorAndCeilingSortedArray foc = new FloorAndCeilingSortedArray();
        System.out.println(foc.findMin(input));
       // System.out.println(foc.ceiling(input, 2));
    }

}
