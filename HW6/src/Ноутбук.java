import java.util.Objects;

public class Ноутбук {
    private String модель;
    private String производитель;
    private double цена;
    private int годВыпуска;

    public Ноутбук(String модель, String производитель, double цена, int годВыпуска) {
        this.модель = модель;
        this.производитель = производитель;
        this.цена = цена;
        this.годВыпуска = годВыпуска;
    }

    public String getМодель() {
        return модель;
    }

    public void setМодель(String модель) {
        this.модель = модель;
    }

    public String getПроизводитель() {
        return производитель;
    }

    public void setПроизводитель(String производитель) {
        this.производитель = производитель;
    }

    public double getЦена() {
        return цена;
    }

    public void setЦена(double цена) {
        this.цена = цена;
    }

    public int getГодВыпуска() {
        return годВыпуска;
    }

    public void setГодВыпуска(int годВыпуска) {
        this.годВыпуска = годВыпуска;
    }

    @Override
    public String toString() {
        return "Ноутбук{" +
                "модель='" + модель + '\'' +
                ", производитель='" + производитель + '\'' +
                ", цена=" + цена +
                ", годВыпуска=" + годВыпуска +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ноутбук ноутбук = (Ноутбук) o;
        return Double.compare(ноутбук.цена, цена) == 0 &&
                годВыпуска == ноутбук.годВыпуска &&
                Objects.equals(модель, ноутбук.модель) &&
                Objects.equals(производитель, ноутбук.производитель);
    }

    @Override
    public int hashCode() {
        return Objects.hash(модель, производитель, цена, годВыпуска);
    }
}
