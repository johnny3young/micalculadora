package com.example.micalculadora.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.micalculadora.R;
import com.example.micalculadora.presenter.MainActivityPresenter;
import com.example.micalculadora.presenter.MainActivityPresenterImpl;

public class MainActivity extends AppCompatActivity implements MainActivityView {

        private EditText edtNumber1;
        private EditText edtNumber2;
        private MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainActivityPresenterImpl(this);
    }

    public void suma (View view) {
        String number1 = "";
        String number2 = "";
        presenter.sumar(number1, number2);

    }

    @Override
    public void showResult(String result) {

    }

    @Override
    public void shoeError(String error) {

    }
}
