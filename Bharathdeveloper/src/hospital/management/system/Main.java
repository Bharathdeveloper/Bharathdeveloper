package hospital.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
        Doctor lizzy = new Doctor(1,"Lizzy",500);
        Doctor mellisa = new Doctor(2,"Mellisa",700);
        Doctor vanderhorn = new Doctor(3,"Vanderhorn",600);

        List<Doctor> doctorList = new ArrayList<>();
        doctorList.add(lizzy);
        doctorList.add(mellisa);
        doctorList.add(vanderhorn);


        Patient tamasha = new Patient(1,"Tamasha",4);
        Patient rakshith = new Patient(2,"Rakshith Vasudev",12);
        Patient rabbi = new Patient(3,"Rabbi",5);
        List<Patient> patientList = new ArrayList<>();

        patientList.add(tamasha);
        patientList.add(rabbi);
        patientList.add(rakshith);




        Hospital ghs = new Hospital();

        Doctor megan = new Doctor(6,"Megan", 900);

        ghs.Doctor(megan);


        tamasha.payFees(5000);
        rakshith.payFees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("------Making hospital PAY SALARY----");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName()
        +" and now has $" + ghs.getTotalMoneyEarned());

        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spent for salary to " + vanderhorn.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());


        System.out.println(rakshith);

        mellisa.receiveSalary(mellisa.getSalary());

        System.out.println(mellisa);


    }
}



