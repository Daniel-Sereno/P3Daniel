package geometriaTest;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import br.unibave.geometria.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeomeriaTest {
    private ArrayList<Forma> formas = new ArrayList<Forma>();
    @BeforeEach
    void inicializar(){
        formas.add(new Triangulo("Triangulo1","Azul",3,5,4,4,2));
        formas.add(new Circulo("Circulo1","Azul",2));
        formas.add(new Retangulo("Retangulo1","rosa", 4, 5,2));
        formas.add(new Poligono("Poligono1","amarelo", 12));
    }
    @Test
    void getters(){
        assertEquals("Triangulo1", formas.get(0).getNome());
    }
    @Test
    void areasValidas(){
        //circulo
        assertEquals(12.0, formas.get(1).calcularArea());

    }


}
