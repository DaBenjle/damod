package com.dabenjle.damod.devTools;

public class StringTools
{
	public static String getUserFriendlyNameFromRegistryName(String regName)
	{
		String s = (regName.substring(regName.indexOf(":") + 1, regName.length())).replace('_', ' ');
		if(s.length() < 4) return s;
		String f = "" + Character.toUpperCase(s.charAt(0));
		for(int i = 1; i < s.length(); i++)
		{
			if(s.charAt(i - 1) == ' ')
			{
				f += Character.toUpperCase(s.charAt(i));
			}
			else
			{
				f += s.charAt(i);
			}
		}
		return f;
	}
}
