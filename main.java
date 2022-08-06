import java.util.ArrayList;
import java.util.Scanner;
 class Account_ex3  {
    private String id;
    private double balance=300;
    Account_ex3(String setid)
    {
        id=setid;
    }
    void setid(String si)
    {
        id=si;
    }
    String getid()
    {
        return id;
    }
    void setBalance(double sb)
    {
        balance=sb;
    }
    double getBalance()
    {
        return balance;
    }

    void withdraw(double w_amount)
    {
        if(w_amount<balance){
            balance=balance-w_amount;
            System.out.println("Your Amount is withdraw successfully !!!");
        }
        else
        {
            System.out.println("Your account dose not have demanded amount !!!");
        }
    }
    void deposit(double d_amount)
    {
        balance=balance+ d_amount;
        System.out.println("Your Amount is deposit successfully !!!");
    }

    void moneytransfer(Account_ex3 x,double mta)
    {
        if(getBalance()<mta)
        {
            System.out.println("Your account dose not have demanded amount !!!");
        }
        else {
            double xb= x.getBalance()+mta;
            double b= getBalance()-mta;
            setBalance(b);
            x.setBalance(xb);
            System.out.println("money transfer successfully !!!");
        }


    }

}

class main{


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Account_ex3> ID = new ArrayList<Account_ex3>(10);
        Account_ex3 AC001= new Account_ex3("AC001");
        Account_ex3 AC002= new Account_ex3("AC002");
        Account_ex3 AC003= new Account_ex3("AC003");
        Account_ex3 AC004= new Account_ex3("AC004");
        Account_ex3 AC005= new Account_ex3("AC005");
        Account_ex3 AC006= new Account_ex3("AC006");
        Account_ex3 AC007= new Account_ex3("AC007");
        Account_ex3 AC008= new Account_ex3("AC008");
        Account_ex3 AC009= new Account_ex3("AC009");
        Account_ex3 AC0010= new Account_ex3("AC0010");

        ID.add(AC001);
        ID.add(AC002);
        ID.add(AC003);
        ID.add(AC004);
        ID.add(AC005);
        ID.add(AC006);
        ID.add(AC007);
        ID.add(AC008);
        ID.add(AC009);
        ID.add(AC0010);

        System.out.print("Enter ID : ");
        String mid=sc.next();
        int flag=0;
        int index=0;
        for(int i=0;i<10;i++)
        {
            Account_ex3 a=ID.get(i);

            if(mid.equals(a.getid()))
            {
                flag++;
                index=i;
                break;
            }

        }

        if(flag==1)
        {
            Account_ex3 temp;
            temp= ID.get(index);
            System.out.println("----choose option from following manu----");
            System.out.println("1. Balance inquiry");
            System.out.println("2. Withdraw money [Maintain minimum balance 300₹]");
            System.out.println("3. Deposit money");
            System.out.println("4. Money Transfer");
            System.out.println("5. Create Account");
            System.out.println("6. Deactivate Account");
            System.out.println("7. Exit");
            System.out.println("8. ANOTHER account's Balance");

            for (int i=1;i<20;i++) {

                System.out.print("->");
                int option = sc.nextInt();
                if(option==7)
                {
                    break;
                }

                switch (option) {
                    case 1:
                        System.out.println("[1]Balance inquiry");
                        System.out.println("Your balance : " + temp.getBalance());
                        break;

                    case 2:
                        System.out.println("[2]Withdraw money");
                        System.out.print("Enter withdraw amount : ");
                        double wa = sc.nextDouble();
                        temp.withdraw(wa);
                        break;
                    case 3:
                        System.out.println("[3]Deposit money");
                        System.out.print("Enter deposit amount : ");
                        double da= sc.nextDouble();
                        temp.deposit(da);
                        break;
                    case 4:
                        System.out.println("[4]Money Transfer");
                        System.out.print("Enter Destination account id for Money Transfer : ");
                        String tsid= sc.next();
                        Account_ex3 tid=new Account_ex3("AC001");

                        for(int x=0;x<10;x++)
                        {
                            Account_ex3 temp1=ID.get(x);
                            if(tsid.equals(temp1.getid()))
                            {
                                tid=ID.get(x);
                                break;
                            }
                        }

                        System.out.print("Enter Transfer amount : ");
                        double ta=sc.nextDouble();
                        temp.moneytransfer(tid,ta);
                        ID.set(i,tid);
                        // System.out.println(tid.getBalance());

                        break;

                    case 5:
                        System.out.println("[5]Create Account");
                        System.out.print("Enter new unique account ID : ");
                        String newid=sc.next();
                        Account_ex3 nid= new Account_ex3(newid);
                        ID.add(nid);
                        System.out.println("New Account Created successfully !!!");
                        break;
                    case 6:
                        System.out.println("[6]Deactivate Account");
                        System.out.print("Enter account ID for Deactivation : ");
                        String dsid= sc.next();
                        Account_ex3 did=new Account_ex3("AC001");
                        int x;
                        for(x=0;x<10;x++)
                        {
                            Account_ex3 temp1=ID.get(x);
                            if(dsid.equals(temp1.getid()))
                            {
                                did=ID.get(x);
                                break;
                            }
                        }

                        ID.remove(x);
                        System.out.println("ID Deactivate successfully !!! ");
                        break;
                    case 8:
                        System.out.println("[8]ANOTHER account's Balance");
                        System.out.print("Enter Another account id : ");
                        String asid= sc.next();
                        Account_ex3 aid=new Account_ex3("AC001");

                        for(int u=0;u<10;u++)
                        {
                            Account_ex3 temp1=ID.get(u);
                            if(asid.equals(temp1.getid()))
                            {
                                aid=ID.get(u);
                                System.out.println("Your balance : " + aid.getBalance());
                                break;
                            }
                        }
                        break;

                }
                System.out.println("");
            }

        }
        else {
            System.out.println("ID IS NOT AVAILABLE !!!!");

        }
        System.out.println("21CE0008");
    }

}