import java.util.*;
public class Todo
{
    static void display(ArrayList<String>al)
    {
        if(al.size()==0)
        {
            System.out.println("No Schedule is added");
            return;
        }
        for(int i=0;i<al.size();i++)
        {
            System.out.println(i+1+" "+al.get(i));
        }
    }
   
public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
   ArrayList<String> al=new ArrayList<String>();
   
   while(true)
   {
       System.out.println("Enter the task");
       System.out.println("1.add");
       System.out.println("2.remove");
       System.out.println("3.update");
       System.out.println("4.display");
       System.out.println("5.exit");
       int n=sc.nextInt();
       boolean b=true;
       switch(n){
           case 1:
               String x=sc.next();
               al.add(x);
               break;
           case 2:
               int del=sc.nextInt();
               al.remove(--del);
               break;
           case 3:
               int m=sc.nextInt();
               String s=sc.next();
               al.set(--m,s);
               break;
          case 4:
              System.out.println("-------------");
              display(al);
              System.out.println("-------------");
              break;
          case 5:
              b=false;
              System.out.println("Complete all the task on time ");
              break;
       }
       if(!b)
       break;
   }
}
}