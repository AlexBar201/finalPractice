public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public String checkNameToEmboss() {

        boolean canAndCantType = name.length() >= 3 && name.length() <= 19 && name.matches("^[^\\s].*[^\\s]$") && name.split("\\s+").length <= 2;

        if(canAndCantType){
            return "Это имя можно печатать на карте";
        }

        return "Это имя нельзя печатать на карте";

    }
}
