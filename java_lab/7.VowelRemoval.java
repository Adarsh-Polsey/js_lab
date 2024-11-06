package adarsh;
import java.util.Scanner;

class VowelRemoval {

    public static void main(String[] args) {

        String vowels = "aeiouAEIOU";
        String result = "";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (char c : str.toCharArray()) {

            if (vowels.indexOf(c) == -1) {

                result += c;
            }
        }

       
        System.out.println("String without vowels: " + result);
    }
}
