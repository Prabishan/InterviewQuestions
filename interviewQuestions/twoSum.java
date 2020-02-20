public class twoSum {
    public static int[] twoSum(int[] array, int targetNum) {
        
        int diff;
        for(int i = 0 ; i< array.length ; i++)
        {
            diff = targetNum - array[i] ; 
            for(int j = i+1 ; j< array.length ; j++)
            {
                if(diff == array[j])
                {
                    return new int[] {array[i], array[j]};
                }
                    
            }
        }
        return new int[] {};
    }
  public static void main( String[] args )       
  {
      int[] array = new int[2];
      int[] arr = {-1,-2,-3,-4,-5};
      array = twoSum(arr, -8 );
      System.out.println(array[0] + " " + array[1]);
  }
}
