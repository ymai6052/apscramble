package scramble;

public class scramblefun {
	public static void main(String[] args)
	{
		System.out.println(scrambleword("A"));
	}
	public static String scrambleword(String word)
	{
		String returnword="";
		for(int i=0;i<word.length();i++)
		{
			if((word.length()-1)==i)
			{
				returnword+=word.substring(i,i+1);
			}
			else
			{
				//
				if(word.substring(i,i+1).equals("A"))
				{
					if(word.substring(i+1,i+2).equals("A")&&(word.length()>i+3))
					{
						returnword+=word.substring(i,i+1);
						returnword+=word.substring(i+2,i+3);
						returnword+=word.substring(i+1,i+2);
						i+=2;
					}
					else
					{
						returnword+=word.substring(i+1,i+2);
						returnword+=word.substring(i,i+1);
						i++;
					}
				}
				else
				{
					returnword+=word.substring(i,i+1);
				}
			}
		}
		return returnword;
	}
}
