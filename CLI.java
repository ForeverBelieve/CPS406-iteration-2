import java.util.Scanner;

public class CLI
{
    private Club c;
    private Scanner sc;
    
    public CLI()
    {
        this.c = new Club();
        this.sc = new Scanner(System.in);
    }
    
    public void mainMenu()
    {
        printMainMenu();
        boolean exit = false;
        do
        {
            char option = sc.next().charAt(0);
            //System.out.println(option);
            switch(option)
            {
                case '1':
                    memberMenu();
                    break;
                case '2':
                    treasuryMenu();
                    break;
                case '0':
                    exit = true;
                    break;
                default:
                    printMainMenu();
            }
        } while(!exit);
    }
    
    private void printMainMenu()
    {
        System.out.println("Club Menu");
        System.out.println("1. Member Menu");
        System.out.println("2. Treasury Menu");
        System.out.println("0. Exit");
    }
    
    private void memberMenu()
    {
        printMemberMenu();
        
    }
    
    private void printMemberMenu()
    {
        System.out.println("Member Menu");
        System.out.println("1. View Members");
        System.out.println("2. Sort Members");
        boolean exit = false;
        do
        {
            char option = sc.next().charAt(0);
            
            switch(option)
        } while(!exit);
    }
    
    private void treasuryMenu()
    {
        printTreasuryMenu();
    }
    
    private void printTreasuryMenu()
    {
        System.out.println("Treasury Menu");
    }
}
