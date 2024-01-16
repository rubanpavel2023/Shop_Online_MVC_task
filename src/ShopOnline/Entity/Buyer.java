package ShopOnline.Entity;

public class Buyer {
    private final String name;
    private final String tel;

    public Buyer(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }
}
