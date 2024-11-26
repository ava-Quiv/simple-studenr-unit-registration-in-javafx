package project1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.text.*;
import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.List;
import java.util.Arrays;


/**
 *
 * @author areba
 */
public class Project1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        // elements of scene 1
        Label l1 = new Label("username");
        Label l2 = new Label("password");
        TextField tf1 = new TextField();
        TextField tf2 = new TextField(); 
        Button b1 = new Button("cancel");
        Button b2 = new Button("log~in");
        Button bs =new Button("sign up");
        
        
        HBox hb1 = new HBox();
        hb1.setSpacing(10);
        hb1.getChildren().addAll(l1,tf1);
        HBox hb2 = new HBox();
        hb2.setSpacing(10);
        hb2.getChildren().addAll(l2,tf2);
        HBox hb3 = new HBox();
        hb3.setSpacing(10);
        hb3.getChildren().addAll(b1 ,b2);
        VBox vb1 = new VBox ();
        vb1.setSpacing(10);
        vb1.getChildren().addAll(hb1,hb2,hb3);
        
        
        //sign up page:
        
       
        
        
        //elements of scene2
        
        Button b3  =new Button("Register");
        b3.setPrefSize(100, 50);
        b3.setStyle("-fx-background-color: Blue;");
        Button b4 =new Button("add/drop");
        b4.setPrefSize(100, 50);
        Label lb41 = new Label("ADD/DROP UNIT");
        Button b41 = new Button("add");
        Button b42 = new Button("drop unit");
        Button b43 = new Button("show units");
        Button b44 = new Button("Back");
        TilePane tp2 = new TilePane();
        tp2.getChildren().addAll(b41,b42,b43,b44);
        VBox vbd = new VBox();
        vbd.getChildren().addAll(lb41,tp2);
        b4.setStyle("-fx-background-color: Green;");
        Button b5  = new Button("fees");
        b5.setPrefSize(100, 50);
        b5.setStyle("-fx-background-color: lightblue;");
        Button b6 = new Button("grades");
        b6.setPrefSize(100, 50);
        b6.setStyle("-fx-background-color: lightgoldenrodyellow;");
        
        //registration elements:
        Text t1 = new Text("FOR REGISTRATION YOU MUST ADHARE TO 60% FEES PAYMENT RULE!!!");
        Label lr1 = new Label("TRIMISTER 1 YEAR1");
        CheckBox cb1 = new CheckBox ("Introduction to computer science" +"  " +"COMP 101");
        CheckBox cb2 = new CheckBox ("Introduction to programing"+" "+"COMP 110");
        CheckBox cb3 = new CheckBox ("Foundations of mathematics"+ " "+"MATH 103");
        CheckBox cb4= new CheckBox ("Calclus 1"+" " +" MATH 103");
        CheckBox cbo = new CheckBox ("Introduction to sociology"+" " +" SOST 131");
        CheckBox cb5 = new CheckBox ("Christian believes"+" " +" THE 111");
        Label lr2 = new Label("TRIMISTER 2 YEAR 2");
        CheckBox cb6 = new CheckBox ("Communication skills"+" " +"COMM 111");
        CheckBox cb7 = new CheckBox ("Analogue electronics"+" " +"COMP 104");
        CheckBox cb8 = new CheckBox ("Stractured programming"+" " +"COMP 111");
        CheckBox cb9 = new CheckBox ("Calclus 11"+" " +"MATH 104");
        CheckBox cba = new CheckBox ("Linear algebra"+" " +"MATH 110");
        CheckBox cbb = new CheckBox ("Probability and statistics 1"+" " +"MATH 132");
        Label lr3  =new Label("TRIMISTER 1 YEAR 2");
        CheckBox cbc = new CheckBox ("Introduction to computer networks"+" " +"COMP 131");
        CheckBox cbd = new CheckBox ("Object oriented programing"+" " +" COMP 211");
        CheckBox cbe = new CheckBox ("Telecommunication"+" " +"COMP 231");
        CheckBox cbf = new CheckBox ("Calclus 111"+" " +"MATH 200");
        CheckBox cbg = new CheckBox ("Linear algebra 11"+" " +"MATH 210");
        CheckBox cbh = new CheckBox ("Probability and statistics 11"+" " +"MATH 230");
        Label lr4 = new Label("TRIMISTER 2 YEAR 2");
        CheckBox cbi = new CheckBox ("Computer organization and architecture"+" " +"COMP 201");
        CheckBox cbj = new CheckBox ("Data stractures"+" " +"COMP 210");
        CheckBox cbk = new CheckBox ("System analysis and design"+" " +"COMP 220");
        CheckBox cbl = new CheckBox ("HIV/AIDS"+" " +"HSCI 2225");
        CheckBox cbm = new CheckBox ("Discret stractures"+" " +"MATH 211");
        CheckBox cbn = new CheckBox ("Ordnary differential equations "+" " +"MATH 220");
        
        Button rb1 = new Button("cancel");
        Button rb2 = new Button("submit"); 
        Button rb3 = new Button("show");
        Button rb4 = new Button ("<");
        
        HBox rhb1  = new HBox();
        rhb1.getChildren().addAll(rb1,rb2,rb3);
        rhb1.setSpacing(14);
       
        
       
        
        
        
        
        VBox vbx  =new VBox();
        vbx.getChildren().addAll(t1,rb4,lr1,cb1,cb2,cb3,cb4,cb5,cb6,lr2,cb7,cb8,cb9,cba,cbb,cbc,lr3,cbd,cbe,cbf,cbg,cbh,cbi,lr4,cbj,cbk,cbl,cbm,cbn,cbo,rhb1);
        
        Group grp3  =new Group();
        grp3.getChildren().add(vbx);
        Scene sc3 = new Scene(grp3,400,800);
        
        
        TilePane tp1  = new TilePane();
        tp1.setPrefColumns(2);
        tp1.setVgap(70);
        tp1.setHgap(90);
        tp1.getChildren().addAll(b3,b4,b5,b6);
        
        
        //group:
        Group grp1 = new Group();
        grp1.getChildren().add(vb1);
        Scene sc1 = new Scene(grp1,300,200);
        
        Group grp2 = new Group();
        grp2.getChildren().add(tp1);
        Scene sc2 = new Scene(grp2,300,200);
        
        Group grp4 = new Group();
        grp4.getChildren().addAll(vbd);
        Scene sc4 = new Scene(grp4,300,200);
        
        b1.setOnAction(e -> {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to exit?");
        alert.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
                  primaryStage.close();
                }
            });
        });
        
       

        b2.setOnAction(e -> {
            String username = tf1.getText();
            String password = tf2.getText();

    // Check if fields are not empty
        if (username.isEmpty() || password.isEmpty()) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText("Username and password must not be empty.");
        alert.showAndWait();
        return;
        }

    // Database connection
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException ex)
        {
           ex.printStackTrace();
        }
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "");
            String query = "SELECT * FROM login WHERE username = ? AND password = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet res = preparedStatement.executeQuery(); 
            if (res.next()) {
               primaryStage.setScene(sc2);
            } else {
                System.out.println("invallid nusername/password");
            }

        } 
        catch (SQLException ex) 
        {
            ex.printStackTrace(); // Print the stack trace for debugging
    // You might also want to show an alert or log this
        }
    });
    rb2.setOnAction(e -> {
    String username = tf1.getText();
    String password = tf2.getText();

    // Check if fields are not empty
    if (username.isEmpty() || password.isEmpty()) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText("Username and password must not be empty.");
        alert.showAndWait();
        return;
    }

    // Database connection to verify the login
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "");
        String query = "SELECT * FROM students WHERE username = ? AND password = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(query);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        ResultSet res = preparedStatement.executeQuery(); 

        if (res.next()) {
            // User is authenticated, now handle course registration

            // Get student_id from database
            int studentId = res.getInt("student_id");

            // List of selected courses
            List<CheckBox> checkboxes = Arrays.asList(cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cba, cbb, cbc, cbd, cbe, cbf, cbg, cbh, cbi, cbj, cbk, cbl, cbm, cbn, cbo);
            for (CheckBox checkbox : checkboxes) {
                if (checkbox.isSelected()) {
                    String courseName = checkbox.getText();
                    // Get course_id from courses table based on course_name
                    String courseQuery = "SELECT course_id FROM courses WHERE course_name = ?";
                    PreparedStatement courseStatement = conn.prepareStatement(courseQuery);
                    courseStatement.setString(1, courseName);
                    ResultSet courseResult = courseStatement.executeQuery();

                    if (courseResult.next()) {
                        int courseId = courseResult.getInt("course_id");

                        // Insert into the registrations table
                        String insertQuery = "INSERT INTO student_courses (student_id, course_id) VALUES (?, ?)";
                        PreparedStatement insertStatement = conn.prepareStatement(insertQuery);
                        insertStatement.setInt(1, studentId);
                        insertStatement.setInt(2, courseId);
                        insertStatement.executeUpdate();
                    }
                }
            }

            // Once courses are registered, show success message and switch scene
            Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
            successAlert.setTitle("Registration Successful");
            successAlert.setHeaderText(null);
            successAlert.setContentText("You have successfully registered for your selected courses.");
            successAlert.showAndWait();

            primaryStage.setScene(sc2); // Switch to the next scene

        } else {
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setTitle("Login Failed");
            errorAlert.setHeaderText(null);
            errorAlert.setContentText("Invalid username or password.");
            errorAlert.showAndWait();
        }

    } catch (SQLException ex) {
        ex.printStackTrace(); // Log the error
        Alert dbErrorAlert = new Alert(Alert.AlertType.ERROR);
        dbErrorAlert.setTitle("Database Error");
        dbErrorAlert.setHeaderText(null);
        dbErrorAlert.setContentText("There was an error connecting to the database.");
        dbErrorAlert.showAndWait();
    } catch (ClassNotFoundException ex) {
        ex.printStackTrace(); // Log the error
        Alert classNotFoundAlert = new Alert(Alert.AlertType.ERROR);
        classNotFoundAlert.setTitle("Error");
        classNotFoundAlert.setHeaderText(null);
        classNotFoundAlert.setContentText("Database driver not found.");
        classNotFoundAlert.showAndWait();
    }
});


        
             
// Method to show alerts

        b3.setOnAction(eh->{
             primaryStage.setScene(sc3);
        }
        );
        rb4.setOnAction(eh->{
            primaryStage.setScene(sc2);
        }
        );
        b4.setOnAction(eh->{
            primaryStage.setScene(sc4);
        }
        );
        b44.setOnAction(eh->{
            primaryStage.setScene(sc2);
        }
        );
       
        
       // Scene scene = new Scene(vb1,300,200);
     
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(sc1);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
