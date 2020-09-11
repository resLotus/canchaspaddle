import jdk.nashorn.internal.ir.annotations.Immutable;

import javax.persistence.*;

@Table(name = "color")
@Entity
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_color;

    @Column(name = "descripcion")
    String descripcion;
}
