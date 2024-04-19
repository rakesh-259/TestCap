package Day9;
class Employee {
    int salary = 60000;
}
 

class Engineer extends Employee {
    int benefits = 10000;
}
 


public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engineer E1 = new Engineer();
        System.out.println("Salary : " + E1.salary
                           + "\nBenefits : " + E1.benefits);

	}

}
