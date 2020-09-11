import javax.persistence.*;

@Table(name = "paleta")
@Entity
public class Paleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_paleta;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "grosor")
    private String grosor;

    @ManyToOne
    private Color cod_color;

    @ManyToOne
    private Constructor cod_constructor;
}
