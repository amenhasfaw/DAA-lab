import java.util.Scanner;

public class Exp1 {
    String USN;
    String Name;
    String branch;
    String phone;

    void insertRecord(String reg, String name, String brnch, String ph) {

        USN = reg;
        Name = name;
        branch = brnch;
        phone = ph;
    }

    void displayRecord() {
        System.out.println(USN + " " + Name + " " + branch + " " + phone);
    }

    public static void main(String args[]) {
        Exp1 s[] = new Exp1[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of students");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            s[i] = new Exp1();
        for (int j = 0; j < n; j++) {
            System.out.println("enter the usn,name,branch,phone");
            String USN = sc.next();
            String Name = sc.next();
            String branch = sc.next();
            String phone = sc.next();
            s[j].insertRecord(USN, Name, branch, phone);
        }
        for (int m = 0; m < n; m++) {
            s[m].displayRecord();
        }
    }
}