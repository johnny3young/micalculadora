package com.example.micalculadora.interactor;

import com.example.micalculadora.presenter.MainActivityPresenter;

public class MainActivityInteractorImpl implements MainActivityInteractor {

    private MainActivityPresenter mainActivityPresenter;

    @Override
    public void sumar(String number1, String number2) {
            Double resultado = Double.valueOf(number1) + Double.valueOf(number2);
    }
}
