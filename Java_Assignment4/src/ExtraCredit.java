import java.util.Arrays;

public class ExtraCredit {

	public static void missingNumber(int[] nums){
		if(nums.length==0){	//Checking if the array is empty
			System.out.println("The array is empty");
		}
		else if(nums.length>1){ //Checking if there is more than one element in the array
			Arrays.sort(nums);	//Sort the array first
			for(int i=0;i<nums.length-1;i++){
				if(nums[i]+1!=nums[i+1]){	//Check if the numbers are consecutive
					System.out.println("The missing number is "+(nums[i+1]-1));
				}
			}
		}
		else  //If there is only one element
			System.out.println("It has only one element");
	}

	public static void moveZeroes(int[] nums){	
		int count=0;
		int len = nums.length;
		if(nums.length==0){   //Checking if the array is empty
			System.out.println("This is an empty array!");
		}
		else {
			for(int i=0;i<len;i++){
				if(nums[i]!=0){  //Finding the non-zero elements in the array
					nums[count]=nums[i];
					count++;
				}
			}

			while(count<len){  //To add the zeroes in the end
				nums[count]=0;		
				count++;
			}		
			System.out.println("The array after moving zeroes to the end is " +Arrays.toString(nums)); 
		}

	}

	public static void thirdMax(int[] nums){

		if(nums.length==0){   //Checking if the array is empty
			System.out.println("The array is empty!");
		}

		if(nums.length!=0 && nums.length<=2){  //If the array contains only 1 or 2 elements
			System.out.println("The maximum distinct number in the array is " +nums[nums.length-1]);
		}
		else if (nums.length!=0 && nums.length>2){   //If the array contains more than 2 elements
			int count=0;
			for(int i=0;i<nums.length;i++){
				if(nums[i]!=nums[i+1]){
					count++;
					if(count==2){   //counter to keep track of the third element
						System.out.println("The third maximum distinct number in the array is " +nums[i+1]);
						break;
					}
				}
			}
		}

	}

	public static void main(String[] args) {

		int[] numberArray = new int[]{10,8,6,7};
		missingNumber(numberArray);

		int[] zeroArray = new int[]{0,1,0,100,0,0,200,3,4,0,5};
		moveZeroes(zeroArray);

		int[] thirdMaxArray = new int[]{1,2,2,2,10,20,30,50};
		thirdMax(thirdMaxArray);
	}
}
