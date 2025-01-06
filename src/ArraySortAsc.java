import java.util.Scanner;

public class ArraySortAsc {
    public static void main(String[] args) {
        //creating object of scanner class for user input
        Scanner in = new Scanner(System.in);

        //declare array of size 10
        int nums[]=new int[10];

        //taking users input
        for(int i=0;i<10;i++){
            System.out.println("Enter "+(i+1)+" number:");
            nums[i]=in.nextInt();
        }

        //sort
        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }

        }
        //display
        for(int i=0;i<10;i++){
            System.out.println(nums[i]);
        }

    }
}
