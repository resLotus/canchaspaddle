import javax.persistence.*;

@Table(name = "partido")
@Entity
public class Partido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_partido;

    @Column
    private Long inicio_partido;

    @Column
    private Long fin_partido;

    @ManyToOne
    private Cancha id_cancha;

    @ManyToOne
    private Color cod_color_cancha;

    @ManyToOne
    private Jugador id_jugador_responsable;
}
