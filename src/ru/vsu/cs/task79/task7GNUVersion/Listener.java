package task7GNUVersion;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import logic.ArrayUtil;

public class Listener {

    private ModelData modelData;

    public Listener(ModelData modelData) {
        this.modelData = modelData;
    }

    @FXML
    private Button ButtonGetResult;

    @FXML
    private Button ButtonGetNewArray;

    @FXML
    private Label LabelShowResult;

    @FXML
    private TextField TextFieldArray;

    @FXML
    void initialize() {
        ButtonGetResult.setOnAction(actionEvent -> {
            //Нажатие на Кнопку"Get Result"
            String readFieldText = TextFieldArray.getText();
            if (readFieldText.length() != 0) {
                int[] readArray = ArrayUtil.toIntArray(readFieldText);
                ArrayUtil arrayUtil = new ArrayUtil(readArray);
                modelData.setArray(arrayUtil);
                LabelShowResult.setText(Integer.toString(modelData.getArray().getNumberOfIdenticalConsecutiveElements()));
                ButtonGetResult.setDisable(true);
            }
        });

        ButtonGetNewArray.setOnAction(actionEvent -> {
            //Нажатие на Кнопку "Get new Array"
            TextFieldArray.clear();
            ButtonGetResult.setDisable(false);
        });
    }

}