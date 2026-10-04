
import java.util.Scanner;


class student{
   private String name;
   private int btech_year ;
   private String college_name;
   private String cast;
   private int annual_income;
   private long mobilenumber;
   private String gmail;

              student(String name , int btech_year , String college_name , String cast , int annual_income , long mobilenumber , String gmail){
              this.name=name;
              this.btech_year=btech_year;
              this.college_name=college_name;
              this.cast=cast;
              this.annual_income=annual_income;
              this.mobilenumber=mobilenumber;
              this.gmail=gmail;


   }

// to fetch the details before user go to next step

   void display(){
      System.out.println("------ YOUR DETAILS-----------");
      System.out.println("student name = "+ name);
      System.out.println("college name = "+ college_name);
      System.out.println("btech year = "+ btech_year);
      System.out.println("cast = "+ cast);
      System.out.println("annual income = "+ annual_income);
      System.out.println("your mobile number : "+mobilenumber);
      System.out.println("your gmail "+gmail);

   }
   
}



class main{
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("-----hello user enter your details----");
   System.out.println("Enter Your Full Name:");
   String name = sc.nextLine();
   System.out.println("enter your btech year : ");
   int btech_year =sc.nextInt();
   System.out.println("Enter your college name :");
   String college_name = sc.next();
   System.out.println("enter your cast : ");
   String cast = sc.next();
   System.out.println("enter your family annual income");
   int annual_income = sc.nextInt();
   System.out.println("enter your mobilenumber");
   long mobilenumber = sc.nextLong();
   System.out.println("enter your gmail");
   String gmail =sc.next();
    sc.close();
    student st = new student(name , btech_year , college_name , cast , annual_income, mobilenumber, gmail);
    st.display();
    
   }
}
