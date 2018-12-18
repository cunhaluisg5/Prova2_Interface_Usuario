
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Quarto;

/**
 *
 * @author Luis Gustavo
 */
public class QuartoDao {
    private final List<Quarto> lista;

    public QuartoDao() {
        lista = new ArrayList<>();
    }
    
    public void adicionaQuarto(Quarto quarto){
        lista.add(quarto);
    }
    
    public List<Quarto> listaQuartos(){
        return lista;
    }
}
