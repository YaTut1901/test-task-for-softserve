package task.counter;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class WordCounterTest {
    public static final String PATH = "src/main/resources/test_1.txt";
    public static final String EXPECTED = "1 very\n" +
            "1 called\n" +
            "1 hats\n" +
            "1 hall\n" +
            "1 whole\n" +
            "1 beyond\n" +
            "1 without\n" +
            "1 fond\n" +
            "2 these\n" +
            "1 pantries\n" +
            "1 coats\n" +
            "1 meadows\n" +
            "1 devoted\n" +
            "3 going\n" +
            "2 in\n" +
            "1 fairly\n" +
            "1 then\n" +
            "3 it\n" +
            "1 bathrooms\n" +
            "1 bedrooms\n" +
            "1 doors\n" +
            "2 hobbit\n" +
            "1 as\n" +
            "1 comfortable\n" +
            "1 exact\n" +
            "1 looking\n" +
            "1 perfectly\n" +
            "1 knob\n" +
            "1 cellars\n" +
            "1 painted\n" +
            "1 another\n" +
            "1 yellow\n" +
            "1 out\n" +
            "1 into\n" +
            "2 same\n" +
            "1 walls\n" +
            "1 have\n" +
            "6 a\n" +
            "3 side\n" +
            "1 middle\n" +
            "1 one\n" +
            "2 many\n" +
            "1 kitchens\n" +
            "1 people\n" +
            "1 straight\n" +
            "3 lots\n" +
            "15 the\n" +
            "2 hill\n" +
            "1 garden\n" +
            "1 river\n" +
            "4 to\n" +
            "1 first\n" +
            "1 lefthand\n" +
            "1 but\n" +
            "2 door\n" +
            "2 rooms\n" +
            "1 passage\n" +
            "2 had\n" +
            "1 down\n" +
            "1 his\n" +
            "1 pegs\n" +
            "1 only\n" +
            "1 quite\n" +
            "1 chairs\n" +
            "1 carpeted\n" +
            "1 sloping\n" +
            "3 all\n" +
            "2 like\n" +
            "2 opened\n" +
            "1 brass\n" +
            "1 panelled\n" +
            "1 visitors\n" +
            "1 porthole\n" +
            "3 were\n" +
            "1 diningrooms\n" +
            "1 little\n" +
            "1 no\n" +
            "1 provided\n" +
            "4 for\n" +
            "1 best\n" +
            "1 miles\n" +
            "1 polished\n" +
            "1 not\n" +
            "1 wound\n" +
            "1 floors\n" +
            "1 upstairs\n" +
            "10 and\n" +
            "5 of\n" +
            "1 floor\n" +
            "1 tubeshaped\n" +
            "8 on\n" +
            "1 over\n" +
            "1 tiled\n" +
            "1 green\n" +
            "1 was\n" +
            "1 smoke\n" +
            "2 windows\n" +
            "1 indeed\n" +
            "1 clothes\n" +
            "1 wardrobes\n" +
            "3 with\n" +
            "4 round\n" +
            "1 ones\n" +
            "1 deepset\n" +
            "1 shiny\n" +
            "1 he\n" +
            "3 tunnel";

    @Test
    public void CounterTest() {
        String text = Reader.readFromFile(PATH);
        Map<String, Long> table = WordCounter.count(text);
        String actual = Parser.parse(table);
        Assert.assertEquals(EXPECTED, actual);
    }

    @Test
    public void NoTextInputTest() {
        String input = "";
        String expected = "No words counted";
        String actual = Parser.parse(WordCounter.count(input));
        Assert.assertEquals(expected, actual);
    }
}
