package ua.ucu.apps.lab8.flower.model;

public enum FlowerColor {
    RED("#FF0000"), WHITE("#FFFFFF"), PINK("#FFC0CB");

    private final String code;

    FlowerColor(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
