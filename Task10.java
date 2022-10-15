package assignment1;

public class Task10 {

	public static void main(String[] args) {
		
		String names[]= {"Java","JavaScript","Selenium","Python","Mukesh"};
		Task10 obj10=new Task10();
		obj10.Search1(names);
		
				

	}
	
	void Search1(String terms[]) {
		
		int i=0;
		while(i<terms.length) {
			
			if(terms[i].equals("Selenium")==true)
				break;
			
			i++;
		}
		System.out.println("The term Selenium found in index "+i);
	}

	}


