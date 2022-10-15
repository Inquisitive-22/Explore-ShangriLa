package assignment1;

public class Task5 {

		public static void main(String[] args) {
			
			Task5 obj5=new Task5();
			obj5.Odd();
			
		}
		
		void Odd() {
			
			
			for(int i=1; i<=50;i++)
			{
				if(i%2!=0)
				{
					System.out.print(" "+i);
				}
			}
		}

}
