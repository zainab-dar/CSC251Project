import java.util.Scanner;

public class Project_Zainab_Dar
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);//creating a scanner object
      
      //initializing variables
      int policyNumber, age;
      String providerName, firstName, lastName, smokerStatus;
      double height, weight;
      
      //ask user for policy number, provider name, policyholder first name, last name, age, smoking status, height, and weight
      
      System.out.print("Please enter the Policy Number: ");
      policyNumber = keyboard.nextInt();
      
      keyboard.nextLine(); // clear the buffer
      
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      firstName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      lastName = keyboard.nextLine();
            
      System.out.print("Please enter the Policyholder's Age: ");
      age = keyboard.nextInt();
      keyboard.nextLine();// clear the buffer
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokerStatus = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      height = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      weight = keyboard.nextDouble();
      
      //instantiate the object
      Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokerStatus, height, weight);
      
      //display calculated fields and user input
      System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policyholder's First Name: " + policy.getFirstName());
      System.out.println("Policyholder's Last Name: " + policy.getLastName());
      System.out.println("Policyholder's Age: " + policy.getAge());
      System.out.println("Policyholder's Smoking Status: " + policy.getSmokerStatus());
      System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
      System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
      System.out.printf("Policyholder's BMI: %.2f", policy.getBMI());
      System.out.printf("\nPolicy Price: $%.2f", policy.getPolicyPrice());
   }
}