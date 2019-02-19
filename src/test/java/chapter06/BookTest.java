package chapter06;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.unitils.reflectionassert.ReflectionAssert.assertPropertyLenientEquals;
import static org.unitils.reflectionassert.ReflectionAssert.assertReflectionEquals;
import static org.unitils.reflectionassert.ReflectionComparatorMode.IGNORE_DEFAULTS;
import static org.unitils.reflectionassert.ReflectionComparatorMode.LENIENT_ORDER;

public class BookTest {

    @Test
    public void testBook_Reflection() throws Exception {
        Book aBook = new Book("사람은 무엇으로 사는가?", "톨스토이", 9000);
        Book otherBook = new Book("사람은 무엇으로 사는가?", "톨스토이", 9000);
        assertReflectionEquals("Book 객체 필드 비교", aBook, otherBook);

        //LENIENT_ORDER 컬렉션이나 배열를 비교할 때 순서는 무시한다.
        List<Integer> myList = Arrays.asList(3, 2, 1);
        assertReflectionEquals(Arrays.asList(1, 2, 3), myList, LENIENT_ORDER);

        //IGNORE_DEFAULTS 예상 객체의 필드 중 타입 기본값을 갖는 필드에 대해서는 비교를 하지 않는다.
        Book defaultBook = new Book("사람은 무엇으로 사는가?", null, 9000);
        assertReflectionEquals(defaultBook, aBook, IGNORE_DEFAULTS);

        //LENIENT_DATES 시간이나 날짜 타입은 서로 비교하지 않는다.
    }

    @Test
    public void testBook_Property() throws Exception {
        Book aBook = new Book("사람은 무엇으로 사는가?", "톨스토이", 9000);
        assertPropertyLenientEquals("author","톨스토이", aBook);
    }

}