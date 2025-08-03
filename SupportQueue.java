import java.util.LinkedList;
import java.util.Scanner;

public class SupportQueue {
    static LinkedList<String> Linklist = new LinkedList<>();
    static String DroppedCustomer;

    public static void addCustomer(String name){
        Linklist.add(name);
        System.out.println("Customer Added to Queue Successfully");
        int j=1;
        System.out.println("------Updated Queue-------");
        for(String Name : Linklist){
            System.out.println(j+") "+Name);
            j++;
        }
        System.out.println("--------------------------");
    }

    public static void serveCustomer(){
        System.out.println("Served Customer: "+Linklist.getFirst()+"\n");
        DroppedCustomer=Linklist.getFirst();
        Linklist.removeFirst();
        int j=1;
        System.out.println("------Updated Queue-------");
        for(String Name : Linklist){
            System.out.println(j+") "+Name);
            j++;
        }
        System.out.println("--------------------------");
        
    }

    public static void peekNextCustomer(){
        System.out.println("Next Customer: "+Linklist.peek());
    }

    public static void printQueue(){
        int i=1;
        System.out.println("----------------");
        for(String Name : Linklist){
            System.out.println(i+") "+Name);
            i++;
        }
        System.out.println("----------------");
    }

    public static void prioritizeCustomer(){
        Scanner scan=new Scanner(System.in);
        int i=1,qno;
        String customer;
        System.out.println("---------Current Queue---------");
        for(String Value : Linklist){
            System.out.println(i+") "+Value);
            i++;
        }
        System.out.println("-------------------------------");
        System.out.println("Enter Queue Number: ");
        qno=scan.nextInt();
        customer = Linklist.get(qno-1);
        Linklist.remove(qno-1);
        Linklist.addFirst(customer);
        int j=1;
        System.out.println("------Updated Queue-------");
        for(String Name : Linklist){
            System.out.println(j+") "+Name);
            j++;
        }
        System.out.println("--------------------------");
    }

    public static void reAddCustomerToEnd(){
        Linklist.add(DroppedCustomer);
        System.out.println("Dropped Customer Added to Queue Successfully");
        int j=1;
        System.out.println("------Updated Queue-------");
        for(String Name : Linklist){
            System.out.println(j+") "+Name);
            j++;
        }
        System.out.println("--------------------------");
    }

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        boolean running = true;
        Linklist.add("Cindy");
        Linklist.add("Max");
        Linklist.add("Nathan");
        Linklist.add("Tommy");
        Linklist.add("Gorge");
        while(running){
            int choice;
            System.out.println("1) Add Customer");
            System.out.println("2) Serve Customer");
            System.out.println("3) Show Next Customer");
            System.out.println("4) Show Queue");
            System.out.println("5) Prioritize Customer");
            System.out.println("6) Re-Add Served Customer");
            System.out.println("7) Exit");
            System.out.println("Enter Your Choice: ");
            choice = scan.nextInt();
            switch(choice){
                case 1:
                    String name;
                    System.out.println("Enter Customer Name: ");
                    name = scan.nextLine();
                    addCustomer(name);
                    break;

                case 2:
                    serveCustomer();
                    break;
                
                case 3:
                    peekNextCustomer();
                    break;

                case 4:
                    printQueue();
                    break;

                case 5:
                    prioritizeCustomer();
                    System.out.println("Customer Prioritized Successfully");
                    break;

                case 6:
                    reAddCustomerToEnd();
                    break; 

                case 7:
                    running = false;
                    break;
                }
            }
        }
    }
