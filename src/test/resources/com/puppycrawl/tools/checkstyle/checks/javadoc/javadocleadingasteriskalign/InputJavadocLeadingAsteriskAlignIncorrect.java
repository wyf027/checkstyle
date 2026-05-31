/*xml
<module name="Checker">
  <module name="TreeWalker">
    <module name="JavadocLeadingAsteriskAlign" />
  </module>
</module>
*/

package com.puppycrawl.tools.checkstyle.checks.javadoc.javadocleadingasteriskalign;

/**
* This is the class level javadoc.
 */
// violation 2 lines above 'Leading asterisk has .* indentation .* 1, expected is 2.'
public class InputJavadocLeadingAsteriskAlignIncorrect {
  /**
    * Javadoc for instance variable
   */
  // violation 2 lines above 'Leading asterisk has .* indentation .* 5, expected is 4.'
  private int age;

  // violation 2 lines below 'Leading asterisk has .* indentation .* 3, expected is 4.'
  /**
  *
   */
  private String name;

  /**
   * Javadoc for foo.
    */
  // violation above 'Leading asterisk has .* indentation .* 5, expected is 4.'
  public void foo() {}

  // violation 2 lines below 'Leading asterisk has .* indentation .* 3, expected is 4.'
  /**
  */
  public void foo2() {}

  // violation 2 lines below 'Leading asterisk has .* indentation .* 7, expected is 4.'
  /**
      *
   */
  public void foo3() {}

  // violation 2 lines below 'Leading asterisk has .* indentation .* 1, expected is 4.'
  /**
*
   */
  public void foo4() {}

  /**
   * Default Constructor.
      */
  // violation above 'Leading asterisk has .* indentation .* 7, expected is 4.'
  public InputJavadocLeadingAsteriskAlignIncorrect() {}

  /**
   * Parameterized Constructor.
*/
  // violation above 'Leading asterisk has .* indentation .* 1, expected is 4.'
  public InputJavadocLeadingAsteriskAlignIncorrect(String a) {}

  // violation 3 lines below 'Leading asterisk has .* indentation .* 7, expected is 4.'
  // violation 3 lines below 'Leading asterisk has .* indentation .* 5, expected is 4.'
  /**
      *
    * Inner Class.
    */
  // violation above 'Leading asterisk has .* indentation .* 5, expected is 4.'
  private static class Inner {
    /**

        */
    // violation above 'Leading asterisk has .* indentation .* 9, expected is 6.'
    private Object obj;

    /**
     * @param testing
       *         Testing......
     */
    // violation 2 lines above 'Leading asterisk has .* indentation .* 8, expected is 6.'
    void foo(String testing) {}
  }

  private enum incorrectJavadocEnum {

    // violation 2 lines below 'Leading asterisk has .* indentation .* 4, expected is 6.'
    /**
   */
    ONE,


    // violation 2 lines below 'Leading asterisk has .* indentation .* 7, expected is 6.'
    /**
      * Wrong Alignment
      */
    // violation above 'Leading asterisk has .* indentation .* 7, expected is 6.'
    TWO
  }
}
