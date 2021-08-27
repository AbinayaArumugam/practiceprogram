import java.util.Scanner;
import java.lang.*;
public class FindWeight {

public static void swap(int[] weiArr,int[] arr,int i,int j){
int temp= weiArr[i];
int temp1=arr[i];
weiArr[i]=weiArr[j];
arr[i]= arr[j];
weiArr[j]=temp;
arr[j]=temp1;
}

 public static void main (String[] args) {
 Scanner in = new Scanner(System.in);
 System.out.println("Enter the length of array");
 int length = in.nextInt();
 System.out.println("Enter the Array Elements");
  int[] array = new int[length];
  for(int i=0;i<length;i++){
   array[i]=in.nextInt();
   }
   
   int[] weightArray = new int[length];
   for(int i=0;i<length;i++) {
   weightArray[i]=0;
   int square = (int) Math.sqrt(array[i]);
   if((square*square)==array[i]){
   weightArray[i]=weightArray[i]+5;
   }
   if(array[i]%4==0&&array[i]%6==0) {
   weightArray[i]=weightArray[i]+4;
   }
   if(array[i]%2==0) {
   weightArray[i]=weightArray[i]+3;
   }
   }
   for(int i=0;i<length;i++){
   for(int j=0;j<length-1-i;j++) {
   if(weightArray[j]>=weightArray[j+1]) {
   swap(weightArray,array,j,j+1);
   }
   }
   }
   
   for(int i=0;i<length;i++) {
   System.out.println("<"+array[i] +","+weightArray[i] +">");
   }
   }
   }
