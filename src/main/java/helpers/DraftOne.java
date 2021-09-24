package helpers;

public class DraftOne {

    public static void main(String[] args) {

        String name = "Ivan";
        int age = 30;
        float f = 20.22f;

        System.out.println(name instanceof String);

        System.out.println(((Object) age).getClass().getName());

        String dataType = ((Object) f).getClass().getTypeName();

        dataType = dataType.replace("java.lang.", "");

        System.out.println(dataType);
        System.out.println();

        StringBuilder sb = new StringBuilder(dataType);
        sb.delete(0, 9);
        System.out.println(dataType);

        //Casting

        int x = 1;
        double y = 2.0;

        char a = '1';

        int z = x + (int) y;

        System.out.println(z);

        System.setProperty("default.browser", "chrome");
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("default.browser"));
        System.out.println(System.getProperties());
    }
}
