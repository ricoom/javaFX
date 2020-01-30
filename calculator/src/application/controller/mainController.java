package application.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class mainController {
	@FXML
	private Button sub;
	@FXML
	private Button eight;
	@FXML
	private Button add;
	@FXML
	private Button nine;
	@FXML
	private Button five;
	@FXML
	private Button one;
	@FXML
	private Button four;
	@FXML
	private Button six;
	@FXML
	private Button two;
	@FXML
	private Button three;
	@FXML
	private Button prod;
	@FXML
	private Button zero;
	@FXML
	private Button seven;
	@FXML
	private Button clear;
	@FXML
	private Button enter;
	@FXML
	private TextField screen;
	
	int a=0;
	int b=0;
	int ans=0;
	String operator;

	// Event Listener on Button[#sub].onAction
	@FXML
	public void handleAction(ActionEvent event) {
	    if(event.getSource()==one) {
	    	screen.setText(screen.getText()+"1");
	}
	    else if(event.getSource()==two) {
	    	screen.setText(screen.getText()+"2");
	}
	    else if(event.getSource()==three) {
	    	screen.setText(screen.getText()+"3");
	}
	    else if(event.getSource()==four) {
	    	screen.setText(screen.getText()+"4");
	}
	
	    else if(event.getSource()==five) {
	    	screen.setText(screen.getText()+"5");
	}
	    else if(event.getSource()==six) {
	    	screen.setText(screen.getText()+"6");
	}
	    else if(event.getSource()==seven) {
	    	screen.setText(screen.getText()+"7");
	}
	    else if(event.getSource()==eight) {
	    	screen.setText(screen.getText()+"2");
	}
	    else if(event.getSource()==nine) {
	    	screen.setText(screen.getText()+"9");
	}
	    else if(event.getSource()==add) {
	    	screen.setText(screen.getText()+" + ");
	}
	    else if(event.getSource()==sub) {
	    	screen.setText(screen.getText()+" - ");
	}
	    else if(event.getSource()==clear) {
	    	screen.clear();
	}
	    else if(event.getSource()==prod) {
	    	screen.setText(screen.getText()+" * ");
	}
	    else if(event.getSource()==enter) {
	    	String screenItems = screen.getText();
	    	String[] parts=screenItems.split(" ",3);
	    	 a=Integer.parseInt(parts[0]);

	   	     b=Integer.parseInt(parts[2]);
	   	     operator=parts[1];
	   	    
	    	switch(operator) {
	    	case "+":	
	   	    	ans=(a+b);
	   	    	break;
	   	    case "*":
	   	    	ans=(a*b);
	   	    	break;
	   	 case "-":
	   	    	ans=(a-b);
	   	    	break;
	    	}
	    	screen.clear();
	    	screen.setText(screen.getText()+ans);
			}
	
	}
	
}
