public class FlipFlops extends Shoes implements CanBeTaken{

    public FlipFlops(String style, String side) {
        super(style, side);
    }

    @Override
    public boolean takeIt() {
        return true;
    }
}
