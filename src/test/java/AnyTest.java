import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnyTest {

  @Test
  public void shouldReturnA() {
    Any any = new Any(5);

    assertEquals(5, any.getA().intValue());
  }

  @Test
  public void shouldReturnAAgain() {
    Any any = new Any(5);

    assertEquals(5, any.getA().intValue());
  }

}