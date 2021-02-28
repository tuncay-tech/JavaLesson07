package sayfam;

public class page06 {
    public static void main(String[] args) {
        String animal = "DOG";
        String result;

        switch (animal) {
            case "CAT":
                result = " Domestic animal";
                break;
            case "DOG":
                result = " Domestic animal";
                break;
            case "TIGER":
                result = " Wild animal";
                break;
            default:
                result = "Unknown animal";
        }
        System.out.println(result);
    }
}
