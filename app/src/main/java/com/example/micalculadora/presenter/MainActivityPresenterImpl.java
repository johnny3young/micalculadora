package com.example.micalculadora.presenter;

import com.example.micalculadora.interactor.MainActivityInteractor;
import com.example.micalculadora.interactor.MainActivityInteractorImpl;
import com.example.micalculadora.view.MainActivityView;

public class MainActivityPresenterImpl implements MainActivityPresenter {

    private MainActivityView activityView;
    private MainActivityInteractor interactor;

    public MainActivityPresenterImpl(MainActivityView activityView) {
        this.activityView = activityView;
        interactor = new MainActivityInteractorImpl();
    }

    @Override
    public void sumar(String number1, String number2) {
        interactor.sumar(number1, number2);

    }

    @Override
    public void showResult(String result) {
        activityView.showResult(result);
    }

    @Override
    public void showError(String error) {
        activityView.shoeError(error);
    }
}
