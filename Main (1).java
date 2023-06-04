import java.util.Scanner;  
class Main{  
public static void main(String args[]){  
int a[]={4,2,-4,0,6};
  int sum=0;
  for(int i=0;i<a.length;i++)
    {
      for(int j=i+1;j<a.length;j++)  
      {
        if(a[j]==sum-a[i])
        {
          System.out.println(a[i] +","+ a[j]);
        }
      }
    }
  
}
}