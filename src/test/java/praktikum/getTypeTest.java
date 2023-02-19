package praktikum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

@RunWith(Parameterized.class)
public class getTypeTest {
    IngredientType type;
    public getTypeTest (IngredientType type) {
        this.type = type;
    }
    @Parameterized.Parameters
    public static Object[][] newOrderData(){
        return new Object[][] {
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