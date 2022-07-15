package shorturl.urlshorter.util;

import shorturl.urlshorter.model.Url;

public class ShortenerUtil {
    private static final char[] map =
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

    public static Url toShortUrl(Url url) {
        String url1 = url.getUrlFull();
        int hash = Math.abs(url1.hashCode() + 31);
        StringBuffer shorturl = new StringBuffer();
        while (hash > 0) {
            shorturl.append(map[hash % 62]);
            hash = hash / 62;
        }
        url.setUrlShort("http://localhost:8080/" + shorturl);
        return url;
    }
}

//    public static Url toShortUrl(Url url) {
//        StringBuilder stringBuilder = new StringBuilder();
//        while (stringBuilder.length() != 8) {
//            stringBuilder.append(map[(int) (map.length - Math.random() * map.length)]);
//        }
//        url.setUrlShort("http://localhost:8080/" + stringBuilder);
//        return url;
//    }
//    private static final char[] map =
//            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
//
//    public static Url toShortUrl(Url url) {
//        StringBuilder stringBuilder = new StringBuilder();
//        while (stringBuilder.length() != 8) {
//            stringBuilder.append(map[(int) (map.length - Math.random() * map.length)]);
//        }
//        url.setUrlShort("http://localhost:8080/" + stringBuilder);
//        return url;
//    }
//}
//
//
//

//static String getShortUrl(String url) {
//        char[] map = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
//        int hash = Math.abs(url.hashCode() + 31);
//        StringBuffer shorturl = new StringBuffer();
//        while (hash > 0) {
//            shorturl.append(map[hash % 62]);
//            hash = hash / 62;
//        }
//        return shorturl.reverse().toString();
//    }

//
