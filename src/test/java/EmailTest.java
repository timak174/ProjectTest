import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

// @Disabled("номер ошибки или название из баг репорта")
// Анатация @Disabled не будет запускать ваш класс, он будет отображается в колонке RUN.
@Tag("SMOKE")
/* Анатация @Tag конкретезирует проверки чтоб запускать с определенным тегом, тег можно ставить
над классом как в моём случае, либо ставить в самом тесте если в классе имеются другие теги
или проверки без тегов. */
public class EmailTest {

    @Test
    @DisplayName("Отправить письмо новуму пользователю")
    void emailShouldBeSentForNewUser() {
        System.out.println("Hi Artem");
    }

    @Test
    @DisplayName("Отправить письмо за зблокированому пользователю")
    void emailShouldBeSentForBannerUser() {
        System.out.println("Hi Artem");
    }

    /* Тест токого типа показывает что есть баг в программе но его можно отложить если о не критичный
    и чтобы в дальнейшем не забыть о его существовании своего рода Баг - репорт */
    @Disabled("номер ошибки или название из баг репорта")
    // Анатация @Disabled не будет запускать ваш тест, он будет отображается в колонке RUN.
    @Test
    @DisplayName("Отправить письмо в случае изменеия PaymentMethod")
    void emailShouldBeSentAfterChangePaymentMethod() {
        throw new AssertionError("Падаем!");
        // Комадна throw new AssertionError().
        // 1. Найден баг.
        // 2. Стал не актуален нужно переписать тест.
    }



}