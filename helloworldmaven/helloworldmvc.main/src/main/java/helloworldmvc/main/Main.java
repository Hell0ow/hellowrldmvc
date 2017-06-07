package helloworldmvc.main;

import helloworldmvc.Contract.IModel;
import helloworldmvc.Contract.IView;
import helloworldmvc.controller.Controller;
import helloworldmvc.model.Model;
import helloworldmvc.view.View;

public class Main{

	public static void main(String[] args) {
		IView view = new View();
		IModel model = new Model();
		Controller controller = new Controller(view, model);
	}
}
