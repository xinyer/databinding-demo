package com.xinx.databind;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.xinx.databind.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        UserBean user = new UserBean();
        user.setName("John");

        final ObservableUser observableUser = new ObservableUser();
        observableUser.setName("Hash");

        mainBinding.setUser(user);
        mainBinding.setObservableUser(observableUser);

        findViewById(R.id.btn_update_observable_user).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                observableUser.setName("change name");
            }
        });
    }
}
