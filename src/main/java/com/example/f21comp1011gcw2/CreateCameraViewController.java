package com.example.f21comp1011gcw2;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

public class CreateCameraViewController {

    @FXML
    private ComboBox<?> makeComboBox;

    @FXML
    private TextField modelTextField;

    @FXML
    private Spinner<?> mpSpinner;

    @FXML
    private TextField priceTextField;

    @FXML
    private CheckBox digitalCheckBox;

    @FXML
    private CheckBox mirrorlessCheckBox;

    @FXML
    private Label msgLabel;

}
