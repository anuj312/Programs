package demo;

public class programs {

	public static void main(String[] args) {
		
		
		String str = "anuj kumar rana".replaceAll(" ", "");
		
		char [] ch = str.toCharArray();
		int count =0;
		
		
		for(int i=0;i<ch.length;i++) {
			count =1;
			for(int j=i+1;j<ch.length;j++) {
				
				
				if(ch[i] == ch[j]) {
					
					count ++;
					ch[j] = ' ';
				}
				
			}
			
			if(count == 1 && ch[i]!=' ' ) {
				System.out.println(ch[i]+" "+count);
				//break;
			}
			
			
			
		}
		

	}

}
