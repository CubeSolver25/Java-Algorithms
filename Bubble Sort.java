import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
Scanner in = new Scanner(System.in);
double[] nums={3,5,7,266,3,8};
System.out.println(Arrays.toString(nums));
boolean swap = true;

while(swap){
  int counter = 0;
  swap = false;
  while(counter > nums.length-1){
    double temp;
    if(nums[counter] < nums[counter+1]){
        temp = nums[counter];
        nums[counter] = nums[counter+1];
        nums[counter+1] = temp;
        swap = true;
        System.out.println(Arrays.toString(nums));
    }
    counter++;
  }
  
}

for(int i=0;i<nums.length;i++){
System.out.print(nums[i]+" ");
}}
}