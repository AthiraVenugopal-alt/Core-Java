public class ConversionExample
 {
    public static void main(String[] args)
	{

        // 1. String to int (primitive)
        String str = "123";
        int primitiveInt = Integer.parseInt(str);
        System.out.println("String to int: " + primitiveInt);

        // 2. int (primitive) to String
        int num = 456;
        String intToStr = Integer.toString(num);
        System.out.println("int to String: " + intToStr);

        // 3. String to Long (Wrapper class)
        String longStr = "9876543210";
        Long longWrapper = Long.valueOf(longStr);
        System.out.println("String to Long: " + longWrapper);

        // 4. Long to long (primitive)
        long primitiveLong = longWrapper.longValue();
        System.out.println("Long to long: " + primitiveLong);

        // 5. long (primitive) to String
        long longNum = 123456789L;
        String longToStr = Long.toString(longNum);
        System.out.println("long to String: " + longToStr);
    }
}