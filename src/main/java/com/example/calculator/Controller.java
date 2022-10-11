package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    @FXML
    private Text secondText, operatorText;
    @FXML
    private TextField mainText;
    @FXML
    private Button zeroB, oneB, twoB, threeB, fourB, fiveB, sixB, sevenB, eightB, nineB, clear, equalB;
    @FXML
    private Button division, multiplication, subtraction, addB;
    private String calculationType;
    private String firstNumber = "";
    private String currentNumber = "";

    public void clear(ActionEvent e){
        mainText.setText("");
        secondText.setText("");
        operatorText.setText("");
        firstNumber = "";
        currentNumber = "";
    }
    public void calculationSetup(String type){
        this.calculationType = type;
        operatorText.setText(type);
        firstNumber = currentNumber;
        currentNumber = "";
        secondText.setText(firstNumber + " " + type + currentNumber);
    }
    @FXML
    public void calculate(ActionEvent event){
        int firstInt = Integer.parseInt(firstNumber);
        int secondInt = Integer.parseInt(currentNumber);

        switch (this.calculationType){
            case "+"-> {
                int rez = firstInt + secondInt;
                secondText.setText(firstNumber + "+" + currentNumber + "=" + rez);
                mainText.setText(String.valueOf(rez));
            }
            case "-" -> {
                int rez = firstInt - secondInt;
                secondText.setText(firstNumber + "-" + currentNumber + "=" + rez);
                mainText.setText(String.valueOf(rez));
            }
            case "*" -> {
                int rez = firstInt * secondInt;
                secondText.setText(firstNumber + "*" + currentNumber + "=" + rez);
                mainText.setText(String.valueOf(rez));
            }
            case "/" -> {
                int rez;
                if(secondInt == 0){
                    rez = 0;
                }else {
                    rez = firstInt / secondInt;
                }
                secondText.setText(firstNumber + "/" + currentNumber + "=" + rez);
                mainText.setText(String.valueOf(rez));
            }
        }
    }
    @FXML
    private void addNumber(String numButton){
        currentNumber += numButton;
        mainText.setText(currentNumber);
        secondText.setText(currentNumber);
    }
    public void addNr1(ActionEvent event){
        addNumber("1");
    }
    public void addNr2(ActionEvent event){
        addNumber("2");
    }
    public void addNr3(ActionEvent event){
        addNumber("3");
    }
    public void addNr4(ActionEvent event){
        addNumber("4");
    }
    public void addNr5(ActionEvent event){
        addNumber("5");
    }
    public void addNr6(ActionEvent event){
        addNumber("6");
    }
    public void addNr7(ActionEvent event){
        addNumber("7");
    }
    public void addNr8(ActionEvent event){
        addNumber("8");
    }
    public void addNr9(ActionEvent event){
        addNumber("9");
    }
    public void addNr0(ActionEvent event){
        addNumber("0");
    }
    @FXML
    public void addNumbers(ActionEvent event){
        calculationSetup("+");
    }
    @FXML
    public void multiplyNumbers(ActionEvent event){
        calculationSetup("*");
    }
    @FXML
    public void divideNumbers(ActionEvent event){
        calculationSetup("/");
    }
    @FXML
    public void subtractNumbers(ActionEvent event){
        calculationSetup("-");
    }
}