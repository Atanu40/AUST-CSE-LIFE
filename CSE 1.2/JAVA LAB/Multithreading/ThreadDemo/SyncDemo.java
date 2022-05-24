/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo;

/**
 *
 * @author Asus
 */
// A Java program to demonstrate working of 
// synchronized. 
import java.io.*; 
import java.util.*; 

// A Class used to send a message 
class Sender 
{ 
	public void send(String msg) 
	{ 
		System.out.println("Sending\t" + msg ); 
		try
		{ 
			Thread.sleep(1000); 
		} 
		catch (Exception e) 
		{ 
			System.out.println("Thread interrupted."); 
		} 
		System.out.println(msg + "Sent"); 
	} 
} 

// Class for send a message using Threads 
class ThreadedSend extends Thread 
{ 
	private String msg; 
	Sender sender; 

	// Recieves a message object and a string 
	// message to be sent 
	ThreadedSend(String m, Sender obj) 
	{ 
		msg = m; 
		sender = obj; 
	} 

        @Override
	public void run() 
	{ 
		// Only one thread can send a message 
		// at a time. 
            for(int i=0;i<5;i++)
            {
		//synchronized(sender) 
		{ 
			// synchronizing the snd object 
			sender.send(msg+i); 
		}
            }
	} 
} 

// Driver class 
public class SyncDemo 
{ 
	public static void main(String args[]) 
	{ 
		Sender snd = new Sender(); 
		ThreadedSend S1 = 
			new ThreadedSend( " Hi " , snd ); 
		ThreadedSend S2 = 
			new ThreadedSend( " Bye " , snd ); 

		// Start two threads of ThreadedSend type 
		S1.start(); 
		S2.start(); 

		// wait for threads to end 
		try
		{ 
			S1.join(); 
			S2.join(); 
		} 
		catch(Exception e) 
		{ 
			System.out.println("Interrupted"); 
		} 
	} 
} 
