package co.edu.uptc.presenter;

import co.edu.uptc.model.HanoiTower;
import co.edu.uptc.model.view.IoManager;
import co.edu.uptc.utils.FileManager;

import java.util.HashMap;

public class Presenter {

    private HanoiTower hanoiTower;
    private FileManager fileManager;
    private IoManager ioManager;
    private HashMap<String, Integer> map;

    public Presenter() {
        fileManager = new FileManager();
        ioManager = new IoManager();
        map = fileManager.readData();
        hanoiTower = new HanoiTower(map, 'A', 'B', 'C');
        init();
    }

    public void init() {
        //int option = 0;
        ioManager.showMessage("Torres de Hanoi");
        while (true) {
            switch (ioManager.readInt("Seleccione la dificultad:\n 1. Principiante.\n 2. Novato.\n 3. Intermedio.\n 4. Avanzado.\n 5. Experto.\n 6. Maestro.")) {
                case 1:
                    begginers();
                    break;
                case 2:
                    novice();
                    break;
                case 3:
                    intermediate();
                    break;
                case 4:
                    advanced();
                    break;
                case 5:
                    expert();
                    break;
                case 6:
                    master();
                default:
                    break;
            }
        }
    }

    private void master() {
        int n = hanoiTower.getDifficulty().get("Master");
        char initial = hanoiTower.getInitialTower();
        char aux = hanoiTower.getAuxTower();
        char finalT = hanoiTower.getFinalTower();

        hanoiTower.resolveHanoiTower(n, initial, finalT, aux);
    }

    private void expert() {
        int n = hanoiTower.getDifficulty().get("Expert");
        char initial = hanoiTower.getInitialTower();
        char aux = hanoiTower.getAuxTower();
        char finalT = hanoiTower.getFinalTower();

        hanoiTower.resolveHanoiTower(n, initial, finalT, aux);
    }

    private void advanced() {
        int n = hanoiTower.getDifficulty().get("Advanced");
        char initial = hanoiTower.getInitialTower();
        char aux = hanoiTower.getAuxTower();
        char finalT = hanoiTower.getFinalTower();

        hanoiTower.resolveHanoiTower(n, initial, finalT, aux);
    }

    private void intermediate() {
        int n = hanoiTower.getDifficulty().get("Intermediate");
        char initial = hanoiTower.getInitialTower();
        char aux = hanoiTower.getAuxTower();
        char finalT = hanoiTower.getFinalTower();

        hanoiTower.resolveHanoiTower(n, initial, finalT, aux);
    }

    private void novice() {
        int n = hanoiTower.getDifficulty().get("Novice");
        char initial = hanoiTower.getInitialTower();
        char aux = hanoiTower.getAuxTower();
        char finalT = hanoiTower.getFinalTower();

        hanoiTower.resolveHanoiTower(n, initial, finalT, aux);
    }

    private void begginers() {

        int n = hanoiTower.getDifficulty().get("Beginners");
        char initial = hanoiTower.getInitialTower();
        char aux = hanoiTower.getAuxTower();
        char finalT = hanoiTower.getFinalTower();

        hanoiTower.resolveHanoiTower(n, initial, finalT, aux);
    }
}
