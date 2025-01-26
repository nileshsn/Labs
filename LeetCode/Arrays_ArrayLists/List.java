import java.util.*;
public class List{
    public static void main(String[] args){
        ArrayList<Integer> temp = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while(true){
            Menu();
            int choice = in.nextInt();

            if(choice == 1){
                System.out.println("Enter an integer: ");
                temp.add(in.nextInt());
                System.out.println("Added");
            }
            else if(choice == 2){
                System.out.println("Enter the number to remove: ");
                int r = in.nextInt();
                if(temp.contains(r)){
                    temp.remove(Integer.valueOf(r));
                    System.out.println("Removed");
                }
                else{
                    System.out.println("Element not found");
                }
            }
            else if(choice == 3){
                System.out.println("Your List: "+temp);
            }
            else if(choice == 4){
                System.out.println("Good bye");
                break;
            }
        }
    }
    private static void Menu(){
        System.out.println();
        System.out.println("1. Add");
        System.out.println("2. Remove");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        System.out.println();
        System.out.println("Your Choice: ");
    }
}