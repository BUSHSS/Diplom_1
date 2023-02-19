package praktikum;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

public class TestBun {
    Bun bun = new Bun("Булочка с корицей", 300.0F);
    @Test
    @DisplayName("Получение имени булочки")
    public void getNameTest() {
        Assert.assertEquals("Булочка с корицей", bun.getName());
    }
    @Test
    @DisplayName("Получение цены булочки")
    public void getPriceTest() {
        Assert.assertEquals(300F, bun.getPrice(),0.0F);
    }
}
