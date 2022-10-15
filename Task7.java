package assignment1;

public class Task7 {

	public static void main(String[] args) {
		
		Task7 obj7=new Task7();
		obj7.Pattern();
		
	}
	
	void Pattern() {
		
		for(int i=1; i<=5;i++)
		{
			for(int j=1;j<=i;j++) {
				
				System.out.print("*"+" ");	
			}
			
			System.out.println();
				
			}
		}

}
