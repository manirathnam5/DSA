class LinearSearch{

  
  
  
    public static int search(int[] arr , int x  ){
	
	
	     for(int i = 0; i< arr.length ;i++){
			 if( arr[i] == x )
				 return i;
		 }
		 
		 return -1 ;
	
	}
	
	
	
	
	//Driver code 
	
	public static void main(String[] arg){
	
	  int[] arr = {2, 3, 4, 10 , 60 , 40};
	  
	  int x = 30;
	  
	  int result = search(arr , x );
	  
	  if( result == -1){
	       System.out.println("Element is not found ");
        }
     else{
          System.out.println("Element is found at index " + result );
        }

     }
	 
}


	 
	  
	  
	  
	  
	
	