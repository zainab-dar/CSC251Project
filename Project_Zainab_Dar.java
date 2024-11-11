import java.io.*;
import java.util.*;

public class Project_Zainab_Dar {
   public static void main(String[] args) throws IOException {
      ArrayList<Policy> policies = new ArrayList<>(); // ArrayList to store policies
      
      int smokerCount = 0;
      int nonSmokerCount = 0;

      try {
         //open the file
         File file = new File("PolicyInformation.txt");
         Scanner keyboard = new Scanner(file); // Creating a scanner object

         //read data and create Policy objects
         while (keyboard.hasNext()) {
            //read each set of 8 lines and create a Policy object

            //read the policy number
            String policyNumberLine = keyboard.nextLine().trim();
            if (policyNumberLine.isEmpty()) continue;
            int policyNumber = Integer.parseInt(policyNumberLine);

            //read the provider name
            String providerName = keyboard.nextLine().trim();
            if (providerName.isEmpty()) continue;

            //read the first name
            String firstName = keyboard.nextLine().trim();
            if (firstName.isEmpty()) continue;

            //read the last name
            String lastName = keyboard.nextLine().trim();
            if (lastName.isEmpty()) continue;

            //read the age
            String ageLine = keyboard.nextLine().trim();
            if (ageLine.isEmpty()) continue;
            int age = Integer.parseInt(ageLine);

            //read the smoking status
            String smokerStatus = keyboard.nextLine().trim();
            if (smokerStatus.isEmpty()) continue;

            //read the height
            String heightLine = keyboard.nextLine().trim();
            if (heightLine.isEmpty()) continue;
            double height = Double.parseDouble(heightLine);

            //read the weight
            String weightLine = keyboard.nextLine().trim();
            if (weightLine.isEmpty()) continue;
            double weight = Double.parseDouble(weightLine);

            //create a new Policy object
            Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokerStatus, height, weight);
            policies.add(policy); // Add to the ArrayList

            //count smokers and non-smokers
            if (smokerStatus.equalsIgnoreCase("smoker")) {
               smokerCount++;
            } else {
               nonSmokerCount++;
            }
         }

         //close the Scanner
         keyboard.close();

         //display the information for each policy
         for (Policy policy : policies) {
            System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
            System.out.println("Provider Name: " + policy.getProviderName());
            System.out.println("Policyholder's First Name: " + policy.getFirstName());
            System.out.println("Policyholder's Last Name: " + policy.getLastName());
            System.out.println("Policyholder's Age: " + policy.getAge());
            System.out.println("Policyholder's Smoking Status: " + policy.getSmokerStatus());
            System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
            System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
            System.out.printf("Policyholder's BMI: %.2f", policy.getBMI());
            System.out.printf("\nPolicy Price: $%.2f\n", policy.getPolicyPrice());
         }

         //display smoker and non-smoker counts
         System.out.println("\nThe number of policies with a smoker is: " + smokerCount);
         System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);

      } catch (IOException ex) {
         //handle any file reading errors
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      } catch (NumberFormatException ex) {
         //handle parsing errors
         System.out.println("Error parsing a number: " + ex.getMessage());
      }
   }
}