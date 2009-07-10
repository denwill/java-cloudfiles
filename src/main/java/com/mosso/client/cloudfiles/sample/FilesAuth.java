/*
 * See COPYING for license information.
 */ 

package com.mosso.client.cloudfiles.sample;

import com.mosso.client.cloudfiles.*;

public class FilesAuth
{
	public static void main(String[] args)
	{
		try
		{
			FilesClient client = new FilesClient();
			boolean success = client.login();
			if (success)
			{
				System.out.println("username: "+client.getUserName());
				System.out.println("url: "+client.getStorageURL());
				System.out.println("token: "+client.getStorageToken());
			}
			else
			{
				System.out.println("login failed.");
			}
		}
		catch (Exception e)
		{
			System.err.println(e.toString());
		}
	}
}
