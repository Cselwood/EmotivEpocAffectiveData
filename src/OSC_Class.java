// Imports
// ====================================================
package osc_javabundler;
import java.io.*;
import oscP5.*;
import netP5.*;

// Main Class
// ====================================================
class OSC_Class {
     // Variables
     OscP5 oscP5;
     WriteFile writeFile;
     int affectCount;
     final int PORT = 7400;

     // Affective Categories and For Loop Arrays
     final String[] AFFECT_TAGS = {"/AFF/Engaged/Bored", "/AFF/Excitement", "/AFF/Excitement Long Term", "/AFF/Meditation", "/AFF/Frustration"};
     final String[] AFFECT_NAME_PRINT = {"BOREDOM = ", "EXCITEMENT = ", "LONG TERM EX = ", "MEDITATION = ", "FRUSTRATION = "};

     // Testing
     boolean willPrintFile = false;
     String outputString;
     final String FILE_OUTPUT_ADDRESS = "OSC_Content.txt";
     final String DECIMAL_PLACES = "%.3f";
     final String PRINT_FORMAT_SPACE = " ";

     // Constructor
     // ====================================================
     public OSC_Class() {
          oscP5 = new OscP5(this, PORT);
          writeFile = new WriteFile(FILE_OUTPUT_ADDRESS);
          affectCount = 0;

          // Each Affective Component called in Loop
          for (int plugCount = 0; plugCount < 5; plugCount++) {
               oscP5.plug(this, "updateAffect", AFFECT_TAGS[plugCount]);
          }

          // Optional
          if (willPrintFile) {
               outputString = "";
          }
     }

     // Update The User File
     public void updateAffect(float affectiveValue) {
          concatOutput(affectiveValue);
          affectCount++;

          if (willPrintFile) {
               System.out.print(AFFECT_NAME_PRINT[affectCount] + String.format(java.util.Locale.UK, DECIMAL_PLACES, affectiveValue) + PRINT_FORMAT_SPACE);
          }
     }

     // Testing and Helper Methods
     // ====================================================
     void concatOutput(float concat) {
          outputString = outputString + String.format(java.util.Locale.UK, DECIMAL_PLACES, concat) + ",";

          if (affectCount >= 4) {
               writeFile.write(outputString);
               outputString = "";
          }
     }
}

// WriteFile Class
// ====================================================
public class WriteFile {
     private String path;

     public WriteFile(String file_path) {
          path = file_path;
     }

     public void write(String content){
          try {
               BufferedWriter out = new BufferedWriter(new FileWriter(path));
               out.write(content);
               out.close();
          }
          catch (IOException e) {}
     }

}
