public class Club {
    private String name;
	private MemberList members;
    
    public Club()
    {
        this.name = "";
        this.members = new MemberList();
    }
    
    public void newMember(String name, String phone, String address)
    {
        Member m = new Member(name, phone, address);
        this.members.add(m);
    }
    
	public MemberList getMembers()
    {
        return this.members;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
}

