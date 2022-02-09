import java.util.LinkedList;
import java.util.Scanner;

class LkList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();
        while(true) {
            System.out.println("1. Add element to the list");
            System.out.println("2. Remove element from the list");
            System.out.println("3. Display the list");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter the element to add");
                    int element = sc.nextInt();
                    list.add(element);
                    break;
                case 2:
                    System.out.println("Enter the element to remove");
                    int removeElement = sc.nextInt();
                    list.remove(removeElement);
                    break;
                case 3:
                    System.out.println("The list is: " + list);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }    
}
