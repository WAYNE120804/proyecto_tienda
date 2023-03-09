package co.edu.umanizales.tads.servicie;

import co.edu.umanizales.tads.model.Kid;
import co.edu.umanizales.tads.model.ListSE;
import co.edu.umanizales.tads.model.Node;
import lombok.Data;
import org.springframework.stereotype.Service;



@Service
@Data
public class ListSEService {
    private ListSE kids;

    public ListSEService() {

        kids.add(new Kid("123", "carlos", (byte) 4, "masculino"));
        kids.add(new Kid("256", "Mariana", (byte) 3, "femenino"));
        kids.add(new Kid("789", "Daniel", (byte) 5, "masculino"));

        kids.addToStart(new Kid("967", "Estefania", (byte) 6, "femenino"));

    }

    public Node getKids(){return kids.getHead();}
}
