import java.util.*;

public class E_Wallet{
    static ArrayList<Double> ArrList=new ArrayList<>();

    public static void addTransaction(double amount){
       ArrList.add(amount);
       System.out.println("Transaction Added Successfully");
    }
    
    public static double getTotalSpent(){
        double total=0;
        for(double Value : ArrList){
            total=total+Value;
        }
        return total;
    }
    
    public static double getLargestTransaction(){
        double amt=0.0;
        for(double Value : ArrList){
            if(amt<Value){
                amt=Value;
            }
        }
        return amt;
    }
    
    public static void printAllTransactions(){
        System.out.println("-------------------");
        for(double Value : ArrList){
            System.out.println("-> "+Value);
        }
        System.out.println("-------------------");
    }
    
    public static void addSample(){
        ArrList.add(100.9);
        ArrList.add(6.2);
        ArrList.add(500.9);
        ArrList.add(456.11);
        ArrList.add(234.32);
        ArrList.add(10.3);
        ArrList.add(54.67);
        ArrList.add(789.98);
        ArrList.add(5.66);
        ArrList.add(98.23);

    }
    
    public static void printAboveThreshold(double Threshold){
        System.out.println("-------------------");
        for(double Value : ArrList){
            if(Value>Threshold){
                System.out.println("-> "+Value);
            }
        }
        System.out.println("-------------------");
    }
    
    public static void refundLastTransaction(){
        int size;
        size = ArrList.size();
        ArrList.remove(size-1);
        System.out.println("Last Transaction Removed Successfully");
    }
    
    
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        boolean running = true;
        while(running){
            int choice;
            System.out.println("1) Add Transaction");
            System.out.println("2) Show total of Transactions");
            System.out.println("3) Show Highest Transaction");
            System.out.println("4) Show all Transactions");
            System.out.println("5) Add Sample Transactions");
            System.out.println("6) Show Transaction Greater than Threshold");
            System.out.println("7) Refund Last Transaction");
            System.out.println("8) Exit");
            System.out.println("Enter Your Choice: ");
            choice = scan.nextInt();
            switch(choice){
                case 1:
                    double amount;
                    System.out.println("Enter Amount: ");
                    amount=scan.nextDouble();
                    addTransaction(amount);
                    break;

                case 2:
                    double total;
                    total = getTotalSpent();
                    System.out.println("Total Amount Spent = "+total);
                    break;
                
                case 3:
                    double Max;
                    Max = getLargestTransaction();
                    System.out.println("Largest Transaction is: "+Max);
                    break;

                case 4:
                    printAllTransactions();
                    break;

                case 5:
                    addSample();
                    System.out.println("Sample Transaction Added Successfully");
                    break;

                case 6:
                    double Threshold;
                    System.out.println("Enter Threshold Value: ");
                    Threshold=scan.nextInt();
                    printAboveThreshold(Threshold);
                    break;
                
                case 7:
                    refundLastTransaction();
                    break;
                    
                case 8:
                    running = false;
                    break;
                }
            }
        }
    }