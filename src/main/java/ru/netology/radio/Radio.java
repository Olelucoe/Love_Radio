package ru.netology.radio;

public class Radio {

    private int minRadioStation = 0;
    private int maxRadioStation = 9;

    private int minVolume = 0;
    private int maxVolume = 100;

    private int currentRadioStation = minRadioStation;
    private int currentVolume = minVolume;

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
        if (nextCurrentRadioStation > maxRadioStation) {
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

    public void increaseVolumeBelowMax() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == maxVolume) {
            currentVolume = 0;
        }
    }

    public void decreaseVolumeNotBelowMin() {
        if (currentVolume <= minVolume) {
            currentVolume = 0;
        } else {
            currentVolume = currentVolume - 1;
        }
    }
    public void increaseRadioStationBelowMax() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = 0;
        }
    }

    public void decreaseRadioStationNotBelowMin() {
        if (currentRadioStation <= minRadioStation) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }
}