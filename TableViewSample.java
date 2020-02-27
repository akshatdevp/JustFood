package application;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.control.*; 
import javafx.scene.layout.*; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.collections.*; 
import javafx.stage.Stage; 
import javafx.scene.text.Text.*; 
import javafx.scene.paint.*; 
import javafx.scene.text.*;
import application.*;
 
public class TableViewSample  {
 
    private static TableView<Person> table = new TableView<Person>();
    private static final ObservableList<Person> data =
        FXCollections.observableArrayList(
            new Person("Average Time", "15 mins", "18 mins"),
            new Person("Rating", "4.1", "3.9"),
            new Person("Distance", "2.5KM", "2.2KM"),
            new Person("Avalibility", "24/7", "24/5"),
            new Person("Cost (for 2)", "Rs.420", "Rs.377"),
            new Person("Order From","Order","Order")
        );
   
   
    
    public static void ini(Stage stage,int r) {
    	
    	int rendm=r;
    	table.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
	Font F1= Font.font("Times New Roman",FontWeight.BOLD,20);
		Font F2= Font.font("Times New Roman",13);
	
		Font f1= Font.font("Times New Roman",FontWeight.BOLD,40);
        Text t1=new Text("JUSTFOOD");
        t1.setFont(f1);
        t1.setFill(Color.RED);
        t1.setLayoutX(5.0);
        t1.setLayoutY(35.0);

		
		Text t=new Text("JUSTFOOD");
	t.setFont(F1);
	t.setFill(Color.RED);
	t.setX(10);
	t.setY(20);
        Scene scene;
        Pane p1=new Pane();
        stage.setTitle("JUSTFOOD");
 
        final Label label = new Label(Restoclass.r[rendm].name);
        label.setTextFill(Color.WHITE);
        label.setFont(new Font("Times New Roman", 20));
 
        table.setEditable(true);
 
        TableColumn firstNameCol = new TableColumn("Parameters");
        firstNameCol.setMinWidth(100);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<Person, String>("firstName"));
 
        TableColumn lastNameCol = new TableColumn("Swiggy");
        lastNameCol.setMinWidth(100);
        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<Person, String>("lastName"));
 
        TableColumn emailCol = new TableColumn("Zomato");
        emailCol.setMinWidth(100);
        emailCol.setCellValueFactory(
                new PropertyValueFactory<Person, String>("email"));
 
        table.setItems(data);
        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);
        
        Button b1=new Button("HOME");
        
        b1.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e1)
            {
                stage.setScene(Main.init(stage));
                stage.show();
            	//st1.hide();
            }
        });
 
        final VBox vbox = new VBox();
        vbox.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(t1,label, b1,table);
        p1.setStyle("-fx-background-color:black");
        p1.getChildren().addAll(vbox);
        scene=new Scene(p1,500,500);
        scene.setFill(Color.BLACK);
        
        stage.setScene(scene);
        stage.show();
    }
 
    public static class Person {
 
        private final SimpleStringProperty firstName;
        private final SimpleStringProperty lastName;
        private final SimpleStringProperty email;
 
        private Person(String fName, String lName, String email) {
            this.firstName = new SimpleStringProperty(fName);
            this.lastName = new SimpleStringProperty(lName);
            this.email = new SimpleStringProperty(email);
        }
 
        public String getFirstName() {
            return firstName.get();
        }
 
        public void setFirstName(String fName) {
            firstName.set(fName);
        }
 
        public String getLastName() {
            return lastName.get();
        }
 
        public void setLastName(String fName) {
            lastName.set(fName);
        }
 
        public String getEmail() {
            return email.get();
        }
 
        public void setEmail(String fName) {
            email.set(fName);
        }
    }
} 