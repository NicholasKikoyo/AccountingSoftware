import java.util.ArrayList;

public class Transfer  {

        private double accountBalance;
        private ArrayList<Double> transferOut = new ArrayList<>();
        private ArrayList<Double> transferIn = new ArrayList<>();


    public Transfer() {
    }

    //method to transferOut
        public double transferOut ( /*String description*/double amount ) {
            transferIn.add(/*description*/ amount);
            accountBalance -= amount;
            //System.out.println(" description "  /* + description*/);
            return accountBalance;
        }


         //method to transferIn
        public double  transferIn ( /*String description*/double amount ) {
        transferOut.add(/*description*/amount);
        accountBalance += amount;
        return accountBalance;
        }



        }







