package be.intecbrussel.sellers;

public interface Profitable {
    public default double getProfitable(double profit) {
        return profit ;
    }
}
