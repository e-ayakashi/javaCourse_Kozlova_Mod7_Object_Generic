public abstract class Clothes implements CanBeTaken {
    private String style;

    public Clothes(String style) {
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public abstract boolean takeIt();
}
