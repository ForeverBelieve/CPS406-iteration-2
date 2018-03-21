import java.util.Date;
import java.util.List;
import java.util.LinkedList;

/*public class MemberList
{
	private List<Member> members;
    
    public MemberList()
    {
        this.members = new LinkedList<Member>();
    }
    
    public Member newMember(String name, String phone, String address)
    {
        Member m = new Member(name, phone, address);
        this.members.add(m);
        return m;
    }
    
    private List<Member> sortByPaid()
    {
        return this.members;
    }
    
    private List<Member> sortByAttendance()
    {
        return this.members;
    }
}*/

public class MemberList extends LinkedList<Member> {
    public MemberList() {
        super();
    }
    
    /*public MemberList sortByPaid() {
        
    }
    
    public MemberList sortByAttendance() {
        
    }*/
}

class Member
{
    private String name;
    private String phone;
    private String address;
    private List<Boolean> monthsPaid;
    
    public Member(String name, String phone, String address)
    {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.monthsPaid = new LinkedList<Boolean>();
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getPhone()
    {
        return this.phone;
    }
    
    public String getAddress()
    {
        return this.address;
    }
    
    public String getTimesPaid()
    {
        int timesPaid = 0;
        for(boolean p : this.monthsPaid)
        {
            if(p)
            {
                timesPaid++;
            }
        }
        return String.valueOf(timesPaid) + '/' + String.valueOf(this.monthsPaid.size());
    }
    
    public String toString()
    {
        return "Member " + this.name + "\nPhone: " + this.phone + "\nAddress: " + this.address + "\nPaid?: " + String.valueOf(this.monthsPaid);
    }
}

/*class MonthlyDebt {
    //month from 0-12
    private int month;
    private int year;
    private List<Payment> debt;
    //highest value indicates highest urgency
    private int urgency;
    
    //public MonthlyDebt(int month, int year
}

class Payment {
    private Date date;
    private double amount;
    
    public Payment(int year, int month, int day, double amount) {
        this.date = new Date(year, month, day);
        this.amount = amount;
    }
    
    public get 
}*/
