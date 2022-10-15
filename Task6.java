package assignment1;

public class Task6 {

	public static void main(String[] args) {
	
		Task6 obj6=new Task6();
		obj6.Prime();
		
	}
	
	void Prime() {
		
		
		
		for(int i=1; i<=1000;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++) {
				
				if(i%j==0) {
				count++;
				}
			}
				
				if(count==2) {
					System.out.print(" "+i);
				}
			}
		}

	

}
