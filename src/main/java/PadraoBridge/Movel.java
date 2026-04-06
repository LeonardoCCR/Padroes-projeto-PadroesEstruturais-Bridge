package PadraoBridge;

public abstract class Movel {
    protected Material material; // A Bridge

    protected Movel(Material material) {
        this.material = material;
    }

    public abstract String montar();
}
