public class Shoe extends Shoes implements CanBeTaken{

    public Shoe(String style, String side) {
        super(style, side);
    }

    @Override
    public boolean takeIt() {
        return true;
    }

}
