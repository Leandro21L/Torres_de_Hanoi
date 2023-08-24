package co.edu.uptc.model;

import java.util.Stack;

public class HanoiTower {
    private int diskNumber;
    private Stack<Disk> initialTower, finalTower, auxTower;

    public HanoiTower(int diskNumber, Stack<Disk> initialTower, Stack<Disk> finalTower, Stack<Disk> auxTower) {
        this.diskNumber = diskNumber;
        this.initialTower = initialTower;
        this.finalTower = finalTower;
        this.auxTower = auxTower;
    }

    //public void resolveHanoi(int diskNumber, )

    private void fillTower(int diskNumber){
        for (int i = 0; i < diskNumber; i++) {
            initialTower.push(new Disk(3));
        }
    }

    public int getDiskNumber() {
        return diskNumber;
    }

    public void setDiskNumber(int diskNumber) {
        this.diskNumber = diskNumber;
    }

    public Stack<Disk> getInitialTower() {
        return initialTower;
    }

    public void setInitialTower(Stack<Disk> initialTower) {
        this.initialTower = initialTower;
    }

    public Stack<Disk> getFinalTower() {
        return finalTower;
    }

    public void setFinalTower(Stack<Disk> finalTower) {
        this.finalTower = finalTower;
    }

    public Stack<Disk> getAuxTower() {
        return auxTower;
    }

    public void setAuxTower(Stack<Disk> auxTower) {
        this.auxTower = auxTower;
    }
}
