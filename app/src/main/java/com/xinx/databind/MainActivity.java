package com.xinx.databind;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.xinx.databind.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter myAdapter;
    private List<UserBean> userBeanList;

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

        recyclerView = findViewById(R.id.rv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        userBeanList = new ArrayList<>();
        userBeanList.add(new UserBean("123"));
        myAdapter = new MyAdapter(userBeanList);
        recyclerView.setAdapter(myAdapter);


        findViewById(R.id.btn_update_observable_user).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                observableUser.setName("change name");
            }
        });

        findViewById(R.id.btn_update_recycle_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userBeanList.add(new UserBean("new user"));
                myAdapter.notifyDataSetChanged();
            }
        });
    }
}
