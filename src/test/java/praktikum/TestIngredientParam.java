package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

@RunWith(Parameterized.class)
public class TestIngredientParam {
    IngredientType type;

    public TestIngredientParam(IngredientType type) {
        this.type = type;
    }

    @Parameterized.Parameters(name = "Типы ингридиентов. Тестовые данные: {0}")
    public static Object[][] newOrderData() {
        return new Object[][]{
                {SAUCE},
                {FILLING}
        };
    }

    @Test
    //"Проверка покрытия getType"
    public void getTypeTest() {
        Ingredient ingredient = new Ingredient(type, "начинка", 500F);
        Assert.assertEquals(type, ingredient.getType());
    }


}