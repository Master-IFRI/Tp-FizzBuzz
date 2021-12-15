

class FizzBuzz {
    public String build(int variable){
        String result = "";
        if (variable % 3 ==0){
            result += "Fizz";
        }
        if (variable % 5 ==0){
            result += "Buzz";
        }

        if (variable % 7 == 0){
            result = "Aurel";
        }

        if (result.isBlank()){
            result += variable;
        }

        return  result;
    }
}
