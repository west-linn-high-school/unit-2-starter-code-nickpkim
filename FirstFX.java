import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FirstFX extends Application {

  public void start(Stage stage){
    /*Text hello = new Text(50, 50, "Hello World!");
    Text question = new Text(120, 80, "How's it going?");
    Rectangle box = new Rectangle(20, 20, 120, 50);

    box.setStroke(Color.BLUE);
    box.setFill(null);

    Group root = new Group(hello, question, box);
    Scene scene = new Scene(root, 300, 120, Color.GRAY);

    stage.setTitle("FXPractice");
    stage.setScene(scene);
    stage.show();

    Elliple ellipse = new Ellipse(); {
      ellipse.setCenterX(50.0f);
      ellipse.setCenterY(50.0f);
      ellipse.setRadiusX(50.0f);
      ellipse.setRadiusY(25.0f);
    }
    ellipse.setStroke(Color.GREEN);
    ellipse.setFill(null);

    Group root = new Group(ellipse);
    Scene scene = new Scene(root, 300, 120, Color.GRAY);*/

    Text error = new Text(50, 50, "error404");
    Rectangle border = new Rectangle(5,5,290,110);
    Rectangle sungl = new Rectangle(100,50,30,10);
    Rectangle asses = new Rectangle(140,50,30,10);
    border.setStroke(Color.BLACK);
    border.setFill(null);
    sungl.setStroke(Color.BLACK);
    asses.setFill(null);
    border.setStroke(Color.BLACK);
    border.setFill(null);

    Group root = new Group(error, border, sungl,asses);
    Scene scene = new Scene(root, 300, 120, Color.BLUE);
    stage.setTitle("FirstFX");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}
