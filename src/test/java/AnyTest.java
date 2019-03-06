import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnyTest {

  @Test
  public void shouldReturnA() {
    Any any = new Any(5);

    assertEquals(6, any.getA().intValue());
  }
}