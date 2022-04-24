public class Atelye
{
    public void dressMale(Clothing[] clothes) {
        System.out.println("Мужская одежда в наличии:");
        for (Clothing clothe : clothes) {
            if (clothe instanceof MenClothing) {
                System.out.println(clothe);
            }
        }
    }

    public void dressFemale(Clothing[] clothes) {
        System.out.println("Женская одежда в наличии:");
        for (Clothing clothe : clothes) {
            if (clothe instanceof WomenClothing) {
                System.out.println(clothe);
            }
        }
    }
}
