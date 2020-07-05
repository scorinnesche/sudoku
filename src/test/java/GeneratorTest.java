import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratorTest {
    @Test
    public void ifNumberGeneratorIsCreated_DifferentNumbersArePresented ()  {
        Generator generator = new Generator();
       int generatedNumers=  generator.generateNumbers();
        assertEquals(9, generatedNumers);
    }


}
