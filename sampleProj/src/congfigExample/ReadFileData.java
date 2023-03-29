package congfigExample;

import java.io.IOException;

import util.ReadConfigData;

class ReadFileData{
	
	public static void main(String args[]) throws IOException
	{
		ReadConfigData r= new ReadConfigData();
		r.getName();
		r.getTitle();
		//System.out.println("User name is "+ r.getName());
		//System.out.println("User title is "+ r.getTitle());
	}
}