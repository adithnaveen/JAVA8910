package com.naveen;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainApp {
   private static final Logger logger = LogManager.getLogger(MainApp.class);

   public static void main(String[] args) {
      logger.info("Log4j 2 Example ");

      int a, b, c;
      try {
         a = 5;
         b = 0;
         c = a / b;
         logger.info("Value of c = " + c);
      } catch (Exception e) {
         logger.error("Runtime error..", e);
      }

   }
}