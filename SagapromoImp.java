import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SagapromoImp implements Sagapromo {

    @Override
    public double Prixsaga(ArrayList<String> sagafilm) {
       
        
       Set <String> uniqueSaga = new HashSet<>(sagafilm);
       int nombredeSaga = uniqueSaga.size();
       if (nombredeSaga == 2) {
        return 0.10;
       }
       else if(nombredeSaga == 3) {
        return 0.20;
       }
       else{
        return 0.0;
       }
       
       
    }

   
    
}
    