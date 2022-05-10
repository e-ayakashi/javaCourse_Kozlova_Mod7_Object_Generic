public class HawaiiStyle extends Clothes implements CanBeTaken{
    public HawaiiStyle(String style) {
        super(style);
    }

    @Override
    public boolean takeIt() {
        return true;
    }
}
