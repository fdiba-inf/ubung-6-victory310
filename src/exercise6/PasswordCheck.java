package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean passwordValid = false; 
        do {
          System.out.print("Enter password: ");
          String password = input.nextLine();

          if (password.length()< 8) {
            continue;
          }

          boolean allLettersAndDigits = true; 
          int digitCount = 0; 
          for (int index = 0; index < password.length(); index ++){
            char symbol = password.charAt(index);
            boolean letterOrDigit = Character.isLetterOrDigit(symbol);
            if (!letterOrDigit) {
              allLettersAndDigits = false;
              break; 
            }

            boolean digit = Character.isDigit(symbol);
            if (digit){
              digitCount++;
            }
          }

          if (allLettersAndDigits && digitCount >= 2){
            passwordValid = true;
          }
        } while (!passwordValid);

        System.out.println("Password valid!: ");
    }
}
