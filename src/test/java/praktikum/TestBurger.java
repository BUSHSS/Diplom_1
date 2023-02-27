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
    @Mock
    Ingredient ingredient;
    @Mock
    Ingredient ingredient2;

    @Test
    //"Проверка покрытия getPrice"
    public void getPrice() {
        Mockito.when(ingredient.getPrice()).thenReturn(100F);
        burger.addIngredient(ingredient);
        burger.setBuns(bun);
        Mockito.when(bun.getPrice()).thenReturn(300F);
        Assert.assertEquals(700F, burger.getPrice(), 0.0F);
    }

    @Test
    //"Проверка покрытия getReceipt"
    public void getReceipt() {
        burger.addIngredient(ingredient);
        Mockito.when(ingredient.getName()).thenReturn("Булочка с корицей");
        Mockito.when(ingredient.getType()).thenReturn(IngredientType.FILLING);
        burger.setBuns(bun);
        burger.getReceipt();
        Mockito.verify(bun, Mockito.times(2)).getName();
        Mockito.verify(ingredient, Mockito.times(1)).getName();
        Mockito.verify(ingredient, Mockito.times(1)).getType();
    }

    @Test
    //"Проверка покрытия addIngredient"
    public void addIngredient() {
        burger.addIngredient(ingredient);
        Assert.assertFalse(burger.ingredients.isEmpty());
    }

    @Test
    //"Проверка покрытия removeIngredient"
    public void removeIngredient() {
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        int expected = burger.ingredients.size() - 1;
        burger.removeIngredient(1);
        Assert.assertEquals(expected, burger.ingredients.size());
    }

    @Test
    //"Проверка покрытия moveIngredient"
    public void moveIngredient() {
        Mockito.when(ingredient.getName()).thenReturn("Булочка с корицей");
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient2);
        int expectedSize = burger.ingredients.size();
        burger.moveIngredient(0, 1);
        Assert.assertEquals(burger.ingredients.get(1).getName(), ingredient.getName()); //проверка, что нужный ингридиент переместился в заданный индекс
        Assert.assertEquals(expectedSize, burger.ingredients.size()); // проверка, что размер массива при этом не изменился
    }
}
