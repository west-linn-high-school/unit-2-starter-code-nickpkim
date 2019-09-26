import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class Snowman extends Application {
  public void start(Stage stage){
    final int GROUND_LEVEL = 350;
    final int SCREEN_WIDTH = 400;
    final int BASE_RADIUS = 75;
    final int BASE_X = 200;
    final int BASE_Y = 300;
    Rectangle ground = new Rectangle(0,GROUND_LEVEL,SCREEN_WIDTH,100);
    ground.setFill(Color.WHITE);
    Circle base = new Circle(BASE_X, BASE_Y, BASE_RADIUS);
    base.setFill(Color.WHITE);
    Circle middle = new Circle(BASE_X, BASE_Y-100, BASE_RADIUS*2/3);
    middle.setFill(Color.WHITE);
    Circle head = new Circle(BASE_X, BASE_Y-165, BASE_RADIUS*2/5);
    head.setFill(Color.WHITE);
    Line rightArm = new Line(160,190,130,220);
    rightArm.setStroke(Color.BROWN);
    Line leftArm = new Line(240,190,270,220);
    leftArm.setStroke(Color.BROWN);
    Line rightArm2 = new Line(130,220,160,260);
    rightArm2.setStroke(Color.BROWN);
    Line leftArm2 = new Line(270,220,240,260);
    leftArm2.setStroke(Color.BROWN);
    Polygon nose = new Polygon();
    nose.getPoints().addAll(new Double[]{
      200.0, 135.0,
      200.0, 145.0,
      170.0, 140.0
    });
    Circle eye1 = new Circle(190,125,5);
    Circle eye2 = new Circle(210,125,5);
    Rectangle hatBase = new Rectangle(170,105,60,5);
    Rectangle hatTop = new Rectangle(175,60,50,50);
    nose.setFill(Color.ORANGE);
    Group root = new Group(base, middle, head, ground, rightArm, leftArm, rightArm2, leftArm2, nose, eye1, eye2, hatTop, hatBase);
    Scene scene = new Scene(root, 400, 400, Color.LIGHTBLUE);
    stage.setTitle("Snowman");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}
