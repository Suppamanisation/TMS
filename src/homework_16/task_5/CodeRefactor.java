package homework_16.task_5;

/*Task 5
Нужно поправить ошибки в коде, чтобы метод мейн нормально запустился.
Перед тем, как копировать этот код, создайте сами класс CodeRefactor, затем скопируйте в него метод main
Затем класс Website и enum.
Копируйте аккуратно и не внутрь класса CodeRefactor, а рядом с ним.
*/

// +
public class CodeRefactor {
    public static void main(String[] args) {
        WebSite website = new WebSite("http://www.onliner.by");

        String url = website.getUrl();
        WebsiteType type = website.getType();

        System.out.println(url);
        System.out.println(type);
    }
}
class WebSite {
    private String url;
    private WebsiteType type;

    public WebSite(String url) {
        this(url, WebsiteType.NEWS);
    }

    public WebSite(String url, WebsiteType type) {
        this.url = url;
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public WebsiteType getType() {
        return type;
    }
}

 enum WebsiteType {
    NEWS,
    MUSIC,
    EDUCATION
}

