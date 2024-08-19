//To find the largest number
//Vikhneswar S
//60
import java.util.Scanner;

class largestsum {
    public static void main(String args[]) {
        int largest=0;
        int num, n;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n = s.nextInt();
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            num = s.nextInt();
            if (num > largest) {
                largest = num;
            }
        }
        
        System.out.println("The largest number is: " + largest);
        s.close();
    }
    Enter the number of elements:
3
Enter the elements:
33 44 323
The largest number is: 323
}
