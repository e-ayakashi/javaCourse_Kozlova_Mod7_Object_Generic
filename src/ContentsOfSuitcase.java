public class ContentsOfSuitcase <C extends CanBeTaken> {
    private C thing;
    private boolean takeIt;

    public ContentsOfSuitcase(C thing, boolean takeIt) {
        this.thing = thing;
        this.takeIt = takeIt;
    }

    public void PackSuitcase(){
        if (takeIt==true){
            System.out.println("Годится, берем!");
        }
        else System.out.println("И как ты себе это представляешь?");
    }
}
