import java.util.Scanner;

public class Main {
    public static void main(String strg[]){
        System.out.println("hello");
        System.out.println("Enter the Name of student");
        Scanner scan = new Scanner(System.in);
        String str1 =scan.next();
        StudentInfo s1 = new StudentInfo();
        s1.setName(str1);
        System.out.println("Enter the id of student");
        int id= scan.nextInt();
        s1.setId(id);

        PricesOfCourses pc =new PricesOfCourses();

        System.out.println("Note there is 3 courses in order arabic math english plz continue if you'll enroll");

        System.out.println("choose the  first subject you want");

        AvaliableSubjects as = new AvaliableSubjects();
        String sub1 =scan.next();
        as.setSub1(sub1);
        pc.setPriceOfSub1(sub1);

        System.out.println("choose the  second subject you want");
        String sub2 =scan.next();
        as.setSub2(sub2);
        pc.setPriceOfSub2(sub2);

        System.out.println("choose the  second subject you want");
        String sub3 =scan.next();
        as.setSub3(sub3);
        pc.setPriceOfSub3(sub3);

        System.out.println("your choices "+as.getSub1()+"\n"+ as.getSub2()+"\n"+ as.getSub3()+"\n");


       System.out.println("the price of course "+sub1+" is :"+pc.getSubject1Price()+ "\n");
        System.out.println("the price of course "+sub2+" is :"+pc.getSubject2Price()+ "\n");
        System.out.println("the price of course "+sub3+" is :"+pc.getSubject3Price()+ "\n");







    }
}
