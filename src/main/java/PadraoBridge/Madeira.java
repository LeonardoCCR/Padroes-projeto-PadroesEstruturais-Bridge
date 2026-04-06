package PadraoBridge;

public class Madeira implements Material {
    public void aplicarAcabamento() { System.out.println("Lixando e aplicando verniz na madeira."); }
    public String obterResistencia() { return "Alta (sensível a umidade)"; }
}
