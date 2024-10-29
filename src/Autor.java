import java.util.Arrays;

public class Autor {
    private String codigo;
    private String nome;
    private String[] titulo;

    /**
     * Constructor para la clase Autor.
     * @param codigo El código del autor.
     * @param nome El nombre del autor.
     * @param titulo Un array de títulos de libros escritos por el autor.
     */
    public Autor(String codigo, String nome, String[] titulo) {
        this.codigo = codigo;
        this.nome = nome;
        this.titulo = titulo;
    }

    // Getters para cada atributo
    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String[] getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", titulo=" + Arrays.toString(titulo) +
                '}';
    }
}