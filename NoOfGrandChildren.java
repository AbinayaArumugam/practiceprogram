import java.util.Scanner;
public class NoOfGrandChildren{
static Scanner in= new Scanner(System.in);
public static int grandChildCount(String[][] str,String grandFather,int row) {
int count=0;
int k=0;
String[] child = new String[row];
for(int i=0;i<row;i++){
if(str[i][1].equals(grandFather)){
child[k]=str[i][0];
System.out.println("Child: "+ child[k]);
k++;
}
}
for(int i=0;i<row;i++){
for(int j=child.length-1;j>=0;j--){
if(str[i][1].equals(child[j])){
System.out.println("GrandChild: "+ str[i][0]);
count+=1;
}
}
}
//System.out.println("The count is: "+count);
return count;
}

public static void main(String[] args) {
System.out.println("Enter the number of row ");
int row = in.nextInt();
System.out.println("Enter the number of colunm");
int col= in.nextInt();
String a[][] = new String[row][col];
System.out.println("Enter the name of Child and Parent"); 
for(int i=0;i<row;i++) {
for(int j=0;j<col;j++){
a[i][j]= in.next();
}
}
System.out.println("-----------------"); 
System.out.println("Child " + "  Parent"); 
System.out.println("-----------------");   
for (int i=0;i<row;i++){
for(int j=0;j<col;j++) {
System.out.print(a[i][j]+"   ");
}
System.out.println();
}
System.out.println("Enter the Grandfather name: ");  
String grandFather=in.next();
System.out.println("The Count: "+ grandChildCount(a,grandFather,row));
}
}
