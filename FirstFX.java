import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.QuadCurve;
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

    Text yes = new Text(50, 50, "yes");
    Rectangle border = new Rectangle(5,5,290,110);
    border.setStroke(Color.BLACK);
    border.setFill(null);
    Rectangle sungl = new Rectangle(100,50,30,10);
    sungl.setStroke(Color.BLACK);
    //sungl.setFill(null);
    Rectangle asses = new Rectangle(145,50,30,10);
    asses.setStroke(Color.BLACK);
    //asses.setFill(null);
    Line frame = new Line(175,50,185,45);
    Line frame2 = new Line(185,45,187,47);
    Line frame3 = new Line(100,50,145,50);
    Ellipse face = new Ellipse(140,70,40,50);
    face.setStroke(Color.YELLOW);
    face.setFill(Color.YELLOW);
    Line upperLip = new Line(120,85,165,85);
    QuadCurve lowerLip = new QuadCurve(120,85,143,110,165,85);
    lowerLip.setStroke(Color.BLACK);
    lowerLip.setFill(Color.WHITE);
    Ellipse fingy = new Ellipse(75,85,10,5);
    fingy.setStroke(Color.YELLOW);
    fingy.setFill(Color.YELLOW);
    Ellipse fingy2 = new Ellipse(75,95,10,5);
    fingy2.setStroke(Color.YELLOW);
    fingy2.setFill(Color.YELLOW);
    Ellipse fingy3 = new Ellipse(75,105,10,5);
    fingy3.setStroke(Color.YELLOW);
    fingy3.setFill(Color.YELLOW);
    Ellipse fingy4 = new Ellipse(85,88,5,20);
    fingy4.setStroke(Color.YELLOW);
    fingy4.setFill(Color.YELLOW);

    Group root = new Group(yes, border, face, sungl, asses, frame, frame2,
    frame3, upperLip, lowerLip, fingy, fingy2, fingy3, fingy4);
    Scene scene = new Scene(root, 300, 120, Color.LIGHTBLUE);
    stage.setTitle("FirstFX");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}
