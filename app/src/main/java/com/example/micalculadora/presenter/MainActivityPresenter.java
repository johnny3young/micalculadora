package com.example.micalculadora.presenter;

public interface MainActivityPresenter {

    // Methos that are going to be called * Created by Johnny Young 21-March-19

    void sumar (String number1, String number2); //interactor
    void showResult (String result); //view
    void showError (String error); //view
}
