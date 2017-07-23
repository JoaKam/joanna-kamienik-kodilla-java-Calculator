class Calculator {

    private Calculator(){
    }

    public void add2Numbers (int firstNumber, int secondNumber){
        int sum = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
    }

    public void substract2Numbers (int firstNumber, int secondNumber){
        int difference = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
    }

}
