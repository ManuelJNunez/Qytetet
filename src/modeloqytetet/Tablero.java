package modeloqytetet;
import java.util.ArrayList;
/**
 *
 * @author Fernando Roldán
 */
public class Tablero {
    private ArrayList<Casilla> casillas = new ArrayList<>();
    private Casilla carcel;
    
    public Tablero (){
        inicializar();
        
    }
    
    public Casilla getCasilla(int i){return casillas.get(i);}
    
    public Casilla getCarcel () {return carcel;}
    
    private void inicializar(){
        TituloPropiedad titulo;
        this.casillas = new ArrayList();
        this.casillas.add(new Casilla (0, TipoCasilla.SALIDA, 0));
        titulo = new TituloPropiedad ("Avenida de Andalucia", 800, 500, 10, 60, 200);
        this.casillas.add(new Casilla (1, titulo));
        titulo = new TituloPropiedad ("Avenida de la Constitución", 800, 500, 10, 60, 200);
        this.casillas.add(new Casilla (2, titulo));
        this.casillas.add(new Casilla (3, TipoCasilla.SORPRESA,0));
        titulo = new TituloPropiedad ("Parque Almunia", 800, 500, 10, 60, 200);
        this.casillas.add(new Casilla (4, titulo));
        this.casillas.add(new Casilla (5, TipoCasilla.CARCEL,0));
        titulo = new TituloPropiedad ("Gran Vía de Colón", 800, 500, 10, 60, 200);
        this.casillas.add(new Casilla (6, titulo));
        this.casillas.add(new Casilla (7, TipoCasilla.SORPRESA,0));
        titulo = new TituloPropiedad ("Avenida de Dilar", 800, 500, 10, 60, 200);
        this.casillas.add(new Casilla (8, titulo));
        titulo = new TituloPropiedad ("Camino de Ronda", 800, 500, 10, 60, 200);
        this.casillas.add(new Casilla (9, titulo));
        this.casillas.add(new Casilla (10, TipoCasilla.PARKING,0));
        titulo = new TituloPropiedad ("Recogidas", 800, 500, 10, 60, 200);
        this.casillas.add(new Casilla (11, titulo));
        titulo = new TituloPropiedad ("Avenida de Juan Pablo II", 800, 500, 10, 60, 200);
        this.casillas.add(new Casilla (12, titulo));
        this.casillas.add(new Casilla (13, TipoCasilla.SORPRESA,0));
        titulo = new TituloPropiedad ("Plaza de Bib-Rambla", 800, 500, 10, 60, 200);
        this.casillas.add(new Casilla (14, titulo));
        this.casillas.add(new Casilla (15, TipoCasilla.JUEZ,0));
        titulo = new TituloPropiedad ("Calle Mesones", 800, 500, 10, 60, 200);
        this.casillas.add(new Casilla (16, titulo));
        titulo = new TituloPropiedad ("Jardines del Triunfo", 800, 500, 10, 60, 200);
        this.casillas.add(new Casilla (17, titulo));
        titulo = new TituloPropiedad ("Calle Acera del Darro", 800, 500, 10, 60, 200);
        this.casillas.add(new Casilla (18, titulo));
        titulo = new TituloPropiedad ("Parque Almunia", 800, 500, 10, 60, 200);
        this.casillas.add(new Casilla (19, titulo));
        
        this.carcel = this.casillas.get(5);
    }
    
    @Override
    public String toString() {
        return "Casillas = " + casillas + ", carcel = " + carcel;
    }
    
}
