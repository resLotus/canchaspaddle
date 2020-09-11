import javax.persistence.*;
import java.util.List;

@Table(name="cancha")
@Entity
public class Cancha {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id_cancha;

    @Column(name = "nombre", length = 100)
    private String nombre;

    @Column(name = "esta_prendida")
    private boolean esta_iluminada;

    @ManyToOne
    private Color color;
}
