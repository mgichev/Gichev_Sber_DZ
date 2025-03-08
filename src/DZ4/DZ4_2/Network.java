package DZ4.DZ4_2;

import java.util.Map;
import java.util.Objects;

public class Network {

    public Map<String, String> map = Map.of(
            "https://www.google.com/", "Добро пожаловать в Гугл!");

    public String readContent(String url) {
        checkUrl(url);
        for (var it : map.keySet()) {
            if (Objects.equals(url, it))
                return map.get(it);
        }
        throw new UrlNotFoundException(String.format("Ошибка. Url %s не найден в базе данных", url));
    }

    private void checkUrl(String url) {
        final int minSiteLength = 15;

        if (url.length() < minSiteLength)
            throw new WrongUrlException("Длина ссылки должна быть больше 15 символов. Текущая длина: " + url.length());

        String httpsFromString = url.substring(0, 12);
        final String httpsFormat = "https://www.";;
        if (!httpsFromString.equals(httpsFormat)) {
            throw new WrongUrlException("Url должно начинаться с https://www.");
        }

        boolean lastSymbolOrDigit = false;

        for (char ch : url.substring(13).toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && ch != '.' && ch != '-' && ch != '/')
                throw new WrongUrlException("Url должно состоять из цифр, букв, . - /");

            if (!Character.isLetterOrDigit(ch) && !lastSymbolOrDigit)
                throw new WrongUrlException("Нельзя использовать в Url подряд не цифры и буквы");
            else
                lastSymbolOrDigit = Character.isLetterOrDigit(ch);
        }

        if (url.endsWith(".") || url.endsWith("-"))
            throw new WrongUrlException("Url должно завершаться на буквы, цифры или /");
    }
}
