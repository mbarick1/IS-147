public class SwappingValues
{
      public static void main(String[] args)
      {
            int n1 = 1;
            int n2 = 2;
            
            

            System.out.println( n1 + " and " + n2);
            
            swap(n1, n2);
       }
     
      public static void swap(int n1, int n2)
      {
        int temp = n1;
        n1 = n2;
        n2 = temp;
        
        System.out.println(n1 + " and " + n2 );      
            
          
      }
    
}