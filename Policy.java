public class Policy
{
   /**
    * this program is to collect information regarding an insurance policy.
    * it collect info like policy number, provider info,
    * policyholder's name, age, smoker status, height, and weight.
    * the program provides methods to set and get these attributes
    * it also calculates bmi and policy price based on specific conditions.
    */
    
   //data fields
      private int policyNumber, age;
      private String providerName, firstName, lastName, smokerStatus;
      private double height, weight;
   
   /**no arg constructor
   * initializes policy info to default values
   */
   
   public Policy(){
      policyNumber = 0; //default value, room temp default
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokerStatus = "";
      height = 5.0;
      weight = 100.0;
   }
   /*constructor initializes the policy variable to specific values
    * @param aPolicyNumber the policy number
    * @param aProviderName the provider name
    * @param aFirstName the policyholder's first name
    * @param aLastName the policyholder's last name
    * @param bAge the policyholder's age
    * @param aSmokerStatus the policyholder's smoker status
    * @param aHeight the policyholder's height in inches
    * @param aWeight the policyholder's weight in pounds
    */
    
   public Policy(int aPolicyNumber, String aProviderName, String aFirstName, String aLastName, int bAge, String aSmokerStatus, double aHeight, double aWeight){
      policyNumber = aPolicyNumber;
      providerName = aProviderName;
      firstName = aFirstName;
      lastName = aLastName;
      age = bAge;
      smokerStatus = aSmokerStatus;
      height = aHeight;
      weight = aWeight;
   }
   /**
      setPolicyNumber method 
      @param aPolicyNumber the policy number
   */
   public void setPolicyNumber (int aPolicyNumber){
      policyNumber = aPolicyNumber;
   }
   /**
      setProviderName method 
      @param aProviderName the provider name
   */
   public void setProviderName (String aProviderName){
      providerName = aProviderName;
   }
   /**
      setFirstName method 
      @param aFirstName the policyholders first name
   */
   public void setFirstName (String aFirstName){
      firstName = aFirstName;
   }
   /**
      setLastName method 
      @param aLastName the policyholders last name
   */
   public void setLastName (String aLastName){
      lastName = aLastName;
   }   
   /**
      setAge method 
      @param bAge the policyholders age
   */
   public void setAge (int bAge){
      age = bAge;
   }
   /**
      setSmokerStatus method 
      @param aSmokerStatus the policyholders smoker status
   */
   public void setSmokerStatus (String aSmokerStatus){
      smokerStatus = aSmokerStatus;
   }
   /**
      setHeight method 
      @param aHeight the policyholders height
   */
   public void setHeight (double aHeight){
      height = aHeight;
   }
   /**
      setWeight method 
      @param aWeight the provider name
   */
   public void setWeight (double aWeight){
      weight = aWeight;
   } 
   /**
      getPolicyNumber method
      @return the policy number
   */
   public int getPolicyNumber(){
      return policyNumber;
   }
   /**
      getProviderName method
      @return the provider name
   */
   public String getProviderName(){
      return providerName;
   }
   /**
      getFirstName method
      @return the policyholder first name
   */
   public String getFirstName(){
      return firstName;
   }
   /**
      getLastName method
      @return the policyholder last name
   */
   public String getLastName(){
      return lastName;
   }
   /**
      getAge method
      @return the policyholder age
   */
   public int getAge(){
      return age;
   }
   /**
      getSmokerStatus method
      @return the policyholder smokerStatus
   */
   public String getSmokerStatus(){
      return smokerStatus;
   }
   /**
      getHeight method
      @return the policyholder height
   */
   public double getHeight(){
      return height;
   }
   /**
      getWeight method
      @return the policyholder weight
   */
   public double getWeight(){
      return weight;
   }
   /**
      calculateBMI method
      calculate the BMI and return to the user
   */
   public double getBMI(){
      double BMI = (weight*703)/Math.pow(height, 2);
      return BMI;
   }
   /**
      method for determining any additional fees
   */
   public double getPolicyPrice(){
      final int BASE_FEE = 600;
      double BMI = getBMI();
      double additionalFee = 0;
      
      if (age > 50){
         additionalFee = 75.0;
      }else if (smokerStatus.equalsIgnoreCase ("yes")){
         additionalFee = 100.0;
      }else if (BMI > 35){
         additionalFee = (BMI - 35) * 20;
      }else{
         additionalFee = 0.0;
      }
      
      return BASE_FEE + additionalFee;   
   }
}