package TDDSeaCombat;

import java.util.Random;

public class Ship {
    private int coordinate;
    private int length;
    public int getCoordinate() {
        return coordinate;
    }
    public void setCoordinate(int coordinate) {
        this.coordinate = coordinate;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public Ship() {
        Random random = new Random();
        coordinate = random.nextInt(Game.SIZE);
        length = calculateLength();
        //length = 1; /// Лучше не привязывать жестко размер корабля в конструктор. Лучше сделать поле вычисляемым
    }

    private int calculateLength() {
        return 1; // Это самый простой способ, но необходимо сделать более универсальным если корабль будет например 2палубным
    }
}