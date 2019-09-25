/*Author:Y3872595
 * This program allows to change a face expression which is initialized as a smile to a sad or serious expression.
 * The face expression can be changed as many times as needed
 *  
 *  */

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.layout.Background; 
import javafx.scene.layout.HBox; 
import javafx.scene.layout.VBox; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Arc; 
import javafx.scene.shape.ArcType; 
import javafx.scene.shape.Circle; 
import javafx.scene.text.Font; 
import javafx.scene.text.Text; 
import javafx.stage.Stage; 
import javafx.geometry.Pos;

public class ChangingFace1_Y3872595 extends Application {
	
	 @Override     
	 public void start(Stage stage)     
	 {   //set face color shape and style
		 Circle face = new Circle(125, 125, 80);          
		 face.setFill(Color.web("#f1ff77"));         
		 face.setStroke(Color.WHITE);  
		//set eyes color shape and style   
		 Circle rightEye = new Circle(86, 100, 10);         
		 rightEye.setFill(Color.GREEN);         
		 rightEye.setStroke(Color.GREEN); 
		       
		 Circle leftEye = new Circle(162, 100, 10);         
		 leftEye.setFill(Color.GREEN);         
		 leftEye.setStroke(Color.GREEN);   
		  
		//set mouth color shape and style as an arc
		 Arc mouth = new Arc(125, 150, 45, 35, 0, -180);          
		 mouth.setFill(Color.GREEN);         
		 mouth.setStroke(Color.GREEN);         
		 mouth.setType(ArcType.OPEN); 
		 
		//set description
		 Text caption = new Text(68, 240, "Changing Face");         
		 caption.setFill(Color.BLUE);         
		 caption.setFont(Font.font ("Verdana", 15));
		 
		 //create group of items to be displayed in root
		 Group group = new Group(face, rightEye, leftEye, mouth,  caption);  
         
		 //buttons
		 Button smileButton = new Button("Smile"); 
		 Button frownButton = new Button("Frown"); 
		 Button seriousButton = new Button("Thinking"); 
	 
		 HBox buttonBox = new HBox(10);         
		 buttonBox.setAlignment(Pos.CENTER); 
		       
		 buttonBox.getChildren().addAll(smileButton, frownButton, seriousButton);
		 
		 //root
		 VBox root = new VBox(10); 
		 root.setBackground(Background.EMPTY);         
		 root.setAlignment(Pos.CENTER); 
		      
		 root.getChildren().addAll(buttonBox, group);

		 //scene
		 Scene scene = new Scene(root, 250, 275, Color.web("#1ed2a3"));

		
		 //set facial expression on events
		 smileButton.setOnAction(e -> {mouth.setLength(-180);
		 mouth.setRadiusY(35);
		 });
		 
		 frownButton.setOnAction(e -> {mouth.setLength(180);
		 mouth.setRadiusY(35);
		 });

		 
		 seriousButton.setOnAction(e -> mouth.setRadiusY(0));
		 
	     //set scene, userform title
		 stage.setScene(scene);         
		 stage.setTitle("ChangingFace2_Y3872595");  
		 //display the userform
		 stage.show();             
	}         
	 
	 public static void main(String[] args)     
	 {         
		 launch(args);     
	 }
}
	


