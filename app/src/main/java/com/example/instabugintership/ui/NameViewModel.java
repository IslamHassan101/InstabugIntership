package com.example.instabugintership.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.instabugintership.pojo.NameModel;

import java.util.ArrayList;

public class NameViewModel extends ViewModel {
    public static LiveData<ArrayList<NameModel>> nameMutableLiveData;
    LiveData<String>nameLiveData;
//    MutableLiveData <ArrayList<NameModel>> nameMutableLiveData = new MutableLiveData<>();

    public void getNames(){
        nameMutableLiveData.setValue(getNameFromDatabase());
    }


    private ArrayList<NameModel> getNameFromDatabase() {
        ArrayList<NameModel> arrayList = new ArrayList<>();
        arrayList.add(new NameModel("islam",2));
        arrayList.add(new NameModel("ahmed",2));
        arrayList.add(new NameModel("hassan",2));
        arrayList.add(new NameModel("sayed",2));
        arrayList.add(new NameModel("huseen",2));
        arrayList.add(new NameModel("khaled",2));
        arrayList.add(new NameModel("bassem",2));
        return arrayList;
    }
}
