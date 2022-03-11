
package entidades.paises;
public class Paises implements Comparable<Paises> {
    String nombre;

    public Paises(String nombre) {
        this.nombre = nombre;
    }

    public Paises() {
    }

    @Override
    public String toString() {
        return "Paises{" + "nombre=" + nombre + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Paises o) {
        return this.getNombre().compareTo(o.getNombre());
    }
    
}
