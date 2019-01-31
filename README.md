# Calculator
Simple calculator written in Java with a GUI made in Java Swing. Uses BigDecimal to achieve a mathematical precision.
As I do not have a big knowledge about Java Swing, this app may present a several exceptions which shouldn't occur when we run the last console-based version of a Calculator. "Translating the whole project" commit.
+
This program needs to make an each calculation step by step. For example:
1+3+4-5*2 = x 
Arithmetically, the x variable should be x =(-2), but this app will present the result of a last two numbers.
So the program's response will be x = 10.
+
This program is not a fully finished version of it, as when we  for example 
will try the calculation of 169 divided by 3, then the program throws:
Exception in thread "AWT-EventQueue-0" java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.
when the result should be "56.(3)"
