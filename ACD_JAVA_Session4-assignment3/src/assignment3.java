
public class assignment3 {

//encapsulation example
			private int ssn;
		    private String empName;
		    private int empAge;

		   
		    public int getEmpSSN(){
		        return ssn;
		    }

		    public String getEmpName(){
		        return empName;
		    }

		    public int getEmpAge(){
		        return empAge;
		    }

		    public void setEmpAge(int newValue){
		        empAge = newValue;
		    }

		    public void setEmpName(String newValue){
		        empName = newValue;
		    }

		    public void setEmpSSN(int newValue){
		        ssn = newValue;
		    }


		    public static void main(String args[]){
		         assignment3 obj = new assignment3();
		         obj.setEmpName("Mario");
		         obj.setEmpAge(32);
		         obj.setEmpSSN(112233);
		         System.out.println("Employee Name: " + obj.getEmpName());
		         System.out.println("Employee SSN: " + obj.getEmpSSN());
		         System.out.println("Employee Age: " + obj.getEmpAge());
		    } 
		}