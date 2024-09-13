package japneet;

import java.util.HashMap;

public class StringCompression {
	
	public static void main (String[] args)
    {
        String str = "aabbcdaav";
        Compression(str);
    }
	
	private static void Compression(String str)
	 {
		HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				int count =1;
				if(str.charAt(i)==str.charAt(j))
				{
					
					count = count +1;
					hmap.put(str.charAt(i), count);
					
				}
				else
				{
					hmap.put(str.charAt(i), count);
				}
			}
		}
	 }

}
