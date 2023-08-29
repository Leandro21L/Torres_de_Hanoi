package co.edu.uptc.model;

import java.util.HashMap;
import java.util.Stack;
import java.util.Vector;

public class HanoiTower {

    private HashMap<String, Integer> difficulty;
    private int diskNumber;
    private char initialTower, finalTower, auxTower;

    public HanoiTower(int diskNumber, char initialTower, char finalTower, char auxTower) {
        this.diskNumber = diskNumber;
        this.initialTower = initialTower;
        this.finalTower = finalTower;
        this.auxTower = auxTower;
    }

    public HanoiTower(HashMap<String, Integer> difficulty, char initialTower, char finalTower, char auxTower) {
        this.difficulty = difficulty;
        this.initialTower = initialTower;
        this.finalTower = finalTower;
        this.auxTower = auxTower;
    }

    public void resolveHanoiTower(int n, char initialTower, char finalTower, char auxTower) {
        if (n == 0) {
            return;
        }
        resolveHanoiTower(n - 1, initialTower, auxTower, finalTower);
        System.out.println("Move disk " + n + " from rod " + initialTower + " to rod " + finalTower);
        resolveHanoiTower(n - 1, auxTower, finalTower, initialTower);
    }

    public HashMap<String, Integer> getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(HashMap<String, Integer> difficulty) {
        this.difficulty = difficulty;
    }

    public int getDiskNumber() {
        return diskNumber;
    }

    public void setDiskNumber(int diskNumber) {
        this.diskNumber = diskNumber;
    }

    public char getInitialTower() {
        return initialTower;
    }

    public void setInitialTower(char initialTower) {
        this.initialTower = initialTower;
    }

    public char getFinalTower() {
        return finalTower;
    }

    public void setFinalTower(char finalTower) {
        this.finalTower = finalTower;
    }

    public char getAuxTower() {
        return auxTower;
    }

    public void setAuxTower(char auxTower) {
        this.auxTower = auxTower;
    }
}
