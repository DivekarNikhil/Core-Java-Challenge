public class MinimumArrayS{

    public static void main(String[] args) {

        int arr[]={12,45,30,26,51};
        int max=arr[0];
        for(int i=0;i<=arr.length-1;i++)
        {
            if (max < arr[i])
            {
                //int temp=max;
                max=arr[i];

            }
            }
        System.out.println(max);
        }


    }

