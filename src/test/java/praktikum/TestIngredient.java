package praktikum;

import org.junit.Assert;
import org.junit.Test;

public class TestIngredient {
    Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "hot sauce", 100F);

    @Test
    //"Получение названия ингридиента"
    public void getNameTest() {
        Assert.assertEquals("hot sauce", ingredient.getName());
    }

    @Test
    //"Получение цены ингридиента"
    public void getPriceTest() {
        Assert.assertEquals(100F, ingredient.getPrice(), 0.0F);
    }
}
