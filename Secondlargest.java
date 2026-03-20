public class Secondlargest {
    public static void main (String[] args){
        int arr[]={1,2,3,4};
        int size = arr.length;

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for(int i=0;i<size;i++){
            if(arr[i]>largest){
                secondlargest = largest;
                largest = arr[i];
            }else if(arr[i]!=largest && arr[i]>secondlargest)
            {
                secondlargest = arr[i];

            }

            

            
        }
         System.out.println("the second largest number is:" + secondlargest);
    }
    
}
