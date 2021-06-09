package app;

public class Kubus {
    private int sisi;

    public int getSisi() {
        return this.sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int volume() {
        return sisi * sisi * sisi;
    }

    public int luasPermukaan(){
        return 6 * sisi * sisi;
    }

}
