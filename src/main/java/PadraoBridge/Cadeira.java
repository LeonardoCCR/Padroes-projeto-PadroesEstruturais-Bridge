package PadraoBridge;

public class Cadeira extends Movel {
    public Cadeira(Material material) { super(material); }

    public String montar() {
        System.out.print("Montando Cadeira: ");
        material.aplicarAcabamento();
        return "Resistência da cadeira: " + material.obterResistencia();
    }
}
