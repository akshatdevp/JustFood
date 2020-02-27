package application;

import javafx.event.*;
import java.util.regex.*;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.text.*;
import javafx.stage.*;
import javafx.scene.paint.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import java.util.*;
class Account{
	private static HashMap<String,Account> acs=new HashMap<String,Account>();
	static
	{
		new Account("admin","0","admin","admin","0000");
		new Account("admin","1","admin1","admin1","1111");
		new Account("ekshit","69","ekshit","as69420","69420");
	}
	final String fn,ln,em;
	String key,ph;
	Account(String f,String l,String e,String k,String p)
	{
		fn=f;
		ln=l;
		em=e;
		key=k;
		ph=p;
		acs.put(em,this);
	}
	String getFn()
	{
		return fn;
	}
	String getln()
	{
		return ln;
	}
	String getE()
	{
		return em;
	}
	String getK()
	{
		return key;
	}
	String getP()
	{
		return ph;
	}
	static Account getAcc(String e,String k)
	{
		if(e!=null&&acs.containsKey(e))
		{
			if(k!=null&&acs.get(e).key.equals(k))
			{
				return acs.get(e);
			}
		}
		return null;
	}
	static boolean isP(String e)
	{
		return acs.containsKey(e);
	}
}
class LI
{
	public static Scene getS()
	{
		VBox vb=new VBox();
		vb.setAlignment(Pos.CENTER);
		Text t;
		Font F1= Font.font("Times New Roman",FontWeight.BOLD,50);
		Label l1,l2;
		TextField tf1;
		PasswordField tf2;
		Button b1,b2;
		HBox h1,h2,h3,h4,h5,h6,h7,h8,h9;
		Insets mr;
		Border eb=new Border(new BorderStroke(Color.RED,BorderStrokeStyle.SOLID,null,new BorderWidths(3))),cb=new Border(new BorderStroke(Color.GREEN,BorderStrokeStyle.SOLID,null,new BorderWidths(3)));
    	Color ec=Color.rgb(255,0,0,1),cc=Color.rgb(0,255,0,1);
		mr=new Insets(10,10,10,10);
		t=new Text("JUSTFOOD");
		l1=new Label("Email:      ");
		l2=new Label("Password:");
		tf1=new TextField();
		tf2=new PasswordField();
		b1=new Button("login");
		b2=new Button("sign up");
		tf1.setPromptText("Enter Email...   ");
		tf2.setPromptText("Enter Password...");
		h1=new HBox(t);
		h2=new HBox(l1);
		h3=new HBox(tf1);
		h4=new HBox(l2);
		h5=new HBox(tf2);
		h6=new HBox(b1);
		h7=new HBox(h2);
		h8=new HBox(h4);
		h9=new HBox(b2);
		t.setFont(F1);
        t.setFill(Color.RED);
        l1.setTextFill(Color.WHITE);
        l2.setTextFill(Color.WHITE);
        h1.setAlignment(Pos.BASELINE_CENTER);
        h2.setAlignment(Pos.BASELINE_CENTER);
        h3.setAlignment(Pos.BASELINE_CENTER);
        h4.setAlignment(Pos.BASELINE_CENTER);
        h5.setAlignment(Pos.BASELINE_CENTER);
        h6.setAlignment(Pos.BASELINE_CENTER);
        h7.setAlignment(Pos.BASELINE_CENTER);
        h8.setAlignment(Pos.BASELINE_CENTER);
        h9.setAlignment(Pos.BASELINE_CENTER);
        h7.getChildren().add(h3);
        h8.getChildren().add(h5);
        h1.setMargin(t, mr);
        h2.setMargin(l1, mr);
        h2.setMargin(tf1, mr);
        h4.setMargin(l2, mr);
        h4.setMargin(tf2, mr);
        h6.setMargin(b1, mr);
        h7.setMargin(l1, mr);
        h8.setMargin(l2, mr);
        h7.setMargin(tf1, mr);
        h8.setMargin(tf2, mr);
        h9.setMargin(b2, mr);
        vb.getChildren().add(h1);
        vb.getChildren().add(h7);
        vb.getChildren().add(h8);
        vb.getChildren().add(h6);
        vb.getChildren().add(h9);
        vb.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY, Insets.EMPTY)));
        b1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				Account ac=(Account.getAcc(tf1.getText(),tf2.getText()));
				l1.setTextFill(cc);
				l2.setTextFill(cc);
				tf1.setBorder(cb);
				tf2.setBorder(cb);
				if(ac==null)
				{
					if(!Account.isP(tf1.getText())) {
					System.err.println("em pw err");
					l1.setTextFill(ec);
					tf1.setBorder(eb);}else System.err.println("pw err");
					l2.setTextFill(ec);
					tf2.setBorder(eb);
				}else
				{
					maja.acc=ac;
					/*
					 * 
					 * yaha tera aana
					 * 
					 * 
					 * 
					 */
					maja.st1.setScene(maja.sc);
				}
			}
		});
       b2.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				maja.st1.setScene(maja.ca);
			}
		});
       vb.autosize();
		return new Scene(vb,500,500,Color.BLACK);
	}
}
class CA{
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE),VP= Pattern.compile("\\d{10}",Pattern.CASE_INSENSITIVE),VK=Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$\\(\\)%^&+=])(?=\\S+$).{8,}$",Pattern.UNICODE_CASE);
	public static boolean cs=true;
		public static boolean validate(String emailStr) {
		        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
		        return matcher.find();
		}
		public static boolean validateP(String p) {
	        Matcher matcher = VP .matcher(p);
	        return matcher.find();
	}
		public static boolean validateK(String k) {
	        Matcher matcher = VK.matcher(k);
	        return matcher.find();
	}
	public static Scene getS()
	{
    	VBox vb=new VBox();
    	Border eb=new Border(new BorderStroke(Color.RED,BorderStrokeStyle.SOLID,null,new BorderWidths(3))),cb=new Border(new BorderStroke(Color.GREEN,BorderStrokeStyle.SOLID,null,new BorderWidths(3)));
    	Color ec=Color.rgb(255,0,0,1),cc=Color.rgb(0,255,0,1);
        Label l1=new Label("Name:"),l2=new Label("Email:"),l3=new Label("Password:"),l4=new Label("Phone no.:"),l5=new Label("Confirm Password:");
        Font F1= Font.font("Times New Roman",FontWeight.BOLD,20),F2= Font.font("Times New Roman",13),F3= Font.font("Times New Roman",20);
        Text t=new Text("JUSTFOOD"),t1=new Text("I accept the \"Terms and conditions\"");
        CheckBox cb1=new CheckBox();
        TextField tf1=new TextField(),tf2=new TextField(),tf3=new TextField(),tf4=new TextField(),tf5=new TextField();
        PasswordField pf1=new PasswordField(),pf2=new PasswordField();
        Button bu=new Button("Create Account");
        HBox h1=new HBox(),h2=new HBox(),h3=new HBox(),h4=new HBox(l2),h5=new HBox(tf3),h6=new HBox(l3),h7=new HBox(pf1),h8=new HBox(l4),h9=new HBox(cb1),h10=new HBox(t1),h11=new HBox(bu);
        Insets mr=new Insets(10,10,10,10);
        t.setFont(F1);
        t.setX(10);
        t.setY(20);
        t.setFill(Color.RED);
        t1.setFill(Color.WHITE);
        l1.setTextFill(Color.WHITE);
        l2.setTextFill(Color.WHITE);
        l3.setTextFill(Color.WHITE);
        l4.setTextFill(Color.WHITE);
        l5.setTextFill(Color.WHITE);
        l1.setTextFill(Color.WHITE);
        pf1.setPromptText("Password");
        pf2.setPromptText("Confirm Password");
        tf1.setPromptText("First Name");
        tf2.setPromptText("Last Name");
        tf3.setPromptText("Email Address");
        tf4.setPromptText("phone number");
        t1.setUnderline(true);
        l1.setPrefSize(150,10);
        tf1.setPrefSize((500-30)/2,10);
        tf2.setPrefSize((500-30)/2,10);
        l3.setPrefSize((500-30)/2,10);
        l5.setPrefSize((500-30)/2,10);
        pf1.setPrefSize((500-30)/2,10);
        pf2.setPrefSize((500-30)/2,10);
        l4.setPrefSize(100, 10);
        tf4.setPrefSize(500-100-30-20+10+10, 10);
        h10.setPrefSize(550,10);
        tf3.setPrefSize((500-20),10);
        
        h8.setSpacing(0);
        tf4.setAlignment(Pos.BASELINE_LEFT);

        h9.setSpacing(0);
        
		h1.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
		h2.setAlignment(Pos.CENTER);
		h4.setMargin(l2, mr);
		h6.setMargin(l3, mr);
        h6.setMargin(l5, mr);
        h7.setMargin(pf1, mr);
        h7.setMargin(pf2, mr);
        h5.setMargin(tf3, mr);
        h8.setMargin(l4, mr);
        h8.setMargin(tf4, mr);
		h9.setMargin(cb1, mr);
        h9.setMargin(h10, mr);
		h2.setMargin(tf1, mr);
		h2.setMargin(tf2, mr);
		h3.setMargin(l1, mr);
		h11.setMargin(bu, mr);
		
		h11.setAlignment(Pos.BOTTOM_CENTER);
		
		h3.getChildren().add(l1);
        h2.getChildren().add(t);
        h6.getChildren().add(l5);
        h8.getChildren().add(tf4);
        h7.getChildren().add(pf2);
        h9.getChildren().add(h10);
        h1.getChildren().add(tf1);
        h1.getChildren().add(tf2);
        
		vb.getChildren().add(h2);
		vb.getChildren().add(h3);
		vb.getChildren().add(h1);
		vb.getChildren().add(h4);
		vb.getChildren().add(h5);
		vb.getChildren().add(h6);
		vb.getChildren().add(h7);
		vb.getChildren().add(h8);
		vb.getChildren().add(h9);
		vb.getChildren().add(h11);
		
		vb.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY,Insets.EMPTY)));
		bu.setOnAction(new EventHandler<ActionEvent>(){
        	public void handle(ActionEvent e)
        	{
        		if(tf1.getText().equals("admin"))
        			{
        				maja.st1.setScene(maja.gh);
        				return;
        			}
        		boolean ck=true;
        		tf1.setBorder(cb);
        		tf2.setBorder(cb);
        		tf3.setBorder(cb);
        		tf4.setBorder(cb);
        		pf1.setBorder(cb);
        		pf2.setBorder(cb);
        		l1.setTextFill(cc);
        		l2.setTextFill(cc);
        		l3.setTextFill(cc);
        		l4.setTextFill(cc);
        		l5.setTextFill(cc);
        		t1.setFill(cc);
        		cb1.setBorder(cb);
        		if(tf1.getText().length()==0)
        			{
        				l1.setTextFill(ec);
        				tf1.setBorder(eb);
        				ck=ck&false;
        				System.err.println("fn err");
        			}
        		if(tf2.getText().length()==0)
    			{
    				l1.setTextFill(ec);
    				tf2.setBorder(eb);
    				ck=ck&false;
    				System.err.println("ln err");
    			}
        		if(!validate(tf3.getText())||Account.isP(tf3.getText()))
        		{
        			l2.setTextFill(ec);
        			tf3.setBorder(eb);
        			ck=ck&false;
        			System.err.println("em err");
        		}
        		if(!validateK(pf1.getText()))
        		{
        			l3.setTextFill(ec);
        			pf1.setBorder(eb);
        			ck=ck&false;
        			System.err.println("pw err");
        			if((!(pf1.getText().equals(pf2.getText())))||pf2.getText().length()<=0)
        			{
        				l5.setTextFill(ec);
            			pf2.setBorder(eb);
            			ck=ck&false;
            			System.err.println("cpw err");
        			}
        		}
        		if(!validateP(tf4.getText())||tf4.getText().length()!=10)
        		{
        			l4.setTextFill(ec);
        			tf4.setBorder(eb);
        			ck=ck&false;
        			System.err.println("ph err");
        		}
        		if(!cb1.isSelected())
        		{
        			cb1.setBorder(eb);
        			t1.setFill(ec);
        			ck=ck&false;
        			System.err.println("tc err");
        		}
        		if(ck)
        		{
        			Account ac=new Account(tf1.getText(),tf2.getText(),tf3.getText(),pf1.getText(),tf4.getText());
        			maja.st1.setScene(maja.gh);
        			maja.acc=Account.getAcc(tf3.getText(),pf1.getText());
        		}
        	}
        });
		vb.autosize();
		h1.autosize();
		h2.autosize();
		h3.autosize();
		h4.autosize();
		h1.autosize();
		h1.autosize();
		h1.autosize();
		h1.autosize();
		h1.autosize();
		h1.autosize();
		h1.autosize();
		
		return new Scene(vb,500,500,Color.BLACK);
	}
}
class GH{
	static Scene getS()
	{
		VBox vb=new VBox();
		vb.setAlignment(Pos.CENTER);
		Text t=new Text("Success!");
		t.setFont(Font.font(30));
		t.setFill(Color.GREEN);
		Button b1=new Button("Home");
		vb.setBackground(new Background(new BackgroundFill(Color.BLACK,CornerRadii.EMPTY, Insets.EMPTY)));
		vb.getChildren().add(t);
		vb.getChildren().add(b1);
		b1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
			/*
			 * 
			 * 
			 * 
			 * yaha tera aana
			 * 
			 * 
			 * 
			 */
				maja.st1.setScene(maja.sc);
			}
		});
		return new Scene(vb,500,500,Color.BLACK);
	}
}
public class maja extends Application{
	static Account acc;
	static Stage st1;
	static Scene ca=CA.getS(),lin=LI.getS(),gh=GH.getS(),sc;
	//sc tera scene hai;
	public static void main(String args[])
    {
        launch();
    }
    public void start(Stage st)
    {
    	st1=st;
        st.setTitle("JustFood");
        st.setScene(lin);
        st.show();
		sc=Main.init(st1);
    }
}
