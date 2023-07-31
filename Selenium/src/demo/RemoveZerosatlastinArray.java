package demo;

public class RemoveZerosatlastinArray {
	
	
	
	public static void main(String[] args) {
        int[] arr = {1, 2,0,7,0,5,3,7};
 
        
        
        int count =0;;
       
        for(int i=0;i<arr.length;i++) {
        	
        	
        	if(arr[i]!=0) {
        		
        		arr[count] = arr[i];
        		//System.out.println(i+""+arr[i]+""+count);
        		count++;
        		
        	}
        }
        
        while(count<arr.length) {
        	
        	arr[count]=0;
        	count++;
        }
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]); 
        
        
      //  for(int i=0;i<arr.length;i++) {
        	
        		
        }

}
