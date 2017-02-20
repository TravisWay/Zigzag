
import java.util.Arrays;

public class Solution {
	
	public static void main(String[] args){
		
		int intArr[]= {13,14,12,11,10,9,7,8,4,5,6,1,2,3};
		
		
	
        
	
		    
		    
		      //bubble sort for highest to lowest  
		       for(int j=0;j<intArr.length; j++){ 
		      
		      boolean flag= true;
		       
		      int temp=0;
		           
		           while(flag)
		           {
		            
		           
		        	flag = false;
		            
		        	for(int k =j; k<intArr.length-1; k++)
		            
		        	{
		                if(intArr[k]<intArr[k+1])
		                	
		                {
		                        
		        
		                temp = intArr[k];
		                   
		                intArr[k] =intArr[k+1];
		                
		                intArr[k+1]=temp;
		                
		                flag = true;
		                }
		            }   
		            
		
		           
		        }
		           
		       }
		       
		       
		       
		       
		       
			System.out.println(Arrays.toString(intArr));
		    
		        
			
			
			int j = intArr.length-1;
			
			int intArrtwo[]= new int[j+1];
			
			intArrtwo[0] = intArr[0];
			
			for(int i =1; i <= intArr.length-1; i++){
				
				if (i%2 != 0){
				
				intArrtwo[i] = intArr[j];
				
				j--;
					
				}
				
				else{
					
					
					intArrtwo[i] = intArr[i/2];
					
					
				}	
				System.out.println(Arrays.toString(intArr));
				
				System.out.println(Arrays.toString(intArrtwo));
				
			}
			
	}

}     
