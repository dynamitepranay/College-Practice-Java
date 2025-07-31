import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("The array you entered is: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
        
         System.out.println("Enter the key:");
          int key = sc.nextInt();
          int l=0;
          int f=0;
          int length=a.length;
          int h=length-1;
          while(l<=h)
          {
            int mid=(l+h)/2;
            if(a[mid]==key)
            {
              System.out.println("The element is at index"+mid);
               f=1;
               break;
            }
            else if(key>a[mid])
            {
              l=mid+1;
            }
            else{
              h=mid-1;
            }
           }
             if (f==0){
             System.out.println("Elenment not found");
            }
      }
    }
