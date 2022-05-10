public class Cat implements CanBeTaken{
  private String catName;

  public Cat(String catName) {
      this.catName = catName;
  }

    public String getCatName() {
        return catName;
    }

    @Override
    public boolean takeIt() {
        //System.out.println("Ты решил взять с собой кота??");
        return false;
    }
}
