package assignment1;

public class Task9 {

	public static void main(String[] args) {
		
		int num[]= {12,34,66,85,900};
		Task9 obj9=new Task9();
		obj9.Search(num);
		
				

	}
	
	void Search(int nums[]) {
		
		int i=0;
		while(i<nums.length) {
			
			if(nums[i]==85)
				break;
			
			i++;
		}
		System.out.println("The number 85 found in index "+i);
	}

}
