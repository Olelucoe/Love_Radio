package ru.netology.radio;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentRadioStation(int nextCurrentRadioStation) {
        if (nextCurrentRadioStation < 0) {
            return;
        }
        if (nextCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = nextCurrentRadioStation;
    }

    public void setCurrentVolume(int nextCurrentVolume) {
        if (nextCurrentVolume < 0) {
            return;
        }
        if (nextCurrentVolume > 10) {
            return;
        }
        currentVolume = nextCurrentVolume;
    }

    public void setToMaxVolume() {

        currentVolume = 10;
    }

    public void setToMaxRadioStation() {

        currentRadioStation = 9;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }

    }

    public void decreaseVolume() {
        if (currentVolume <= 0) {
            currentVolume = 0;
        } else {
            currentVolume = currentVolume - 1;
        }
    }

    public void nextRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation <= 0) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }
}

