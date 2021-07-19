package edu.uptc.run.actProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Scanner;



public class ActProperties {
	static  Scanner sc = new Scanner (System.in);
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load (new FileInputStream("rsources/files/users.properties"));
		properties.load(new FileInputStream("rsources/files/setup.properties"));
		properties.storeToXML(new FileInputStream("rsources /files.users.xml"),"ejemplo xml");
		Enumeration<String> en =  (Enumeration<String>) properties.propertyNames();
		while (en.hasMoreElements()){
			String user = en.nextElement ();
			String pass = properties.getProperty (user);
			System.out.println("Digite el nombre de usuario ");
			String nom = sc.next ();
			System.out.println("Digite la contraseña");
			String con = sc.next();
//			if (){
				
				
			System.out.println(user+ "-------->"+pass);
			
				
			}
		}
		
		
	}
	
	
	
	
