public class VeredaGT implements Vehicle{
    private float energy = 100;
    private float maxEnergy = energy;
    private String matrícula;
    private int energyDelta;

    public VeredaGT() {
    }

    @Override
    public float energyLevel() {
        return energy;
    }

    @Override
    public void recharge() {
        energy = 100;
    }

    @Override
    public float move() {
        return energy - 10;
    }

    @Override
    public String status() {
        return null;
    }


}
