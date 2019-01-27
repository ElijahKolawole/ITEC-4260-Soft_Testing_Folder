public class CodingBatQuestions {

    public CodingBatQuestions() {

    }

    public int add(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public int subtract(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    public int multiply(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    public int getAverage(int i, int i1, int i2) {
        return (i + i1 + i2) / 3;
    }

    public int returnNum(int num) {
        return num;
    }

    public int multiplyByTen(int num) {
        return num * 10;
    }

    public int addThreeNums(int i, int i1, int i2) {
        return i + i1 + i2;
    }

    public boolean getBoolean(boolean input) {
        return input;
    }

    public boolean isLargerThanTen(int num) {
        return num >= 10;

    }

    public double getFahrenheit(double celcius) {
        return (celcius * (9 / 5.0)) + 32;
    }

    public String isPassing(int score) {
        String status = "";
        if (score >= 70)
            status = "pass";
        else
            status = "fail";
        return status;
    }

    public String concatStrings(String a, String b) {
        return a + b;
    }

    public char getGrade(int score) {
        char grade = ' ';
        if (score < 60) //unfavorable condition
            grade = 'F';


        if (score >= 70)
            grade = 'C';
        if (score >= 80)
            grade = 'B';
        if (score >= 90)
            grade = 'A';
        if (score >= 60)
            grade = 'D';


        return grade;

    }

      public boolean isFortyTwo(int num) {
        return num == 42;
    }

    public int doFortyTwo(int num) {
        if (num > 42)
            return 1;
        else
        return 0;

    }

   public int greaterOfTwoNums(int a, int b) {
       int greater;

       if (a > b)
           greater = a;
       else
           greater = b;

       return greater;

   }

    public int greatestAmongThree(int a, int b, int c) {
        int greater;
        if (a > b)
            greater = a;
        else
            greater = b;

        int greatest;
        if (c > greater)
            greatest = c;
        else
            greatest = greater;

        return greatest;
    }

    public int findGreatestOfFour(int a, int b, int c, int d) {
        int greaterA;
        int greaterB;
        int greatest;
        if (a > b)
            greaterA = a;
        else
            greaterA = b;
        if (c > d)
            greaterB = c;
        else
            greaterB = d;

        if (greaterA > greaterB)
            greatest = greaterA;
        else
            greatest = greaterB;


        return greatest;
    }

    public char getHumidityChar(boolean isRaining, int humidity) {
        char value;
        if (isRaining || humidity >= 80)
            value = 'h';
        else
            value = 'x';
        return value;

    }

    public boolean isPassingClass( boolean finalPassed, boolean testPassed, boolean projectpassed) {
        return (finalPassed) || (testPassed && projectpassed);
    }
    public int getLetter(char mychar){
        int value = 5;
        if (mychar == 'a')
            value =1;
        if (mychar == 'b')
            value =2;
        if (mychar == 'c')
            value =3;
        if (mychar == 'd')
            value =4;
        return value;
    }


   public int changeNums(int num){
       int value = 0;
	if(num < 0 || num > 0)
		value = -num;
       return value;
   }
}
