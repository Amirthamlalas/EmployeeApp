import java.util.Scanner;

public class EmployeeApp {

    public static void main(String[] args) {
        int ex;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter\n 1 : To add employee\n 2 : To view an employee\n 3 : To search an employee\n 4 : To delete an employee\n 5 : Exit");
            int choice = sc.nextInt();

            switch (choice){



            }


            System.out.println("Do you want to continue:1 for yes 2 for no");

            ex = sc.nextInt();
        }while (ex == 1);

    }
}