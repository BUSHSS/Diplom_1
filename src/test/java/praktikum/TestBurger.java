package praktikum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class TestBurger {
    @Mock
    Bun bun;
    Burger burger = new Burger();
    Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "hot sauce", 100F);
    @Test
    //"Проверка покрытия getPrice"
    public void getPrice(){
        burger.addIngredient(ingredient);
        burger.setBuns(bun);
        Mockito.when(bun.getPrice()).thenReturn(300F);
        Assert.assertEquals(700F,burger.getPrice(),0.0F);
    }

    @Test
    //"Проверка покрытия getReceipt"
    public void getReceipt() {
        burger.addIngredient(ingredient);
        burger.setBuns(bun);
        burger.getReceipt();
        Mockito.verify(bun, Mockito.times(2)).getName();
    }

    @Test
    //"Проверка покрытия addIngredient"
    public void addIngredient() {
        burger.addIngredient(ingredient);
        Assert.assertEquals(false, burger.ingredients.isEmpty());
    }

    @Test
    //"Проверка покрытия removeIngredient"
    public void removeIngredient() {
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        int expected = burger.ingredients.size()-1;
        burger.removeIngredient(1);
        Assert.assertEquals(expected, burger.ingredients.size());
    }

    @Test
    //"Проверка покрытия moveIngredient"
    public void moveIngredient() {
        burger.addIngredient(new Ingredient(IngredientType.SAUCE, "hot sauce", 100F));
        burger.addIngredient(new Ingredient(IngredientType.FILLING, "cutlet", 100F));
        burger.addIngredient(new Ingredient(IngredientType.FILLING, "sausage", 300F));
        Ingredient expectedIngredient = burger.ingredients.get(2);
        int expectedSize = burger.ingredients.size();
        burger.moveIngredient(2,0);
        Assert.assertEquals(expectedIngredient,burger.ingredients.get(0)); //проверка, что нужный ингридиент переместился в заданный индекс
        Assert.assertEquals(expectedSize, burger.ingredients.size()); // проверка, что размер массива при этом не изменился
    }
}
