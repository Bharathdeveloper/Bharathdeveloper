package hospital.management.system;

import java.util.List;

public class Hospital {
	private List<Doctor>doctors;
	private List<Patient>patients;
	private static int totalMoneyearned;
	private static int totalMoneySpent;
	
	
	public void hospital(List<Doctor> doctors,List<Patient> patients)
	{
		this.doctors=doctors;
		this.patients=patients;
		totalMoneyearned=0;
		totalMoneySpent=0;
	}
	public List<Doctor> getDoctors() {
		return doctors;
	}
	public  void Doctor(Doctor doctor)
	{
		doctors.add(doctor);
	}
	public List<Patient> getpatients() {
		return patients;
	}
	public void patient(Patient patient)
	{
		patients.add(patient);
	}
	
	public int getTotalMoneyEarned() {
        return totalMoneyearned;
    }

    
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyearned += MoneyEarned;
    }

   
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyearned-=moneySpent;
     }
}


