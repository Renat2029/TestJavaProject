package TDDSeaCombat;

public class Main {
    public static final int COORDINATE = 2;

    public static void main(String[] args) {
        Game game = new Game();
        game.init();
        game.createShip();
        game.getShip().setCoordinate(COORDINATE); //Выглядит очень коряво. Coordinate - это координата корабля, а почему 2?
        game.start();
    }
}
