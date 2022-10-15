package assignment1;

public class Task2 {

	public static void main(String[] args) {
	
		double Number[]={10,90.78,111,8989,7876};
		Task2 obj2=new Task2();

		obj2.Sum(Number);

		}

		void Sum( double Digits[])
		{
		double sum=0;
		int len= Digits.length;

		for(int i=0;i<len;i++)
		{
		sum=sum+Digits[i];
		}
		System.out.println("Sum of the numbers in array="+sum);

}
}

