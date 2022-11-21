import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class EmployeeApp {

    public static void main(String[] args) {


        ArrayList<Object> arrli = new ArrayList<Object>();

        int ex;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter\n 1 : To add employee\n 2 : To view an employee\n 3 : To search an employee\n 4 : To delete an employee\n 5 : Exit");
            int choice = sc.nextInt();


            switch (choice){


                case 1:


                    System.out.println("Enter employee code");
                    int ecode = sc.nextInt();
                    arrli.add(ecode);
                    System.out.println("Enter Employee name");
                    String empname = sc.next();
                    arrli.add(empname);
                    System.out.println("Enter Designation");
                    String empdes = sc.next();
                    arrli.add(empdes);
                    System.out.println("Enter Salary");
                    Double sal = sc.nextDouble();
                    arrli.add(sal);
                    System.out.println("Enter company name");
                    String comp =  sc.next();
                    arrli.add(comp);
                    System.out.println("Enter phone no");
                    Double phn = sc.nextDouble();
                    arrli.add(phn);

                    System.out.println("Enter email address");
                    String mail = sc.next();
                    arrli.add(mail);


                break;



            }


            System.out.println("Do you want to continue:1 for yes 2 for no");

            ex = sc.nextInt();
        }while (ex == 1);

    }
}