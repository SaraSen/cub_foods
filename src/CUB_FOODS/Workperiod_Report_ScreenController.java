/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CUB_FOODS;

import com.jfoenix.controls.JFXComboBox;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Saroj
 */
public class Workperiod_Report_ScreenController implements Initializable {

    @FXML
    private JFXComboBox<String> dura;
    ObservableList<String> duralist = FXCollections.observableArrayList("Today", "Yesterday", "This Week", "Past Week", "This Month", "Past Month");
    @FXML
    private TableView<Workperiod_Data_Template> table;
    @FXML
    private TableView<Workperiod_Data_Template> table2;
    @FXML
    private TableView<Workperiod_Data_Template> table3;
    @FXML
    private TableColumn<Workperiod_Data_Template, String> saledatacol1;
    @FXML
    private TableColumn<Workperiod_Data_Template, String> saledatacol2;
    @FXML
    private TableColumn<Workperiod_Data_Template, String> paymentdatacol1;
    @FXML
    private TableColumn<Workperiod_Data_Template, Float> paymentdatacol2;
    @FXML
    private TableColumn<Workperiod_Data_Template, String> countdatacol1;
    @FXML
    private TableColumn<Workperiod_Data_Template, Integer> countdatacol2;

    ObservableList<Workperiod_Data_Template> salelist = FXCollections.observableArrayList(
            new Workperiod_Data_Template("total", "5000")
    );

    ObservableList<Workperiod_Data_Template> payment = FXCollections.observableArrayList(
            new Workperiod_Data_Template("Cash", 2500.00f),
            new Workperiod_Data_Template("Credit", 2500.00f)
    );
    ObservableList<Workperiod_Data_Template> counte = FXCollections.observableArrayList(
            new Workperiod_Data_Template("Amount", 02)
    );

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dura.setItems(duralist);
        saledatacol1.setCellValueFactory(new PropertyValueFactory<Workperiod_Data_Template, String>("salecol1"));
        saledatacol2.setCellValueFactory(new PropertyValueFactory<Workperiod_Data_Template, String>("salecol2"));
        paymentdatacol1.setCellValueFactory(new PropertyValueFactory<Workperiod_Data_Template, String>("paymentcol1"));
        paymentdatacol2.setCellValueFactory(new PropertyValueFactory<Workperiod_Data_Template, Float>("paymentcol2"));
        countdatacol1.setCellValueFactory(new PropertyValueFactory<Workperiod_Data_Template, String>("paymentcol1"));
        countdatacol2.setCellValueFactory(new PropertyValueFactory<Workperiod_Data_Template, Integer>("paymentcol2"));
        table.setItems(salelist);
        table2.setItems(payment);
        table3.setItems(counte);
    }

}
