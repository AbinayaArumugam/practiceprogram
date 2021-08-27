import java.util.*;
public class TwoDimensionalArray {
public static void twoDimension(String str) {
int len=str.length();
int k=0,i,j;
int row=(int) Math.floor(Math.sqrt(len));
 int col=(int) Math.ceil(Math.sqrt(len));
if (row*col<len) {
row=col;
}
char s[][] = new char [row][col];
for(i=0;i<row;i++) {
for(j=0;j<col;j++){
s[i][j]=str.charAt(k);
k++;
if(k==(len)) {
s[i][j+1]= ' ';
break;
}
}
}
for (i=0;i<row;i++){
for(j=0;j<col;j++) {
System.out.print(s[i][j]);
}
System.out.println();
}
int flag=0;
String subStr ="COC"; 
for(i=0;i<s.length;i++) {
for(j=0;j<subStr.length();j++) {
if((s[i][j]=='C')&&(s[i][j+1]=='O')&&(s[i][j+2]=='C'))
{
flag=1;
System.out.println("Start Index: <"+i+","+j+">");
System.out.println("End Index: <"+i+"," +(j+2)+">");
break;
}
}
if(flag==1){
break;
}
}
for(i=0;i<subStr.length();i++) {
for( j=0;j<s.length;j++) {
if((s[i][j]=='C')&&(s[i+1][j]=='O')&&(s[i+2][j]=='C'))
{
flag=1;
System.out.println("Start Index: <"+i+","+j+">");
System.out.println("End Index: <"+(i+2) +"," +j+">");
break;
}
}if(flag==1){
break;
}
}
if(flag==0) {
System.out.println("SubString not found");
}
}
public static void main(String[] args) {
String str="WELCOMETOZOHOCORPORATION";
twoDimension(str);
}
}


