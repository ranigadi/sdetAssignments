public class DuplicatesArray {  
    public static void main(String[] args) 
    {      
          
         
        int [] arr = new int [] {60, 70, 80, 60, 90, 75, 85, 85,5,5};
          
        System.out.println("Duplicate elements in given array: ");  
      
        for(int i = 0; i < arr.length; i++) 
        {  
            for(int j = i + 1; j < arr.length; j++) 
            {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}  