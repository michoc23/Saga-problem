import java.util.ArrayList;

public class Calcul {

    public double calculerTotal(ArrayList<String> films) {
       ArrayList<String> sagafilm = new ArrayList<>();
       for(String film : films){
    if (film.equals("Back to the Future 1") || film.equals("Back to the Future 2") ||
         film.equals("Back to the Future 3")) {

        sagafilm.add(film);
}
        }

         SagapromoImp promo = new SagapromoImp();
         double reduction = promo.Prixsaga(sagafilm);
         double total = 20*(films.size()-sagafilm.size()) + 15*sagafilm.size()*(1-reduction);
         return total;
    }
}