import java.util.Arrays;

class Main {
  
  //Code won't work for UNICODE 
  private static boolean isUniqueViaTwoLoops(String inputString) {

    //If the size of the array is greater than 256
    //By default the string will be non-unique as it will be guarantee to have the same character
    if (inputString.length() > 256) {
      return false;
    }

    int index_of_first;
    int index_of_second;
    for (index_of_first = 0 ; index_of_first < inputString.length(); index_of_first++) {
      for (index_of_second = 0 ; index_of_second < inputString.length(); index_of_second++) {
          if (index_of_first != index_of_second &&  inputString.charAt(index_of_first) == inputString.charAt(index_of_second)) {
            return false;
          }
      }
    }
    return true;
  }


  private static boolean isUniqueViaSort(String inputString) {

    //If the size of the array is greater than 256
    //By default the string will be non-unique as it will be guarantee to have the same character
    if (inputString.length() > 256) {
      return false;
    }

    //In case the input string is only 1 size, and by default it's unique
    if (inputString.length() == 1) {
      return true;
    }

    char[] inputStringAsCharArray = inputString.toCharArray();
    Arrays.sort(inputStringAsCharArray);
    String inputStringSorted = new String(inputStringAsCharArray);

    int index;
    for (index = 0; index < inputStringSorted.length() - 1; index++) {
      if (inputStringSorted.charAt(index) == inputStringSorted.charAt(index + 1) ) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isUniqueViaTwoLoops("world!"));
    System.out.println(isUniqueViaTwoLoops("Hello world!"));

    System.out.println(isUniqueViaSort("world!"));
    System.out.println(isUniqueViaSort("Hello world!"));
  }
}