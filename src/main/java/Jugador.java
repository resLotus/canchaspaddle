import javax.persistence.*;

@Table(name = "jugador")
@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_jugador;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "domicilio")
    private String domicilio;

    @OneToOne
    private Paleta id_paleta;
}
