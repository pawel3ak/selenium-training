package helpers;

import org.apache.commons.lang3.RandomStringUtils;

public class StringHelper {

    public static String randomStrinWithGivenLenght(int lenght) {
        return RandomStringUtils.randomAlphabetic(lenght);
    }

    public static String generateRandomEmail() {
        return RandomStringUtils.randomAlphabetic(5) + "@gmail.com";
    }

    public static void main(String[] args) {
        System.out.println(StringHelper.randomStrinWithGivenLenght(5) + "@gmail.com");
        System.out.println(StringHelper.generateRandomEmail());
    }
}
