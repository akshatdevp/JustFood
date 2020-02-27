package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Spinner;
//import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class prateeksearch {
    public static void iniii(Stage st)
    {
        Stage st1=st;
        Pane p1=new Pane();
        Pane p2=new Pane();
        p1.setStyle("-fx-background-color:black");
        p2.setStyle("-fx-background-color:black");
        Font F1= Font.font("Times New Roman",FontWeight.BOLD,40);
        Font F2= Font.font("Times New Roman",15);
        Font F3= Font.font("Times New Roman",10);
        Text t=new Text("JUSTFOOD");
        Text t1=new Text("SEARCH RESTAURANT");
        Text t2=new Text("Please enter keywords for your favorite restaurant");
        Text t3=new Text("Pardise hotel, Secunderabad.");
        Text t4=new Text("Pardise hotel, Himayathnagar.");
        Spinner spin=new Spinner(1,5,1);
        TextArea tf=new TextArea();
        tf.setStyle("-fx-background-color:black");
        tf.setMaxSize(300,5);
        HBox h=new HBox(tf);
        Button b=new Button("SEARCH");
        Button f=new Button("FILTER");
        Button s=new Button("SORT");
        Button e=new Button("HOME");
        t.setFont(F1);
        t1.setFont(F2);
        t3.setFont(F2);
        t4.setFont(F2);
        t.setFill(Color.RED);
        t1.setFill(Color.WHITE);
        t2.setFill(Color.WHITE);
        t3.setFill(Color.WHITE);
        t4.setFill(Color.WHITE);
        t.setX(5);
        t.setY(35);
        t1.setX(150);
        t1.setY(80);
        t2.setX(10);
        t2.setY(140);
        t3.setX(15);
        t3.setY(30);
        t4.setX(15);
        t4.setY(60);
        spin.setLayoutX(10);
        spin.setLayoutY(160);
        h.setLayoutX(50);
        h.setLayoutY(280);
        b.setLayoutX(360);
        b.setLayoutY(285);
        f.setLayoutX(80);
        f.setLayoutY(200);
        s.setLayoutX(300);
        s.setLayoutY(200);
        e.setLayoutX(220);
        e.setLayoutY(250);
        
        p1.getChildren().addAll(t,t1,t2,h,b,f,s);
        p2.getChildren().addAll(t3,t4,e);
        Scene sc1=new Scene(p1,500,500);
        Scene sc2=new Scene(p2,500,500);
        st.setTitle("foodbegins");
        st.setScene(sc1);
        st.show();
   
        b.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent a)
            {
                Object x=spin.getValue();
                System.out.println("ENTERED RATING IS "+x);
                st1.setScene(sc2);
                st1.show();
                
            }
        });
        e.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e1)
            {
                st1.setScene(Main.init(st1));
            	st1.show();
            }
        });
        //Scene sc4=new Scene(h,500,500,Color.WHITE);
        /*st1.setTitle("textfield");
        st1.setScene(sc4);
        st1.show();*/
    }
}
