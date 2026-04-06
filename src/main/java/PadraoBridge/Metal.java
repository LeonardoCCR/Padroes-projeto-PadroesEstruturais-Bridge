package PadraoBridge;

public class Metal implements Material {
    public void aplicarAcabamento() { System.out.println("Aplicando tinta de revestimento no metal."); }
    public String obterResistencia() { return "Muito Alta (resistente a impactos)"; }
}
