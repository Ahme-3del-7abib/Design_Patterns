package B_Factory_With_Singleton;

public final class Factory {

    private static Factory instance;

    public static synchronized Factory getInstance() {

        if (instance == null) {
            instance = new Factory();
        }

        return instance;
    }

    public Shape getShape(String ID) {

        switch (ID) {
            case "CIRCLE":
                return new Circle();

            case "SQUARE":
                return new Square();

            case "RECTANGLE":
                return new Rectangle();

            default:
                return null;
        }
    }
}
