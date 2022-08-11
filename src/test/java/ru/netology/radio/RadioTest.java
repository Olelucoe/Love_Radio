package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio rad = new Radio();
    @Test
    public void shouldSetRadioStation() {

        rad.setCurrentRadioStation(7);

        int expected = 7;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {

        rad.getMaxVolume();

        int expected = 100;
        int actual = rad.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() {

        rad.getMinVolume();

        int expected = 0;
        int actual = rad.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMaxRadioStation() {

        rad.getMaxRadioStation();

        int expected = 9;
        int actual = rad.getMaxRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinRadioStation() {

        rad.getMinRadioStation();

        int expected = 0;
        int actual = rad.getMinRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetVolumeAboveMax() {

        rad.setCurrentVolume(101);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeByOne() {
        rad.setCurrentVolume(0);

        rad.increaseVolumeBelowMax();

        int expected = 1;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolumeByOne() {
        rad.setCurrentVolume(100);

        rad.decreaseVolumeNotBelowMin();

        int expected = 99;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationByOne() {
        rad.setCurrentRadioStation(5);

        rad.increaseRadioStationBelowMax();

        int expected = 6;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationByOne() {
        rad.setCurrentRadioStation(9);

        rad.decreaseRadioStationNotBelowMin();

        int expected = 8;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationLessMin() {
        rad.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationAboveMax() {
        rad.setCurrentRadioStation(10);

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeBelowMin() {
        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {

        rad.setCurrentVolume(50);

        int expected = 50;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseRadioStationPrevMin() {
        rad.setCurrentRadioStation(0);

        rad.decreaseRadioStationNotBelowMin();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseRadioStationNextMax() {
        rad.setCurrentRadioStation(9);

        rad.increaseRadioStationBelowMax();

        int expected = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolumePrevMin() {
        rad.setCurrentVolume(0);

        rad.decreaseVolumeNotBelowMin();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolumeNextMax() {
        rad.setCurrentVolume(100);

        rad.increaseVolumeBelowMax();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
