import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.transform.*;
import javafx.scene.effect.*;
import javafx.scene.paint.*;

public class EffectsAndTransformsDemo extends Application {
	double angle = 0.0;
	double scaleFactor = 0.4; 
	double blurVal = 1.0;

	//creat inital effects and transforms. 
	Reflection reflection = new Reflection();
	Rotate rotate = new Rotate ();
	BoxBlur blur = new BoxBlur (1.0, 1.0, 1);
	Scale scale = new Scale (scaleFactor, scaleFactor);

	// make some buttons
	Button btnRotate = new Button ("Rotate"); 
	Button btnBlur = new Button ("Blur off");
	Button btnScale = new Button ("Scale"); 

	Label reflect = new Label ("Refelction Adds Visual Sparkle"); 

	public static void main (String [] args) {
		// start javafx application by calling launch ()
		launch (args);
	}

	//override the start () method 
	public void start (Stage myStage) {

		// set stage title
		myStage.setTitle ("Effects And TransformsDemo using javafx");

		// set a flow pane
		FlowPane rootNode = new FlowPane (Orientation.VERTICAL, 20, 20);

		// put the rootNode in the center
		rootNode.setAlignment (Pos.CENTER); 

		//make a scene
		Scene myScene = new Scene (rootNode, 500, 100) ;

		// put myScence to my stage
		myStage.setScene (myScene); 

		// add roation to the tranformation list for the rotate button;
		btnRotate.getTransforms().add (rotate); 

		// add scale to the btnScale
		btnScale.getTransforms().add (scale);

		//add reflection effects on the label
		reflection.setTopOpacity (0.7);
		reflection.setBottomOpacity (0.2);
		reflect.setEffect (reflection);

		// add events hundler for the button rotation
		btnRotate.setOnAction (new EventHandler <ActionEvent> () {
			public void handle (ActionEvent ae) {
				angle  += 15.0; 

				rotate.setAngle (angle);
				rotate.setPivotX (btnRotate.getWidth()/2); 
				rotate.setPivotY (btnRotate.getHeight()/2); 

			}
		});

		// add the effects for the scale button
		btnScale.setOnAction (new EventHandler <ActionEvent> (){
			public void handle (ActionEvent ae) {
				scaleFactor += 0.1; 
				if (scaleFactor > 2.0) scaleFactor = 0.4;
				scale.setX (scaleFactor);
				scale.setY(scaleFactor);
			}
		});

		btnBlur.setOnAction(new EventHandler<ActionEvent>() {
			public void handle (ActionEvent ae) {
				if (blurVal == 10.0) {
					blurVal = 1.0;
					btnBlur.setEffect (null);
					btnBlur.setText ("blur off");
				} else {
					blurVal++; 
					btnBlur.setEffect (blur);
					btnBlur.setText ("Blur on");
				}
				blur.setWidth (blurVal);
				blur.setHeight (blurVal);
			}
		});

		//add the label and buttons to the scene graph
		rootNode.getChildren().addAll (btnRotate,btnBlur,btnScale,reflect);

		//show scene on the stage
		myStage.show ();

	}

}