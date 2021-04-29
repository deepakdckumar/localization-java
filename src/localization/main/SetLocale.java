package localization.main;

import java.util.Locale;
import java.util.ResourceBundle;

public class SetLocale {
    private final Locale rusLocale = new Locale("ru","RU");
    private Locale currentLocal = Locale.US;
    private final String resourcesBundle = "resources//MessagesBundle";
    private ResourceBundle resourceBundle = ResourceBundle.getBundle(resourcesBundle, currentLocal);

    public Locale getCurrentLocal() {
        return currentLocal;
    }

    public ResourceBundle getResourceBundle() {
        return resourceBundle;
    }

    public void setEnglish() {
        currentLocal = Locale.US;
        resourceBundle = ResourceBundle.getBundle(resourcesBundle, currentLocal);
    }

    public void setFrench() {
        currentLocal = Locale.FRANCE;
        resourceBundle = ResourceBundle.getBundle(resourcesBundle, currentLocal);
    }

    public void setRussian() {
        currentLocal = rusLocale;
        resourceBundle = ResourceBundle.getBundle(resourcesBundle, currentLocal);
    }
}
