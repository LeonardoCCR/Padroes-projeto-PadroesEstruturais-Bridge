package PadraoBridge;

// Refinamento da abstração
public class Mesa extends Movel {
    public Mesa(Material material) { super(material); }

    public String montar() {
        System.out.print("Montando Mesa: ");
        material.aplicarAcabamento();
        return "Resistência da mesa: " + material.obterResistencia();
    }
}
