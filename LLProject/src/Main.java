import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        LList list = new LList();
        Scanner sc = new Scanner(System.in);
        String menu="1- Add Student\n"
                   +"2- Delete Student\n"
                   +"3- Show the list\n"
                   +"4- Show the most succesfull student\n"
                   +"5- Quit";
        while(true){
            System.out.println(menu);
            int choice = sc.nextInt();
            if(choice==5){
                return;
            }
            else if(choice==1){
                list.add();
            }
            else if(choice==2){
                list.dlt();
            }
            else if(choice==3){
                list.print();
            }
            else if(choice==4){
                list.mostSuccesful();
            }
        }
    }
}
