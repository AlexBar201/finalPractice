import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

public class TestForAccount {

    @Test
    @DisplayName("Проверка на то, что метод не примет строку с пробелом в начале и конце")
    @Description("Должна вернуться строка \"Это имя нельзя печатать на карте\"")
    public void twoSpaces(){

        String name = " Саша Баранов ";
        Account account = new Account(name);
        String expected = "Это имя нельзя печатать на карте";
        Assert.assertEquals(expected, account.checkNameToEmboss());

    }

    @Test
    @DisplayName("Проверка на то, что метод не примет строку с пробелом в начале")
    @Description("Должна вернуться строка \"Это имя нельзя печатать на карте\"")
    public void startsWithOneSpaces(){

        String name = " Саша Баранов";
        Account account = new Account(name);
        String expected = "Это имя нельзя печатать на карте";
        Assert.assertEquals(expected, account.checkNameToEmboss());

    }

    @Test
    @DisplayName("Проверка на то, что метод не примет строку с пробелом в конце")
    @Description("Должна вернуться строка \"Это имя нельзя печатать на карте\"")
    public void endsOneSpaces(){

        String name = "Саша Баранов ";
        Account account = new Account(name);
        String expected = "Это имя нельзя печатать на карте";
        Assert.assertEquals(expected, account.checkNameToEmboss());

    }

    @Test
    @DisplayName("Проверка на то, что метод примет валидную строку")
    @Description("Должна вернуться строка \"Это имя можно печатать на карте\"")
    public void validStringName(){

        String name = "Саша Баранов";
        Account account = new Account(name);
        String expected = "Это имя можно печатать на карте";
        Assert.assertEquals(expected, account.checkNameToEmboss());

    }

    @Test
    @DisplayName("Проверка на то, что метод не примет строку менее трех символов")
    @Description("Должна вернуться строка \"Это имя нельзя печатать на карте\"")
    public void lessThanThree(){

        String name = "Са";
        Account account = new Account(name);
        String expected = "Это имя нельзя печатать на карте";
        Assert.assertEquals(expected, account.checkNameToEmboss());

    }

    @Test
    @DisplayName("Проверка на то, что метод не примет строку менее трех символов")
    @Description("Должна вернуться строка \"Это имя нельзя печатать на карте\"")
    public void moreThanNineTeen(){

        String name = "Сашааааааааааа Баааааааррааанооов";
        Account account = new Account(name);
        String expected = "Это имя нельзя печатать на карте";
        Assert.assertEquals(expected, account.checkNameToEmboss());

    }

}
