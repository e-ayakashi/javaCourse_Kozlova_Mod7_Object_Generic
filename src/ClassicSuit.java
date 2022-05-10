public class ClassicSuit extends Clothes implements CanBeTaken{
    public ClassicSuit(String style) {
        super(style);
    }

    @Override
    public boolean takeIt() {
        return true;
    }
}
