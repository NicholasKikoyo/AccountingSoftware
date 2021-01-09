import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

    public class Transaction  {
        private double accountBalance;
        private ArrayList<Double> depositAmount = new ArrayList<>();
        private ArrayList<Double> withdrawAmount = new ArrayList<>();

        Map<String,Double> transferIn = new HashMap<>();
        Map<String,Double> transferOut = new HashMap<>();


        public Transaction() {
        }

        //method to deposit
        public double deposit (double amount){
            accountBalance += amount;
            depositAmount.add(amount);
            return accountBalance;
        }

        //method to withdraw
        public double withdraw (double amount){
            accountBalance -= amount;
            withdrawAmount.add(amount);
            return accountBalance;
        }

        public Map<String, Double> getTransferOut() {
            return transferOut;
        }

        public ArrayList<Double> getDepositAmount() {
            return depositAmount;
        }

        public ArrayList<Double> getWithdrawAmount() {
            return withdrawAmount;
        }
        public double getAccountBalance (){
            return accountBalance;

        }
        public double transferIn ( String description ,double amount ) {
            transferIn.put(description,amount);
            accountBalance += amount;
            System.out.println(" description " + description);
            return accountBalance;

        }
        public double transferOut ( String description, double amount){
            transferOut.put(description,amount);
            accountBalance -= amount;
            return accountBalance;
        }









    }

