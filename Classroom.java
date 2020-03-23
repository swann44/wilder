public class Classroom {


    public static void main(String[] args) {

        //morgan receives a reference to a new instance of the wilder class
        wilder morgan = new wilder("Morgan", false);
        String affichage = morgan.whoAmI();
        System.out.println(affichage);

        wilder anne = new wilder("Anne", true);
        String affichage2 = anne.whoAmI();
        System.out.println(affichage2);

        // 
    }
}