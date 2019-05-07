/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(100);
    swan.explore();
  }
  public static void testKeepOnlyBlue()
  {
	  Picture beach = new Picture("beach.jpg");
	    beach.explore();
	    beach.zeroRed();
	    beach.zeroGreen();
	    beach.explore();
  }
  public static void testNegate()
  {
	  Picture beach = new Picture("beach.jpg");
	    beach.explore();
	    beach.negateRed();
	    beach.negateGreen();
	    beach.negateBlue();
	    beach.explore();
  }
  public static void testGrayscale()
  {
	  Picture beach = new Picture("beach.jpg");
	    beach.explore();
	    beach.grayScale();
	    beach.explore();
  }
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture beach = new Picture("beach.jpg");
	    beach.explore();
	    beach.mirrorVerticalRightToLeft();
	    beach.explore();
  }
  public static void testMirrorHorizontal()
  {
	  Picture beach = new Picture("beach.jpg");
	    beach.explore();
	    beach.mirrorHorizontal();
	    beach.explore();
  }
  public static void testMirrorHorizontalBotToTop()
  {
	  Picture beach = new Picture("beach.jpg");
	    beach.explore();
	    beach.mirrorHorizontalBotToTop();
	    beach.explore();
  }
  public static void testMirrorArms()
  {
	  Picture beach = new Picture("snowman.jpg");
	    beach.explore();
	    beach.mirrorHorizontal();
	    beach.explore();
  }
  public static void testMirrorGull() {
      Picture caterpillar = new Picture("seagull.jpg");
      caterpillar.explore();
      caterpillar.mirrorVertical();
      caterpillar.explore();
  }
  public static void testCopy() {
      Picture caterpillar = new Picture("beach.jpg");
      caterpillar.explore();
      caterpillar.copy(caterpillar, 100, 100);
      caterpillar.explore();
  }
  public static void testCopy2() {
      Picture caterpillar = new Picture("beach.jpg");
      caterpillar.explore();
      caterpillar.copy2(caterpillar, 10, 10, 20, 20, 90, 90);
      caterpillar.explore();
  }
  public static void testMyCollage() {
      Picture canvas = new Picture("640x480.jpg");
      canvas.myCollage();
      canvas.explore();
  }
  public static void testBlur(int x, int y, int w, int h, int n)
{
   Picture redMoto = new Picture("redMotorcycle.jpg");
   for (int i = 0; i<n; i++){
      redMoto.blur(x,y,w,h);
    }
    redMoto.explore();
}

  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
      testBlur(180,160,25,25,10);
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	//  testMirrorVerticalRightToLeft();
	  //testMirrorHorizontal();
	  //testMirrorHorizontalBotToTop();
    //testZeroBlue();
    //testKeepOnlyBlue();
	  //testCopy2();
	  //testMyCollage();
	 // testEdgeDetection();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}