/*
15). Implement a sort function that illustrates overloading methods. Sort method sorts the array in the default ordering, sorts the array into the specified order, sorts array elements ranging from fromIndex to toIndex in the specified order.
*/
 
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
 
class sort{
    void sorting(int []a){
        Arrays.sort(a);
        System.out.println("Default Ordering");
    }
    void sorting(int []a,int n){
        System.out.println("\nSpecified Ordering\n1:Ascending\n2:Descending");
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int c=in.nextInt();
        switch(c){
            case 1:  Arrays.sort(a);
                     disp(a,n);
                     break;
            case 2:   Arrays.sort(a);
                      System.out.println("Sorted Array: ");
                      for(int i=n-1;i>=0;i--){
                          System.out.println(a[i]);
                      }
        }
    }
    void sorting(int []a,int n,int x,int y){
        int p=Math.min(x, y);
        int q=Math.max(x, y);
        int []temp=new int[(q-p)+1];
        int j=0;
        for(int i=p;i<=q;i++){
            temp[j]=a[i];
            j++;
        }
        Arrays.sort(temp);
        j=0;
        for(int i=p;i<=q;i++){
            a[i]=temp[j];
            j++;
        }
        System.out.println("fromIndex to toIndex");
        disp(a, n);
    }
    void disp(int []a,int n){
        System.out.println("Sorted Array: ");
                for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
 
public class TW15_sortOverloading 
{
    public static void main(String[] args){
        int []a={7,8,4,5,2};
        int n=a.length;
        int x=1,y=4;
        sort s1=new sort();
        s1.sorting(a, n, x, y);
 
        sort s=new sort();
        s.sorting(a);
        s.disp(a, n);
 
        sort s2=new sort();
        s2.sorting(a,n);
    }    
}
