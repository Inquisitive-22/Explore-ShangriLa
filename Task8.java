package assignment1;

public class Task8 {

	public static void main(String[] args) {
		
		int marks[]= {78,12,89,55,35};
		Task8 obj8=new Task8();
		obj8.Score(marks);

	}

	void Score(int scores[]) {
	
		for(int i=0;i<scores.length;i++) {
			if(scores[i]>80)
			{
				System.out.println(" "+scores[i]);
			}
		}
		
	}
}
