package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class majamod {
	
    public static void st(Stage ps,int r)
    {
    	int rendm=r;
        Pane p1=new Pane();
        Pane p2=new Pane();	
        p1.setStyle("-fx-background-color:black");
        p2.setStyle("-fx-background-color:black");
        
        Font f1= Font.font("Times New Roman",FontWeight.BOLD,40);
        Text t=new Text("JUSTFOOD");
        t=new Text("JUSTFOOD");
        t.setFont(f1);
        t.setFill(Color.RED);
        t.setLayoutX(5.0);
        t.setLayoutY(35.0);
        Text tt=new Text("JUSTFOOD");
        tt=new Text("JUSTFOOD");
        tt.setFont(f1);
        tt.setFill(Color.RED);
        tt.setLayoutX(5.0);
        tt.setLayoutY(35.0);
        Font F2= Font.font("Times New Roman",18);
        Font F3= Font.font("Times New Roman",8);
        Text t1=new Text(Restoclass.r[rendm].name);//display r.name
        Text t2=new Text("Please rate and review the restaurant!");
        Text t3=new Text("Thank you!");
        Spinner spin=new Spinner(1,5,1);
        TextField tx=new TextField();
        TextArea tf=new TextArea();
        tf.setStyle("-fx-background-color:black");
        HBox h=new HBox(tf);
        Button b=new Button("SUBMIT");
        Button e=new Button("HOME");
  
        t1.setFont(F2);
        t3.setFont(f1);
        
        t1.setFill(Color.WHITE);
        t2.setFill(Color.WHITE);
        t3.setFill(Color.WHITE);
        t1.setX(10);
        t1.setY(80);
        t2.setX(10);
        t2.setY(140);
        t3.setX(180);
        t3.setY(200);
        spin.setLayoutX(10);
        spin.setLayoutY(160);
        h.setLayoutX(10);
        h.setLayoutY(200);
        b.setLayoutX(10);
        b.setLayoutY(400);
        e.setLayoutX(220);
        e.setLayoutY(250);
        p1.getChildren().addAll(t,t1,t2,spin,h,b);
        p2.getChildren().addAll(tt,t3,e);
        Scene sc1=new Scene(p1,500,500);
        Scene sc2=new Scene(p2,500,500);
        ps.setScene(sc1);
        ps.show();
        b.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent a)
            {
                Object x=(Integer)(spin.getValue());//update r.avgrating
                Restoclass.r[rendm].noofrating++;
                System.out.println(((Restoclass.r[rendm].avgrating*Restoclass.r[rendm].noofrating)+(Integer)x)/(Restoclass.r[rendm].noofrating));
                Restoclass.r[rendm].avgrating=((Restoclass.r[rendm].avgrating*Restoclass.r[rendm].noofrating)+(Integer)x)/(Restoclass.r[rendm].noofrating);
                System.out.println(Restoclass.r[rendm].avgrating+" "+Restoclass.r[rendm].noofrating);	        
                ps.setScene(sc2);
                ps.show();
                //System.out.println("ENTERED RATING IS "+x);
            }
        });
        e.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent e1)
            {
                ps.setScene(Main.init(ps));
                ps.show();
            	//st1.hide();
            }
        });
//	st2.setScene(sc3);
//	st2.show();
        //Scene sc4=new Scene(h,500,500,Color.WHITE);
        /*st1.setTitle("textfield");
        st1.setScene(sc4);
        st1.show();*/
    }
}
