package helloworldmvc.model;
import helloworldmvc.Contract.IModel;

public class DAOHelloWorld {
	
	private String FileName = new String("HelloWorld.txt");
	private DAOHelloWorld instance = null;
	private String helloWorldMessage = null;
	
	//Constructeur
	protected DAOHelloWorld(String fileName, DAOHelloWorld instance, String helloWorldMessage) {
		FileName = fileName;
		this.instance = instance;
		this.helloWorldMessage = helloWorldMessage;
	}
	
	//Getter et Setter
	public DAOHelloWorld getInstance(){
		return instance;
	}
	private void setInstance(DAOHelloWorld instance){
		this.instance = instance;
	}
	
	
	
	private void readFile(){
	}
	
	public String getHelloWorldMessage(){
		return null;
	}
	
	public void setHelloWorldMessage(String helloWorldMessage){
	}
}
