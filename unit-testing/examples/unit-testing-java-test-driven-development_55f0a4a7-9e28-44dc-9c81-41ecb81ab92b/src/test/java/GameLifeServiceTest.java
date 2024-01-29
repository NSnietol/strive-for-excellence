import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import services.GameLifeService;

public class GameLifeServiceTest {

    /*
       Example matrix of the tests below, checking the scenario
     *  Matrix (3x3)
    *   1 0 0
    *   0 1 0
    *   0 0 1
    *
    * */

    @Test
    @DisplayName("Any live cell with fewer than two live neighbors dies, as if by underpopulation.")
    public void cellWithFewerThanTwoLiveNeighborsDiesByUnderpopulation() {
        GameLifeService gameLifeService = new GameLifeService(3);
        gameLifeService.setCell(0, 0, true);
        gameLifeService.setCell(1, 1, true);
        gameLifeService.setCell(2, 2, true);

        gameLifeService.runIteration();

        Assertions.assertFalse(gameLifeService.getCell(0, 0));
        Assertions.assertTrue(gameLifeService.getCell(1, 1));
        Assertions.assertFalse(gameLifeService.getCell(2, 2));
    }



    /*
       Example matrix of the tests below, checking the scenario
     *  Matrix (5x5)
     *   0 0 0 1 0
     *   1 1 0 0 0
     *   0 1 1 1 0
     *   0 0 0 0 1
     *   0 0 0 0 0
     *
     * */

    @Test
    @DisplayName("Any live cell with two or three live neighbors lives on to the next generation.")
    public void cellWitTwoOrThreeNeighborsLive() {
        GameLifeService gameLifeService = new GameLifeService(5);
        gameLifeService.setCell(0, 3, true);
        gameLifeService.setCell(1, 0, true);
        gameLifeService.setCell(1, 1, true);
        gameLifeService.setCell(2, 1, true);
        gameLifeService.setCell(2, 2, true);
        gameLifeService.setCell(2, 3, true);
        gameLifeService.setCell(3, 4, true);

        gameLifeService.runIteration();

        Assertions.assertTrue(gameLifeService.getCell(0, 0));
        Assertions.assertTrue(gameLifeService.getCell(0, 1));
        Assertions.assertTrue(gameLifeService.getCell(0, 2));
        Assertions.assertFalse(gameLifeService.getCell(0, 3));

        Assertions.assertTrue(gameLifeService.getCell(1, 0));
        Assertions.assertTrue(gameLifeService.getCell(1, 1));
        Assertions.assertFalse(gameLifeService.getCell(1, 2));
        Assertions.assertTrue(gameLifeService.getCell(1, 3));

        Assertions.assertTrue(gameLifeService.getCell(2, 0));
        Assertions.assertTrue(gameLifeService.getCell(2, 1));
        Assertions.assertTrue(gameLifeService.getCell(2, 2));
        Assertions.assertTrue(gameLifeService.getCell(2, 3));
        Assertions.assertTrue(gameLifeService.getCell(2, 4));


        Assertions.assertFalse(gameLifeService.getCell(3, 0));
        Assertions.assertTrue(gameLifeService.getCell(3, 1));
        Assertions.assertTrue(gameLifeService.getCell(3, 2));
        Assertions.assertTrue(gameLifeService.getCell(3, 3));
        Assertions.assertFalse(gameLifeService.getCell(3, 4));

    }


    /*
       Example matrix of the tests below, checking the scenario
     *  Matrix (5x5)
     *   0 1 0 0 0
     *   1 1 1 0 0
     *   0 1 0 1 0
     *   0 0 1 1 1
     *   0 0 0 1 0
     *
     * */

    @Test
    @DisplayName("Any live cell with more than three live neighbors dies, as if by overpopulation")
    public void cellWithMoreThanThreeNeighborsDiesByOverpopulation() {
        GameLifeService gameLifeService = new GameLifeService(5);
        gameLifeService.setCell(0, 1, true);
        gameLifeService.setCell(1, 0, true);
        gameLifeService.setCell(1, 1, true);
        gameLifeService.setCell(1, 2, true);
        gameLifeService.setCell(2, 1, true);
        gameLifeService.setCell(2, 3, true);
        gameLifeService.setCell(3, 2, true);
        gameLifeService.setCell(3, 3, true);
        gameLifeService.setCell(3, 4, true);
        gameLifeService.setCell(4, 3, true);

        gameLifeService.runIteration();


        Assertions.assertFalse(gameLifeService.getCell(1, 1));
        Assertions.assertFalse(gameLifeService.getCell(3, 3));

    }

    /*
     *  Matrix 5x5
     *   0 1 0 0 0
     *   1 1 1 1 0
     *   0 0 0 0 0
     *   0 0 1 1 1
     *   0 0 0 1 0
     *
     * */

    @Test
    @DisplayName("Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.\n")
    public void deadCellWitExactlyThreeNeighborsLiveByReproduction() {
        GameLifeService gameLifeService = new GameLifeService(5);
        gameLifeService.setCell(0, 1, true);
        gameLifeService.setCell(1, 0, true);
        gameLifeService.setCell(1, 1, true);
        gameLifeService.setCell(1, 2, true);
        gameLifeService.setCell(1, 3, true);

        gameLifeService.setCell(3, 2, true);
        gameLifeService.setCell(3, 3, true);
        gameLifeService.setCell(3, 4, true);
        gameLifeService.setCell(4, 3, true);

        gameLifeService.runIteration();


        Assertions.assertTrue(gameLifeService.getCell(2, 4));
        Assertions.assertFalse(gameLifeService.getCell(2, 1));
        Assertions.assertFalse(gameLifeService.getCell(2, 2));
        Assertions.assertFalse(gameLifeService.getCell(2, 3));

    }


}
