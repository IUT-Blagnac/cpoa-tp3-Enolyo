package test;
import pizza.*;
import pizzaFactory.*;
import pizzeria.Pizzeria;
import pizzeria.PizzeriaFactory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        Pizzeria boutiqueBrest = PizzeriaFactory.getInstance().create("Brest");
        Pizzeria boutiqueStrasbourg = PizzeriaFactory.getInstance().create("Strasbourg");

        Pizza pizza = boutiqueBrest.orderPizza("fromage");
        System.out.println("JMB a commandé une " + pizza.getName() + "\n");

        pizza = boutiqueStrasbourg.orderPizza("fromage");
        System.out.println("JMI a commandé une " + pizza.getName() + "\n");
    }
}