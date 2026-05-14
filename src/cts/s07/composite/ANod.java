package cts.s07.composite;

public abstract class ANod implements AbstractElementTransport{
    private String tipNod;

    public ANod(String tipNod) {
        this.tipNod = tipNod;
    }
    public String getTipNod(){
        return this.tipNod;
    }

    public abstract void adaugaNod(ANod nod);
    public abstract void stergeNod(ANod nod);
    public abstract ANod getNod(int index);

    public abstract String afisare();
}
