//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket();
        Basket petyaBasket = new Basket();
        vasyaBasket.add("Молоко", 80);
        vasyaBasket.add("Хлеб", 40);
        petyaBasket.add("Лопата", 280);
        petyaBasket.add("Бочка", 2900);
        vasyaBasket.print("Корзина Васи: ");
        System.out.println("Общая стоимость корзины: " + vasyaBasket.getTotalPrice());
        System.out.println();
        petyaBasket.print("Корзина Пети: ");
        System.out.println("Общая стоимость корзины: " + petyaBasket.getTotalPrice());
    }
}
