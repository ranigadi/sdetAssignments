public class OddandEvenArray
{  
 public static void main(String args[]){  
	 
    int a[]={10,21,55,64,26,77};
    
System.out.println("Odd Numbers:"); 

for(int i=0;i<a.length;i++)
  {  
    if(a[i]%2!=0){  
    System.out.println(a[i]);  
  }  
}  
System.out.println("Even Numbers:");

for(int i=0;i<a.length;i++)
    {  
      if(a[i]%2==0){  
      System.out.println(a[i]);  
    }  
  }  
 }
}  