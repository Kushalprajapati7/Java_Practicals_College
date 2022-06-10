import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class KBP_5_b extends Application {
@Override
public void start(Stage primaryStage) throws Exception {
primaryStage.setTitle("Tic-Tac-Toe by kt");
GridPane gridPane = new GridPane();
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
int n = (int) (Math.random() * 3);
if (n == 0)
gridPane.add(createX(), i, j);
else if (n == 1)
gridPane.add(createO(), i, j);
else
continue;
}
}
Scene primaryScene = new Scene(gridPane, 300, 300);
primaryStage.setScene(primaryScene);
primaryStage.show();
}

 public VBox createX() {
Image imageX = new Image("File:C:/Users/hiren/Desktop/image/x.jpg");
ImageView imageViewX = new ImageView(imageX);
VBox xBox = setProp(imageViewX);
return xBox;
}

 public VBox createO() {
Image imageO = new Image("File:C:/Users/hiren/Desktop/image/0.jpg");
ImageView imageViewO = new ImageView(imageO);
VBox oBox = setProp(imageViewO);
return oBox;
}

public VBox setProp(ImageView iv) {
iv.setFitHeight(50);

iv.setFitWidth(50);
iv.setPreserveRatio(true);
VBox vBox = new VBox();
vBox.getChildren().add(iv);
vBox.setStyle("-fx-border-color: orange");
return vBox;
}

 public static void main(String[] args) {
// Here you can work with args - command line parameters
Application.launch(args);
}
}
