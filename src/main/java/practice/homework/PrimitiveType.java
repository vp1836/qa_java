package practice.homework;

public class PrimitiveType extends PrintBase {

    public static void main(String[] args) {

        //Double primitive data type
        double sampleRate = 44100.0;
        double sineWaveAmplitude = 1.0;
        double totalSeconds = 2.0;
        double frequencyRate = 440.0;
        double valueWithOffset = 234.87554;

        //Print Double data
        printData("f", sampleRate, sineWaveAmplitude, totalSeconds, frequencyRate, valueWithOffset);

        //Float primitive data type
        float storedLongitude = -105.0269805f;
        float savedLatitude = 100.0287980f;
        float equatorialCircumference = 40075.017f;
        float taxRate = 0.0663f;
        float currentMortgageRate = 3.056f;

        //Print Float data
        printData("f", storedLongitude, savedLatitude, equatorialCircumference, taxRate, currentMortgageRate);

        //Long primitive data type
        long cellCount = 98753498753987345L;
        long neuronalCellCount = 939877894549L;
        long neuronalConnectionCount = 478923498723L;
        long elementaryEntityCount = 42478393874323L;
        long atomCount = 109382983298323L;

        //Print Long data
        printData("d", cellCount, neuronalCellCount, neuronalConnectionCount, elementaryEntityCount, atomCount);

        //Integer primitive data type
        int productQuantity = 123;
        int productId = 23;
        int itemCount = 34;
        int houseRoomCount = 4;
        int averageDistance = 1023;

        //Print Integer data
        printData("d", productQuantity, productId, itemCount, houseRoomCount, averageDistance);

        //Char primitive data type
        char charU = 'u';
        char charB = 'b';
        char rightArrowSign = '\u2192';
        char euroCurrencySign = '\u20ac';
        char bitcoinSign = '\u20bf';

        //Print Char data
        printData("s", charU, charB, rightArrowSign, euroCurrencySign, bitcoinSign);

        //Short primitive data type
        short imageWidth = 1980;
        short imageHeight = 1080;
        short loopCounter = 100;
        short framePixelWidth = 500;
        short framePixelHeight = 500;

        //Print Short data
        printData("d", imageWidth, imageHeight, loopCounter, framePixelWidth, framePixelHeight);

        //Byte primitive data type
        byte velocityValue = 127;
        byte pitchBandChange = 64;
        byte controllerValueChange = 16;
        byte midiChannel = 10;
        byte midiNoteNumber = 16;

        //Print Byte data
        printData("d", velocityValue, pitchBandChange, controllerValueChange, midiChannel, midiNoteNumber);

        //Boolean primitive data type
        boolean isSelected = true;
        boolean isDisplayed = false;
        boolean isElementVisible = false;
        boolean isButtonEnabled = true;
        boolean paymentReceived = true;

        //Print Boolean data
        printData("s", !isSelected, !isDisplayed, isElementVisible, isButtonEnabled, paymentReceived);

        //String non-primitive data type (Wrapper Class)
        String name = "Vladimir";
        String city = "Riga";
        String country = "Latvia";

        //Print using String.format()
        String outputString = String.format("My name is %s, I live in %s, %s.%n", name, city, country);
        System.out.format("%s", outputString);
    }
}
