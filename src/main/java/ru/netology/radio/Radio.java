package ru.netology.radio;

public class Radio {

    private int minRadioStation = 0;
    private int maxRadioStation = 9;

    private int minVolume = 0;
    private int maxVolume = 100;

    private int currentRadioStation = minRadioStation;
    private int currentVolume = minVolume;

    private int stationAmount;

    public Radio() {
        stationAmount = 10;

    }

    public Radio(int stationAmount) {
        this.stationAmount = stationAmount;
    }

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setCurrentRadioStation(int nextCurrentRadioStation) {
        if (nextCurrentRadioStation < minRadioStation) {
            return;
        }
        if (nextCurrentRadioStation > stationAmount - 1) {
            return;
        }
        currentRadioStation = nextCurrentRadioStation;
    }

    public void setCurrentVolume(int nextCurrentVolume) {
        if (nextCurrentVolume < minVolume) {
            return;
        }
        if (nextCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = nextCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }

    }

    public void decreaseVolume() {
        if (currentVolume <= minVolume) {
            currentVolume = 0;
        } else {
            currentVolume--;
        }
    }

    public void nextRadioStation() {
        if (currentRadioStation < stationAmount - 1) {
            currentRadioStation++;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = stationAmount - 1;
        } else {
            currentRadioStation--;
        }

    }
}