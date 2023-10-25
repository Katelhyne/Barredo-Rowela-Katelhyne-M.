import java.util.Scanner;

public class Student {
   private String firstName;
   private String middleName;
   private String lastName;
   private String suffix;
   private String fullName;
   
   //getters
   public String getFirstName() {
      return firstName;
   }
   public String getMiddleName() {
      return middleName;
   }
   public String getLastName() {
      return lastName;
   }
   public String getSuffix() {
      return suffix;
   }
   public String getFullName() {
      return fullName;
   }
   
   //setters
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }
   public void setMiddleName(String middleName) {
      this.middleName = middleName;
   }
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }
   public void setSuffix(String suffix) {
      this.suffix = suffix;
   }
   public void setFullName(String fullName) {
      this.fullName = fullName;
   }
   
   public static void main (String[] args) {
      Scanner scan = new Scanner (System.in);
      Student s = new Student();
      
      System.out.print("First Name: ");
      s.setFirstName(scan.nextLine());
      System.out.print("Middle Name: ");
      s.setMiddleName(scan.nextLine());
      System.out.print("Last Name: ");
      s.setLastName(scan.nextLine());
      System.out.print("Suffix: \n");
      s.setSuffix(scan.nextLine());

      String fullName = s.getFirstName() + " " + s.getMiddleName() + " " + s.getLastName() + " " + s.getSuffix();
      s.setFullName(fullName);
            
      System.out.println("First Name: " + s.getFirstName());
      System.out.println("Middle Name: " + s.getMiddleName());
      System.out.println("Last Name: " + s.getLastName());
      System.out.println("Suffix: " + s.getSuffix());
      System.out.println("Full Name: " + s.getFullName());
      scan.close();
   }
}
