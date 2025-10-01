

public class CountNumberArray {
    public static void main(String[] args) {

        int [] arr={1,2,3,4,-5,-6,-7,0,0};

      int val;
      int count1=0;
      int count2=0;
      int count3=0;
        for(int i=0;i<arr.length;i++)
        {
            val=arr[i];
            if(val<0)
            {
                count1++;
            }
            else if(val>0)
            {
                count2++;
            }
            else {
                count3++;
            }
        }
        System.out.println("the count of positive values is: "+count2);
        System.out.println("the count of negative values is:"+count1);
        System.out.println("the count of zero is:"+count3);
    }
}
