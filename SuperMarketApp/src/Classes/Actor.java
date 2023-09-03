package Classes;

import Interfaces.*;


public  abstract class Actor implements  iActorBehaviour, iReturnOrder {

    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    abstract public void setName(String name);

    abstract public String getName();

    abstract  public  void returnOrder(int idOrder);


}
