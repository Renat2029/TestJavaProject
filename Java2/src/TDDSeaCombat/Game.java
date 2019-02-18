package TDDSeaCombat;

import java.util.Scanner;

public class Game {
    public static final int SIZE = 10;
    private char[] field;
    private Ship ship;
    private String resultMessage;
    private int userInput;
    private int gameLoopCount;
    private Scanner scan;
    private int isShot;

    public int getIsShot() {
        return isShot;
    }

    public void setIsShot(int isShot) {
        this.isShot = isShot;
    }

    public void checkUserInput(int input) {
        if (input > 0 && input < 11) {
            userInput = input;
        } else {
            userInput = 1;
            System.out.println("Неверное входное значение = вы ввели " + input);
            System.out.println("Введите значение пользователя от 1 до 10");
        }
    }

    public int getUserInput() {
        return userInput;
    }

    public void setUserInput(int userInput) {
        this.userInput = userInput;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public char[] getField() {
        return field;
    }

    public void setField(char[] field) {
        this.field = field;
    }

    public void init() {
        field = new char[SIZE];
        for (int i = 0; i < SIZE; i++) {

            field[i] = '.';
        }
    }

    public void fieldShow() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print(" " + field[i]);
        }
        System.out.println(" ");
    }

    public void createShip() {
        ship = new Ship();
    }

    public void start() {
        System.out.print("Введите любое целое число от 1 до 10: ");
        scan = new Scanner(System.in);
        int number;
        while (isShot == 0) {
            number = scan.nextInt();
            checkUserInput(number);
            userfieldCheck(userInput);
            fieldShow();
        }
    }

    public int fieldCheck(int shoot) {
        gameLoopCount++;
        System.out.println("Заданная координата корабля = " + ship.getCoordinate());
        System.out.println("Выстрел в координату = " + shoot);
        if (shoot == ship.getCoordinate()) {
            isShot = 1;
            field[shoot] = 'X';
            resultMessage = "Потоплен";
            System.out.println(resultMessage);
            System.out.println("Победа! количество ходов = " + gameLoopCount);
            return isShot;
        } else {
            isShot = 0;
            field[shoot] = '*';
            resultMessage = "Промах";
            System.out.println(resultMessage);
            return isShot;
        }
    }

    public void userfieldCheck(int userInput) {
        fieldCheck(userInput - 1);
    }
}
