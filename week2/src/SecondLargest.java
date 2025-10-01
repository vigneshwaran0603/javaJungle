public class SecondLargest {
    public static void main(String[] args) {
        int [] arr={14,28,19,44,45,12};
        int l1=0;
        int l2 = 0;

        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]>l1 )
            {
                l1=arr[i];
            }


        }
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]<l1&& arr[j]>l2)
            {
                l2=arr[j];
            }
        }

        System.out.println("the second largest element is" + l2);

    }
}
