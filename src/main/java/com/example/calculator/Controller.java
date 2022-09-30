package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    @FXML
    private Text secondText;
    @FXML
    private TextField mainText;
    @FXML
    private Button zeroB, oneB, twoB, threeB, fourB, fiveB, sixB, sevenB, eightB, nineB, clear, equalB;
    @FXML
    private Button division, multiplication, subtraction, add;
    String number = "";
    private String firstNumber = "";
    private String currentNumber = "";
    private String operation;

    private void calculate(ActionEvent event){

    }
    private String addNumber(String numButton){
        number += numButton;
        mainText.setText(number);
        secondText.setText(number);
        return number;
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
    public double addTwoNumber(double firstNumber, double secondNumber){
        return firstNumber + secondNumber;
    }
    public double multiply(double firstNumber, double secondNumber){
        return firstNumber * secondNumber;
    }
    public double divide(double firstNumber, double secondNumber){
        try {
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        return firstNumber / secondNumber;
    }
    public double subtract(double firstNumber, double secondNumber){
        return firstNumber - secondNumber;
    }





}