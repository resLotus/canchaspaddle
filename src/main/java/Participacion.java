import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "participacion")
@Entity
public class Participacion {

    @EmbeddedId
    @ManyToOne
    private Partido id_partido;

    @EmbeddedId
    @ManyToOne
    private Jugador id_jugador;

    @ManyToOne
    private Paleta id_paleta;
}
