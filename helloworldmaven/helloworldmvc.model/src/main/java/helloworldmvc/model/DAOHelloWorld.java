package helloworldmvc.model;
import helloworldmvc.Contract.IModel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

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
	
	//Getter et Setter
	public DAOHelloWorld getInstance(){
		return instance;
	}
	private void setInstance(DAOHelloWorld instance){
		this.instance = instance;
	}
	
	
	
	private void readFile(){
		File f = new File("HelloWorld.txt");
		
		if(!f.exists()){
			System.out.println("Fichier absent.");
		}
		else{
			FileInputStream fLect = null;
			
			try {
				fLect = new FileInputStream(f);
				
			} catch (FileNotFoundException e) {
				
				System.out.println("Erreur de lecture");
				System.exit(-1);
			}
			System.out.println();
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
