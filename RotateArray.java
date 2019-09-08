public class RotateArray {
void leftRotateArray(int arr[],int d,int n){
   for(int i=0;i<d;i++)
       leftRotateArrayByOne(arr,n);
}

void leftRotateArrayByOne(int arr[],int n){
     int i,temp;
     temp = arr[0];
     for (i = 0; i < n-1; i++)
         arr[i] = arr[i+1];
     arr[i] = temp;
}

void printArray(int arr[],int n){
     for(int i = 0;i < n; i++)
         System.out.println(arr[i] + " ");
}

public static void main(String[]args){
    RotateArray rotate = new RotateArray();
    int arr[] = {1,2,3,4,5,6,7,8};
    rotate.leftRotateArray(arr,2,8);
    rotate.printArray(arr,8);
}
}
