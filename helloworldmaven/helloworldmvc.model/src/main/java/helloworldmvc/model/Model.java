package helloworldmvc.model;
import helloworldmvc.Contract.IModel;

public class Model implements IModel {
	
	public String getHelloWorld(){
		return new DAOHelloWorld(null, null, null).getHelloWorldMessage();
	}
}
