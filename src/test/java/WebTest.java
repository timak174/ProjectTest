
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.*;
//
//public class WebTest {
//    @Test
//    void successfulSearchTest(){
//        open("https://www.ya.ru/");
//        $("#text").setValue("selenide").pressEnter();
//        $("serp-item").shouldBe();
//
//    }
//}

public class WebTest {
    // Анатация @BeforeEach - тесты стоновят без прикондишен open(), в тесте остаются только шаги.
    @BeforeEach
    void setUp(){
        open("https://duckduckgo.com/");
    }

    //Так выглядит баозый авто-тест-кейс
    @Test
    @Tag("BLOCKER")
    //Важность выражается через TAG
    @DisplayName("Для поискового запроса должен 'selenide' отправляться не пустой список")
    // Название кейса.
    void successfulSearchTest(){
        //Шаги
        //open("https://duckduckgo.com/");
        //1.Открыть браузер (open)
        //2.Открыть путь (Пример(https://duckduckgo.com/))
        $("#searchbox_input").setValue("selenide").pressEnter();
        //3.Ввести значение $().setValue
        //4.Совершить действие .pressEnter()
        $$("[data-testid='result'] li[data-layout='organic']").shouldBe();
        //Ожидаемой Результат = списко данных

    }
    @Test
    @Tag("BLOCKER")
    @DisplayName("Для поискового запроса должен 'selenide' отправляться не пустой список фото")
    void successfulSearchPhotoTest(){
        //open("https://duckduckgo.com/");
        $("#searchbox_input").setValue("selenide").pressEnter();
        $("[class='kFFXe30DOpq5j1hbWU1q SnptgjT2zdOhGYfNng6g wZ4JdaHxSAhGy1HoNVja d26Geqs1C__RaCO7MUs2']").click();
        $$("SZ76bwIlqO8BBoqOLqYV").shouldBe();


    }
}