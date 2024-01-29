package services;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class GameLifeService {

    private static final int MIN_LIVING_NEIGHBORS = 2;
    private static final int MAX_LIVING_NEIGHBORS = 3;
    private static final int UNDERPOPULATION_THRESHOLD = 2;
    private static final int OVERPOPULATION_THRESHOLD = 3;
    private final boolean[][] contentHolder;
    private final List<BiConsumer<Integer,Integer>> gameRules;
    private final List<Point> cellsToRemove;
    private final List<Point> cellsToAdd;

    public GameLifeService(int size) {
        contentHolder = new boolean[size][size];
        cellsToRemove = new ArrayList<>();
        cellsToAdd = new ArrayList<>();
        gameRules = new ArrayList<>();
        setGameRules();
    }

    public void setCell(int row, int column, boolean alive) {
        contentHolder[row][column] = alive;
    }

    public void runIteration() {
        analyzeTheDashboard();
        removeCells();
        addCells();
    }

    private void analyzeTheDashboard() {
        for (int row = 0; row < contentHolder.length; row++) {
            for (int column = 0; column < contentHolder[row].length; column++) {
                for (BiConsumer<Integer,Integer> rule : gameRules) {
                    rule.accept(row, column);
                }
            }
        }
    }

    private void setGameRules(){
        gameRules.add(getRuleOfUnderpopulation());
        gameRules.add(getRuleAnyCellWithTwoOrThreeLiveNeighbors());
        gameRules.add(getRuleAnyCellWithMoreThanThreeLiveNeighborsDies());
        gameRules.add(getRuleAnyDeadCellWithExactlyThreeLiveNeighborsLives());
    }

    private BiConsumer<Integer, Integer> getRuleOfUnderpopulation() {
        return  (row, column) -> {
            int aliveNeighbors = countAliveNeighbors(row, column);
            if (aliveNeighbors < UNDERPOPULATION_THRESHOLD) {
                cellsToRemove.add(new Point(row, column));
            }
        };
    }

    private BiConsumer<Integer, Integer> getRuleAnyCellWithTwoOrThreeLiveNeighbors() {
        return  (row, column) -> {
            int aliveNeighbors = countAliveNeighbors(row, column);
            if (aliveNeighbors == MIN_LIVING_NEIGHBORS || aliveNeighbors == MAX_LIVING_NEIGHBORS) {
                cellsToAdd.add(new Point(row, column));
            }
        };
    }
    private BiConsumer<Integer, Integer> getRuleAnyDeadCellWithExactlyThreeLiveNeighborsLives() {
        return  (row, column) -> {
            int aliveNeighbors = countAliveNeighbors(row, column);
            if (aliveNeighbors == MAX_LIVING_NEIGHBORS && isNotAlive(row, column)) {
                cellsToAdd.add(new Point(row, column));
            }
        };
    }
    private BiConsumer<Integer, Integer> getRuleAnyCellWithMoreThanThreeLiveNeighborsDies() {
        return  (row, column) -> {
            int aliveNeighbors = countAliveNeighbors(row, column);
            if (aliveNeighbors > OVERPOPULATION_THRESHOLD) {
                cellsToRemove.add(new Point(row, column));
            }
        };
    }


    private void removeCells() {
        for (Point cell : cellsToRemove) {
            contentHolder[cell.x][cell.y] = false;
        }
        cellsToRemove.clear();
    }

    private void addCells() {
        for (Point cell : cellsToAdd) {
            contentHolder[cell.x][cell.y] = true;
        }
        cellsToAdd.clear();
    }

    private int countAliveNeighbors(int row, int column){
        int aliveNeighbors = 0;
        for (int internalRow = row - 1; internalRow <= row + 1; internalRow++) {
            if (internalRow < 0 || internalRow >= contentHolder.length) {
                continue;
            }
            for (int internalColumn = column - 1; internalColumn <= column + 1; internalColumn++) {
                if (internalColumn < 0 || internalColumn >= contentHolder[internalRow].length) {
                    continue;
                }
                if (internalRow == row && internalColumn == column) {
                    continue;
                }
                if (isAlive(internalRow, internalColumn)) {
                    aliveNeighbors++;
                }
            }
        }
        return aliveNeighbors;
    }

    private boolean isAlive(int internalRow, int internalColumn) {
        return contentHolder[internalRow][internalColumn];
    }
    private boolean isNotAlive(int internalRow, int internalColumn) {
        return !isAlive(internalRow, internalColumn);
    }

    public boolean getCell(int row, int column) {
        return isAlive(row, column);
    }
}
