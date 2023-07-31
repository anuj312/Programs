package demo;

public class characters2 {

	public static void main(String[] args) {
	
		
		String str= "JAVA";
		
		
		char[] ch = str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			
			System.out.print(str.charAt(i));
			
			if(i!=str.length()-1) {
				
				System.out.print(",");
			}
			
		}
		
	}

}
