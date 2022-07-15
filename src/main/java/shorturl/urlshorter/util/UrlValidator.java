package shorturl.urlshorter.util;

public class UrlValidator {
    public static boolean validate(String url) {
        String cleanLink = url.trim();
        String pattern = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
        return !cleanLink.equals("") && cleanLink.matches(pattern);
    }
}
