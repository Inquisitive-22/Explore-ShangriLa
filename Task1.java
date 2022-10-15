package assignment1;

public class Task1 {

	public static void main(String[] args) {
	
		Task1 obj1=new Task1();
		 obj1.swap(20,30);
		 
		 }
		 
		 void swap(int p,int q)
		 { 
		  System.out.println("Before Swapping , the values are :"+p+ " "+q);
		  p=p+q;
		  q=p-q;
		  p=p-q;
		  
		  System.out.println("After Swapping , the values are :"+p+ " "+q);

	}

}
