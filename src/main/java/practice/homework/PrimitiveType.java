package practice.homework;

public class PrimitiveType extends GenericPrinter {

    public static void main(String[] args) {

        GenericPrinter genericPrinter = new GenericPrinter();

        //Double primitive data type
        double sampleRate = 44100.0;
        double sineWaveAmplitude = 1.0;
        double totalSeconds = 2.0;
        double frequencyRate = 440.0;
        double valueWithOffset = 234.87554;

        //Print Double data
        Double[] doubles = {sampleRate, sineWaveAmplitude, totalSeconds, frequencyRate, valueWithOffset};
        genericPrinter.<Double>printGeneric("f", doubles);

        //Float primitive data type
        float storedLongitude = -105.0269805f;
        float savedLatitude = 100.0287980f;
        float equatorialCircumference = 40075.017f;
        float taxRate = 0.0663f;
        float currentMortgageRate = 3.056f;

        //Print Float data
        Float[] floats = {storedLongitude, savedLatitude, equatorialCircumference, taxRate, currentMortgageRate};
        genericPrinter.<Float>printGeneric("f", floats);

        //Long primitive data type
        long cellCount = 98753498753987345L;
        long neuronalCellCount = 939877894549L;
        long neuronalConnectionCount = 478923498723L;
        long elementaryEntityCount = 42478393874323L;
        long atomCount = 109382983298323L;

        //Print Long data
        Long[] longs = {cellCount, neuronalCellCount, neuronalConnectionCount, elementaryEntityCount, atomCount};
        genericPrinter.<Long>printGeneric("d", longs);

        //Integer primitive data type
        int productQuantity = 123;
        int productId = 23;
        int itemCount = 34;
        int houseRoomCount = 4;
        int averageDistance = 1023;

        //Print Integer data
        Integer[] integers = {productQuantity, productId, itemCount, houseRoomCount, averageDistance};
        genericPrinter.<Integer>printGeneric("d", integers);

        //Short primitive data type
        short imageWidth = 1980;
        short imageHeight = 1080;
        short loopCounter = 100;
        short framePixelWidth = 500;
        short framePixelHeight = 500;

        //Print Short data
        Short[] shorts = {imageWidth, imageHeight, loopCounter, framePixelHeight, framePixelWidth};
        genericPrinter.<Short>printGeneric("d", shorts);

        //Byte primitive data type
        byte velocityValue = 127;
        byte pitchBandChange = 64;
        byte controllerValueChange = 16;
        byte midiChannel = 10;
        byte midiNoteNumber = 16;

        //Print Byte data
        Byte[] bytes = {velocityValue, pitchBandChange, controllerValueChange, midiChannel, midiNoteNumber};
        genericPrinter.<Byte>printGeneric("d", bytes);

        //Char primitive data type
        char charU = 'u';
        char charB = 'b';
        char rightArrowSign = '\u2192';
        char euroCurrencySign = '\u20ac';
        char bitcoinSign = '\u20bf';

        //Print Char data
        Character[] characters = {charU, charB, rightArrowSign, euroCurrencySign, bitcoinSign};
        genericPrinter.<Character>printGeneric("s", characters);

        //Boolean primitive data type
        boolean isSelected = true;
        boolean isDisplayed = false;
        boolean isElementVisible = false;
        boolean isButtonEnabled = true;
        boolean paymentReceived = true;

        //Print Boolean data
        Boolean[] booleans = {!isSelected, !isDisplayed, isElementVisible, isButtonEnabled, paymentReceived};
        genericPrinter.<Boolean>printGeneric("s", booleans);

        //String non-primitive data type (Wrapper Class)
        String name = "Vladimir";
        String city = "Riga";
        String country = "Latvia";

        //Print using String.format()
        String outputString = String.format("My name is %s, I live in %s, %s.%n", name, city, country);
        System.out.format("%s", outputString);
    }
}
