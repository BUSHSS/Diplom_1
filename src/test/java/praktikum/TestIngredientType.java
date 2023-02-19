package praktikum;

import io.qameta.allure.junit4.DisplayName;
import org.hamcrest.MatcherAssert;
import org.junit.Test;
public class TestIngredientType {

    @Test
    @DisplayName("Проверка наличия FILLING в справочнике ингридентов")
    public void TestIngredientFilling() {
        MatcherAssert.assertThat(String.valueOf(IngredientType.FILLING), true);
    }
    @Test
    @DisplayName("Проверка наличия SAUCE в справочнике ингридентов")
    public void TestIngredientSauce() {
        MatcherAssert.assertThat(String.valueOf(IngredientType.SAUCE), true);
    }


}
