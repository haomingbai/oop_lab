package cn.edu.nwpu.lab6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class HelloApplication extends Application {

    private ImageView imageView;
    private int imageIndex = 0;
    private String[] imageUrls = {
            "https://tse1-mm.cn.bing.net/th/id/OIP-C.Pm6vpDpQME6oTDj8radOoAHaEK?rs=1&pid=ImgDetMain", // 图片链接1
            "https://tse2-mm.cn.bing.net/th/id/OIP-C.vhDiwwhybBZ77-dIvPR91gHaEK?rs=1&pid=ImgDetMain", // 图片链接2
            "https://tse1-mm.cn.bing.net/th/id/OIP-C.XyCj688o7QV49ZuzGJOMogHaEK?rs=1&pid=ImgDetMain"  // 图片链接3
    };

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("动态图片切换案例");

        // 创建一个图片视图
        imageView = new ImageView();
        imageView.setFitWidth(300);
        imageView.setFitHeight(300);

        // 初始图片
        updateImage();

        // 创建按钮
        Button changeImageButton = new Button("切换图片");
        changeImageButton.setOnAction(e -> updateImage());

        // 创建计时器，定时切换图片
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(2), e -> {
                    updateImage();
                    System.out.println("Update Image: " + imageIndex);
                })
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        // 布局
        StackPane root = new StackPane();
        root.getChildren().add(imageView);
        root.getChildren().add(changeImageButton);

        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // 更新图片
    private void updateImage() {
        // 切换图片
        imageIndex = (imageIndex + 1) % imageUrls.length;
        Image image = new Image(imageUrls[imageIndex]);
        imageView.setImage(image);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
