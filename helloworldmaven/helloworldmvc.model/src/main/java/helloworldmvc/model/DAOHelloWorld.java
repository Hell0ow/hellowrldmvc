package helloworldmvc.model;
import helloworldmvc.Contract.IModel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DAOHelloWorld {
	
	private String FileName = new String("HelloWorld.txt");
	private DAOHelloWorld instance = null;
	private String helloWorldMessage = null;
	
	//Constructeur
	protected DAOHelloWorld() {
		if(instance != null){
			instance = this;
			helloWorldMessage = "HelloWorld";
		}
	}
	
	//Accesseur et mutateur
	public DAOHelloWorld getInstance(){
		return instance;
	}
	private void setInstance(DAOHelloWorld instance){
		this.instance = instance;
	}
	
	
	
	private void readFile(){
		
		BufferedReader fLect = null;
		
		try {
			FileReader f = new FileReader(FileName);
			fLect = new BufferedReader(f);
			setHelloWorldMessage(fLect.readLine());
			
		} catch (Exception e) {
			System.out.println("Erreur de lecture");
			System.exit(-1);
		} finally {
			try {
				fLect.close();
			} catch (IOException e) {
				System.out.println("Erreur de lecture");
				System.exit(-1);
			}
		}
	}

	
	public String getHelloWorldMessage(){
		readFile();
		return helloWorldMessage;
	}
	
	public void setHelloWorldMessage(String helloWorldMessage){
		this.helloWorldMessage = helloWorldMessage;
	}
}
