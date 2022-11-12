package Tasks;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Task2Test {
    @Test
    public void compareSortedListTags() {
        String trueTags = "#B=4\n#A=3\n#N=2\n#M=1\n#AM=1";
        List<String> tags = new ArrayList<>(
                List.of("#A #A #B",
                        "#A #B",
                        "#N #B",
                        "#AM #N #A",
                        "#M #B"
                )
        );
        String sortedTags = Task2.findTags(tags);
        Assert.assertEquals(trueTags, sortedTags);
    }

    @Test
    public void checkForDuplicates() {
        String trueTags = "#A#A=1\n#A=1";
        List<String> tags = new ArrayList<>(
                List.of("#A #A#A #A#A #A#A #A#A #A")
        );
        String sortedTags = Task2.findTags(tags);
        Assert.assertEquals(trueTags, sortedTags);
    }

    @Test
    public void isListTagsEmpty() {
        List<String> emptyList = new ArrayList<>();
        String s = Task2.findTags(emptyList);
        Assert.assertEquals("", s);
    }

    @Test(expected = NullPointerException.class)
    public void isListTagsNull() {
        Task2.findTags(null);
    }

}