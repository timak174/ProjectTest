import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
//
//public class WebTest {
//    @Test
//    void successfulSearchTest(){
//        open("https://www.ya.ru/");
//        $("#text").setValue("selenoide").pressEnter();
//        $("serp-item").shouldBe();
//
//    }
//}

public class WebTest {
    //Так выглядит баозый авто-тест-кейс
    @Test
    @Tag("BLOCKER")
    //Важность выражается через TAG
    @DisplayName("Для поискового запроса должен отправляться не пустой список")
    // Название кейса.
    void successfulSearchTest(){
        //Шаги
        open("https://duckduckgo.com/");
        //1.Открыть браузер (open)
        //2.Открыть путь (Пример(https://duckduckgo.com/))
        $("#searchbox_input").setValue("selenoide").pressEnter();
        //3.Ввести значение $().setValue
        //4.Совершить действие .pressEnter()
        $$("[data-testid='result'] li[data-layout='organic']").shouldBe();
        //Ожидаемой Результат = списко данных

    }
}
