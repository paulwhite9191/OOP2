package ru.netology;

public class Radio2 {
    private int currentStation;
    private final int minStation = 0;
    private int currentVolume;
    private final int minVolume = 0;
    private final int maxVolume = 100;
    private int countStation = 10;

    public Radio2() {
    }

    public Radio2(int countStation) {
        this.countStation = countStation;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation || currentStation > countStation - 1) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (countStation - 1 <= currentStation) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void previousStation() {
        if (currentStation <= minStation) {
            setCurrentStation(countStation - 1);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume || currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}