package Lam_lai.model;

public class Milk {
    private String name;
    private String code;
    private int NXS;

    public Milk(String name, String code, int NXS) {
        this.name = name;
        this.code = code;
        this.NXS = NXS;
    }

    public Milk() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNXS() {
        return NXS;
    }

    public void setNXS(int NXS) {
        this.NXS = NXS;
    }

    public String toLine() {
        return this.getName() + "," + this.getCode() + "," + this.getNXS();
    }

    @Override
    public String toString() {
        return "Milk{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", NXS=" + NXS +
                '}';
    }
}
