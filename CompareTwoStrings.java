import java.util.Scanner;

public class CompareTwoStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        int comparison = str1.compareToIgnoreCase(str2);

        if (comparison < 0) {
            System.out.println(str1 + " is alphabetically less than " + str2);
        } else   {
            System.out.println(str1 + " is alphabetically greater than " + str2);
        
    }
}
}


    
    




