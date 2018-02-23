//Will run tests on my Topcoder solutions using data from files [challenge]-[division]-[problem].data
//Jered Linaes 2/22/2018

import java.util.Scanner;
import java.io.IOException;
import java.io.File;


public class Runner {

	//generally wouldn't use a global variable, but this is just for testing
	public String challenge; 

	//args[0]: Challenge number
	//args[1]: Problem number
	public static void main(String[] args){
		Runner run = new Runner();
		run.challenge = args[0];
		switch(args[1]){
			case "1":
				run.run1(run.load1());
				break;
			case "2":
				run.run2(run.load2());
				break;
			case "3":
				run.run3(run.load3());
		}
	
	}

	public Runner(){
	}
	
	public void load1(){
		//get data from [challenge]-d2-1.data
		Scanner scan; 
		try{
			scan = new Scanner(new File(challenge+"-d2-1.data"));
		}catch(IOException e){
			System.out.println("Issue with file");
		}

		

	}

	public void run1(){

	}

	public void load2(){
		//get data from [challenge]-d2-1.data
		Scanner scan; 
		try{
			scan = new Scanner(new File(challenge+"-d2-2.data"));
		}catch(IOException e){
			System.out.println("Issue with file");
		}


	}

	public void run2(){

	}

	public void load3(){
		//get data from [challenge]-d2-1.data
		Scanner scan; 
		try{
			scan = new Scanner(new File(challenge+"-d2-3.data"));
		}catch(IOException e){
			System.out.println("Issue with file");
		}



	}
	
	public void run3(){

	}

}


