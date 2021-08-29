import java.util.Scanner;
import java.util.*;
public class Paranthesis{
public static boolean isParanthesis(char c) {
return ((c=='(')||(c==')'));
}

public static boolean isValidString(String str){
int count=0;
for (int i=0;i<str.length();i++) {
if(str.charAt(i)=='('){
count++;
} else if(str.charAt(i)==')'){
count--;
}
if(count<0){
return false;
}
}
return (count==0); 
}

public static void removeInvalidParanthesis(String str){
if (str.isEmpty()){
return;
}
HashSet<String>visit=new HashSet<String>();
Queue<String> que= new LinkedList<>();
String temp;
boolean level=false;
que.add(str);
visit.add(str);
//System.out.println(str);
//System.out.println(que);
//System.out.println(visit);
while(!que.isEmpty()){
str=que.peek(); que.remove();
//System.out.println("inside:" +str);
if(isValidString(str)){
System.out.println(str);
level = true;
}
if(level) {
continue;
}
for(int i=0;i<str.length();i++){
  if(!isParanthesis(str.charAt(i))){ 
    continue;
}
temp = str.substring(0,i)+str.substring(i+1);
if(!visit.contains(temp)){
que.add(temp);
visit.add(temp);
}
}
}
}

public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter the String");
String str = input.next();
if(isValidString(str) == true) {
 System.out.println("Vaild");
} else {
System.out.println("Invalid");
removeInvalidParanthesis(str);
}
}
}