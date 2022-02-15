package hospital.management.system;

public class Patient {
	private int id;
    private String name;
    private int condition;
    private int feesPaid;
    private int feesTotal;

    public Patient(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}

	
    public void Patient(int id, String name,int condtion){
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id=id;
        this.name=name;
        this.condition=condition;

    }

    
    public void setCondition(int condition){
        this.condition=condition;
    }


   
    public void payFees(int fees){
        feesPaid+=fees;
        Hospital.updateTotalMoneyEarned(feesPaid);
    }

    
    public int getId() {
        return id;
    }

    
    public String getName() {
        return name;
    }

   
    public int getCondition() {
        return condition;
    }

    
    public int getFeesPaid() {
        return feesPaid;
    }

    
    public int getFeesTotal() {
        return feesTotal;
    }

   
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Patient's name :"+name+
                " Total fees paid so far $"+ feesPaid;
    }
}


