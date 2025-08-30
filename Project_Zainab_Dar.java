import java.util.Scanner;

public class Project_Zainab_Dar {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // Creating a Scanner object
        
        // Initializing variables
        int policyNumber, age;
        String providerName, firstName, lastName, smokerStatus;
        double height, weight;
        
        // Ask user for input
        System.out.print("Please enter the Policy Number: ");
        policyNumber = keyboard.nextInt();
        keyboard.nextLine(); // Clear the buffer
        
        System.out.print("Please enter the Provider Name: ");
        providerName = keyboard.nextLine();
        
        System.out.print("Please enter the Policyholder's First Name: ");
        firstName = keyboard.nextLine();
        
        System.out.print("Please enter the Policyholder's Last Name: ");
        lastName = keyboard.nextLine();
        
        System.out.print("Please enter the Policyholder's Age: ");
        age = keyboard.nextInt();
        keyboard.nextLine(); // Clear the buffer
        
        System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        smokerStatus = keyboard.nextLine();
        
        System.out.print("Please enter the Policyholder's Height (in inches): ");
        height = keyboard.nextDouble();
        
        System.out.print("Please enter the Policyholder's Weight (in pounds): ");
        weight = keyboard.nextDouble();
        
        // Instantiate the Policy object
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokerStatus, height, weight);
        
        // Display user input and calculated fields
        System.out.println("\n--- Policy Information ---");
        System.out.println("Policy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder's First Name: " + policy.getFirstName());
        System.out.println("Policyholder's Last Name: " + policy.getLastName());
        System.out.println("Policyholder's Age: " + policy.getAge());
        System.out.println("Policyholder's Smoking Status: " + policy.getSmokerStatus());
        System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
        System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
        System.out.printf("Policyholder's BMI: %.2f%n", policy.getBMI());
        System.out.printf("Policy Price: $%.2f%n", policy.getPolicyPrice());
        
        keyboard.close(); // Close Scanner
    }
}
