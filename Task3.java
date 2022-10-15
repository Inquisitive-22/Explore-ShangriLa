package assignment1;

public class Task3 {

	public static void main(String[] args) {

		double Number[]={10,90.78,111,8989,7876};
		Task3 obj3=new Task3();

		obj3.Avg(Number);

		}

		void Avg( double Digit[])
		{
		double avg=0,sum=0;
		int len= Digit.length;

		for(int i=0;i<len;i++)
		{
		sum=sum+Digit[i];
		avg=sum/len;
		}
		System.out.println("Sum of the numbers in array="+sum);
		System.out.println("Average of thhe numbers in array="+avg);


	}

}
