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

    public boolean isPassingClass(boolean finalPassed, boolean testPassed, boolean projectpassed) {
        return (finalPassed) || (testPassed && projectpassed);
    }

    public int getLetter(char mychar) {
        int value = 5;
        if (mychar == 'a')
            value = 1;
        if (mychar == 'b')
            value = 2;
        if (mychar == 'c')
            value = 3;
        if (mychar == 'd')
            value = 4;
        return value;
    }

    public int changeNums(int num) {
        int value = 0;
        if (num < 0 || num > 0)
            value = -num;
        return value;
    }

    public int stringLength(String str) {
        return str.length();
    }

    public boolean areTwoStringsEqual(String a, String b) {
        return a.equals(b);
    }

    public double getCircumference(double radius) {
        return 2 * 3.14 * radius;
        //return 3.14 * radius*2;
    }

    public float addPointFive(int num) {
        //return (float)(num + 0.5);
        return 0.5f + num;
    }

    public boolean getToGraduate(char chem, char prog) {
        return (chem == 'A' || chem == 'B') && (prog == 'A' || prog == 'B') ? true : false;
    }

    public boolean isEvenlyDivisibleByFourtyTwo(int num) {
        return num % 42 == 0;
    }

    public String getKarmaLevel(int points) {
        String response = "";
        if (points >= -1000 && points <= -750)
            response = "Very Evil";
        if (points >= -749 && points <= -250)
            response = "Evil";
        if (points >= -249 && points <= 249)
            response = "Neutral";
        if (points >= 250 && points <= 749)
            response = "Good";
        if (points >= 750 && points <= 1000)
            response = "Very Good";
        return response;
    }

    public String changeToShouting(String str) {
        return str.toUpperCase();
    }

    public char getThirdChar(String str) {
        return str.charAt(3);
    }

    public String getLastThreeCharString(String str) {
        return str.substring(str.length() - 3, str.length());
    }

    public String getFirstTwoCharConcat(String str1, String str2) {
        return str1.substring(0, 2) + str2.substring(0, 2);
    }

    public String getMiddleOfString(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String getLongOrShort(String name) {
        if (name.length() >= 2) {
            if (name.length() < 6)
                return "short";
            else
                return "long";
        }
        return name;
    }

    public boolean isStartingWithIM(String str) {
        String firstTwo = str.substring(0, 2);
        //return
        if (str.length() < 2)
            return false;
        else
            return firstTwo.equals("im");
    }

    public boolean isEndingWithING(String str) {
        String lastThree = str.substring(str.length() - 3);
        if (str.length() < 3)
            return false;
        else
            return lastThree.equals("ing");
    }

    public char oddOrEven(String str) {
        int strLength = str.length();
        if (strLength % 2 == 0)
            return 'e';
        else
            return 'o';
    }

    public int getNumForString(String str) {
        int day = 0;
        int value = -1;
        if (str.equals("one"))
            day = 1;
        if (str.equals("two"))
            day = 2;
        if (str.equals("three"))
            day = 3;
        switch (day) {
            case 1:
                value = 1;
                break;
            case 2:
                value = 2;
                break;
            case 3:
                value = 3;
                break;
        }
        return value;
    }

    public int getAbsValue(int num) {
        return Math.abs(num);
    }

    public String getRicksMessage(String msg) {
        boolean a = msg.equals("let you down");
        boolean b = msg.equals("say goodbye");
        boolean c = msg.equals("desert you");
        String response = "always gonna";
        if (a || b || c)
            response = "never gonna";
        return response;
    }

    public String getSparta(int num) {
        if (num == 300)
            return "Sparta!";
        else
            return "Persia!";
    }

    public int getYourWeightPriceInGold(int pounds) {
        int eachPound = 16;
        int eachOunce = 1800;
        return pounds * eachOunce * eachPound;
    }

    public double getMoneyForProf(int hours) {
        double pay = 0.0;
        int regHours = 8;
        int overTime = 0;
        if (hours > 8) {
            overTime = hours - regHours;
            regHours = 8;
        } else {
            regHours = hours;
        }
        pay = regHours * 300 + overTime * (300 * 1.5);
        return pay;
    }

    public int getSum(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++)
            sum += i;
        return sum;
    }

    public int getSumOfSquaresB(int n) { //gets sum of sqaure values between 1 and 100 1,4,9,16,25,36,49,64,81,100
        int x = 1;
        int sum = 0;
        int squareValue;
        while (x <= Math.sqrt(n)) {
            squareValue = x * x;
            sum += squareValue;
        }
        return sum;
    }

    public int getSumOfSquares(int n) { //gets sum  of square values from 1 to n. 1sq, 2sq, 3sq...nsq. 1, 4, 9, 16, 100sq
        int x = 1;
        int sum = 0;
        int squareValue;
        for (x = 1; x <= n; x++) {
            squareValue = x * x;
            sum += squareValue;
        }
        return sum;
    }

    public int getSumOfOdds(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public String getShoutingString(String str, int num) {
        int strLength = str.length();
        int newStrLength = num + strLength;
        String attachment = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String response = str + attachment;
        if (str.length() > 0)
            response = response.substring(0, newStrLength);
        return response;
    }

    public String getRepeatingString(String str, int num) {
        String repeated = new String(new char[num]).replace("\0", str);
        return repeated;
    }

    public int getTwoToThePowerOf(int N) {
        int base_value = 2;
        int result = 1;
        if (N < 0) {
            base_value = 1 / base_value;
            N = -N;
        }
        for (int i = 0; i < N; i++) {
            result = result * base_value;
        }
        return result;
    }

    public int getNumberOfAs(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a')
                count += 1;
        }
        return count;
    }

    public String getRidOfOddIndexChar(String str) {
        String toReturn = "";
        String toReplace = "";
        char[] characters = str.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (i % 2 == 0)
                toReturn += characters[i];
        }
        return toReturn;
    }

    public String getReverseString(String str) {
        char[] character = str.toCharArray();
        int beginIndex = 0;
        int endIndex = str.length() - 1;
        char tmp;
        while (endIndex > beginIndex) {
            tmp = character[beginIndex];
            character[beginIndex] = character[endIndex];
            character[endIndex] = tmp;
            endIndex--;
            beginIndex++;
        }
        return new String(character);
    }

    public String getRepeatingChar(char myChar, int num) {
        String response = "";
        char[] character = new char[num];
        for (int i = 0; i < character.length; i++)
            character[i] = myChar;
        response = new String(character);
        return response;
    }

    public String changeVowels(String str) {
        String response = "";
        char[] characters = str.toLowerCase().toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (characters[i] == 'a' || characters[i] == 'e' || characters[i] == 'a' || characters[i] == 'i' || characters[i] == 'o' || characters[i] == 'u') {
                characters[i] = 'x';
                response = new String(characters);
            }
        }
        return response;
    }

    public int getSumFromArray( int[] nums) {
        int sum =0;
        for(int i =0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }

    public int getNumOfEvens( int[] nums) {
        int count =0;
        for(int i =0; i <  nums.length; i++){
            if (nums[i] % 2 == 0)
                count++;
        }
        return count;
    }

    public int getNumOfChars( String[] strs) {
        int count =0;
            for (int i =0; i < strs.length; i++){
                count += strs[i].length();
            }
        return count;

    }



}
