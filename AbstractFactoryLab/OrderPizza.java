public class OrderPizza {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza nyPizza = nyStore.orderPizza("cheese");
        System.out.println("Ordered a pizza from NY: " + nyPizza);

        Pizza chicagoPizza = chicagoStore.orderPizza("veggie");
        System.out.println("Ordered a pizza from Chicago: " + chicagoPizza);
    }

}
