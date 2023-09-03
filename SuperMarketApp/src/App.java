import Classes.*;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("boris");
        iActorBehaviour client2 = new SpecialClient("prezident", 1);
        iActorBehaviour client3 = new TaxInspector();

        iActorBehaviour client4 = new ActionClient("Stanislav","3+1",1);
        iActorBehaviour client5 = new ActionClient("Sergey","3+1",2);
        iActorBehaviour client6 = new ActionClient("Ivan","3+1",3);


        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);

        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);
        magnit.acceptToMarket(client6);

        magnit.update();
    }
}
