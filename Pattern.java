import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the value of n");

        int n = s.nextInt();
        
        System.out.println("Printing First Pattern");

        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println("Printing Second Pattern: Traingle");

        for (int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println("Printing Third Pattern: Inverted Triangle");

        for (int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println("Printing Forth Pattern: Right Aligned Triangle");

        for (int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for( int k =0; k<=i; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }        

        System.out.println("Printing Fifth Pattern: Right Aligned Inverted Triangle");

        for (int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for( int k =i; k<n; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }        

        System.out.println("Printing Sixth Pattern: Pyramid");

        for (int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for( int k =0; k< (2*i+1); k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }        

        System.out.println("Printing Seventh Pattern: Inverted Pyramid");

        for (int i=n-1; i>=0; i--){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for( int k =0; k< (2*i+1); k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }        

        s.close();
    }
}
