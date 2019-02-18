package TestSeaCombatTDD;

import org.junit.Before;
import org.junit.Test;
import TDDSeaCombat.Game;
import TDDSeaCombat.Ship;

import static org.junit.Assert.assertEquals;

public class SeaCombatTest {
    Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
        game.init();
        game.createShip();
    }

    @Test
    public void testArrayUs1() { // зачтено
        assertEquals(Game.SIZE, game.getField().length);
        game.fieldShow();
    }

    @Test
    public void testFieldUs2() { // зачтено
        for (int i = 0; i < Game.SIZE; i++) {
            assertEquals('.', game.getField()[i]);
        }
    }

    @Test
    public void testCreateShipUs3() { // Лучше писать более говорящее название, т.к. тестируем однопалубный корабль
        Ship ship = game.getShip(); // понятнее так // зачтено
        assertEquals(1, ship.getLength());
        System.out.println(game.getShip().getCoordinate());
    }

    @Test
    public void doShootUs4() { /// Необходимо дописать тест , чтобы было видно другие результаты выстрела (промах и т.д.)
        Ship ship = game.getShip(); /// понятнее так
        ship.setCoordinate(2);
        assertEquals(1, game.fieldCheck(2));
        assertEquals(0, game.fieldCheck(1));
    }

    @Test
    public void showSymbolicResultUs5() {
// На экран выводится в обоих случаях "Координата корабля 3". Хотя в одном случае попадание, в другом промах. Исправить
        game.getShip().setCoordinate(3);
        //наличие корабля в выбранной клетке
        assertEquals(1, game.fieldCheck(3));
        assertEquals('X', game.getField()[3]);
        //проверка выстрела по полю где нет корабля
        assertEquals(0, game.fieldCheck(2));
        assertEquals('*', game.getField()[2]);
        //hit X
        //miss *
    }

    @Test
    public void showUserFriendlyResultUs6() {
// На экран выводится в обоих случаях "Координата корабля 3". Хотя в одном случае попадание, в другом промах. Исправить
        game.getShip().setCoordinate(3);
        game.fieldCheck(3);
        assertEquals("Потоплен", game.getResultMessage());
        game.fieldShow();
        game.fieldCheck(2);
        assertEquals("Промах", game.getResultMessage());
        game.fieldShow();
    }

    @Test
    public void userFriendlyIncrementUs7() {
        // не совсем тот тест. Тест подразумевает, что я могу ввести номер ячейки от 1 до длины поля
        // Не могу ввести 0 и больше длины поля
        game.checkUserInput(14);
        assertEquals(1, game.getUserInput());
    }

    @Test
    public void winCheckUs8() {
// тут надо сравнить с "Игра окончена"
        game.getShip().setCoordinate(3);
        game.fieldCheck(3);
        assertEquals("Потоплен", game.getResultMessage());
        //проверка состояния потопленности
        assertEquals(1, game.getIsShot());
    }
}
