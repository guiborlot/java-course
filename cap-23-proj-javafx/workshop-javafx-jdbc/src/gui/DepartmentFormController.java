package gui;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.entities.Department;

import java.net.URL;
import java.util.ResourceBundle;

public class DepartmentFormController implements Initializable {

    private Department entity;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private Button btSave;

    @FXML
    private Button btCancel;

    @FXML
    private Label labelErrorName;

    public void setDepartment(Department entity){
        this.entity = entity;
    }

    public void updateFormData(){
        if(entity == null){
            throw new IllegalStateException("Entity was null!");
        }
        txtId.setText(String.valueOf(entity.getId()));
        txtName.setText(entity.getName());
    }

    @FXML
    public void onBtSaveAction(){
        System.out.println("Ta salvando");
    }

    @FXML
    public void onBtCancelAction(){
        System.out.println("Ta cancelando");
    }


    @Override
    public void initialize(URL url, ResourceBundle rb){
        initializeNode();
    }

    private void initializeNode(){
        Constraints.setTextFieldInteger(txtId);
        Constraints.setTextFieldMaxLength(txtName, 30);

    }
}
