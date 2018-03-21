import java.util.Scanner;

public class CLI
{
    private Club club;
    private Scanner sc;
    
    public CLI()
    {
        this.club = new Club();
        this.sc = new Scanner(System.in);
    }
    
    public void mainMenu()
    {
        boolean exit = false;
        do
        {
            printMainMenu();
            char option = sc.next().charAt(0);
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
                    break;
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
        boolean exit = false;
        do
        {
            System.out.println();
            printMemberMenu();
            char option = sc.next().charAt(0);
            switch(option)
            {
                case '1':
                    System.out.println(this.club.getMembers());
                    break;
                case '2':
                    System.out.println("would launch sorting menu");
                    break;
                case '0':
                    exit = true;
                    break;
                default:
                    break;
            }
        } while(!exit);
    }
    
    private void printMemberMenu()
    {
        System.out.println("Member Menu");
        System.out.println("1. View Members");
        System.out.println("2. Sort Members");
        System.out.println("0. Return to Main Menu");
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
