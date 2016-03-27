import java.util.Scanner;

public class PhoneKeypads {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String number = input.nextLine();
    
    for (int i = 0; i < number.length(); i++){
      char letter = number.toUpperCase().charAt(i);
      if (getNumber(letter) == 0)
        System.out.print(letter);
      else
        System.out.print(getNumber(letter));
    } // for i
    System.out.println();
  } // main
  
  static int getNumber(char uppercaseLetter){
    int num = 0;  
    switch (uppercaseLetter){
        case 'A':
        case 'B':
        case 'C':
            num = 2; break;
        case 'D':
        case 'E':
        case 'F':
            num = 3; break;
        case 'G':
        case 'H':
        case 'I':
            num = 4; break;
        case 'J':
        case 'K':
        case 'L':
            num = 5; break;
        case 'M':
        case 'N':
        case 'O':
            num = 6; break;
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
            num = 7; break;
        case 'T':
        case 'U':
        case 'V':
            num = 8; break;
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
            num = 9; break;
    } // switch
    return num;
  } // getNumber
}
