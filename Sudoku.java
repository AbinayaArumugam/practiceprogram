import java.util.*;
public class Sudoku{

public static int rowCheck(int[][] a){
 int[] checkArr = new int[10];
 for(int i=0;i<10;i++) {
 checkArr[i]=0;
 }
 for(int i=0;i<9;i++){
 for(int j=0;j<9;j++) {
 checkArr[a[i][j]]++;
 }
 for(int k=1;k<=9;k++){
 if(checkArr[k]!=1){
 System.out.println("The Value " + k +" came "+checkArr[k] + " times in " + i+1 +" row");
 return 0;
 }
 }
 for(int k=0;k<=9;k++) {
 checkArr[k]=0;
 }
 }
 return 1;
 }
 
 public static int colCheck(int[][] a){
 int[] checkArr = new int[10];
 for(int i=0;i<10;i++) {
 checkArr[i]=0;
 }
 for(int i=0;i<9;i++){
 for(int j=0;j<9;j++) {
 checkArr[a[j][i]]++;
 }
 for(int k=1;k<=9;k++){
 if(checkArr[k]!=1){
 System.out.println("The Value of " + k +" came "+checkArr[k] + " times in "+ i+1 +"  column");
 return 0;
 }
 }
 for(int k=0;k<=9;k++) {
 checkArr[k]=0;
 }
 }
 return 1;
 }
 
 public static int cubeCheck(int[][] a) {
int[] checkArr = new int[10];
int count=0;
 for(int i=0;i<10;i++) {
 checkArr[i]=0;
 }
 for (int m=0;m<9;m+=3){
 for(int b=0;b<9;b+=3) {
  for(int i=m;i<m+3;i++) {
  for(int j=b;j<b+3;j++){
  checkArr[a[j][i]]++;
 }
 }
 count++;
 for(int k=1;k<=9;k++){
 if(checkArr[k]!=1){
 System.out.println("The Value of " + k +" came "+checkArr[k] + " times in cube");
 return 0;
 }
 }
 for(int k=0;k<=9;k++) {
 checkArr[k]=0;
 }
 }
 }
 return 1;
 }
 
 public static void main(String[] args) {
 //int[][] array =  new int[9][9];
 int[][] array={ {1,2,3,4,5,6,7,8,9},
                 {4,5,6,7,8,9,1,2,3},
                 {7,8,9,1,2,3,4,5,6},
                 {2,3,4,5,6,7,8,9,1},
                 {5,6,7,8,9,1,2,3,4},
                 {8,9,1,2,3,4,5,6,7},
                 {3,4,5,6,7,8,9,1,2},
                 {6,7,8,9,1,2,3,4,5},
                 {9,1,2,3,4,5,6,7,8}};
  if(rowCheck(array)==1 && colCheck(array)==1 && cubeCheck(array)==1) {
  System.out.println("Success");
  } else {
  System.out.println("Failed");
  }
  }
  }
             
              
            
 
 
