package praktikum;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

public class TestIngredient {
    Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "hot sauce", 100F);
    @Test
    @DisplayName("Получение названия ингридиента")
    public void getNameTest() {
        Assert.assertEquals("hot sauce", ingredient.getName());
    }
    @Test
    @DisplayName("Получение цены ингридиента")
    public void getPriceTest() {
        Assert.assertEquals(100F, ingredient.getPrice(),0.0F);
    }
}
