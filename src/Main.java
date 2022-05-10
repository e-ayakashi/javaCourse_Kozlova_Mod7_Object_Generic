import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClassicSuit classicSuit = new ClassicSuit("классический костюм");
        HawaiiStyle hawaiiStyle = new HawaiiStyle("гавайская рубашка и джоггеры");

        FlipFlops flipFlopsL = new FlipFlops("сланцы", "левая");
        FlipFlops flipFlopsR = new FlipFlops("сланцы", "правая");
        Shoe shoeL = new Shoe("классические туфли", "левая");
        Shoe shoeR = new Shoe("классические туфли", "правая");
        Shoe first = new Shoe(null,null);
        Shoe second = new Shoe(null,null);

        Cat cat = new Cat("Василий");

        ContentsOfSuitcase<Clothes> takeClothes = new ContentsOfSuitcase<>(classicSuit, classicSuit.takeIt());
        ContentsOfSuitcase<Clothes> takeClothes2 = new ContentsOfSuitcase<>(hawaiiStyle, hawaiiStyle.takeIt());

        ContentsOfSuitcase<Cat> takeCat = new ContentsOfSuitcase<>(cat, cat.takeIt());

        Scanner scrType = new Scanner(System.in);
        int[] selectedShoes =new int [2];



        System.out.println("Утро понедельника. Тебя будит раньше будильника уведомление из мессенджера.");
        System.out.println("Сообщение от начальника: \"Ты сегодня летишь в командировку в Лос-Анджелес, заключать многомилионный контракт с нашими бизнес-партнерами. Рейс через 4 часа, поспеши.\"");
        System.out.println("Прекрасное начало недели :)\n\nУ тебя немного времени, чтобы собрать чемодан.\nТы рыскаешь по квартире в поиске всего необходимого.\n");
        System.out.println("Тебе нужно решить, какую одежду взять на встречу. Выбери один из вариантов:");
        System.out.println("1 " + classicSuit.getStyle());
        System.out.println("2 " + hawaiiStyle.getStyle());
        int typeClothes = scrType.nextInt();

        switch (typeClothes){
            case 1:
                System.out.println("В ЛА будет жарковато в таком костюме, но он кажется более подходящим.");
                takeClothes.PackSuitcase();
                break;
            case 2:
                System.out.println("Это точно будет по погоде! Неформальный наряд, конечно, но лучше чувствовать себя комфортно.");
                takeClothes2.PackSuitcase();
                break;
        }
        System.out.println("\nПришло время выбрать обувь. Укажи два числа через пробел:");
        System.out.print("1 " + shoeL.getStyle()); System.out.println("; " + shoeL.getSide());
        System.out.print("2 " + flipFlopsL.getStyle()); System.out.println("; " + flipFlopsL.getSide());
        System.out.print("3 " + shoeR.getStyle()); System.out.println("; " + shoeR.getSide());
        System.out.print("4 " + flipFlopsR.getStyle()); System.out.println("; " + flipFlopsR.getSide());

        for (int i=0; i < selectedShoes.length; i++){
            selectedShoes[i] = scrType.nextInt();
        }

        if (selectedShoes[0] == 1) {
            first.setStyle(shoeL.getStyle());
            first.setSide(shoeL.getSide());
        }
        if (selectedShoes[1] == 1) {
            second.setStyle(shoeL.getStyle());
            second.setSide(shoeL.getSide());
        }
        if (selectedShoes[0] == 2) {
            first.setStyle(flipFlopsL.getStyle());
            first.setSide(flipFlopsL.getSide());
        }
        if (selectedShoes[1] == 2) {
            second.setStyle(flipFlopsL.getStyle());
            second.setSide(flipFlopsL.getSide());
        }
        if (selectedShoes[0] == 3) {
            first.setStyle(shoeR.getStyle());
            first.setSide(shoeR.getSide());
        }
        if (selectedShoes[1] == 3) {
            second.setStyle(shoeR.getStyle());
            second.setSide(shoeR.getSide());
        }
        if (selectedShoes[0] == 4) {
            first.setStyle(flipFlopsR.getStyle());
            first.setSide(flipFlopsR.getSide());
        }
        if (selectedShoes[1] == 4) {
            second.setStyle(flipFlopsR.getStyle());
            second.setSide(flipFlopsR.getSide());
        }

        CheckShoes(first, second);

        System.out.println("\nТвой кот запрыгнул в чемодан, с тобой хочет. Возьмешь?\n1 Да\n2 Нет");
        int tmp = scrType.nextInt();
        switch (tmp){
            case 1:
                takeCat.PackSuitcase();
                break;
            case 2:
                System.out.printf("Какой ответственный хозяин)\nТвой кот %s будет скучать", cat.getCatName());
                break;
        }

        System.out.println("\n\nA few moments later...");

        System.out.println("\nТы наконец в ЛА. Успел переодется и помчался на встречу.\nНемного задержался, но тем эффектнее твое появление))\nКстати об эффекте");

       if (typeClothes==1){
           System.out.println("\nКак ни крути, встречают по одежке.\nТвой костюм произвел положительное впечатление.\nБизнес-партнеры считывают, что ты серьезный парень, и с тобой можно вести диалог.\n+20% к успеху сделки.");
       }
       if (typeClothes==2) {
           System.out.println("\nВот это картина...\nШикарный бизнес-центр, за круглым столом сидят бизнес-партнеры в деловых костюмах, и тут ты...\nВ гавайской рубахе, джоггерах, еще коктейля не хватает и шляпы\nПартнеры в легком смятении и с неловкой улыбкой на устах.\nВряд ли к тебе отнесутся серьезно.\n-20% от успеха сделки");
       }
       if (first.getStyle()!=shoeL.getStyle()) {
           System.out.println("\nСланцы...На деловой встрече...Многомилионная сделка...Ты выглядишь нелепо.\n-15% от успеха сделки");
       } else {
           System.out.println("\nКлассические туфли хоть немного жмут, но они производят впечатление.\n+15% к успеху сделки");
       }

    }

    public static void CheckShoes (Shoes firstShoe, Shoes secShoe){
        if (firstShoe.getStyle().equals(secShoe.getStyle()) && !firstShoe.getSide().equals(secShoe.getSide())){
            System.out.println("Отличный выбор, наверное)");
            return;
        }
        if (!firstShoe.getStyle().equals(secShoe.getStyle()) && firstShoe.getSide().equals(secShoe.getSide())) {
            System.out.println("Все смешалось: люди, кони, стили, еще и стороны одинаковые... Мы это поправим");
            return;
        }
        if (!firstShoe.getStyle().equals(secShoe.getStyle())) {
            System.out.println("Кажется, в спешке ты схватил туфли из разной оперы)) Мы это исправим, оставим " + firstShoe.getStyle());
            return;
        }
        if (firstShoe.getSide().equals(secShoe.getSide())){
            System.out.println("И та, и другая часть пары - " + firstShoe.getSide());
            System.out.println("Мы это исправим) Будь внимательнее");
        }
    }

}
