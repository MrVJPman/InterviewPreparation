class Main {
  
  //Code won't work for UNICODE 
  private static boolean isUnique(String inputString) {

    //If the size of the array is greater than 256
    //By default the string will be non-unique as it will be guarantee to have the same character
    if (inputString.length() > 256) {
      return false
    }


    boolean [] characterExist = new boolean[256];
    for (char c: inputString.toCharArray()) {
      if (characterExist[(int)c]) {
        return false;
      }
      else {
        characterExist[(int)c] = true;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isUnique("world!"));
    System.out.println(isUnique("Hello world!"));
  }
}