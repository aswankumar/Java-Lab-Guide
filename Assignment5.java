package Assignments;

public class Assignment5 {
	private int biologyMarks;
	private int physicsMarks;
	private int zoologyMarks;
	public void setbiologyMarks(int biologyMarks)
	{
		this.biologyMarks=biologyMarks;
	}  
	  
	public int getbiologyMarks()
	{
		return biologyMarks;
	}
	public void setphysicsMarks(int physicsMarks)
	{
		this.physicsMarks=physicsMarks;
	}  
	  
	public int getphysicsMarks()
	{
		return physicsMarks;
	}
	public void setzoologyMarks(int zoologyMarks)
	{
		this.zoologyMarks=zoologyMarks;
	}  
	  
	public int getzoologyMarks()
	{
		return zoologyMarks;
	}
	public static void main(String[] args)
	{
		Assignment5 as=new Assignment5();
		as.setbiologyMarks(60);
		as.setphysicsMarks(80);
		as.setzoologyMarks(90);
		if (as.getbiologyMarks()>=80 && as.getbiologyMarks()<=100)
			System.out.println("grade A");
		if (as.getbiologyMarks()>=73 && as.getbiologyMarks()<=79)
			System.out.println("grade B+");
		if (as.getbiologyMarks()>=65 && as.getbiologyMarks()<=72)
			System.out.println("grade B");
		if (as.getbiologyMarks()>=55 && as.getbiologyMarks()<=64)
			System.out.println("grade C");
		if (as.getbiologyMarks()>=0 && as.getbiologyMarks()<=54)
			System.out.println("grade D");
		if (as.getphysicsMarks()>=80 && as.getphysicsMarks()<=100)
			System.out.println("grade A");
		if (as.getphysicsMarks()>=73 && as.getphysicsMarks()<=79)
			System.out.println("grade B+");
		if (as.getphysicsMarks()>=65 && as.getphysicsMarks()<=72)
			System.out.println("grade B");
		if (as.getphysicsMarks()>=55 && as.getphysicsMarks()<=64)
			System.out.println("grade C");
		if (as.getphysicsMarks()>=0 && as.getphysicsMarks()<=54)
			System.out.println("grade D");
		if (as.getzoologyMarks()>=80 && as.getzoologyMarks()<=100)
			System.out.println("grade A");
		if (as.getzoologyMarks()>=73 && as.getzoologyMarks()<=79)
			System.out.println("grade B+");
		if (as.getzoologyMarks()>=65 && as.getzoologyMarks()<=72)
			System.out.println("grade B");
		if (as.getzoologyMarks()>=55 && as.getzoologyMarks()<=64)
			System.out.println("grade C");
		if (as.getzoologyMarks()>=0 && as.getzoologyMarks()<=54)
			System.out.println("grade D");
		
	}
}
