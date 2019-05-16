package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Factura;
import java.util.HashSet;
import java.util.Set;

public class ControladorFactura {
 
    private Set<Factura> lista;
    private int codigo;

    public ControladorFactura() {
    
        lista=new HashSet<>();
        codigo=1;
    }

    public Set<Factura> getLista() {
        return lista;
    }

    public void setLista(Set<Factura> lista) {
        this.lista = lista;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "ControladorFactura{" + "lista=" + lista + ", codigo=" + codigo + '}';
    }
    
    
    public void cread(Factura factura){
    
        factura.setCodigo(codigo);
        lista.add(factura);
        codigo++;
    }
    
    public Factura read(int codigo){
    
        for (Factura factura : lista) {
            
            if (factura.getCodigo()==codigo){
            
                return factura;
            }
        }
        return null;
    }
    
    public void update(Factura factura){
    
        if (lista.contains(factura)){
        
            lista.remove(factura);
            lista.add(factura);
        }
    }
    
    public void delete(int codigo){
    
        for (Factura factura : lista) {
            if (factura.getCodigo()==codigo){
            
                lista.remove(factura);
                break;
            }
        }
    }
    
    public void printAll(){
    
        for (Factura factura : lista) {
            System.out.println(factura);
        }
    }

    
}
