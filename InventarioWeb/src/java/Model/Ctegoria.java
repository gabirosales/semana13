
package Model;

public class Ctegoria {
    private int id_categoria;
    private String nom_catgoria;
    private int estado_categoria;

    public Ctegoria() {
        this.id_categoria = 0;
        this.nom_catgoria = "";
        this.estado_categoria = 1;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNom_catgoria() {
        return nom_catgoria;
    }

    public void setNom_catgoria(String nom_catgoria) {
        this.nom_catgoria = nom_catgoria;
    }

    public int getEstado_categoria() {
        return estado_categoria;
    }

    public void setEstado_categoria(int estado_categoria) {
        this.estado_categoria = estado_categoria;
    }
    
    
}
