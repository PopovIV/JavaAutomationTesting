import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class OKCustomMatcher extends TypeSafeMatcher<String> {

    @Factory
    public static Matcher<String> isALargeString() {
        return new OKCustomMatcher();
    }

    @Override
    protected boolean matchesSafely(String str) {
        return str.length() > 10;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("a large string(>10)");
    }
}