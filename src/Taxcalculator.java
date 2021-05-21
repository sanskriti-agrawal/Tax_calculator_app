import java.util.Scanner;
public class Taxcalculator {
    public static void main(String[] args) {
        System.out.println("Tax Calculator App");
        System.out.println("----- " + "WELCOME " + "-----");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total person count: ");
        int person = sc.nextInt();

        String name[] = new String[person];

        long income[] = new long[person];

        for (int i = 0; i < person; i++) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter name "+ (i+1) + ':');
            name[i] = s.nextLine();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter anuual income: ");
            income[i] = scanner.nextLong();
        }

        System.out.println("Names with liable taxes");
        System.out.println("-------------");
        for(int i=0;i<person;i++)
        {
            calculateTax(name[i],income[i]);
        }
    }
        public static long calculateTax(String name, long income){
        long taxamount=0L;
        if(income>=300000)
        {
            taxamount=income*20/100;
        }
        else if(income>100000 && income<300000)
        {
             taxamount=income*10/100;
        }
        else if(income<100000)
        {
             taxamount=income*0;
        }
        System.out.println(name + ": " + taxamount);
        return taxamount;
    }
}
