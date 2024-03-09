package com.example.myapplication;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {
    private MutableLiveData<String> sharedData = new MutableLiveData<>();
    private MutableLiveData<String> sharedData1 = new MutableLiveData<>();
    private MutableLiveData<String> sharedData2 = new MutableLiveData<>();
    private MutableLiveData<String> sharedData3 = new MutableLiveData<>();

    private MutableLiveData<String> sharedData4 = new MutableLiveData<>();

    private MutableLiveData<String> sharedData5 = new MutableLiveData<>();

    private MutableLiveData<String> sharedData6 = new MutableLiveData<>();

    private MutableLiveData<String> sharedData7 = new MutableLiveData<>();
    private MutableLiveData<String> sharedData8 = new MutableLiveData<>();
    private MutableLiveData<String> sharedData9 = new MutableLiveData<>();

    private MutableLiveData<String> sharedData10 = new MutableLiveData<>();
    private MutableLiveData<String> sharedData11 = new MutableLiveData<>();
    private MutableLiveData<String> sharedData12 = new MutableLiveData<>();

    private MutableLiveData<String> sharedData13 = new MutableLiveData<>();
    private MutableLiveData<String> sharedData14 = new MutableLiveData<>();
    private MutableLiveData<String> sharedData15 = new MutableLiveData<>();

    private MutableLiveData<String> sharedData16 = new MutableLiveData<>();
    private MutableLiveData<String> sharedData17 = new MutableLiveData<>();

    private MutableLiveData<String> sharedData18 = new MutableLiveData<>();
    private MutableLiveData<String> sharedData19 = new MutableLiveData<>();

    private MutableLiveData<Integer> tutartut = new MutableLiveData<>();


    public void setSharedData(String data) {
        sharedData.setValue(data);

    }

    public LiveData<String> getSharedData() {
        return sharedData;

    }

    public void setSharedData1(String data) {
        sharedData1.setValue(data);

    }

    public LiveData<String> getSharedData1() {
        return sharedData1;
    }


    public void setSharedData2(String data) {
        sharedData2.setValue(data);
    }

    public LiveData<String> getSharedData2() {
        return sharedData2;
    }


    public void setSharedData3(String data) {
        sharedData3.setValue(data);
    }

    public LiveData<String> getSharedData3() {
        return sharedData3;
    }


    public void setSharedData4(String data) {
        sharedData4.setValue(data);
    }

    public LiveData<String> getSharedData4() {
        return sharedData4;
    }

    public void setSharedData5(String data) {
        sharedData5.setValue(data);
    }

    public LiveData<String> getSharedData5() {
        return sharedData5;
    }

    public void setSharedData6(String data) {
        sharedData6.setValue(data);
    }

    public LiveData<String> getSharedData6() {
        return sharedData6;
    }

    public void setSharedData7(String data) {
        sharedData7.setValue(data);
    }

    public LiveData<String> getSharedData7() {
        return sharedData7;
    }

    public void setSharedData8(String data) {
        sharedData8.setValue(data);
    }

    public LiveData<String> getSharedData8() {
        return sharedData8;
    }
    public void setSharedData9(String data) {
        sharedData9.setValue(data);
    }

    public LiveData<String> getSharedData9() {
        return sharedData9;
    }
    public void setSharedData10(String data) {
        sharedData10.setValue(data);
    }

    public LiveData<String> getSharedData10() {
        return sharedData10;
    }
    public void setSharedData11(String data) {
        sharedData11.setValue(data);
    }

    public LiveData<String> getSharedData11() {
        return sharedData11;
    }
    public void setSharedData12(String data) {
        sharedData12.setValue(data);
    }

    public LiveData<String> getSharedData12() {
        return sharedData12;
    }
    public void setSharedData13(String data) {
        sharedData13.setValue(data);
    }

    public LiveData<String> getSharedData13() {
        return sharedData13;
    }
    public void setSharedData14(String data) {
        sharedData14.setValue(data);
    }

    public LiveData<String> getSharedData14() {
        return sharedData14;
    }
    public void setSharedData15(String data) {
        sharedData15.setValue(data);
    }

    public LiveData<String> getSharedData15() {
        return sharedData15;
    }
    public void setSharedData16(String data) {
        sharedData16.setValue(data);
    }

    public LiveData<String> getSharedData16() {
        return sharedData16;
    }
    public void setSharedData17(String data) {
        sharedData17.setValue(data);
    }

    public LiveData<String> getSharedData17() {
        return sharedData17;
    }


    public void setTutarTut(Integer data) {
        tutartut.setValue(data);
    }

    public LiveData<Integer> getTutarTut() {
        return tutartut;
    }



    public void updateDataForFirstButton() {
        setSharedData2(sharedData2.getValue());
    setSharedData(sharedData.getValue());

        setSharedData1(sharedData1.getValue());
    }
    public void updateDataForSecondButton() {
        setSharedData3(sharedData3.getValue());
        setSharedData4(sharedData4.getValue());
        setSharedData5(sharedData5.getValue());
    }
    public void updateDataForThreeButton() {
        setSharedData6(sharedData6.getValue());
        setSharedData7(sharedData7.getValue());
        setSharedData8(sharedData8.getValue());
    }
    public void updateDataForFourButton() {
        setSharedData9(sharedData9.getValue());
        setSharedData10(sharedData10.getValue());
        setSharedData11(sharedData11.getValue());
    }

    public void updateDataForFiveButton() {
        setSharedData9(sharedData12.getValue());
        setSharedData10(sharedData13.getValue());
        setSharedData11(sharedData14.getValue());
    }
    public void updateDataForSixButton() {
        setSharedData9(sharedData15.getValue());
        setSharedData10(sharedData16.getValue());
        setSharedData11(sharedData17.getValue());
    }

    public void tutartutbutonu(Integer tutar) {
        setTutarTut(tutar);
    }



}