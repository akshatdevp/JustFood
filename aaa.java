package application;
import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.control.*; 
import javafx.scene.layout.*; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.collections.*; 
import javafx.stage.Stage; 
import javafx.scene.text.Text.*; 
import javafx.scene.paint.*; 
import javafx.scene.text.*; 
public class aaa {
	static String cmd,sel; 

	public static void inii(Stage stage) 
	{
		Stage st1=stage;
		stage.setTitle("foodbegins");
		Font F1= Font.font("Times New Roman",FontWeight.BOLD,40);
		Font F2= Font.font("Times New Roman",13);
		Text t=new Text("JUSTFOOD");
		Text t1=new Text("SELECT FROM THE LIST");
		Button b=new Button("SUBMIT");
		Button e=new Button("HOME");
		String []opt = {"All","Veg","Non Veg","Vegan"};
		ComboBox cb = new ComboBox(FXCollections.observableArrayList(opt));
		ListView<String> list = new ListView<String>();
		ObservableList<String> all =FXCollections.observableArrayList ("Santosh Dhaba", "Chutneys", "Bombay Juice", "Flavours of Taj Mahal Hotel","Hotel Azizia", "Euro Bakers", "Pista House", "Lavish Corner","Bikanervala", "Veggie Delite");
		ObservableList<String> veg =FXCollections.observableArrayList ("Santosh Dhaba", "Chutneys", "Bombay Juice", "Flavours of Taj Mahal Hotel");
		ObservableList<String> non =FXCollections.observableArrayList ("Hotel Azizia", "Euro Bakers", "Pista House", "Lavish Corner");
		ObservableList<String> vegan =FXCollections.observableArrayList ("Bikanervala", "Veggie Delite");
		cb.setValue(opt[0]);
		sel=opt[0];
		cmd=sel+" selected";
		t.setFont(F1);
		t1.setFont(F2);
		t.setFill(Color.RED);
		t1.setFill(Color.WHITE);
		t.setX(5);
		t.setY(35);
		t1.setX(10);
        	t1.setY(80);
		cb.setLayoutX(10);
        	cb.setLayoutY(140);
		b.setLayoutX(10);
        	b.setLayoutY(220);
		list.setLayoutX(125);
        	list.setLayoutY(20);
		list.setPrefWidth(250);
		list.setPrefHeight(200);
        	e.setLayoutX(220);
        	e.setLayoutY(250);
		Pane p1 = new Pane();
		Pane p2 = new Pane();
		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
            		public void handle(ActionEvent e) 
            		{
			sel=(String)cb.getValue();
			cmd=sel+" selected";
            		} 
        	};
		cb.setOnAction(event);
		
		p1.getChildren().addAll(t,t1,b);
		p1.getChildren().add(cb);
		p2.getChildren().addAll(e,list);
		p1.setStyle("-fx-background-color:black");
		p2.setStyle("-fx-background-color:black");
		Scene scene = new Scene(p1,500,500);
		Scene scene1 = new Scene(p2,500,500); 
		st1.setScene(scene);
		st1.show();
		
		b.setOnAction(new EventHandler<ActionEvent>(){
    		public void handle(ActionEvent a)
    		{
		System.out.println(cmd);
		st1.setTitle(sel);
		if(sel==opt[0])
		list.setItems(all);
		if(sel==opt[1])
		list.setItems(veg);
		if(sel==opt[2])
		list.setItems(non);
		if(sel==opt[3])
		list.setItems(vegan);
		st1.setScene(scene1);
		st1.show();
			}
	});
e.setOnAction(new EventHandler<ActionEvent>(){
    		public void handle(ActionEvent a)
    		{
		
    			st1.setScene(Main.init(st1));
    			st1.show();
    		}
	});
		
	} 
	
} 
