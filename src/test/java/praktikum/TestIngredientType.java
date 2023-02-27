package praktikum;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

public class TestIngredientType {

    @Test
    //"Проверка наличия FILLING в справочнике ингридентов"
    public void TestIngredientFilling() {
        MatcherAssert.assertThat(String.valueOf(IngredientType.FILLING), true);
    }

    @Test
    //"Проверка наличия SAUCE в справочнике ингридентов"
    public void TestIngredientSauce() {
        MatcherAssert.assertThat(String.valueOf(IngredientType.SAUCE), true);
    }


}
