package by.example;

public class RapMusic implements Music {

    public void initBean() {
        System.out.println("The bean is init");
    }

    public void destroyBean() {
        System.out.println("Destroy bean");
    }

    @Override
    public String getSong() {
        return "Stan";
    }
}
