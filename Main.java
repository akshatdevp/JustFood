package application;

import java.util.Arrays;
import java.util.Comparator;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import application.*;

public class Main  {
	
	static Text t,t1,t2,t3,t4,t5,tt1,tt2,tt3,tt4,tt5;
	static HBox hb11,hb12,hb1,hb21,hb22,hb2,hb31,hb32,hb3,hb41,hb42,hb4;static VBox vb1;
	static Insets mr;static TextField tf1;static Stage primaryStage;
	static Button b1,b2,b3,b4,b5,b6,b7;static Border bb1;
	static Pane root;static Scene scene;static Line l1,l2;
	
	static Scene init(Stage st1) {
		
			
			
			l1 = new Line(); 
		    l1.setStartX(0.0); 
		    l1.setStartY(1.0); 
		    l1.setEndX(500.0); 
		    l1.setEndY(1.0);
		    l1.setStroke(Color.WHITE);
		    
		    l2 = new Line(); 
		    l2.setStartX(0.0); 
		    l2.setStartY(40.0); 
		    l2.setEndX(500.0); 
		    l2.setEndY(40.0);
		    l2.setStroke(Color.WHITE);
		    
		    bb1=new Border(new BorderStroke(Color.GREY, BorderStrokeStyle.SOLID,null, new BorderWidths(1.5)));
		    
		    Font f1= Font.font("Times New Roman",FontWeight.BOLD,40);
	        t1=new Text("JUSTFOOD");
	        t1.setFont(f1);
	        t1.setFill(Color.RED);
	        t1.setLayoutX(5.0);
	        t1.setLayoutY(35.0);

	        tf1=new TextField();
	        tf1.setPromptText("Search restaurant/dish");
	        tf1.setStyle("-fx-background-color:grey");
	        tf1.setLayoutX(5.0);
	        tf1.setLayoutY(43.0);
	        tf1.setMinSize(250.0, 20.0);
	        tf1.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() { 
		           @Override 
		           public void handle(MouseEvent e) { 
		        	   //Prateek's here
		        	   prateeksearch.iniii(st1);
		           } 
		        });  
		    
	       Platform.runLater(()->root.requestFocus());
	        
	        b6=new Button("Dietary_Preference");
		    b6.setLayoutX(263.0);
		    b6.setLayoutY(43.0);
		    b6.setOnAction(new EventHandler<ActionEvent>(){
	            public void handle(ActionEvent e1)
	            {
	               aaa.inii(st1);
	                //Sumegh's stage here
	            }
	        });
		    
	        b7=new Button("Compare Services");
	        b7.setLayoutX(383.0);
		    b7.setLayoutY(43.0);
		    b7.setOnAction(new EventHandler<ActionEvent>(){
	            public void handle(ActionEvent e1)
	            {
	                TableViewSample.ini(st1,0);
	                //Khaled's stage here
	            }
	        });

	        b1=new Button("Rate & Review");
		    b1.setLayoutX(367.0);
		    b1.setLayoutY(42.0);
		    
		    
		    b2=new Button("Rate & Review");
		    b2.setLayoutX(367.0);
		    b2.setLayoutY(42.0);
		    
		    
		    b3=new Button("Rate & Review");
		    b3.setLayoutX(367.0);
		    b3.setLayoutY(42.0);
		    
		    b4=new Button("Rate & Review");
		    b4.setLayoutX(367.0);
		    b4.setLayoutY(42.0);
		    		    
		    mr=new Insets(10,10,10,10);
		    

		    t=new Text(String.format("%s\n%s\n%s\n%d",Restoclass.r[0].name,Restoclass.r[0].address,Restoclass.r[0].contact,Restoclass.r[0].avgrating));
		    t.setFill(Color.WHITE);
		    
		    tt1=new Text(String.format("NO.OF REVIEWS\n\n\t%d",Restoclass.r[0].noofrating));
		    tt1.setFill(Color.WHITE);
		    
		    t2=new Text(String.format("%s\n%s\n%s\n%d",Restoclass.r[1].name,Restoclass.r[1].address,Restoclass.r[1].contact,Restoclass.r[1].avgrating));
		    t2.setFill(Color.WHITE);
		    
		    tt2=new Text(String.format("NO.OF REVIEWS\n\n\t%d",Restoclass.r[1].noofrating));
		    tt2.setFill(Color.WHITE);
		    
		    t3=new Text(String.format("%s\n%s\n%s\n%d",Restoclass.r[2].name,Restoclass.r[2].address,Restoclass.r[2].contact,Restoclass.r[2].avgrating));
		    t3.setFill(Color.WHITE);
		    
		    tt3=new Text(String.format("NO.OF REVIEWS\n\n\t%d",Restoclass.r[2].noofrating));
		    tt3.setFill(Color.WHITE);
		    
		    t4=new Text(String.format("%s\n%s\n%s\n%d",Restoclass.r[3].name,Restoclass.r[3].address,Restoclass.r[3].contact,Restoclass.r[3].avgrating));
		    t4.setFill(Color.WHITE);
		    
		    tt4=new Text(String.format("NO.OF REVIEWS\n\n\t%d",Restoclass.r[3].noofrating));
		    tt4.setFill(Color.WHITE);	    		    
		    
		    
		    hb11=new HBox(t);
		    hb11.setPrefSize(200.0,80.0);
		    //hb1.setBorder(bb1);
		    hb11.setPadding(mr);
		    hb11.setSpacing(50);

		    hb12=new HBox(tt1,b1);
		    hb12.setPrefSize(300.0,80.0);
		    //hb1.setBorder(bb1);
		    hb12.setPadding(mr);
		    hb12.setSpacing(80.0);

		    hb12.setAlignment(Pos.CENTER_RIGHT);
	        HBox.setHgrow(hb12, Priority.ALWAYS);
		    
		    hb1=new HBox(hb11,hb12);
		    hb1.setPrefSize(500.0,80.0);
		    //hb1.setBorder(bb1);
		    hb1.setPadding(mr);
		    hb1.setSpacing(10.0);

		    hb21=new HBox(t2);
		    hb21.setPrefSize(200.0,80.0);
		    //hb1.setBorder(bb1);
		    hb21.setPadding(mr);
		    hb21.setSpacing(90.0);

		    hb22=new HBox(tt2,b2);
		    hb22.setPrefSize(300.0,80.0);
		    //hb1.setBorder(bb1);
		    hb22.setPadding(mr);
		    hb22.setSpacing(80.0);

		    hb22.setAlignment(Pos.CENTER_RIGHT);
	        HBox.setHgrow(hb22, Priority.ALWAYS);

		    hb2=new HBox(hb21,hb22);
		    hb2.setPrefSize(490.0,80.0);
		    hb2.setPadding(mr);
		    hb2.setBorder(bb1);
		    hb2.setSpacing(10.0);

		    hb31=new HBox(t3);
		    hb31.setPrefSize(200.0,80.0);
		    //hb1.setBorder(bb1);
		    hb31.setPadding(mr);
		    hb31.setSpacing(55.0);

		    hb32=new HBox(tt3,b3);
		    hb32.setPrefSize(300.0,80.0);
		    //hb1.setBorder(bb1);
		    hb32.setPadding(mr);
		    hb32.setSpacing(80.0);

		    hb32.setAlignment(Pos.CENTER_RIGHT);
	        HBox.setHgrow(hb32, Priority.ALWAYS);

		    hb3=new HBox(hb31,hb32);
		    hb3.setPrefSize(490.0,80.0);
		    hb3.setBorder(bb1);
		    hb3.setPadding(mr);
		    hb3.setSpacing(10.0);

		    hb41=new HBox(t4);
		    hb41.setPrefSize(200.0,80.0);
		    //hb1.setBorder(bb1);
		    hb41.setPadding(mr);
		    hb41.setSpacing(55.0);

		    hb42=new HBox(tt4,b4);
		    hb42.setPrefSize(300.0,80.0);
		    //hb1.setBorder(bb1);
		    hb42.setPadding(mr);
		    hb42.setSpacing(80.0);

		    hb42.setAlignment(Pos.CENTER_RIGHT);
	        HBox.setHgrow(hb42, Priority.ALWAYS);

		    hb4=new HBox(hb41,hb42);
		    hb4.setPrefSize(490.0,80.0);
		    hb4.setBorder(bb1);
		    hb4.setPadding(mr);
		    hb4.setSpacing(10.0);

		    vb1=new VBox(hb1,hb2,hb3,hb4);
		    vb1.setLayoutX(0.0);
		    vb1.setLayoutY(75.0);        

		    root = new Pane();
	        root.setStyle("-fx-background-color:black");
	        root.getChildren().addAll(l1,t1,l2,tf1,b6,b7,vb1);

	         scene = new Scene(root,500,500);
			
			b1.setOnAction(new EventHandler<ActionEvent>(){
	            public void handle(ActionEvent e1)
	            {
	                majamod.st(st1, 0);
	            }
	        });
			b2.setOnAction(new EventHandler<ActionEvent>(){
	            public void handle(ActionEvent e1)
	            {
	                majamod.st(st1, 1);
	            }
	        });
		    b3.setOnAction(new EventHandler<ActionEvent>(){
	            public void handle(ActionEvent e1)
	            {
	                majamod.st(st1, 2);
	            }
	        });
		    b4.setOnAction(new EventHandler<ActionEvent>(){
	            public void handle(ActionEvent e1)
	            {
	                majamod.st(st1, 3);
	            }
	        });
		    
		    return scene;
	}
	
}

class Restoclass {
	static Restoclass r[]=new Restoclass[5];
	static {
		/*for(int i=0;i<5;i++) {
			r[i]=new Restoclass(String.format("%s%d","resto",i),i,0,String.format("%s%d","987659876",i),String.format("%s%d","address",i),0,true);
	    }*/
		r[0]=new Restoclass("Santosh Dhaba", 01, 3, "9876598765", "Begum Bazaar,Hyd-500012", 14, true);
		r[1]=new Restoclass("Jashan", 02, 4, "9876598764", "Abids,Hyd-500001", 1, true);
		r[2]=new Restoclass("Royalton", 03, 3, "9876598763", "Gunfoundry,Hyd-500001", 8, true);
		r[3]=new Restoclass("Taj Krishna", 04, 5, "9876598762", "Bajara Hills,Hyd-500034", 35, true);
		r[4]=new Restoclass("Minerva Grand", 05, 4, "9876598761", "Secundrabad-500003", 16, true);
		
		Arrays.sort(r,new Comparator<Restoclass>() {
			@Override
			public int compare(Restoclass r1,Restoclass r2) {
				return r2.avgrating-r1.avgrating;
			}
		});
	}
	int id,avgrating,noofrating;
	String name,contact,address;
	Boolean dp;
	Restoclass(String name,int id,int avg,String c,String a,int nr,Boolean b)
	{
		this.name=name;
		this.id=id;
		avgrating=avg;
		contact=c;
		address=a;
		noofrating=nr;
		dp=b;
	}

}
