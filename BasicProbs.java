import java.util.Scanner;

public class BasicProbs {
    
    // In this program I have implmented several basic problems that will clear the concepts.
    // I have coded all the programs using "switch case" that covers all those small but 
    // important concepts in this single program.

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        try{
            System.out.println("Please select one of the options:");
            System.out.println("1. Palindrome Number ?");
            System.out.println("2. Armstrong Number ?");
            System.out.println("3. Fibonacci");
            System.out.println("4. Prime Number ?");
            System.out.println("5. Factorial of a Number");
            System.out.println("6. Reverse of String or Integer");

            int choice = s.nextInt();

            switch (choice) {
                case 1: // Palindrome
                    System.out.println("Enter the number you want to check for palindrome");
                    try {
                        int n = s.nextInt();

                    int x = n;
                    int reverse = 0;

                    while (n>0){
                        int digit = n % 10;  // Getting the Last Digit
                        reverse = reverse * 10 + digit;     // Adding the extacted digit at its respective position
                        n = n/10; 
                    }

                    if (reverse == x){
                        System.out.println("Number is Palindrome");
                    }
                    else{
                        System.out.println("Number is not Palindrome");

                    }
                    } catch (Exception e) {
                        System.out.println(" Invalid Input" + e);
                    }
                    
                break;

                case 2: // Armstrong
                    System.out.println("Enter the number you want to check for ARMSTRONG");

                    try {
                        int n1 = s.nextInt();
                        int arm = n1;
                        int sum = 0;

                        while ( n1 > 0){
                            int digit = n1 % 10;
                            sum = sum + digit*digit*digit;
                            n1 = n1/10;
                        }   
                        if ( arm == sum){
                            System.out.println("Number is Armstrong");
                        }
                        else {
                            System.out.println("Number is not Armstrong");
                        } 
                    } catch (Exception e) {
                        System.out.println(" Invalid Input" + e);
                    }
                break;

                case 3:
                    System.out.println("Enter the Fibonacci Range");
                    try {
                        int n2 = s.nextInt();
                        int a = 0;
                        int b = 1;
                        System.out.print(a + " " + b + " ");
                        for (int i = 2; i<n2; i++){
                            int c = a + b;
                            System.out.print(c + " ");
                            a = b;
                            b = c;
                        }    
                    } catch (Exception e) {
                        System.out.println(" Invalid Input" + e);
                    }
                break;

                case 4: 
                    System.out.println("Enter the number you wanna check for Prime");
                    try {
                        int n3 = s.nextInt();
                        int c = 0;
    
                        for(int i = 2; i<n3; i++){
                            if(n3 % i == 0){
                                c++;
                            }
                        }
                        if(c==0){ System.out.print("The number is Prime");}
                        else { System.out.print("The number is not Prime");}
                    } catch (Exception e) {
                        System.out.println(" Invalid Input" + e);
                    }
                break;

                case 5:
                    System.out.println("Enter the number you wanna know Factorial of:");
                    try {
                        int n4 = s.nextInt();
                        int facto = 1;
    
                        for(int i  = 1; i<=n4; i++){
                            facto *= i; 
                        }
                        System.out.println("The Factorial of number is:" + facto);
                    } catch (Exception e) {
                        System.out.println(" Invalid Input" + e);
                    }
                break;

                case 6: 
                    System.out.println("Enter the number or String you want to reverse");
                        s.nextLine();    // This is to make sure no characters are lost
                        String st = s.nextLine();
                        boolean numb = true;
    
                        for(int i=0; i<st.length(); i++){
                            if(!Character.isDigit(st.charAt(i))){
                                numb = false;
                                break;
                            }
                        }
    
                        if(numb){
                            try {
                                int n5 = Integer.parseInt(st);   // storing the String entered as a number in variable "n5"
                                int revNum = 0;
                        
                                while(n5 > 0){
                                    int digit = n5 % 10;
                                    revNum = revNum * 10 + digit;
                                    n5 = n5/10;
                                }
                                System.out.println("Reversed Number is: " + revNum);
                            } catch (NumberFormatException e) {
                            System.out.println("Error in number format. Please enter a valid number.");
                        }
                    }      
                        else {
                            String revStr = "";
                            for(int i = st.length()-1; i>=0; i--){
                                revStr += st.charAt(i);
                            }
                            System.out.println("Reversed String is: " + revStr);
                        }
                break;  
                        
                default: System.out.println("You've entered a wrong choice"); break;  
                }    

            } catch(Exception e){
                System.out.println("An error occured" + e);
            }
            finally {
                s.close();
            }
    }  
}
