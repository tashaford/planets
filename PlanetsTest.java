import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class PlanetsTest{

  Planets planet;

  @Before
  public void before(){
    planet = new Planets("Mars", 21343);
  }

  @Test
  public void hasName(){
    assertEquals("Mars", planet.getName());
  }

  @Test
  public void hasSize(){
    assertEquals(21343, planet.getSize(), 1);
  }

  @Test
  public void canExplode(){
    assertEquals("Boom! Mars has exploded.", planet.explode());
  }

}