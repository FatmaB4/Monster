
public class Monster
{
	private String name;
	private int howBig;	

	public Monster(String n, int size)
	{
    name= n;
    howBig= size;
	}

	public String getName()
	{
		return name;
	}
	
	public int getHowBig()
	{
		return howBig;
	}
	
	public  boolean isBigger(Monster other2)
	{
    if(howBig>other2.getHowBig()){
		  return true;
    }
      else
      {
      return false;
    }
	}
	
	public boolean isSmaller(Monster other2)
	{
		if(howBig<other2.getHowBig()){
		  return true;
    }
      else
      {
      return false;
    }
	}

	public  boolean namesTheSame(Monster other2)
	{
		if(name.equalsIgnoreCase(other2.getName())){
		  return true;
    }
      else
      {
      return false;
    }
	}
	
	public String toString()
	{
		return "";
	}
}