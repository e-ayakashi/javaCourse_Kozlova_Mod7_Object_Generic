public abstract class Shoes implements CanBeTaken {
    private String style;
    private String side;

    Shoes(String style, String side) {
        this.style = style;
        this.side = side;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj!=null) {
            Shoes shoes = (Shoes) obj;
            return this.style.equals(((Shoes) obj).style) && this.side.equals(((Shoes) obj).side);
        }
        return false;
    }
}