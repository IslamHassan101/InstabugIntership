package com.example.instabugintership.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.instabugintership.databinding.ActivityMainBinding;
import com.example.instabugintership.pojo.NameModel;
import com.example.instabugintership.R;
import com.example.instabugintership.ui.NameListAdapter;
import com.example.instabugintership.ui.NameViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    NameViewModel nameViewModel;
    TextView textName;
    private Bundle savedInstanceState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.savedInstanceState = savedInstanceState;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);


        textName= findViewById(R.id.tv_islam);
        nameViewModel = ViewModelProviders.of(this).get(NameViewModel.class);
        binding.setViewModel(nameViewModel);
        final NameListAdapter adapter = new NameListAdapter();
        binding.recyclerView.setAdapter(adapter);
        NameViewModel.nameMutableLiveData.observe(this, new Observer<ArrayList<NameModel>>() {
            @Override
            public void onChanged(ArrayList<NameModel> nameModels) {
                adapter.setList(nameModels);
            }
        });
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.setLifecycleOwner(this);





    }
    public NameModel getNameFromDatabase(){
        return new  NameModel("islam",2);

    }

}
