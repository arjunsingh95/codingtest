//Question1-print only the even number of array.
public class Question1
{  
public static void main(String args[])
{  
int a[]={10,25,50,60,32,20,23};  
System.out.println("Even Numbers:");  
for(int i=0;i<a.length;i++)
{  
if(a[i]%2==0)
{  
System.out.println(a[i]);  
}  
}
}
}