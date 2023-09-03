package Classes;

import java.util.Objects;

/*
Класс описывающий акционного клиента
 */
public class ActionClient extends Actor {
    /*
    переменные индивидуальные для класса акционный клиент
    nameAction - название акции
    id акционного клиента
    maxClientCount - максимальное  количество участников акции
     */
    private String nameAction;
    private int id;
    private static int maxClientCount = 2;

    /*
    Конструктор. Принимает поля
    Имя,
    Наименование акции для конкретного клиента
    id клиента
     */
    public ActionClient(String name, String nameAction, int id) {
        super(name);
        this.nameAction = nameAction;
        this.id = id;
    }

    /*
    гетер для получения наименования акции
     */
    public String getNameAction() {
        return nameAction;
    }

    /*
    Сеттер для установления имени акции
     */
    public void setNameAction(String nameAction) {
        this.nameAction = nameAction;
    }

    /*
    Геттер для получения id клиента
     */
    public int getId() {
        return id;
    }

    /*
        Сеттер для установки id клиента
         */
    public void setId(int id) {
        this.id = id;
    }


    /*
       Сеттер для установки имени клиента
        */
    @Override
    public void setName(String name) {
        super.name = name;
    }


    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void returnOrder(int idOrder) {
        System.out.println("Заказ" + getName() + "№ " + idOrder + " отменен");

    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public void setTakeOrder(boolean takenOrder) {
        super.isTakeOrder = takenOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActionClient that = (ActionClient) o;
        return id == that.id && Objects.equals(nameAction, that.nameAction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAction, id);
    }
}