package be.intecbrussel.sellers;

public class Stock {
    private int iceRockets;
    private int cones;
    private int balls;
    private int magnum;

    public Stock(){
        this(2,2,4,2);
    }

    public Stock(int iceRockets, int cones, int balls, int magnum) {
        this.iceRockets = iceRockets;
        this.cones = cones;
        this.balls = balls;
        this.magnum = magnum;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public int getCones() {
        return cones;
    }

    public void setCones(int cones) {
        this.cones = cones;
    }

    public int getIceRockets() {
        return iceRockets;
    }

    public void setIceRockets(int iceRockets) {
        this.iceRockets = iceRockets;
    }

    public int getMagnum() {
        return magnum;
    }

    public void setMagnum(int magnum) {
        this.magnum = magnum;
    }
}
