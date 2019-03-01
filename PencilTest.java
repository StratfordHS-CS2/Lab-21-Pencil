import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PencilTest.
 *
 * @author  Dave Avis
 * @version 3.1.2019
 */
public class PencilTest
{
    /**
     * Testing default constructor
     */
    @Test(timeout=2000)
    public void defaultConstructorTest()
    {
        Pencil p = new Pencil();
        assertTrue( "Default constructor does not set isSharp property. (-13 points)", p.isSharp || !p.isSharp );
        assertTrue( "Default constructor does not set hasEraser property. (-13 points)", p.hasEraser || !p.hasEraser );
        assertTrue( "Default constructor does not set length property (or the getter failed). (-13 points)", p.getLength() >= 0 );
        assertTrue( "Default constructor does not set color property (or the getter failed). (-13 points)", p.getColor().length() > 0 );
    }

    /**
     * Testing second constructor
     */
    @Test(timeout=2000)
    public void secondConstructorTest()
    {
        Pencil p = new Pencil("yellow", 25, true, true);
        assertTrue( "Second constructor does not set isSharp property. (-13 points)", p.isSharp );
        assertTrue( "Second constructor does not set hasEraser property. (-13 points)", p.hasEraser );
        assertEquals( "Second constructor does not set length property (or the getter failed). (-13 points)", p.getLength(), 25 );
        assertEquals( "Second constructor does not set color property (or the getter failed). (-13 points)", p.getColor(), "yellow" );
    }

    /**
     * Testing getColor
     */
    @Test(timeout=2000)
    public void getColorTest()
    {
        Pencil p = new Pencil("yellow", 25, true, true);
        assertEquals( "getColor failed (or second constructor doesn't work). (-10 points)", p.getColor(), "yellow" );
    }

    /**
     * Testing getLength
     */
    @Test(timeout=2000)
    public void getLengthTest()
    {
        Pencil p = new Pencil("yellow", 25, true, true);
        assertEquals( "getLength failed (or second constructor doesn't work). (-10 points)", p.getLength(), 25 );
    }

    /**
     * Testing setLength
     */
    @Test(timeout=2000)
    public void setLengthTest()
    {
        Pencil p = new Pencil();
        p.setLength(50);
        assertEquals( "setLength failed (or getLength doesn't work). (-10 points)", p.getLength(), 50 );
    }

    /**
     * Testing setColor
     */
    @Test(timeout=2000)
    public void setColorTest()
    {
        Pencil p = new Pencil();
        p.setColor("blue");
        assertEquals( "setColor failed (or getColor doesn't work). (-10 points)", p.getColor(), "blue" );
    }

    /**
     * Testing setSharp
     */
    @Test(timeout=2000)
    public void setSharpTest()
    {
        Pencil p = new Pencil();
        p.setSharp(false);
        assertEquals( "setSharp failed (-10 points)", p.isSharp, false );
        p.setSharp(true);
        assertEquals( "setSharp failed (-10 points)", p.isSharp, true );
    }

    /**
     * Testing setEraser
     */
    @Test(timeout=2000)
    public void setEraserTest()
    {
        Pencil p = new Pencil();
        p.setEraser(false);
        assertEquals( "setEraser failed (-10 points)", p.hasEraser, false );
        p.setEraser(true);
        assertEquals( "setEraser failed (-10 points)", p.hasEraser, true );
    }

    /**
     * Testing toString
     */
    @Test(timeout=2000)
    public void toStringTest()
    {
        Pencil p = new Pencil("yellow", 25, true, true);
        String out = p.toString().toLowerCase();
        if( out.indexOf("yellow") < 0 )
            fail("toString failed. Does not output the color. (-14 points)");
        if( out.indexOf("25") < 0 )
            fail("toString failed. Does not output the length. (-14 points)");
        if( out.indexOf("eraser") < 0 )
            fail("toString failed. Does not output the eraser status. (-14 points)");
        if( out.indexOf("sharp") < 0 )
            fail("toString failed. Does not output the sharp status. (-14 points)");
    }

    /**
     * Testing sharpen
     */
    @Test(timeout=2000)
    public void sharpenTest()
    {
        Pencil p = new Pencil("yellow", 25, false, true);
        p.sharpen();
        assertEquals("sharpen failed to reduce the length properly (or getLength failed) (-10 points)", p.getLength(), 20 );
        assertTrue("sharpen failed to sharpen the pencil (-10 points).", p.isSharp );
    }
}
