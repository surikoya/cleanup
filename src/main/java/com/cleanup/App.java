package com.cleanup;

import com.cleanup.service.CleanupService;
import com.cleanup.service.CleanupServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	CleanupService svc = new CleanupServiceImpl();
    	String output = svc.cleanup(args[0], args[1]);
        System.out.println("calling cleanup(\"" + args[0] + "\", \"" + args[1] + "\") returns \"" + output + "\"");
    }
}
