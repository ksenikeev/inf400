package model;
/*
- Номер
  - Клиент
  - Время
  - Пиццы
  - Стоимость
  - Скидка
  - СуммаКОплате
 -
 */
public class Order {
    private int number;
    private Client client;
    private String orderTime;
    private Pizza[] pizzas;
    private float cost;
    //private float discount;
    //private float costToPay;

    public Order() {}

    public Order(int number, Client client, String orderTime, Pizza[] pizzas) {
        this.number = number;
        this.client = client;
        this.orderTime = orderTime;
        this.pizzas = pizzas;


    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public  void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public void setPizzas (Pizza[] pizzas) {
        this.pizzas = pizzas;
    }

    public int getNumber() {
        return number;
    }

    public Client getClient() {
        return client;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public float getCost() {
        this.cost = 0;
        for (int i = 0; i < pizzas.length; i++) {
            cost += pizzas[i].getPrice();
        }
        return cost;
    }

    public float getCostToPay() {
        return cost*(1-client.getDiscount()/100.0);
    }
}